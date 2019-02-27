package com.example.mytong.base;

import java.lang.ref.WeakReference;

public class Basepresent<V> {
    private WeakReference<V> weakReference;
    public V mView;
    public  void attachView(V v){
        weakReference=new WeakReference(v);
        if (weakReference!=null){
            weakReference.get();
        }
    }
    public void destoryView(){
        if (weakReference!=null){
            weakReference.clear();
        }
    }
}
