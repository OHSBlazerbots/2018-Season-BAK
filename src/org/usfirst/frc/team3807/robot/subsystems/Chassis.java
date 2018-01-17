package org.usfirst.frc.team3807.robot.subsystems;

//import org.usfirst.frc.team3807.robot.commands.DriveWithJoystick;

import org.usfirst.frc.team3807.robot.controllers.TalonSpeedController;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

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

	//Talon variables
	private SpeedController left, right;
	private TalonSRX leftTalon, rightTalon;
	
	public DifferentialDrive drive;
	private DigitalInput limitSwitch;
	
	private boolean reverse;
	
	public Chassis(int L, int R) {
		if (L != -1 && R != -1) {
			
			//Make an actual object for speed controller
			//left = new TalonSpeedController(leftTalon);
			//right = new TalonSpeedController(rightTalon);
			
		}
		//drive = new DifferentialDrive(left, right);
		//drive.setSafetyEnabled(false);
		
		limitSwitch = new DigitalInput(0);
	}
	
	public void drive(double speed, double turn) {
		//drive.arcadeDrive(speed, turn);
	}
	
	 public void driveWithJoystick(Joystick joystick) {
			double turn = joystick.getZ()*.75;
			SmartDashboard.putNumber("turn", turn);
				double move = joystick.getY()*.80;
				 SmartDashboard.putNumber("move", move);
				drive(move, turn + 0.0);
		 }
	 
	 public void driveWithJoystickInverse(Joystick joystick) {
			double turn = joystick.getZ()* .75;
				double move = joystick.getY()*.80;
				drive(-move, -turn);
		}
	 
	 public void initDefaultCommand() {
			// Set the default command for a subsystem here.
			//setDefaultCommand(new DriveWithJoystick()); 
		
		}
	 
	 public void Halt() {
			left.set(0);
			right.set(0);
		}
	 
	 public boolean isLimitSwitchPressed()
		{
			return !limitSwitch.get();
		}


}
