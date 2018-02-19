package com.example.allanjacob.databindingrecycle;

import android.databinding.BaseObservable;
import android.databinding.Bindable;





public class DataClass extends BaseObservable{
    private String name;
    private String phone;



    public DataClass(String name,String phone){
        this.name=name;
        this.phone=phone;

    }
    @Bindable
    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public  String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }

}
