package org.firstinspires.ftc.teamcode.anay;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Disabled
@Autonomous(name = "Autonomous", group = "Default")
public class Autonomous_OpMode extends LinearOpMode {
    DcMotor bl = hardwareMap.get(DcMotor.class, "bl");
    DcMotor br = hardwareMap.get(DcMotor.class, "bl");

    @Override
    public void runOpMode() {
        waitForStart();
        while (opModeIsActive()) {
            bl.setPower(0.5);
            br.setPower(0.5);
        }
    }
}
