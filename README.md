# CS++ Midterm Challenge Lab

**Replaces:** College Board's retired *Celebrity Lab*
**Curriculum days:** 38–40 (AP CSA — CS++ 90-day plan)
**CED topics:** 1.12, 3.1, 3.2, 3.3, 3.4, 3.5, 3.9, 4.8, 4.9, 4.10

A 3-day object-design sprint. You build a fully-encapsulated `Movie` class and a `MovieLibrary` container that stores and queries movies via an `ArrayList`. Focus is on **encapsulation first, correctness second** — setters must validate, fields must be private, and repeated code must be refactored into private helpers.

This is one of your **primary midterm study artifacts** — finish it with a clean README.

---

## Day 1 — Design

**Objectives**
- Design a class hierarchy for a multi-entity application.
- Implement mutators & accessors with precondition checks.
- Pass the CS++ Maven test suite incrementally.

**Procedure (90 min)**
1. Lab overview (10 min)
2. Design stand-up — class diagram on paper/whiteboard (15 min)
3. Build sprint 1 — `Movie` skeleton + constructor (40 min)
4. Checkpoint: `mvn test` for `MovieTest` (15 min)
5. End-of-day reflection (10 min)

**Success criteria**
- Class skeletons compile
- Team has a written class diagram
- `MovieTest` constructor tests pass

**Exit ticket:** What public API did you commit to today?

---

## Day 2 — Mutators & Validation

**Objectives**
- Finish mutators & accessors.
- Add input validation in every setter (mirror constructor rules).
- Pass at least **75% of the test suite**.

**Procedure (90 min)**
1. Stand-up: blockers (10 min)
2. Build sprint 2 — setters, validation, `toString` (55 min)
3. Pair debugging (15 min)
4. Commit + `mvn test` (10 min)

**Success criteria**
- 75%+ Maven tests green
- Setters reject invalid input with a clear `IllegalArgumentException` message

**Exit ticket:** Which setter required the most validation logic?

---

## Day 3 — Polish & Submit

**Objectives**
- Complete the full object model (`Movie` + `MovieLibrary`).
- Refactor repeated code into private helpers.
- Submit with a clean README.

**Procedure (90 min)**
1. Stand-up (5 min)
2. Final build sprint (55 min)
3. Refactor pass — pull duplication into helpers (15 min)
4. Submit + demo (15 min)

**Success criteria**
- 100% Maven tests green
- README explains your design decisions (see "Design notes" section below)

**Exit ticket:** Where did you most apply the DRY principle today?

---

## What to implement

### `Movie.java`
Private fields: `title`, `director`, `runtimeMinutes`, `rating`.
- Constructor with validation (title/director non-empty, runtime ≥ 1, rating 0.0–10.0)
- Getters for all four fields
- Setters with the same validation rules (throw `IllegalArgumentException`)
- `toString()` returning exactly: `Title (Director, NN min) — R.R/10`

### `MovieLibrary.java`
Private `List<Movie>` field.
- `add(Movie m)` — rejects null
- `removeByTitle(String title)` — case-insensitive, returns `boolean`
- `size()`, `findByTitle(String title)` — case-insensitive, may return null
- `averageRating()` — 0.0 if empty
- `longestRuntime()` — first added wins ties; null if empty
- `ratedAtLeast(double minRating)` — new list, insertion order, does not mutate the library

## Workflow

```bash
mvn test          # all tests
mvn -Dtest=MovieTest test           # just Movie
mvn -Dtest=MovieLibraryTest test    # just the library
```

Commit & push — the autograder runs `mvn -B -q test` for your score.

## Design notes (fill in on Day 3)

Before submitting, add a short section below explaining:
- Why you chose the validation messages you did
- One place where you refactored duplicated code into a helper
- One edge case the test suite caught that surprised you

## Requirements

- Java 17+
- Maven 3.8+
