package com.sofiavistas.rumi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RumiActivity extends AppCompatActivity {

    private TextView mRumiPoemTextView;
    private Button mShowMoreRumiButton;
    private RelativeLayout mRelativeLayout;

    private ColorWheel mColorWheel = new ColorWheel();
    private PoemBook mPoemBook = new PoemBook();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumi);

        //This assigns views from the layout to our variables
        mRumiPoemTextView = (TextView) findViewById(R.id.rumiPoemView);
        mShowMoreRumiButton = (Button) findViewById(R.id.showMoreRumiButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(color);
                mShowMoreRumiButton.setTextColor(color);

                String poem = mPoemBook.getPoem();
                mRumiPoemTextView.setText(poem);

            }
        };
        mShowMoreRumiButton.setOnClickListener(listener);
    }
}
