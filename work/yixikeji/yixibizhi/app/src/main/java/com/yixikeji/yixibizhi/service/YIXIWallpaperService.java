package com.yixikeji.yixibizhi.service;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

import com.yixikeji.yixibizhi.util.ScreenUtils;

import java.util.Timer;
import java.util.TimerTask;

public class YIXIWallpaperService extends WallpaperService {
    private Paint hong = new Paint();
    private Paint cheng = new Paint();
    private Paint huang = new Paint();
    private Paint lv = new Paint();
    private Paint qing = new Paint();
    private Paint lan = new Paint();
    private Paint zi = new Paint();
    private Paint yixi = new Paint();
    private Canvas canvas;
    TimerTask timerTask;

    Timer timer = new Timer();
    private SurfaceHolder surfaceHolder;

    @Override
    public Engine onCreateEngine() {
        return new MyEngine();
    }

    class MyEngine extends Engine {
        @Override
        public SurfaceHolder getSurfaceHolder() {
            return super.getSurfaceHolder();
        }

        @Override
        public void onCreate(SurfaceHolder surfaceHolder) {
            super.onCreate(surfaceHolder);
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
        }

        @Override
        public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            super.onSurfaceChanged(holder, format, width, height);
        }

        @Override
        public void onSurfaceCreated(SurfaceHolder holder) {
            super.onSurfaceCreated(holder);
            surfaceHolder = holder;
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    drawWallPaper();
                    canvas.rotate(120);
//                    canvas.drawText("YIXI");
                }
            };
            timer.schedule(timerTask, 0, 100);


        }

        @Override
        public void onSurfaceDestroyed(SurfaceHolder holder) {
            super.onSurfaceDestroyed(holder);


        }

        private void drawWallPaper() {
            canvas = surfaceHolder.lockCanvas();
            int w = ScreenUtils.getScreenWidth() / 2;
            hong.setColor(Color.argb(175, 255, 0, 0));
            cheng.setColor(Color.argb(175, 255, 125, 0));
            huang.setColor(Color.argb(175, 255, 255, 0));
            lv.setColor(Color.argb(175, 0, 255, 0));
            qing.setColor(Color.argb(175, 0, 255, 255));
            lan.setColor(Color.argb(175, 0, 0, 255));
            zi.setColor(Color.argb(175, 139, 0, 255));
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
                        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, ScreenUtils.getScreenHeight() / 4, w * 5 / 12, hong);
                        canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                        break;
                    case 1:
                        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, ScreenUtils.getScreenHeight() / 4, w * 5 / 12, cheng);
                        canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                        break;
                    case 2:
                        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, ScreenUtils.getScreenHeight() / 4, w * 5 / 12, huang);
                        canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                        break;
                    case 3:
                        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, ScreenUtils.getScreenHeight() / 4, w * 5 / 12, lv);
                        canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                        break;
                    case 4:
                        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, ScreenUtils.getScreenHeight() / 4, w * 5 / 12, qing);
                        canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                        break;
                    case 5:
                        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, ScreenUtils.getScreenHeight() / 4, w * 5 / 12, lan);
                        canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                        break;
                    case 6:
                        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, ScreenUtils.getScreenHeight() / 4, w * 5 / 12, zi);
                        canvas.rotate(360 / 7, w, ScreenUtils.getScreenHeight() / 2);
                        continue;

                }
            }
            surfaceHolder.unlockCanvasAndPost(canvas);

        }
    }

}
