package com.example.revuk.pkdeveloper;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import android.widget.Button;

/**
 * Created by Revuk on 04-Feb-16.
 */
public class Fonts extends Button {

            public Fonts(Context context) {
            super(context);
            setCustomFont();
        }

        public Fonts(Context context, AttributeSet attrs) {
            super(context, attrs);
            setCustomFont();
        }

        public Fonts(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            setCustomFont();
        }


        public void setCustomFont() {
            Typeface normal = Typeface.createFromAsset(getContext().getAssets(),"fonts/acd55.ttf");
            setTypeface( normal, Typeface.NORMAL );

            Typeface bold = Typeface.createFromAsset( getContext().getAssets(), "fonts/acd55.ttf" );
            setTypeface( normal, Typeface.BOLD );
        }

    }

