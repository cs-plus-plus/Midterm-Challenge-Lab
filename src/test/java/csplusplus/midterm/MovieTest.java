package csplusplus.midterm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    void constructor_validFields() {
        Movie m = new Movie("Inception", "Christopher Nolan", 148, 8.8);
        assertEquals("Inception", m.getTitle());
        assertEquals("Christopher Nolan", m.getDirector());
        assertEquals(148, m.getRuntimeMinutes());
        assertEquals(8.8, m.getRating(), 1e-9);
    }

    @Test
    void constructor_rejectsEmptyTitle() {
        assertThrows(IllegalArgumentException.class,
            () -> new Movie("", "Nolan", 148, 8.8));
    }

    @Test
    void constructor_rejectsNullDirector() {
        assertThrows(IllegalArgumentException.class,
            () -> new Movie("Inception", null, 148, 8.8));
    }

    @Test
    void constructor_rejectsBadRuntime() {
        assertThrows(IllegalArgumentException.class,
            () -> new Movie("X", "Y", 0, 5.0));
    }

    @Test
    void constructor_rejectsBadRating() {
        assertThrows(IllegalArgumentException.class,
            () -> new Movie("X", "Y", 100, 11.0));
        assertThrows(IllegalArgumentException.class,
            () -> new Movie("X", "Y", 100, -0.1));
    }

    @Test
    void setters_acceptValidUpdates() {
        Movie m = new Movie("X", "Y", 100, 5.0);
        m.setTitle("Z");
        m.setDirector("D");
        m.setRuntimeMinutes(90);
        m.setRating(7.5);
        assertEquals("Z", m.getTitle());
        assertEquals("D", m.getDirector());
        assertEquals(90, m.getRuntimeMinutes());
        assertEquals(7.5, m.getRating(), 1e-9);
    }

    @Test
    void setters_rejectInvalidUpdates() {
        Movie m = new Movie("X", "Y", 100, 5.0);
        assertThrows(IllegalArgumentException.class, () -> m.setRating(-1.0));
        assertThrows(IllegalArgumentException.class, () -> m.setRuntimeMinutes(-5));
        assertThrows(IllegalArgumentException.class, () -> m.setTitle(""));
    }

    @Test
    void toString_format() {
        Movie m = new Movie("Inception", "Christopher Nolan", 148, 8.8);
        assertEquals("Inception (Christopher Nolan, 148 min) — 8.8/10", m.toString());
    }
}
