package com.example.mytong.module;

import com.example.mytong.base.BaseObserver;
import com.example.mytong.beans.HttpResponse;
import com.example.mytong.beans.ListNewsChannel;
import com.example.mytong.contact.ListNewsChanneiI;
import com.example.mytong.http.HttpMessage;
import com.example.mytong.utils.HttpUtils;
import com.example.mytong.utils.RxUtils;

public class IlistNewsChannelM {
    public  void getListNewsChanne(String json, final ListNewsChanneiI.ListNewsChannlCallBak listNewsChannlCallBak){
      HttpMessage.getInethttpMessage().getServer().getListNewsChannl(HttpUtils.getBosy(json))
              .compose(RxUtils.<HttpResponse<ListNewsChannel>>rxScheThread())
              .compose(RxUtils.<ListNewsChannel>handeResult())
              .subscribe(new BaseObserver<ListNewsChannel>(listNewsChannlCallBak) {
                  @Override
                  public void onNext(ListNewsChannel listNewsChannel) {
                      listNewsChannlCallBak.setListVewsTab(listNewsChannel);
                  }
              });
    }
}
