package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
	
		Robot rob  = new Robot();
	
		
		
		
		
		
		for(int i=0; i<3; i++) {
			drawPointyRoof(rob, "small");
			drawFlatRoof(rob, "large");
			drawPointyRoof(rob, "medium");		
			
		
	}
				
		

	
	
	
	}
	void drawFlatRoof(Robot rob, String height) {
	if (height.equals("large")) {
		rob.hide();
	rob.setSpeed(100);
	rob.penDown();
	rob.setRandomPenColor();
	rob.move(250);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(250);
	rob.turn(270);
	rob.move(20);
	rob.turn(-90);
	}
	}
void drawPointyRoof(Robot rob, String height) {
	if(height.equals("small")) {
	rob.hide();
	rob.setSpeed(100);
	rob.penDown();
	rob.setRandomPenColor();
	rob.move(60);
	rob.turn(45);
	rob.move(20);
	rob.turn(90);
	rob.move(20);
	rob.turn(45);
	rob.move(60);
	rob.turn(270);
	rob.move(20);
	rob.turn(-90);
	}
	if(height.equals("medium")) {
		rob.hide();
		rob.setSpeed(100);
		rob.penDown();
		rob.setRandomPenColor();
		rob.move(120);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		rob.move(120);
		rob.turn(270);
		rob.move(20);
		rob.turn(-90);
		}
	if(height.equals("large")) {
		rob.hide();
		rob.setSpeed(100);
		rob.penDown();
		rob.setRandomPenColor();
		rob.move(250);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		rob.move(250);
		rob.turn(270);
		rob.move(20);
		rob.turn(-90);
		}

}



}
