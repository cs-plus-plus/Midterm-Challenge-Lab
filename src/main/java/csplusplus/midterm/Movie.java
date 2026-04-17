package csplusplus.midterm;

/**
 * CS++ Midterm Challenge Lab — Movie
 *
 * A simple encapsulated entity. Implement the constructor, getters, setters
 * (with validation), and toString. All fields MUST be private.
 *
 * CED: 3.1, 3.3, 3.4, 3.5, 3.9
 */
public class Movie {

    // TODO: declare private fields: title (String), director (String),
    //       runtimeMinutes (int), rating (double)

    /**
     * Construct a Movie. Validate in the constructor:
     *   - title and director must be non-null and non-empty
     *   - runtimeMinutes must be >= 1
     *   - rating must be between 0.0 and 10.0 inclusive
     * On invalid input, throw IllegalArgumentException with a clear message.
     */
    public Movie(String title, String director, int runtimeMinutes, double rating) {
        throw new UnsupportedOperationException("Movie constructor not implemented");
    }

    // ── Accessors ─────────────────────────────────────────────────────

    public String getTitle() {
        throw new UnsupportedOperationException("getTitle not implemented");
    }

    public String getDirector() {
        throw new UnsupportedOperationException("getDirector not implemented");
    }

    public int getRuntimeMinutes() {
        throw new UnsupportedOperationException("getRuntimeMinutes not implemented");
    }

    public double getRating() {
        throw new UnsupportedOperationException("getRating not implemented");
    }

    // ── Mutators (with validation — mirror the constructor rules) ─────

    public void setTitle(String title) {
        throw new UnsupportedOperationException("setTitle not implemented");
    }

    public void setDirector(String director) {
        throw new UnsupportedOperationException("setDirector not implemented");
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        throw new UnsupportedOperationException("setRuntimeMinutes not implemented");
    }

    public void setRating(double rating) {
        throw new UnsupportedOperationException("setRating not implemented");
    }

    /**
     * Return a string of the form:
     *   "Title (Director, NN min) — R.R/10"
     * Example: "Inception (Christopher Nolan, 148 min) — 8.8/10"
     * Use exactly one decimal place for rating.
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("toString not implemented");
    }
}
