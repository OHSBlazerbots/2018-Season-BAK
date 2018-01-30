package org.usfirst.frc.team3807.robot.subsystems.scissorlift;

import org.usfirst.frc.team3807.robot.commands.CommandBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class ExtendScissorlift extends CommandBase {

	double scissorliftSpeed;
	
	WPI_TalonSRX scissorLiftMot1;
	WPI_TalonSRX scissorLiftMot2;
	
	
	public RunScissorlift(double spd) {
		scissorliftSpeed = spd;
		requires(Scissorlift);
	}
	
	public void initialize() {
		scissorLiftMot1.extendLift(scissorliftSpeed);
		scissorLiftMot2.extendLift(scissorliftSpeed)
	}
	
	public void excecute() {
		
	}
	
	public void end() {
		
	}
	
	public boolean isFinished() {
		return true;
	}
	
}
