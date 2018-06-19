package com.sunqi.test.cm.cleandemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cleanmaster.boost.powerengine.process.ProcessScanSetting;
import com.cmcm.boostsdk.boost.BoostSDK;
import com.cmcm.boostsdk.boost.boostengine.interfaces.CleanStateCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BoostSDK mBoostSDK = new BoostSDK(this, BoostSDK.CHANNEL_ID);
        mBoostSDK.init(null, null, null, null);
        mBoostSDK.scanAndClean(ProcessScanSetting.CLOUD_QUERY_SYNC, new CleanStateCallback() {
            @Override
            public void onCleanStart(int i) {

            }

            @Override
            public void onCleanProgress(int i, Object o) {

            }

            @Override
            public void onCleanFinish(int i, Object o) {

            }

            @Override
            public void onCleanFinish(String s, int i) {

            }
        });

    }
}
