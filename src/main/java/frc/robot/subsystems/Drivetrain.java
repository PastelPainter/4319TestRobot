package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
// import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
// import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drivetrain extends SubsystemBase { 
    
    // Left side motors
    private final MotorControllerGroup m_leftMotors =
            new MotorControllerGroup(new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_1),
                    new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_2));

    // Right side motors
    private final MotorControllerGroup m_rightMotors =
            new MotorControllerGroup(new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_3),
                    new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_4));


    public void setMotors(double left, double right) {
        m_leftMotors.set(left);
        m_rightMotors.set(right);
        m_rightMotors.setInverted(true);
    }
    
    public void stopMotors() {
        m_rightMotors.disable();
        m_leftMotors.disable();
    }
}
