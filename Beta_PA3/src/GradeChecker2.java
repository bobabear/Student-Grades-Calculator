/*

@@@@@&&&&&&&&####BBBBBBGGGGGGGGGPPPPPPPPPGGGGGGPGGGGGGGGBBBBB#####&&&&&&&&&
@@@@@&&&&&&###BBBBBBGGGGGGGGPGGPPPGGGPPPPPPPPPPPPPPPPGGGGGGBBB#####&&&&&&&&
&@@@&&&&&####BBBBGGGGGGGPPPGBB###B##BBGGGGGGGGP55555PPPPPGGGBBBB#####&&&&&&
&@@&&&&&####BBBGGGGPPPPPGG##&&&&&&&##BBBB####&#BG55555PPPPGGGGGBBB#####&&&&
&&&&&&&###BBBGGGGPPPPPGB&&&&&&&&&#&&###B##&&&&&&&BGP55555PPPPGGGBBBB####&&&
&&&&&&###BBBGGPPPPPPPB&&&&&&&&&&&&&###########&&&&&#BP55555PPPPGGGBBBB###&&
&&&&&###BBBGGGPPPPPG#@@@@&&&&&#BGP55YJJJJJJJY5PGB&&&&&G55555PPPPGGGGBBB####
&&&&###BBGGGGPP555G&@@@&#GPP5Y?7!!!!!!!!!77??JY5PG#&&&&#555555PPPPGGGGBB###
&&&###BBBGGGPP555P#@&&&PJ?77!~~~~~~~~~~~!!77??JY5PB&&&&@GYY55555PPPPGGGBBB#
####BBBGGGPPP55555#@@&#Y77!!~~~^~~^~~~~~!!!77??JY5G#&&&&GYYYYY5555PPPGGGBBB
####BBGGGPPPP55555#@@&#Y7!!~~~~~~~~~~~~!!!7777?JY5G#&@@&PYYYYYYYY555PPPGGGB
###BBBGGPPPP555555G&@&GJ7!!!!~~^^~~~~~~~!!7????JYPPB&&@&5JJJJYYYYY555PPPGGG
###BBGGPPPP55555555B@&P??77?777!!~~~~~!7JYPP555PPPPG#&@BYJJJJJJJYYYY55PPPGG
##BBBGGPPP555555YYY5B#Y??JYYYYPP5J?777J5PPPPPPGPPPPPG##PJJJJJJJJYYYY555PPGG
##BBGGGPP555555YYYY?JPJ77?J555PP5YJ?7?555YJJYYYYYYY5PBG5YJJJJJJYYYYYY55PPGG
BBBBGGGPP55555YYYYY?7JJ77777777777?77?Y5J77!7777?JY5PG55YJJJJJJYYYYYY55PPGG
BBBBGGPPP5555YYYYYYJ!?J77!~~~~!!!7?7!7Y5YJ7!~~!!7?Y5GBGPYJJJJJJJYYYYY55PPGG
BBBBGGPPP55555YYYYYY??J?7!~~~!777??7!7Y5Y5Y?7777?J5PGBG5YJJJJJJJYYYY555PPPG
BBBBGGPPP55555YYYYYYJJJ?7777??777????JY55YYJYYYYY5PPGB5YJJJJJJJJJYYY555PPPG
BBBGGGPPP5555YYYYYYYYYY?77?JJJJJ??777??JYY5GPPYJJY5PGPJJJJJJJJJJJYYYY55PPPP
BBBGGGPP55555YYYYYYYYYYJ777!77?JY??777??J5GP5J?7?55GGYJJJJJJJJJJJYYYY55PPPP
BBBGGPPP55555YYYYYYYYY5PY?777777???77??JY555YJ?J5GBGYJJJYJJJJJJJJJYYYY55PPP
BBBGGPPP55555YYYYY55PG#BJYYJ??77777777??JYYYY5PGB#PJJJJJJJJJJJJJJJJYYYY55PP
BBBGGPPP5555555PGB##&&@#7!J5YJJ???77777?JYY5GB###GJYYJJJJJJJJJJJJJJJYYY55PP
BBBGGPP55PPGB##&&&&&&&&&5^^!J555YYJ???JJ5PGB####BYYB#BGP5YJJJJJJJJJJYY55PPG
BBBGGGGB##&&&&&&&&&&&&&&&5^::^7JY5555PGGBB###BG5??5&@@&&&##GGP5YYJJYYY55PPG
##&&&&&&&&&&&&&&&&&&&&&&&&P~:..:^!?JY5PGGGGG5?!!!?G&@@@@@@@@@&&&#BGGPPPPPGG
&&@&&&&&&&&&&&&&&&&&&&&&&&&P~:....::~!?JJJ7!~^~!7JB&@@@@@@@@@@@@@@@@&&&##BB
&@@@&&&&&&&&&&&&&&&&&&&&&&&&5^::::...:~!!!!~~^~!7YB&@@@@@@@@@@@@@@@@@@@@@@&
&@@@@&&&&&&&&&&&&&&&&&&&&&&&#Y^.::::^~~^~!7JJ7!!?YB&&&@&&@@&&&&@@@&@@@@@@@@
&@@@@&&&@&&&&&&&&&&&&&&&&&&&&#7::::~77!^~!?55J77?YG&&&@@&&&&&@&&@&&@@&@@@@@
&@@@@&&&&@@&&&&&&&&&&&&&&&&&&&G~::~!~~!!~!YY7777??P&&@@&&@&&&@@@@@@@@@@@@@@
&@@@@@&&&&@@&&&&&&&&&&&&&&&&&&#5^~~~^^~7!!J?!!!!?75&&@@@&@@&@@@@@@@@@@@@@@@
@@@@@@@@&@@@&&&&&&&&&&&&&&&&&&&#J^^^~^~~^~J?7!!!!7P&@@@&&@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@&&&&&&&&&&&&&&&&&&&&G!^~~~~~^~J5J7!~~7P&@@@&&@@@@@@@@@@@@@@@@@@
*/

