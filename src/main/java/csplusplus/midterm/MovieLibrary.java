package csplusplus.midterm;

import java.util.ArrayList;
import java.util.List;

/**
 * CS++ Midterm Challenge Lab — MovieLibrary
 *
 * A container that holds Movie objects and provides common queries.
 * Internally uses an ArrayList<Movie>; the list itself MUST be private.
 *
 * CED: 3.2, 3.3, 3.9, 4.8, 4.9, 4.10
 */
public class MovieLibrary {

    // TODO: declare private List<Movie> field and initialize in the constructor

    public MovieLibrary() {
        throw new UnsupportedOperationException("MovieLibrary constructor not implemented");
    }

    /** Add a movie. Throw IllegalArgumentException if movie is null. */
    public void add(Movie m) {
        throw new UnsupportedOperationException("add not implemented");
    }

    /**
     * Remove the first movie whose title matches (case-insensitive).
     * Return true if a movie was removed, false otherwise.
     */
    public boolean removeByTitle(String title) {
        throw new UnsupportedOperationException("removeByTitle not implemented");
    }

    /** Return the number of movies currently in the library. */
    public int size() {
        throw new UnsupportedOperationException("size not implemented");
    }

    /**
     * Return the first movie whose title matches (case-insensitive), or null
     * if none found.
     */
    public Movie findByTitle(String title) {
        throw new UnsupportedOperationException("findByTitle not implemented");
    }

    /**
     * Return the mean rating of all movies. Return 0.0 if the library is empty.
     */
    public double averageRating() {
        throw new UnsupportedOperationException("averageRating not implemented");
    }

    /**
     * Return the movie with the longest runtime. Return null if empty.
     * If there's a tie, return the one added first.
     */
    public Movie longestRuntime() {
        throw new UnsupportedOperationException("longestRuntime not implemented");
    }

    /**
     * Return a NEW list containing only movies with rating >= minRating,
     * preserving insertion order. Must not modify the internal list.
     */
    public List<Movie> ratedAtLeast(double minRating) {
        throw new UnsupportedOperationException("ratedAtLeast not implemented");
    }
}
