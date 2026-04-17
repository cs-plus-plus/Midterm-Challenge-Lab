package csplusplus.midterm;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieLibraryTest {

    private Movie inception() { return new Movie("Inception", "Nolan", 148, 8.8); }
    private Movie dune()      { return new Movie("Dune", "Villeneuve", 155, 8.0); }
    private Movie toyStory()  { return new Movie("Toy Story", "Lasseter", 81, 8.3); }

    @Test
    void newLibrary_isEmpty() {
        MovieLibrary lib = new MovieLibrary();
        assertEquals(0, lib.size());
        assertNull(lib.findByTitle("anything"));
    }

    @Test
    void add_and_size() {
        MovieLibrary lib = new MovieLibrary();
        lib.add(inception());
        lib.add(dune());
        assertEquals(2, lib.size());
    }

    @Test
    void add_rejectsNull() {
        MovieLibrary lib = new MovieLibrary();
        assertThrows(IllegalArgumentException.class, () -> lib.add(null));
    }

    @Test
    void findByTitle_caseInsensitive() {
        MovieLibrary lib = new MovieLibrary();
        lib.add(inception());
        Movie m = lib.findByTitle("INCEPTION");
        assertNotNull(m);
        assertEquals("Inception", m.getTitle());
    }

    @Test
    void removeByTitle_works() {
        MovieLibrary lib = new MovieLibrary();
        lib.add(inception());
        lib.add(dune());
        assertTrue(lib.removeByTitle("Dune"));
        assertEquals(1, lib.size());
        assertFalse(lib.removeByTitle("NotThere"));
    }

    @Test
    void averageRating_empty() {
        assertEquals(0.0, new MovieLibrary().averageRating(), 1e-9);
    }

    @Test
    void averageRating_basic() {
        MovieLibrary lib = new MovieLibrary();
        lib.add(inception());  // 8.8
        lib.add(dune());       // 8.0
        lib.add(toyStory());   // 8.3
        assertEquals((8.8 + 8.0 + 8.3) / 3.0, lib.averageRating(), 1e-9);
    }

    @Test
    void longestRuntime_returnsCorrect() {
        MovieLibrary lib = new MovieLibrary();
        lib.add(inception());  // 148
        lib.add(dune());       // 155
        lib.add(toyStory());   // 81
        assertEquals("Dune", lib.longestRuntime().getTitle());
    }

    @Test
    void longestRuntime_empty() {
        assertNull(new MovieLibrary().longestRuntime());
    }

    @Test
    void ratedAtLeast_filtersInsertionOrder() {
        MovieLibrary lib = new MovieLibrary();
        lib.add(inception());  // 8.8
        lib.add(dune());       // 8.0
        lib.add(toyStory());   // 8.3
        List<Movie> result = lib.ratedAtLeast(8.2);
        assertEquals(2, result.size());
        assertEquals("Inception", result.get(0).getTitle());
        assertEquals("Toy Story", result.get(1).getTitle());
    }

    @Test
    void ratedAtLeast_doesNotMutateLibrary() {
        MovieLibrary lib = new MovieLibrary();
        lib.add(inception());
        lib.add(dune());
        List<Movie> result = lib.ratedAtLeast(9.0); // none
        result.add(toyStory()); // should not affect lib
        assertEquals(2, lib.size());
    }
}
