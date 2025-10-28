package com.may.a4detocho;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.animation.Animator;

public class AnimacionesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivejexx, ivejeyy, ivalphaa, ivrotationn;
    ImageView ivtodoo, ivbuclee, ivscalee;

    Button btejexx, btejeyy, btaplhaa, btrotationn;
    Button bttodoo, btbuclee, btscalee;

    ObjectAnimator animatorx, animatory, animatoralpha, animatorrotation;

    long animationduration = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_animaciones);

        ivejexx = findViewById(R.id.ivejex);
        ivejeyy = findViewById(R.id.ivejey);
        ivalphaa = findViewById(R.id.ivalpha);
        ivrotationn = findViewById(R.id.ivrotation);
        ivtodoo = findViewById(R.id.ivtodo);
        ivbuclee = findViewById(R.id.ivbucle);
        ivscalee = findViewById(R.id.ivscale);
        
        btejexx =findViewById(R.id.btejex);
        btejeyy =findViewById(R.id.btejey);
        btaplhaa =findViewById(R.id.btalpha);
        btrotationn =findViewById(R.id.btrotation);
        bttodoo =findViewById(R.id.bttodo);
        btbuclee =findViewById(R.id.btbucle);
        btscalee =findViewById(R.id.btscale);
        
        btejexx.setOnClickListener(this);
        btejeyy.setOnClickListener(this);
        btaplhaa.setOnClickListener(this);
        btrotationn.setOnClickListener(this);
        bttodoo.setOnClickListener(this);
        btbuclee.setOnClickListener(this);
        btscalee.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        String cadenita =((Button)v).getText().toString();
        if (cadenita.equals("ejex")){
            animatorx = ObjectAnimator.ofFloat(ivejexx,"x", 400f);
            animatorx.setDuration(animationduration);
            AnimatorSet animatorSetX = new AnimatorSet();
            animatorSetX.play(animatorx);
            animatorSetX.start();
        } 
            else if (cadenita.equals("ejey")) {
                animatory = ObjectAnimator.ofFloat(ivejeyy,"y", 400f);
                animatory.setDuration(animationduration);
                AnimatorSet animatorSetY = new AnimatorSet();
                animatorSetY.play(animatory);
                animatorSetY.start();
            } 
                else if (cadenita.equals("alpha")) {
                    animatoralpha = ObjectAnimator.ofFloat(ivalphaa,View.ALPHA, 1.0f,0.0f);
                    animatoralpha.setDuration(animationduration);
                    AnimatorSet animatorSetAlpha = new AnimatorSet();
                    animatorSetAlpha.play(animatoralpha);
                    animatorSetAlpha.start();
                }
                    else if (cadenita.equals("rotation")) {
                        animatorrotation = ObjectAnimator.ofFloat(ivrotationn, "rotation", 0f, 360f);
                        animatorrotation.setDuration(animationduration);
                        AnimatorSet animatorSetRotation = new AnimatorSet();
                        animatorSetRotation.play(animatorrotation);
                        animatorSetRotation.start();
                    }
                        else if (cadenita.equals("todo")) {
                            animatoralpha = ObjectAnimator.ofFloat(ivtodoo,View.ALPHA, 1.0f,0.0f);
                            animatoralpha.setDuration(animationduration);
                            animatorx = ObjectAnimator.ofFloat(ivtodoo, "x",500f);
                            animatorx.setDuration(animationduration);
                            animatorrotation = ObjectAnimator.ofFloat(ivtodoo,"rotation",0f, 360f);
                            animatorrotation.setDuration(animationduration);
                            AnimatorSet animatorSettodo = new AnimatorSet();
                            animatorSettodo.playTogether(animatoralpha, animatorx, animatorrotation);
                            animatorSettodo.start();
                        }
                            else if (cadenita.equals("buclecito")) {
                                animatorx = ObjectAnimator.ofFloat(ivbuclee, "x", 500f);
                                animatorx.setDuration(animationduration);
                                AnimatorSet animatorSetbucle = new AnimatorSet();
                                animatorSetbucle.play(animatorx);
                                animatorSetbucle.addListener(new AnimatorListenerAdapter() {
                                    public void onAnimationEnd(Animator animation) {
                                        animation.start();
                                    }
                                });
                                animatorSetbucle.start();
                            }
                                else if (cadenita.equals("escala")) {
                                    Animation animationscale = AnimationUtils.loadAnimation(this,R.anim.escaladito);
                                    ivscalee.startAnimation(animationscale);

                                }

    }
}