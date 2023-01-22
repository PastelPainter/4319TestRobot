// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

import com.kauailabs.navx.frc.*;

public class Auto extends CommandBase {
  private AHRS ahrs = new AHRS(SerialPort.Port.kMXP);
  private final Drivetrain drivetrain;

  public Auto(Drivetrain drivetrain) {
    this.drivetrain = drivetrain;
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    ahrs.calibrate();
    SmartDashboard.putNumber("pitch", ahrs.getPitch());
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   
    if (ahrs.getPitch() > 0) {
      drivetrain.setMotors(-0.2, -0.2);
    }
    if (ahrs.getPitch() < 0) {
      drivetrain.setMotors(0.2, 0.2);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
