package com.jugal.popularmovies.details.trailers;

import android.support.v4.app.Fragment;

import com.jugal.popularmovies.BaseActivity;

public class TrailersActivity extends BaseActivity {
    @Override
    protected Fragment createFragment() {
        return TrailersFragment.newInstance(getIntent().getIntExtra("extra_movie_id", 0));
    }
}
