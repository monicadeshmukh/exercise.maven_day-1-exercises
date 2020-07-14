package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */

/**
 * Added method functionality
 * Monica Deshmukh
 * Write a program that returns a student's letter grade given a specific score.
 * If a grade is between 100 and 90, return A
 * If a grade is between 89 and 80, return B
 * If a grade is between 79 and 70, return C
 * If a grade is between 69 and 65, return D
 * If a grade is less than 64, return F.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if (score >=90 && score <= 100)
            return true;
        else
            return false;
        //return null;
    }

    public Boolean isGradeB(Double score) {
        if (score >=80 && score <= 89)
            return true;
        else
            return false;
        //return null;
    }

    public Boolean isGradeC(Double score) {
        if (score >=70 && score <= 79)
            return true;
        else
            return false;
        //return null;
    }

    public Boolean isGradeD(Double score) {
        if (score >=65 && score <= 69)
            return true;
        else
            return false;
        //return null;
    }

    public Boolean isGradeF(Double score) {
        if (score <= 64)
            return true;
        else
            return false;
        //return null;
    }

    public Character getGrade(Double score) {
        if (score >=90 && score <= 100)
            return 'A';
        else if (score >=80 && score <= 89)
            return 'B';
        else if (score >=70 && score <= 79)
            return 'C';
        else if (score >=65 && score <= 69)
            return 'D';
        else if (score <= 64)
            return 'F';
        else
            return null;
        //return null;
    }
}
