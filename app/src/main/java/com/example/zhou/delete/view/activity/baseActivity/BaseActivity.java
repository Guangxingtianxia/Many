package com.example.zhou.delete.view.activity.baseActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity
{
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        unbinder = ButterKnife.bind(this);
        Log.i("TTTTTT_", "BaseActivity-->getLayoutId()");
    }

    /**
     * @return 布局id
     */
    public abstract int getLayoutId();

    @Override
    protected void onDestroy()
    {
        unbinder.unbind();
        super.onDestroy();
    }
}
