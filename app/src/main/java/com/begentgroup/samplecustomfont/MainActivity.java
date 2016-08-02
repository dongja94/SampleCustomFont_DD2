package com.begentgroup.samplecustomfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.text_nanum);
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "nanumgothic.ttf");
        Typeface typeface = FontManager.getInstance().getTypeface(this, FontData.NANUM);
        tv.setTypeface(typeface);

        tv = (TextView)findViewById(R.id.text_noto);
//        typeface = Typeface.createFromAsset(getAssets(), "NotoSansKR-Regular.otf");
        tv.setTypeface(FontManager.getInstance().getTypeface(this, FontData.ROBOTO));

        tv = (TextView)findViewById(R.id.text_roboto);
//        typeface = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
        tv.setTypeface(FontManager.getInstance().getTypeface(this, FontData.NOTO));
    }
}
