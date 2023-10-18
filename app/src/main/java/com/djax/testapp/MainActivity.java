package com.djax.testapp;

import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private static final String AD_UNIT_ID = "ca-app-pub-3940256099942544/6300978111";
    private AdView adView;
    private FrameLayout adContainerView;
    private boolean initialLayoutComplete = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
//        });
//
//        adContainerView = findViewById(R.id.ad_view_container);
//        adView = new AdView(this);
//
//        adContainerView.addView(adView);
//
//
//        adContainerView.getViewTreeObserver().addOnGlobalLayoutListener(
//                new ViewTreeObserver.OnGlobalLayoutListener() {
//                    @Override
//                    public void onGlobalLayout() {
//                        if (!initialLayoutComplete) {
//                            initialLayoutComplete = true;
//                            loadBanner();
//                        }
//                    }
//                });


        YeahAdsManager.init(MainActivity.this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                YeahAdsManager.showBanner();

//                YeahAdsManager.showInterstitial();
//                YeahAdsManager.showRewardedYeahAds();


            }
        }, 3200);

    }


}