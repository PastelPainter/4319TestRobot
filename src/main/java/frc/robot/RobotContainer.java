package frc.robot;

// import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.Auto;
import frc.robot.commands.DriveTrainMove;
import frc.robot.subsystems.Drivetrain;

public class RobotContainer {

    private final Drivetrain m_drivetrain = new Drivetrain();
    private final XboxController m_joystick = new XboxController(RobotMap.DRIVER_CONTROLLER);

    public RobotContainer(){
        m_drivetrain.setDefaultCommand(new DriveTrainMove(m_drivetrain, () -> m_joystick.getRawAxis(RobotMap.JOYSTICK.LEFT_STICK_Y), () -> m_joystick.getRawAxis(RobotMap.JOYSTICK.RIGHT_STICK_X)));
    }
    public Command getAutonomousCommand(){
        return new Auto(m_drivetrain);
    }
}
