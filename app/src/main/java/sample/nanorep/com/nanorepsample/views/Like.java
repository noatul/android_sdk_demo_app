package sample.nanorep.com.nanorepsample.views;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import nanorep.nanowidget.Components.AbstractViews.NRCustomLikeView;
import sample.nanorep.com.nanorepsample.R;

/**
 * Created by noat on 23/11/2016.
 */

public class Like extends NRCustomLikeView implements View.OnClickListener{

    ImageButton like,dislike;

    public Like(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.like, this);
    }

    @Override
    public void onViewAdded(View child) {
        super.onViewAdded(child);

        like = (ImageButton) child.findViewById(R.id.likeButton);
        dislike = (ImageButton) child.findViewById(R.id.dislikeButton);

        like.setOnClickListener(this);
        dislike.setOnClickListener(this);
    }

    @Override
    public void updateLikeButton(boolean isLike) {
        resetLikeView();
        if(isLike){
            like.setBackgroundColor(Color.GREEN);
        } else {
            dislike.setBackgroundColor(Color.RED);
        }
    }

    @Override
    public void resetLikeView() {
        like.setBackgroundColor(Color.GRAY);
        dislike.setBackgroundColor(Color.GRAY);
    }

    @Override
    public boolean getLikeSelection() {
        return false;
    }

    @Override
    public boolean shouldOpenDialog() {
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.likeButton:
                mListener.onLikeClicked(Like.this, null, true);
                updateLikeButton(true);
                break;
            case R.id.dislikeButton:
                mListener.onLikeClicked(Like.this, null, false);
                updateLikeButton(false);
                break;

        }
    }
}
