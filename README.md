# Student Grades Calculator

A Java-based grade‐processing toolkit that:

- Computes a student’s total weighted score (with category drops/averaging).  
- Assigns a final letter grade based on the computed score.  
- Provides both an interactive driver (`GradeChecker`) and a batch/aggregating driver (`GradeChecker2` + `Gradebook`) to compute min, max, median, and average across multiple students.

---

## ⚙️ Prerequisites

- Java SE Development Kit (JDK) 8 or newer  
- A terminal or command prompt

---

## 🛠️ Compilation

1. **Navigate** to the `src` directory:

   ```bash
   cd Student-Grades-Calculator-main/Beta_PA3/src
   ```
2. **Compile** all .java files:<br>

   javac *.java

## ▶️ How to Run
1. GradeChecker (Interactive)
- Without a file (prompts you to type each value):<br>

   ```bash
   java GradeChecker
   ```
- java GradeChecker With a file (reads all inputs from grades.txt or your own file):<br>
   ```bash
   java GradeChecker grades.txt
   ```

**Input Format**

  1. Student name (String)
  2. G# (String)
  3. Participation (double, 0–100)
  4. Readings (comma‑separated list of doubles, out of 100)
  5. Labs (comma‑separated list of doubles)
  6. Exercises (comma‑separated list of doubles)
  7. Projects (comma‑separated list of doubles)
  8. Midterm (double)
  9. Final exam (double)

**GradeChecker2 + Gradebook (Batch + Summary)**

This driver:
- Runs the same prompts as GradeChecker,
- Then adds the resulting StudentGrades to a Gradebook,
- Prints the individual student’s details and the gradebook summary: Min, Median, Average, Max.

  ```bash
  # Interactive mode
  java GradeChecker2
  
  # File mode
  java GradeChecker2 grades.txt
  ```

**Sample**

  ```bash
  $ java GradeChecker grades.txt
  
  Enter a name (String): Alaya Chau
  Enter a G#: 01678345
  Enter participation: 100
  Enter a list of scores (out of 100) for the readings, separated by commas: 99.54, 76.25, 100.0, … 
  Enter a list of scores for the labs, separated by commas: 100, 100, …
  Enter a list of scores for the exercises, separated by commas: 78.0, 96.0, 100.0
  Enter a list of scores for the projects, separated by commas: 80.0, 100.0
  Enter a score for the midterm: 78.25
  Enter a score for the final exam: 80.0
  
  Grades
  Name: Amanda Chu
  G#: 01381239
  Participation: 100.0
  Readings: 97.785…, [76.25, 99.54, 100.0, …]
  Labs: 100.0, [100.0, 100.0, …]
  Exercises: 91.333…, [78.0, 96.0, 100.0]
  Projects: 90.0, [80.0, 100.0]
  Midterm: 78.25
  Final Exam: 80.0
  83.21, B
  ```

## ✅ Testing
You can craft your own input files following the Input Format above. There is no built‑in test harness, but you can:

1. Make copies of grades.txt with different values.
2. Run GradeChecker or GradeChecker2 against each file.
3. Verify the printed totals and letter grades match your expectations.
  
