package com.example.mygithub.Utils;

import android.app.ProgressDialog;
import android.content.Context;

public class MyProgressDialog extends ProgressDialog {

    public static MyProgressDialog myProgressDialog;
    public MyProgressDialog(Context context) {
        super(context);
    }

    public static MyProgressDialog getInstance(Context context) {

        if (myProgressDialog == null) {

            myProgressDialog = new MyProgressDialog(context);
        }

        return myProgressDialog;
    }

    public MyProgressDialog setMessagee(String s) {

        this.setMessage(s);
        return this;
    }

    public MyProgressDialog setStyle(int styleSpinner) {

         this.setProgressStyle(styleSpinner);
         return this;
    }
}
