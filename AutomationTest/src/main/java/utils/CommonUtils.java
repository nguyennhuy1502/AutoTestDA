package utils;

import java.util.Date;
import java.util.Random;

public class CommonUtils {
    public static final int IMPLICIT_WAIT_TIME=10;
    public static final int PAGE_LOAD_TIME=15;
    public static final int EXPLICIT_WAIT_BASIC_TIME=50;

    public String getEmailWithTimeStamp() {
        Random random = new Random();
        int number = random.nextInt(9999);
        return "kumkuma"+number+"@gmail.com";

    }
    public String emailIsMissingTheFollowingPart() {
        Random random = new Random();
        int number = random.nextInt(9999);
        return "kumakuma"+number;
    }
    public String emailIsMissingTheFollowingA() {
        Random random = new Random();
        int number = random.nextInt(9999);
        return "kumakuma"+number + "@";
    }
    public String emailWrongElementAfterA() {
        Random random = new Random();
        int number = random.nextInt(9999);
        return "kumakuma"+number + "@.";
    }

}
