package hu.petrik.animaciok;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonBounce, buttonFadeIn, buttonFadeOut,
            buttonRotate, buttonZoomIn, buttonZoomOut, buttonFrameAnimation;
    private TextView TextViewBounce, TextViewFadeIn, TextViewFadeOut,
            TextViewRotate, TextViewZoomIn, TextViewZoomOut;
    private Animation bounce, fadeIn, fadeOut, rotate, zoomIn, zoomOut;
    private ImageView imageViewFrameAnim;
    private boolean running;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttonBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            TextViewBounce.startAnimation(bounce);
            }
        });
        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewFadeIn.startAnimation(fadeIn);
            }
        });
        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewFadeOut.startAnimation(fadeOut);
            }
        });
        buttonRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewRotate.startAnimation(rotate);
            }
        });
        buttonZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewZoomIn.startAnimation(zoomIn);
            }
        });
        buttonZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewZoomOut.startAnimation(zoomOut);
            }
        });

        buttonFrameAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!running) {
                    ((AnimationDrawable) imageViewFrameAnim.getBackground()).start();
                    running = true;
                } else {
                    ((AnimationDrawable) imageViewFrameAnim.getBackground()).stop();
                    running = false;
                }
            }
        });

    }

    private void init() {
        // btns
        buttonBounce = findViewById(R.id.buttonBounce);
        buttonFadeIn = findViewById(R.id.buttonFadeIn);
        buttonFadeOut = findViewById(R.id.buttonFadeOut);
        buttonRotate = findViewById(R.id.buttonRotate);
        buttonZoomIn = findViewById(R.id.buttonZoomIn);
        buttonZoomOut = findViewById(R.id.buttonZoomOut);
        buttonFrameAnimation = findViewById(R.id.buttonAnimation);

        //anims
        bounce = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
        fadeIn = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
        rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        zoomIn = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in);
        zoomOut = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_out);

        //textviews
        TextViewBounce = findViewById(R.id.textViewBounce);
        TextViewFadeIn = findViewById(R.id.textViewFadeIn);
        TextViewFadeOut = findViewById(R.id.textViewFadeOut);
        TextViewRotate = findViewById(R.id.textViewRotate);
        TextViewZoomIn = findViewById(R.id.textViewZoomIn);
        TextViewZoomOut = findViewById(R.id.textViewZoomOut);

        //ImageView
        imageViewFrameAnim = findViewById(R.id.imageViewFrameAnim);
        //Animation helper
        running = false;

    }
}