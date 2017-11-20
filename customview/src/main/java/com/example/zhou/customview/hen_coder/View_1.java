package com.example.zhou.customview.hen_coder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/18  16:02
 * @Desc :
 */

public class View_1  extends View
{
    private Paint paint;
    public View_1(Context context)
    {
        super(context);
        paint = new Paint();


    }


    public View_1(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        paint = new Paint();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (canvas!=null)
        {
            canvas.drawColor(Color.LTGRAY);
            // 设置线条宽度
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            // 线条宽度为 20 像素
            paint.setStrokeWidth(20);
            canvas.drawCircle(300,300,200,paint);
            paint.setStrokeWidth(2);
            canvas.drawCircle(500,300,200,paint);
            paint.setStrokeWidth(2);
            // 开启抗锯齿
            paint.setAntiAlias(true);
            canvas.drawLine(0,500,800,500,paint);
            paint.setColor(Color.GREEN);
            float[] points = {20, 20, 120, 20,
                    70, 20, 70, 120,
                    20, 120, 120, 120,
                    150, 20, 250, 20,
                    150, 20, 150, 120,
                    250, 20, 250, 120,
                    150, 120, 250, 120};
            canvas.drawLines(points, paint);

            paint.setColor(Color.RED);

            canvas.drawArc(80,160,200,150,20,160,true,paint);

        }


    }
}
