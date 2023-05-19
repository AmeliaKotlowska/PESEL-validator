package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PESELValidator {
  public static boolean isValid(String peselNumber) {
    Pattern pattern = Pattern.compile("\\d{11}");
    Matcher matcher = pattern.matcher(peselNumber);
    return matcher.matches();
  }
}
