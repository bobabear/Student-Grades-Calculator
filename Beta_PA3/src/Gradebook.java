/*
 * Names: Amanda Chu, Juan Carlos Garcia Solis, Raul Valencia
 * netID: achu4, Jgarcias, rvalencia
 * G#: 01381239, 01282623
 * Lecture section: 004, 004, 004
 * Lab section: 208, 208, 208
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import static java.util.Collections.sort;

/**
 *
 */
public class Gradebook implements Comparator<StudentGrades>{
	private Collection<StudentGrades> grades;
	//ArrayList<StudentGrades> gradesSort = new ArrayList<StudentGrades>(grades);
	//gradesSort.sort(grades);
	/**
	 *
	 */
	public Gradebook() {
		this.grades = new ArrayList<StudentGrades>();
	}

	/**
	 *
	 * @param sg
	 */
	public void addGrade(StudentGrades sg) {
		grades.add(sg);
	}

	/**
	 *
	 * @return
	 */
	public double average() {
		if (grades.isEmpty()) {
			return 0.0;
		}

		double totalSum = 0.0;
		for (StudentGrades sg : grades) {
			totalSum += sg.totalScore();
		}
		return (totalSum / grades.size());
	}

	/**
	 *
	 * @return
	 */
	public StudentGrades min() {
		ArrayList<StudentGrades> gradesSort = new ArrayList<StudentGrades>(grades);
		gradesSort.sort(this);
		//System.out.println("pre sort");
		//for (StudentGrades grade : gradesSort) {
			//System.out.println(grade);
		//}
		gradesSort.sort(this);
		//System.out.println("Post sort: \n");
		for (StudentGrades grade : gradesSort) {
			System.out.println(grade);
		}
		return gradesSort.getFirst();
	}

	/**
	 *
	 * @return
	 */
	public StudentGrades max() {
		ArrayList<StudentGrades> gradesSort = new ArrayList<StudentGrades>(grades);
		gradesSort.sort(this);
		//System.out.println("Post maxsort: \n");
		for (StudentGrades grade : gradesSort) {
			System.out.println(grade);
		}
		return gradesSort.getLast();
	}

	/**
	 *
	 * @return
	 */
	public StudentGrades median() {
		ArrayList<StudentGrades> gradesSort = new ArrayList<StudentGrades>(grades);
		gradesSort.sort(this);
		return gradesSort.get((gradesSort.size() / 2));
	}

	public int compare(StudentGrades left, StudentGrades right){
		return Double.compare(left.totalScore(), right.totalScore());
	}

	//provided
	public String toString(){
		String rv = "Grades: [ ";
		for(StudentGrades sg : grades){
			rv += "("+sg.getStudentName()+": "+sg.letterGrade()+"), ";
		}
		rv += "]\n";
		rv += "Max: "+max()+", Median: "+median()+", Average: "+average()+", Min: "+min();
		return rv;
	}

}