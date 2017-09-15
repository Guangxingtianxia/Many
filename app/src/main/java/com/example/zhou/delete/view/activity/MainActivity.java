package com.example.zhou.delete.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.zhou.delete.R;
import com.example.zhou.delete.view.activity.baseActivity.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity
{
    @BindView(R.id.btn_jni_1)
    Button btnJni1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getLayoutId()
    {
        Log.i("TTTTTT_", "MainActivity-->getLayoutId()");
        return R.layout.activity_main;
    }


    @OnClick(R.id.btn_jni_1)
    public void onViewClicked()
    {
        Intent i = new Intent(MainActivity.this,Jni1Activity.class);
        startActivity(i);
    }
    
}
