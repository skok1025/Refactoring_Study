package code_1._7;

public class Main {
	
	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
		
		robot.order(Robot.Command.WALK); // walk
		robot.order(Robot.Command.STOP); // stop
		robot.order(Robot.Command.JUMP); // jump
		
	}

}
