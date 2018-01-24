package org.usfirst.frc.team3807.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

//OI is used to obtain Operator Input.
public class OI {
	private static Joystick joystick = new Joystick(RobotMap.JOYSTICK_PORT);
	private static Joystick coDriver1 = new Joystick(RobotMap.CODRIVER_JOYSTICK_PORT);
	private static Joystick coDriver2 = new Joystick(RobotMap.CODRIVER_JOYSTICK_PORT2);
	public static XboxController xBoxCoDriver = new XboxController(RobotMap.XBOX_CONTROLLER);

	public OI(){

	}

	public static Joystick getJoystick(){
		return joystick;
	}

	public static Joystick getCoDriverJoystick1(){
		return coDriver1;
	}

	public static Joystick getCoDriverJoystick2(){
		return coDriver2;
	}

	public static XboxController getXboxController(){
		return xBoxCoDriver;
	}
}
