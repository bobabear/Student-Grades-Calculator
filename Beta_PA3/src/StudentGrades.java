/*
 * Names: Amanda Chu, Juan Carlos Garcia Solis, Raul Valencia
 * netID: achu4, Jgarcias, rvalencia
 * G#: 01381239, 01282623
 * Lecture section: 004, 004, 004
 * Lab section: 208, 208, 208
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class StudentGrades {
    /**
     * Student Information
     */
    private String studentName;
    private String gNumber;

    /**
     * Student Performance
     */
    private double participation;
    private double midterm;
    private double finalExam;

    /**
     * Students Work
     */
    private List<Double> readings = new ArrayList<>();
    private Collection<Double> labs = new ArrayList<>();
    private Collection<Double> excercises = new ArrayList<>();
    private Collection<Double> projects = new ArrayList<>();

    /**
     * Exam Weight
     */
    private double participationWeight;
    private double readingsWeight;
    private double labsWeight;
    private double exercisesWeight;
    private double projectsWeight;
    private double midtermWeight;
    private double finalExamWeight;

    /**
     * This is the constructor for the Gradebook class
     * @param name - student's name
     * @param gNumber - student's gnumber
     * @param weights - a double array all the weights
     */
    public StudentGrades(String name, String gNumber, double[] weights) {
        this.studentName = name;
        this.gNumber = gNumber;
        setWeights(weights);
    }

    /**
     * Grabs the student's participation points
     * @return participation - retrieves student's participation points
     */
    public double getParticipation() {
        return participation;
    }

    /**
     * Grabs the student's midterm exam score
     * @return midterm - retrieves student's midterm exam score
     */
    public double getMidterm() {
        return midterm;
    }

    /**
     * Grabs the student's final exam score
     * @return finalExam - retrieves student's final exam score
     */
    public double getFinalExam() {
        return finalExam;
    }

    /**
     * Grabs the student's name
     * @return studentName - retrieves student's name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Grabs the student's gnumber
     * @return gNumber - retrieves student's gnumber
     */
    public String getgNumber() {
        return gNumber;
    }

    /**
     * Sets the student's participation points
     * @param participation - participation points
     */
    public void setParticipation(double participation) {
        this.participation = participation;
    }

    /**
     * Sets the student's midterm score
     * @param midterm - midterm exam score
     */
    public void setMidterm(double midterm) {
        this.midterm = midterm;
    }

    /**
     * Sets the student's final exam score
     * @param finalExam - final exam score
     */
    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    /**
     * Sets the student's name
     * @param studentName - student's name
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Set the student's gnumber
     * @param gNumber - student's gnumber
     */
    public void setgNumber(String gNumber) {
        this.gNumber = gNumber;
    }

    /**
     * Add reading weight to reading scores
     * @param readingsWeight - weight of the readings
     */
    public void addReading(double readingsWeight) {
        readings.add(readingsWeight);
    }

    /**
     * Add lab weight to labs scores
     * @param labsWeight - weight of the labs
     */
    public void addLab(double labsWeight) {
        labs.add(labsWeight);
    }

    /**
     * Add exercise weight to exercises scores
     * @param exercisesWeight - weight of the exercises
     */
    public void addExercise(double exercisesWeight) {
        excercises.add(exercisesWeight);
    }

    /**
     * Add project weight to projects scores
     * @param projectsWeight - weight of the projects
     */
    public void addProject(double projectsWeight) {
        projects.add(projectsWeight);
    }

    /**
     * Places each weight category into position in the double array
     * @param weights - index in double array
     */
    public void setWeights(double[] weights) {
        this.participationWeight = weights[0];
        this.readingsWeight = weights[1];
        this.labsWeight = weights[2];
        this.exercisesWeight = weights[3];
        this.projectsWeight = weights[4];
        this.midtermWeight = weights[5];
        this.finalExamWeight = weights[6];
    }

    /**
     * Calculates the total reading scores unweighted with 15 drops
     * @return mySum - the sum of the reading scores unweighted with 15 drops
     */
    public double unweightedReadingsScore() {
        if (readings.size() < 16) {
            return 100.0;
        }

        Double mySum = 0.0;
        Collections.sort(readings);
        for (int i = 0; i < readings.size(); i++) {
            if (i >= 15) {
                mySum += readings.get(i);
            }
        }
        return (mySum / (readings.size() - 15));
    }

    /**
     * Calculates the total lab scores unweighted
     * @return mySum - the sum of the lab scores unweighted
     */
    public double unweightedLabsScore() {
        if (labs.isEmpty()) {
            return 100.0;
        }

        Double mySum = 0.0;
        for (Double lab : labs) {
            mySum += lab;
        }
        return (mySum / labs.size());
    }

    /**
     * Calculates the total exercise scores unweighted
     * @return mySum - the sum of the excersise scores unweighted
     */
    public double unweightedExercisesScore() {
        if (excercises.isEmpty()) {
            return 100.0;
        }

        Double mySum = 0.0;
        for (Double excercise : excercises) {
            mySum += excercise;
        }
        return (mySum / excercises.size());
    }

    /**
     * Calculates the total projects scores unweighted
     * @return mySum - the sum of the project scores unweighted
     */
    public double unweightedProjectsScore() {
        if (projects.isEmpty()) {
            return 100.0;
        }

        Double mySum = 0.0;
        for (Double project : projects) {
            mySum += project;
        }
        return (mySum / projects.size());
    }

    /**
     * Replaces the midterm with the final if the final score is greater than the midterm score
     * @return boolean - true or false depending if the final exam score is greater than the midterm exam score
     */
    public boolean finalReplacesMidterm() {
        if (finalExam > midterm) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *
     * @return boolean - true or false depending on if the score passes or not
     */
    public boolean finalIsPassing() {
        if (finalExam >= 60.0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *
     * @return total - the total score with weights
     */
    public double totalScore() {
        double total = 0.0;

        total = total + (participation * participationWeight) + (unweightedExercisesScore() * exercisesWeight) +
        (unweightedProjectsScore() * projectsWeight) + (unweightedLabsScore() * labsWeight) + (unweightedReadingsScore() * readingsWeight);

        total = finalReplacesMidterm() ?
                (total + (finalExam * finalExamWeight) + (finalExam * midtermWeight)) :
                (total + (finalExam * finalExamWeight) + (midterm * midtermWeight));

        return total;
    }

    /**
     *
     * @return letter grade - letter grade depending on the number range it falls in
     */
    public String letterGrade(){
        if (!(finalIsPassing())) {
            return "F";
        }

        double finalScore = totalScore();

        if (finalScore < 60 ){
            return "F";

        }
        else if (finalScore < 70 ) {
            return "D";
        }

        else if (finalScore < 72 ) {
            return "C-";
        }
        else if (finalScore < 78 ) {
            return "C";
        }
        else if (finalScore < 80 ) {
            return "C+";
        }

        else if (finalScore < 82 ) {
            return "B-";
        }
        else if (finalScore < 88 ) {
            return "B";
        }
        else if (finalScore < 90 ) {
            return "B+";
        }

        else if (finalScore < 92 ) {
            return "A-";
        }
        else if (finalScore < 98 ) {
            return "A";
        }
        else if (finalScore <= 100 ) {
            return "A+";
        }

        return "Not Within Range";
    }

    @Override
    public String toString(){
        String rv = "Name: " + getStudentName() + "\n";
        rv += "G#: " + getgNumber() + "\n";
        rv += "Participation: " + getParticipation() + "\n";
        rv += "Readings: " + unweightedReadingsScore() + ", " + readings + "\n";
        rv += "Labs: " + unweightedLabsScore() + ", " + labs + "\n";
        rv += "Exercises: " + unweightedExercisesScore() + ", "+ excercises + "\n";
        rv += "Projects: " + unweightedProjectsScore() + ", " + projects + "\n";
        rv += "Midterm: " + getMidterm() + "\n";
        rv += "Final Exam: " + getFinalExam() + "\n";
        rv += totalScore() + ", " + letterGrade() + "\n";
        return rv;
    }
}
