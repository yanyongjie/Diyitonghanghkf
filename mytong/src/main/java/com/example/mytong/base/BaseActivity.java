package com.example.mytong.base;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.annotations.Nullable;

public abstract class BaseActivity<V ,P extends Basepresent<V>>extends AppCompatActivity implements BaseView {
    private Unbinder bind;
    public P mPresenter;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createLayoutId());
        bind = ButterKnife.bind(this);
        createProgressBar();
        mPresenter=createPresenter();
        if (mPresenter!=null){
            mPresenter.attachView((V) this);
        }
        initDate();
    }

    protected abstract void initDate();

    protected abstract P createPresenter();

    private void createProgressBar() {

    }

    protected abstract int createLayoutId();



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bind!=null){
            bind.unbind();
        }
        if (mPresenter!=null){
            mPresenter.destoryView();
            mPresenter=null;
        }
    }
}
