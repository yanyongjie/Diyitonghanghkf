package com.example.mytong.presenter;

import com.example.mytong.base.Basepresent;
import com.example.mytong.beans.ListNewsChannel;
import com.example.mytong.contact.ListNewsChanneiI;
import com.example.mytong.module.IlistNewsChannelM;

public class IListNewsChannelP<V extends ListNewsChanneiI.ListNewsChannelV>extends Basepresent<V>implements ListNewsChanneiI.ListNewsChannelp,ListNewsChanneiI.ListNewsChannlCallBak {
 private IlistNewsChannelM ilistNewsChannelM=new IlistNewsChannelM();
    @Override
    public void getListNewsTab(String json) {
if (mView!=null){
     mView.showProgressbar();
     ilistNewsChannelM.getListNewsChanne(json,this);
}
    }

    @Override
    public void setListVewsTab(ListNewsChannel listVewsTab) {
if (mView!=null){
    mView.hintProgressbar();
    mView.showListNewsTab(listVewsTab);
}
    }

    @Override
    public void showError(String error) {
        if (mView!=null) {
            mView.hintProgressbar();
            mView.showError(error);
        }
    }
}
