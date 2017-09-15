package com.example.zhou.delete.view.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.zhou.delete.R;
import com.example.zhou.delete.view.activity.baseActivity.BaseActivity;

import butterknife.BindView;

/**
 * 第一个 jni 界面
 */
public class Jni1Activity extends BaseActivity
{
    @BindView(R.id.tv_first_content)
    TextView tvFirstContent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        tvFirstContent.setText(stringFromJNI());
    }

    static
    {
        // /此处的form库的名称需要和CMakeLists.txt中配置的相同
        System.loadLibrary("native-lib");
    }

    // 获取C或C++ 的数据
    public native String stringFromJNI();


    @Override
    public int getLayoutId()
    {
        return R.layout.activity_jni1;
    }
}
