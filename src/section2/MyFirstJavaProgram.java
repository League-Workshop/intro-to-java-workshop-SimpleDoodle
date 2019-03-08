package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot walle = new Robot();
		walle.setSpeed(10000);
		walle.penDown();
		for (int i = 0; i < 3; i++) {
			walle.move(200);
			walle.turn(120);

		}

		walle.penUp();
	}
}
