package com.jugal.popularmovies.details.reviews;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.jugal.popularmovies.details.DataSetUpdateListener;
import com.jugal.popularmovies.details.FetchMovieElements;
import com.jugal.popularmovies.details.MovieServerConnector;

public class FetchReviews extends FetchMovieElements {


    public FetchReviews(Activity activity, DataSetUpdateListener listener) {
        super(activity, listener);
    }

    @NonNull
    @Override
    protected MovieServerConnector setServerConnector(Integer[] params) {
        return new MovieReviewsServerConnector(mActivity, params[0]);
    }

}
