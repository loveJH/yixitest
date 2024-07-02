package com.yixikeji.yixibizhi.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.yixikeji.yixibizhi.util.ScreenUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ViewWise  extends View {
    private Paint hong=new Paint();
    private Paint cheng=new Paint();
    private Paint huang=new Paint();
    private Paint lv=new Paint();
    private Paint qing=new Paint();
    private Paint lan=new Paint();
    private Paint zi=new Paint();
private Paint yixi =new Paint();
    public ViewWise(Context context) {
        super(context);
    }

    public ViewWise(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewWise(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewWise(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);Paint paint=new Paint();
        int w= ScreenUtils.getScreenWidth() /2;
        hong.setColor(Color.argb(175,255,0,0));
        cheng.setColor(Color.argb(175,255,125,0));
        huang.setColor(Color.argb(175,255,255,0));
        lv.setColor(Color.argb(175,0,255,0));
        qing.setColor(Color.argb(175,0,255,255));
        lan.setColor(Color.argb( 175,0,0,255));
        zi.setColor(Color.argb(175,139,0,255));
        yixi.setColor(Color.BLACK);
        yixi.setTextSize(400);
        hong.setAntiAlias(true);
        cheng.setAntiAlias(true);
        huang.setAntiAlias(true);
        lv.setAntiAlias(true);
        qing.setAntiAlias(true);
        lan.setAntiAlias(true);
        zi.setAntiAlias(true);
        yixi.setAntiAlias(true);
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                canvas.drawCircle(ScreenUtils.getScreenWidth() /2, ScreenUtils.getScreenHeight()/4, w *5/12, hong);
                canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                break;
                case 1:
                    canvas.drawCircle(ScreenUtils.getScreenWidth() /2, ScreenUtils.getScreenHeight()/4, w *5/12, cheng);
                    canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                    break;
                case 2:
                    canvas.drawCircle(ScreenUtils.getScreenWidth() /2, ScreenUtils.getScreenHeight()/4, w *5/12, huang);
                    canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                    break;case 3:
                    canvas.drawCircle(ScreenUtils.getScreenWidth() /2, ScreenUtils.getScreenHeight()/4, w *5/12, lv);
                    canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                    break;case 4:
                    canvas.drawCircle(ScreenUtils.getScreenWidth() /2, ScreenUtils.getScreenHeight()/4, w *5/12, qing);
                    canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                    break;case 5:
                    canvas.drawCircle(ScreenUtils.getScreenWidth() /2, ScreenUtils.getScreenHeight()/4, w *5/12, lan);
                    canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                    break;case 6:
                    canvas.drawCircle(ScreenUtils.getScreenWidth() /2, ScreenUtils.getScreenHeight()/4, w *5/12, zi);
                    canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                    continue;

            }
        }
//        canvas.drawText("YIXI",ScreenUtils.getScreenWidth()/4,ScreenUtils.getScreenHeight()/2,yixi);

          }
}
