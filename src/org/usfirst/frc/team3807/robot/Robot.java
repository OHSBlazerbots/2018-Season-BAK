package org.usfirst.frc.team3807.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot{
	public static OI oi;
	
	@Override
	public void robotInit(){
		oi = new OI();
		CommandBase.init();
	}
	
	@Override
	public void autonomousInit(){
		
	}
	
	@Override
	public void autonomousPeriodic(){
		
	}
	
	@Override
	public void teleopInit(){
		
	}
	
	@Override
	public void teleopPeriodic(){
		
	}
	
	@Override
	public void testPeriodic(){
		
	}

}
