package com.example.allanjacob.databindingrecycle;

import android.databinding.BindingAdapter;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by allan.jacob on 2/19/2018.
 */

public class DataBindUtil {
    @BindingAdapter({"bind:text"})
    public static void setText( TextView textView,String text){
        textView.setText(Html.fromHtml("<h1>"+text+"</h1>"));
    }
}
