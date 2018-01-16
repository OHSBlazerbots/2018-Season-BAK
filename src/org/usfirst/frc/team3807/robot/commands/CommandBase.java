package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command{
	public static OI oi;
	
	public static void init(){
		
		oi = new OI();
	}
	
	public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }

}
