package com.example.shishir.eyeassistant;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.IOException;

public class cameraSurface extends SurfaceView implements SurfaceHolder.Callback {

    Camera camera;
    SurfaceHolder surfaceHolder;
    public cameraSurface(Context context, Camera camera) {
        super(context);
        this.camera = camera;
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

        Camera.Parameters para = camera.getParameters();

        if(this.getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE){
            para.set("orientation","portrait");
            camera.setDisplayOrientation(90);
            para.setRotation(90);
        }        else{
            para.set("orientation","landscape");
            camera.setDisplayOrientation(0);
            para.setRotation(0);
        }

        camera.setParameters(para);
        try{
            camera.setPreviewDisplay(surfaceHolder);
            camera.startPreview();

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
