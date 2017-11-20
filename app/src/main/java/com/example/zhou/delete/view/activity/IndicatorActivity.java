package com.example.zhou.delete.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhou.delete.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IndicatorActivity extends AppCompatActivity
{

    @BindView(R.id.tv_1)
    TextView tv1;

    @BindView(R.id.tv_2)
    TextView tv2;

    @BindView(R.id.v_line)
    View vLine;

    LinearLayout.MarginLayoutParams params;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator);
        ButterKnife.bind(this);


        params = (LinearLayout.MarginLayoutParams) vLine.getLayoutParams();



    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus)
    {
        super.onWindowFocusChanged(hasFocus);
        int tv1_Left = tv1.getLeft();
        int tv1_Top = tv1.getTop();
        int tv1_Right = tv1.getRight();
        int tv1_Bottom = tv1.getBottom();

        int w = tv1.getWidth();
        int h = tv1.getHeight();


        float tv1_x = tv1.getX();

        //  Logger.i("TTTT",tv1_Left+"\n",tv1_Top+"\n",tv1_Right+"\n",tv1_Bottom);


        if (tv1 == null)
        {
            // Logger.i("fgfg:","tv1==null");
            Log.i("fgfg==:", "====================tv1==null");
            Log.i("fgfg==:", "====================tv1==null" + tv1_Left);

        }
        else
        {

            Log.i("fgfg:", "================> tv1_Left " + tv1_Left);
            Log.i("fgfg:", "================> tv1_x " + tv1_x);

            Log.i("fgfg:", "========字体宽度========> w ：" + w);
            Log.i("fgfg:", "========字体高度========> h ：" + h);


        }

    }

    @OnClick({R.id.tv_1, R.id.tv_2})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.tv_1:

                params.width += 300;
                params.leftMargin += 500;
                vLine.requestLayout();


                Toast.makeText(this, "tv_1", Toast.LENGTH_SHORT).show();


                break;
            case R.id.tv_2:
                Toast.makeText(this, "tv_2", Toast.LENGTH_SHORT).show();

                params.width -= 300;
                params.leftMargin -= 500;
                vLine.requestLayout();

                break;
        }
    }
}
