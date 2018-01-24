package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;
import org.usfirst.frc.team3807.robot.RobotMap;
import org.usfirst.frc.team3807.robot.subsystems.Chassis;

import edu.wpi.first.wpilibj.command.Command;

//CommandBase is the parent class for all other custom robot commands.
public abstract class CommandBase extends Command{
	public static OI oi;
	public static Chassis chassis;
	
	public static void init(){
		chassis = new Chassis (RobotMap.LEFT, RobotMap.RIGHT);
		
		
		oi = new OI(); //Always instantiate OI last.
	}
	
	public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }

}
