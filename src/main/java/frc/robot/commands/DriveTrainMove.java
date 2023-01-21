package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

public class DriveTrainMove extends CommandBase {

    private final Drivetrain drivetrain;
    private final Supplier<Double> speedFunction, turnFunction;

    public DriveTrainMove (Drivetrain drivetrain, Supplier<Double> speedFunction, Supplier<Double> turnFunction) {
        this.turnFunction = turnFunction;
        this.speedFunction = speedFunction;
        this.drivetrain = drivetrain;
        addRequirements(drivetrain);
    }

    public void execute() {
        double realTimeSpeed = speedFunction.get();
        double realTimeTurn = turnFunction.get();
    
       SmartDashboard.putNumber("real time speed", realTimeSpeed);
       SmartDashboard.putNumber("real time turn", realTimeTurn);

        if (Math.abs(realTimeSpeed)< 0.2 && Math.abs(realTimeTurn)< 0.2) {
            drivetrain.setMotors(0, 0);
        } else { 
            double left = realTimeSpeed + realTimeTurn;
            double right = realTimeSpeed - realTimeTurn;
            drivetrain.setMotors(left, right);
        }
    }
}
