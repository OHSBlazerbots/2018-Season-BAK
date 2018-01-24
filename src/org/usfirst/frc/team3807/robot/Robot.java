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

	private Joystick joystick = new Joystick(RobotMap.JOYSTICK_PORT);
	private XboxController xbox = new XboxController(RobotMap.XBOX_CONTROLLER);

	@Override
	public void robotInit(){

		CommandBase.init();
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
	}

	@Override
	public void testPeriodic(){

	}

	public void disablePeriodic(){
//		Scheduler.getInstance().run();
	}

}
