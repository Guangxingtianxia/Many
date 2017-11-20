package com.example.zhou.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/19  15:30
 * @Desc :
 */

public class PathView extends View
{
    Paint paint ,paint1,paint2,paint3,paint4;
    Path path, path1;
    PathEffect pathEffect;

    Shader shader ,shader2,shader3;

    Bitmap bitmap ;


    public PathView(Context context)
    {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PathView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);

        initView();
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        initView();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initView()
    {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);

        paint1 = new Paint();
        paint2 = new Paint();
        paint3 = new Paint();
        paint4 = new Paint();

        path = new Path();
        path1 = new Path();

        pathEffect = new DashPathEffect(new float[]{10,30},5);
        paint1.setPathEffect(pathEffect);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(5);

        shader = new LinearGradient(100,100,500,500,
                Color.parseColor("#e91e63"),
                Color.parseColor("#2196f3"),
                 Shader.TileMode.CLAMP);
        paint2.setShader(shader);

        shader2 = new RadialGradient(300,300,200,
                Color.parseColor("#e91e63"),
                Color.parseColor("#2196f3"),
                Shader.TileMode.CLAMP);
        paint3.setShader(shader2);


        bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.xitele_logo);
        shader3 = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
//        paint4.setColor(Color.GREEN);
        paint4.setShader(shader3);






//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);
//
        path1.lineTo(100, 500);
        path1.rLineTo(100, 80);


        path1.quadTo(200,200,350,100);
        path1.quadTo(400,850,450,400);
        path1.quadTo(500,500,550,400);
        path1.quadTo(600,500,650,400);
        path1.quadTo(700,500,750,400);
        path1.quadTo(800,500,850,400);



//        path1.quadTo(400,850,450,400,500,950);



    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

//        canvas.drawPath(path, paint);

        canvas.drawPath(path1, paint);
        canvas.drawCircle(300,200,100,paint1);
        canvas.drawCircle(600,400,200,paint2);
        canvas.drawCircle(300,300,200,paint3);

        canvas.drawCircle(400,800,300,paint4);

    }
}
