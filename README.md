# Kotlin MutableList removeIf() Unexpected Behavior

This repository demonstrates an uncommon bug related to the `removeIf()` function in Kotlin's `MutableList`.  The `removeIf()` function iterates through the list and removes elements that satisfy a given predicate. However, if the predicate's action modifies the list's structure (e.g., removing elements), the iteration can produce unexpected results.

The `bug.kt` file contains code that exhibits this issue. The `bugSolution.kt` file shows a safe alternative using an iterator.