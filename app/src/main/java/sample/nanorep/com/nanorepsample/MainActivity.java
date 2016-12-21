package sample.nanorep.com.nanorepsample;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nanorep.nanoclient.AccountParams;
import com.nanorep.nanoclient.Nanorep;

import nanorep.nanowidget.Components.AbstractViews.NRCustomChannelView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomContentView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomFeedbackView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomLikeView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomSearchBarView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomSuggestionsView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomTitleView;
import nanorep.nanowidget.Fragments.NRMainFragment;
import nanorep.nanowidget.Utilities.FragmentUtils;
import nanorep.nanowidget.interfaces.NRCustomViewAdapter;
import sample.nanorep.com.nanorepsample.views.Like;
import sample.nanorep.com.nanorepsample.views.Title;

public class MainActivity extends AppCompatActivity implements NRCustomViewAdapter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nanorep.getInstance().init(getApplicationContext(), new AccountParams("yatra","English"));

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                NRMainFragment mainFragment = NRMainFragment.newInstance();

                FragmentUtils.openFragment(mainFragment, R.id.content_main,
                        NRMainFragment.TAG, MainActivity.this, false);
            }
        }, 5000);



    }

    @Override
    public NRCustomSearchBarView getSearchBar(Context context) {
        return null;
    }

    @Override
    public NRCustomSuggestionsView getSuggestionsView(Context context) {
        return null;
    }

    @Override
    public NRCustomTitleView getTitle(Context context) {
     return null;
//        return new Title(context);
    }

    @Override
    public NRCustomContentView getContent(Context context) {
        return null;
    }

    @Override
    public NRCustomLikeView getLikeView(Context context) {
        return null;
//        return new Like(context);
    }

    @Override
    public NRCustomChannelView getChannelView(Context context) {
        return null;
    }

    @Override
    public NRCustomFeedbackView getFeedbackView(Context context) {
        return null;
    }
}