import java.util.Random;
import java.util.Scanner;
//import java.io.File;

public class GradeChecker2 {
	public static void main(String[] args){
		runThreeGrades();

	}

	public static void runThreeGrades() {
		Random rand = new Random();
		
		double[] defaultWeights = {0.05, 0.05, 0.15, 0.09, 0.21, 0.2, 0.25};
		String sn1 = "Test1";
		String sn2 = "Test2";
		String sn3 = "Test3";

		String gNum1 = "4323423";
		String gNum2 = "2296553";
		String gNum3 = "09020";
		
		
		StudentGrades sg1 = new StudentGrades(sn1, gNum1, defaultWeights);
		StudentGrades sg2 = new StudentGrades(sn2, gNum2, defaultWeights);
		StudentGrades sg3 = new StudentGrades(sn3, gNum3, defaultWeights);

		for (int i = 0; i < 19; i++) {
			sg1.addReading(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 4; i++) {
			sg1.addLab(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 5; i++) {
			sg1.addExercise(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 3; i++) {
			sg1.addProject(Math.round((rand.nextDouble(100-70) + 70)));
		}
		sg1.setParticipation(100);
		sg1.setMidterm(75.0);
		sg1.setFinalExam(95.0);
		
		System.out.println(sg1);

		for (int i = 0; i < 9; i++) {
			sg2.addReading(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 3; i++) {
			sg2.addLab(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 7; i++) {
			sg2.addExercise(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 4; i++) {
			sg2.addProject(Math.round((rand.nextDouble(100-70) + 70)));
		}
		sg2.setParticipation(99);
		sg2.setMidterm(89.0);
		sg2.setFinalExam(88.0);
		
		System.out.println(sg2);
		
		for (int i = 0; i < 5; i++) {
			sg3.addReading(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 6; i++) {
			sg3.addLab(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 6; i++) {
			sg3.addExercise(Math.round((rand.nextDouble(100-70) + 70)));
		}
		for (int i = 0; i < 5; i++) {
			sg3.addProject(Math.round((rand.nextDouble(100-70) + 70)));
		}
		sg3.setParticipation(95);
		sg3.setMidterm(95.0);
		sg3.setFinalExam(97.0);
		
		System.out.println(sg3);

		Gradebook gb = new Gradebook();

		gb.addGrade(sg1);
		gb.addGrade(sg2);
		gb.addGrade(sg3);

		System.out.println("Min:");
		System.out.println(gb.min());



		System.out.println("Median:");
		System.out.println(gb.median());

		System.out.println("Max:");
		System.out.println(gb.max());
		
		

	}

	public static void runInputTest() {
		double[] defaultWeights = {0.05, 0.05, 0.15, 0.09, 0.21, 0.2, 0.25};
		try{
			System.out.println(	"This driver class should let you test out much of the "+
								"functionality of the StudentGrades class, but you should "+
								"still write your own tests! For each grade you enter below "+
								"be sure to enter as a percentage out of 100. For example, "+
								"for an exercise score of 48/50 you should enter \"96.0\" "+
								"(without quotes). For lists of scores, enter as a comma "+
								"separated list: \"96.0, 85.1, 100.0\" (without quotes). "+
								"If you provide a filename as a command line argument, it "+
								"data will be pulled from that source rather than "+
								"interactively.");
			Scanner scan;
			//if(args.length > 0){
			//	scan = new Scanner(new File(args[0]));
			//} else {
			scan = new Scanner(System.in);
			//}
			System.out.print("Enter a name (String): ");
			String studentName = scan.nextLine();
			System.out.print("Enter a G#: ");
			String gNumber = scan.nextLine();
			StudentGrades sg = new StudentGrades(studentName, gNumber, defaultWeights);
			//Participation
			String line;
			System.out.print("Enter participation: ");
			sg.setParticipation(Double.parseDouble(scan.nextLine()));
			//Readings
			System.out.print("Enter a list of scores (out of 100) for the readings, separated by commas: ");
			line = scan.nextLine();
			for(String scoreStr : line.split(",")){
				sg.addReading(Double.parseDouble(scoreStr.trim()));
			}
			//Labs
			System.out.print("Enter a list of scores (out of 100) for the labs, separated by commas: ");
			line = scan.nextLine();
			for(String scoreStr : line.split(",")){
				sg.addLab(Double.parseDouble(scoreStr.trim()));
			}
			//Exercises
			System.out.print("Enter a list of scores (out of 100) for the exercises, separated by commas: ");
			line = scan.nextLine();
			for(String scoreStr : line.split(",")){
				sg.addExercise(Double.parseDouble(scoreStr.trim()));
			}
			//Projects
			System.out.print("Enter a list of scores (out of 100) for the projects, separated by commas: ");
			line = scan.nextLine();
			for(String scoreStr : line.split(",")){
				sg.addProject(Double.parseDouble(scoreStr.trim()));
			}
			//Midterm
			System.out.print("Enter a score for the midterm: ");
			sg.setMidterm(Double.parseDouble(scan.nextLine()));
			//Final
			System.out.print("Enter a score for the final exam: ");
			sg.setFinalExam(Double.parseDouble(scan.nextLine()));
			scan.close();
			//test output:
			System.out.println("Grades");
			System.out.println(sg);

			Gradebook gb = new Gradebook();
			gb.addGrade(sg);

			System.out.println("\nTest\n");

			gb.median();

		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
