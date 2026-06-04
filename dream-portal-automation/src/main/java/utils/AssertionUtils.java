package utils;

import org.testng.Assert;

public class AssertionUtils {

    public static void validateEquals(String actual, String expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }
}