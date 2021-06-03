package com.technoelevate.assignement3;

import java.util.Scanner;

public class QuesMainDemo {

	public static void main(String[] args) {
		

			String question1 = " OOPS concept in Java?" 
			+ " a. Inheritancen b.Encapsulation c.Abstraction d. All the above";

			String question2 = " Which concept of Java is a way of converting real world objects in terms of class?" 
					+ " a. Polymorphism b.  Encapsulation c. Abstraction d.Inheritance";
			
			String question3 = "Which of these coding types is used for data type characters in Java?" 
					+ " a. ASCII b. UNICODE c. NONE d.All of the above";
			
			String question4 = " When does Exceptions in Java arises in code sequence?" 
					+ " a.  Run Time b. Compilation Time c.  Can Occur Any Time d. None of the mentioned";
			
			String question5 = "Which of these keywords is used to manually throw an exception?" 
					+ " a. try b. finally c.  throw d. catch";
			
			String question6 = "Which method can be defined only once in a program?" 
					+ " a. main method b. finalize method c. static method d. private method";
			
			String question7 = "Which of this keyword must be used to inherit a class?"
					+ " a.  super b. this c. extent d.extends";
			
			String question8 = " What is the default value of a char in Java?" 
					+ " a. space  b. 0 c.  false d. null";

			Ques[] questions = { 
					new Ques(question1, "d"),
					new Ques(question2, "a"),
					new Ques(question3, "a"),
					new Ques(question4, "c"),
					new Ques(question5, "b"),
					new Ques(question6, "a"),
					new Ques(question7, "c"),
					new Ques(question8, "a"),
					
					};
			takeTest(questions);
	}
			
			public static void takeTest(Ques[] questions) {
				int score = 0;
				Scanner sc = new Scanner(System.in);
				for (int i = 0; i < questions.length; i++) {
					System.out.println(questions[i].question);
					String answer = sc.nextLine();
					if (answer.equals(questions[i].answer)) {
						score++;
					}
				}
				float scr=(float)score/questions.length;
				float percentage=scr*100f;
				System.out.println("you got " + score + " out of" + questions.length);
				System.out.println("you got "+percentage+"%");
				if(percentage<=33) {
					System.out.println("Your preformance is  bad");
					System.err.println("Not eligiable for next round");
				}
				else
					if(percentage<=54) {
						System.out.println("Your preformance is  poor");
						System.err.println("Not eligiable for next round");
						
					}
					else
						if(percentage<=60) {
							System.out.println("Your preformance is  good");
							System.err.println("Eligiable for next round");
						}
						else
							if(percentage<=75) {
								System.out.println("Your preformance is  very good");
								System.err.println("Eligiable for next round");
							}
							else {
								System.out.println("Your preformance is  excellent");
				               System.err.println("Eligiable for next round");
				               }
			}

	}

