package com.example.mytong.base;

import android.app.Application;

import com.example.mytong.beans.ApiException;
import com.example.mytong.http.HttpFinishCallbak;

import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import retrofit2.HttpException;

public abstract class BaseObserver<T>implements Observer<T> {
  private HttpFinishCallbak httpFinishCallbak;

    public BaseObserver(HttpFinishCallbak httpFinishCallbak) {
        this.httpFinishCallbak = httpFinishCallbak;
    }
 private CompositeDisposable compositeDisposable=new CompositeDisposable();
    @Override
    public void onSubscribe(Disposable d) {
       compositeDisposable.add(d);
    }

    @Override
    public void onError(Throwable e) {
        String error=null;
if (e instanceof ApiException){
  ApiException apiException  = (ApiException) e;
  switch (apiException.getCode()){
      case 1001:
          error = "网络错误";
          break;
      case 2001:
          error = "验证码错误";
          break;
      case 2002:
          error = "数据不存在";
          break;
      case 2003:
          error = "非法手机号";
          break;
      case 2004:
          error = "验证码一分钟内不能重复发送";
          break;
      case 2005:
          error = "短信功能业务限流";
          break;
      case 2006:
          error = "验证码发送失败";
          break;
      case 2100:
          error = "上传文件为空";
          break;
      case 2101:
          error = "文件大小超出限制";
          break;
      case 2102:
          error = "非法文件格式";
          break;
      case 2103:
          error = "上传文件失败";
          break;

  }
}else if (e instanceof HttpException){
    error="网络错误";
}
if (httpFinishCallbak!=null){
    httpFinishCallbak.showError(error);
}
    }

    @Override
    public void onComplete() {
if (compositeDisposable!=null){
    compositeDisposable.clear();
}
    }
}
