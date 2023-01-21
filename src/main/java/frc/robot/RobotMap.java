package frc.robot;

public class RobotMap {

    public interface CAN {
        int DRIVETRAIN_LEFT_TALON_1 = 1;
        int DRIVETRAIN_LEFT_TALON_2 = 2;
        int DRIVETRAIN_RIGHT_TALON_3 = 3;
        int DRIVETRAIN_RIGHT_TALON_4 = 4;

    }

   /*
    public interface PWM  {
        int DRIVETRAIN_LEFT_VICTORSP_1 = 0;
        int DRIVETRAIN_LEFT_VICTORSP_2 = 1;
        int DRIVETRAIN_LEFT_VICTORSP_3 = 2;
        int DRIVETRAIN_LEFT_VICTORSP_4 = 3;
    }
    */

    public static final int DRIVER_CONTROLLER = 0;
    public static final int OPERATOR_CONTROLLER = 1; 

    // XBOX One Joysticks
    public interface JOYSTICK {
        public static final int LEFT_STICK_X = 0;
        public static final int LEFT_STICK_Y = 1;
        public static final int LEFT_TRIGGER = 2;
        public static final int RIGHT_TRIGGER = 3;
        public static final int RIGHT_STICK_X = 4;
        public static final int RIGHT_STICK_Y = 5;
    }



}
