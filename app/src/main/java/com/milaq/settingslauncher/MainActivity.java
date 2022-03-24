package com.milaq.settingslauncher;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends Activity {

    String ACTIVITY_NAME = "com.android.settings";

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getPackageManager().getLaunchIntentForPackage(ACTIVITY_NAME);
        if (intent != null) {
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Settings not found", Toast.LENGTH_LONG).show();
        }
        finish();
    }
}