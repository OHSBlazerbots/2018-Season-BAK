package org.usfirst.frc.team3807.robot.subsystems;

//import org.usfirst.frc.team3807.robot.commands.DriveWithJoystick;

import org.usfirst.frc.team3807.robot.commands.DriveWithJoystick;
import org.usfirst.frc.team3807.robot.controllers.TalonSpeedController;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Subsystem;

/*
 * CTRE Talon Reference Deprecated, see Latest
 */
public class Chassis extends Subsystem {

	private boolean useXbox = false; //Set to true to enable control with the xbox controller
	private boolean xboxRightHand = false; //Set to true to change movement controls to the right joystick

	// Talon variables

//	private SpeedController left, right;
//	private TalonSRX leftTalon, rightTalon;

	WPI_TalonSRX leftMotor;  		/* device IDs here (1 of 2) */
	WPI_TalonSRX rightMotor;

	public DifferentialDrive drive;

	public Chassis(int L, int R) {
		if (L != -1 && R != -1) {

			leftMotor = new WPI_TalonSRX(L);
			rightMotor = new WPI_TalonSRX(R);

			// Make an actual object for speed controller


		}
		drive = new DifferentialDrive(leftMotor, rightMotor);
		drive.setSafetyEnabled(false);

	}

	public void drive(double speed, double turn) {
		drive.arcadeDrive(speed, turn);
	}

	public void driveWithJoystick(Joystick joystick) {
		double turn = joystick.getZ() * .75;
		SmartDashboard.putNumber("turn", turn);
		double move = joystick.getY() * .80;
		SmartDashboard.putNumber("move", move);
		drive(move, turn);
	}

	public void driveWithJoystickInverse(Joystick joystick) {
		double turn = joystick.getZ() * .75;
		double move = joystick.getY() * .80;
		drive(-move, -turn);
	}

	public void driveWithXbox(XboxController controller){
		if(xboxRightHand){
			double turn = controller.getX(GenericHID.Hand.kRight) * 0.25;
			double move = controller.getY(GenericHID.hand.kRight) * 0.25;
		}else{
			double turn = controller.getX(GenericHID.Hand.kLeft) * 0.25;
			double move = controller.getY(GenericHID.Hand.kLeft) * 0.25;
		}
		drive(move, turn);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		if(useXbox){
			setDefaultCommand(new DriveWithXbox());
		}else{
			setDefaultCommand(new DriveWithJoystick());
		}
	}

	public void Halt() {
		leftMotor.set(0);
		rightMotor.set(0);
	}



}
