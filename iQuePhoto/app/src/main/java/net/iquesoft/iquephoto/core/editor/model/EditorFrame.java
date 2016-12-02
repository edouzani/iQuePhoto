package net.iquesoft.iquephoto.core.editor.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;

import net.iquesoft.iquephoto.R;
import net.iquesoft.iquephoto.util.BitmapUtil;

public class EditorFrame {
    static final int EDITOR_FRAME_PADDING = 25;

    private Paint mFramePaint;

    private Bitmap mDeleteHandleBitmap;
    private Bitmap mTransparencyHandleBitmap;
    private Bitmap mResizeHandleBitmap;
    private Bitmap mFrontHandleBitmap;

    public EditorFrame(Context context) {
        initializeFramePaint();
        initializeHandlesBitmap(context);
    }

    private void initializeFramePaint() {
        mFramePaint = new Paint();
        mFramePaint.setColor(Color.WHITE);
        mFramePaint.setAntiAlias(true);
        mFramePaint.setDither(true);
        mFramePaint.setStyle(Paint.Style.STROKE);
        mFramePaint.setStrokeWidth(5.5f);
        mFramePaint.setAlpha(175);
    }

    private void initializeHandlesBitmap(Context context) {
        mDeleteHandleBitmap = BitmapUtil.drawable2Bitmap(context, R.drawable.ic_handle_delete);
        mResizeHandleBitmap = BitmapUtil.drawable2Bitmap(context, R.drawable.ic_handle_resize);
        mFrontHandleBitmap = BitmapUtil.drawable2Bitmap(context, R.drawable.ic_handle_front);
        mTransparencyHandleBitmap =
                BitmapUtil.drawable2Bitmap(context, R.drawable.ic_handle_transparency);
    }

    public Paint getFramePaint() {
        return mFramePaint;
    }

    public Bitmap getDeleteHandleBitmap() {
        return mDeleteHandleBitmap;
    }

    public Bitmap getRotateHandleBitmap() {
        return mTransparencyHandleBitmap;
    }

    public Bitmap getResizeHandleBitmap() {
        return mResizeHandleBitmap;
    }

    public Bitmap getFrontHandleBitmap() {
        return mFrontHandleBitmap;
    }
}