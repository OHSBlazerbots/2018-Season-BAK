package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;
import org.usfirst.frc.team3807.robot.RobotMap;
import org.usfirst.frc.team3807.robot.subsystems.Chassis;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command{
	public static OI oi;
	public static Chassis chassis;
	
	public static void init(){
		chassis = new Chassis (RobotMap.LEFT, RobotMap.RIGHT);
		oi = new OI();
	}
	
	public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }

}
