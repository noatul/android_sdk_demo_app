package sample.nanorep.com.nanorepsample.views;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import nanorep.nanowidget.Components.AbstractViews.NRCustomTitleView;
import sample.nanorep.com.nanorepsample.R;

/**
 * Created by noat on 23/11/2016.
 */

public class Title extends NRCustomTitleView {

    Context context;
    TextView textView;

    public Title(Context context) {
        super(context);

        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.title, this);
    }

    @Override
    public void onViewAdded(View child) {
        super.onViewAdded(child);

        textView = (TextView) child.findViewById(R.id.title);

        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onTitleClicked();
            }
        });
    }

    @Override
    public void setTitleText(String text) {
        textView.setText(text);
    }

    @Override
    public void unfold(boolean closed) {
        if(closed) {
            textView.setTextColor(Color.BLACK);
        } else {
            textView.setTextColor(Color.GREEN);
        }
    }

    @Override
    public int getTitleHeight(String text) {
        return 0;
    }

    @Override
    public void resetView() {

    }

    @Override
    public void setTitleMaxLines(int lines) {
        textView.setMaxLines(lines);
    }
}
