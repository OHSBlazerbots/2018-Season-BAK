package org.usfirst.frc.team3807.robot.controllers;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;

public class TalonSpeedController implements SpeedController {
	
	private TalonSRX talon;
	
	public TalonSpeedController(TalonSRX talon)
	{
		this.talon = talon;
	}

	@Override
	public void pidWrite(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getInverted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void set(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInverted(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopMotor() {
		// TODO Auto-generated method stub
		
	}

}
