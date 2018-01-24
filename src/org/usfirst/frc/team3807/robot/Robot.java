package org.usfirst.frc.team3807.robot;

import org.usfirst.frc.team3807.robot.commands.CommandBase;
import org.usfirst.frc.team3807.robot.commands.autonomous.DoNothingAuto;
import org.usfirst.frc.team3807.robot.commands.autonomous.DriveForward;
import org.usfirst.frc.team3807.robot.controllers.TalonSpeedController;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot{

	private Joystick joystick = new Joystick(RobotMap.JOYSTICK_PORT);
	private XboxController xbox = new XboxController(RobotMap.XBOX_CONTROLLER);

	Command autonomousCommand;
	SendableChooser autoChooser;
	
	@Override
	public void robotInit(){

		CommandBase.init();
		autoChooser = new SendableChooser();
		autoChooser.addDefault("DriveForward", new DriveForward());
		autoChooser.addDefault("DoNothingAuto",new DoNothingAuto());
		
		SmartDashboard.putData("Autonomous mode chooser", autoChooser);
	}

	@Override
	public void autonomousInit(){

		autonomousCommand = (Command) autoChooser.getSelected();
	
		if(autonomousCommand !=null){
			autonomousCommand.start();
		}
	}

	@Override
	public void autonomousPeriodic(){
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit(){
		if (autonomousCommand != null)
			autonomousCommand.cancel();
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
