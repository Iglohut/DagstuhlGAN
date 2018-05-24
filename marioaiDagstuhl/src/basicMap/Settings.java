package basicMap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Settings {
    public static final String WARN_MSG = "[WARN] ";

    public static final String DEBUG_MSG = "[DEBUG] ";
    public static final String ERROR_MSG = "[ERROR] ";
    public static final String INFO_MSG = "[INFO] ";
    public static final double MAX_VALUE = 1000000.0;

    public static final boolean ACCESSIBLE = true;

    public static final String CMD_SEPARATOR = " ";

	public static final String WASSERSTEIN_PATH = "/home/tjalling/Desktop/ru/natcomp/DagstuhlGAN/pytorch" + File.separator + "generator_ws.py";
	public static final String WASSERSTEIN_GAN = "/home/tjalling/Desktop/ru/natcomp/DagstuhlGAN/pytorch" + File.separator + "netG_epoch_5000.pth";

	// Jacob: IMPORTANT! This is a system-specific path that I had to set.
	// public static String PYTHON_PROGRAM = "/anaconda/bin/python";
	public static String PYTHON_PROGRAM = "/usr/bin/python";

    public static void printWarnMsg(String msg) {
        System.out.println(WARN_MSG + msg);
    }

    public static void printDebugMsg(String msg) {
        System.out.println(DEBUG_MSG + msg);
    }

    public static void printInfoMsg(String msg) {
        System.out.println(INFO_MSG + msg);
    }

    public static void printErrorMsg(String msg) {
        System.out.println(ERROR_MSG + msg);
    }


    public static void setPythonProgram() {
        Settings.PYTHON_PROGRAM = new String("/usr/bin/python");//
    }

}
