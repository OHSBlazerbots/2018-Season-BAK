package org.usfirst.frc.team3807.robot;

import org.usfirst.frc.team3807.robot.commands.CommandBase;
import org.usfirst.frc.team3807.robot.controllers.TalonSpeedController;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot{
	
	
//	WPI_TalonSRX _frontLeftMotor = new WPI_TalonSRX(6); 		/* device IDs here (1 of 2) */
//	WPI_TalonSRX _frontRightMotor = new WPI_TalonSRX(3);
	private Joystick joystick = new Joystick(1);
	
	//DifferentialDrive drive = new DifferentialDrive(_frontLeftMotor, _frontRightMotor);
	
	@Override
	public void robotInit(){
		
		CommandBase.init();
		//drive.setSafetyEnabled(false);
	}
	
	@Override
	public void autonomousInit(){
		
	}
	
	@Override
	public void autonomousPeriodic(){
		Scheduler.getInstance().run();
	}
	
	@Override
	public void teleopInit(){
		
	}
	
	@Override
	public void teleopPeriodic(){
		Scheduler.getInstance().run();
//		double forward = joystick.getY();
//		double turn = joystick.getZ();
//		drive.arcadeDrive(forward,turn);
	}
	
	@Override
	public void testPeriodic(){
		
	}
	
	public void disablePeriodic(){
//		Scheduler.getInstance().run();
	}

}
