package sample.nanorep.com.nanorepsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nanorep.nanowidget.Components.AbstractViews.NRCustomChannelView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomContentView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomLikeView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomSearchBarView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomSuggestionsView;
import nanorep.nanowidget.Components.AbstractViews.NRCustomTitleView;
import nanorep.nanowidget.Fragments.NRMainFragment;
import nanorep.nanowidget.Utilities.FragmentUtils;
import nanorep.nanowidget.interfaces.NRCustomViewAdapter;
import sample.nanorep.com.nanorepsample.views.Title;

public class MainActivity extends AppCompatActivity implements NRCustomViewAdapter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NRMainFragment mainFragment = NRMainFragment.newInstance();

        FragmentUtils.openFragment(mainFragment, R.id.content_main,
                NRMainFragment.TAG, MainActivity.this, false);
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
//     return null;
        return new Title(context);
    }

    @Override
    public NRCustomContentView getContent(Context context) {
        return null;
    }

    @Override
    public NRCustomLikeView getLikeView(Context context) {
        return null;
    }

    @Override
    public NRCustomChannelView getChannelView(Context context) {
        return null;
    }
}
