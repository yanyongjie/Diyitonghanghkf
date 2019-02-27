package com.example.mytong.contact;

import com.example.mytong.base.BaseView;
import com.example.mytong.beans.ListNewsChannel;
import com.example.mytong.http.HttpFinishCallbak;

public interface ListNewsChanneiI {
    interface ListNewsChannelV extends BaseView{
        void showListNewsTab(ListNewsChannel listNewsChannel);
        void showError(String error);
    }
    interface  ListNewsChannelp{
        void getListNewsTab(String json);
    }
    interface  ListNewsChannlCallBak extends HttpFinishCallbak{
        void setListVewsTab(ListNewsChannel listVewsTab);
    }
}
