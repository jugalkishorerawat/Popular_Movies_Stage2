package com.jugal.popularmovies.list;

import com.jugal.popularmovies.Movie;

import java.util.List;


public interface DataSetUpdateListener {
    void onDataSetUpdated(List<Movie> movies);
}
