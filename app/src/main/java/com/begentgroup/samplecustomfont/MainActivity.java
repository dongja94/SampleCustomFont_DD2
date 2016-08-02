package com.begentgroup.samplecustomfont;

import android.os.Bundle;

public class MainActivity extends ParentActivity {

//    AppCompatDelegate mDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getLayoutInflater().setFactory2(this);
//        mDelegate = getDelegate();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tv = (TextView)findViewById(R.id.text_nanum);
////        Typeface typeface = Typeface.createFromAsset(getAssets(), "nanumgothic.ttf");
//        Typeface typeface = FontManager.getInstance().getTypeface(this, FontData.NANUM);
//        tv.setTypeface(typeface);
//
//        tv = (TextView)findViewById(R.id.text_noto);
////        typeface = Typeface.createFromAsset(getAssets(), "NotoSansKR-Regular.otf");
//        tv.setTypeface(FontManager.getInstance().getTypeface(this, FontData.NOTO));
//
//        tv = (TextView)findViewById(R.id.text_roboto);
////        typeface = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
//        tv.setTypeface(FontManager.getInstance().getTypeface(this, FontData.ROBOTO));
    }

//    @Override
//    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
//        View view = super.onCreateView(parent, name, context, attrs);
//        if (view == null) {
//            view = mDelegate.createView(parent, name, context, attrs);
//        }
//        view = setCustomFont(view, name, context, attrs);
//        return view;
//    }
//
//    private View setCustomFont(View view, String name, Context context, AttributeSet attrs) {
//        if (view == null) {
//            if (name.equals("TextView")) {
//                view = new TextView(context, attrs);
//            }
//        }
//        if (view != null && view instanceof TextView) {
//            TextView tv = (TextView)view;
//            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomFont);
//            String fontName = ta.getString(R.styleable.CustomFont_android_fontFamily);
//            int textStyle = ta.getInt(R.styleable.CustomFont_android_textStyle, Typeface.NORMAL);
//            ta.recycle();
//            if (!TextUtils.isEmpty(fontName)) {
//                Typeface typeface = FontManager.getInstance().getTypeface(context, fontName);
//                if (typeface != null) {
//                    tv.setTypeface(typeface, textStyle);
//                }
//            }
//        }
//        return view;
//    }
}
