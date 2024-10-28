package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {
    public static String[] findHighestAverageMarks(String[][] marks) {
        Map<String, int[]> students = new HashMap<>();


        for (String[] entry : marks) {
            String name = entry[0];
            int mark = Integer.parseInt(entry[1]);

            students.putIfAbsent(name, new int[2]); // If the student is not present, create a new entry
            students.get(name)[0] += mark;//add the marks to the total
            students.get(name)[1]++;//increment the count
        }
        //System.out.println(students);
        String maxName = "";
        double maxAverage = Double.NEGATIVE_INFINITY;

        for (String name1 : students.keySet()) {
            int[] data = students.get(name1);
            double average = (double) data[0] / data[1];//cal avg

            //to find highest average
            if (average > maxAverage) {
                maxAverage = average;
                maxName = name1;
            }

        }

        return new String[]{String.valueOf(maxAverage), maxName};

    }

    public static void main(String[] args){
        String[][] marks={
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };
       String[] result=findHighestAverageMarks(marks);
        System.out.println("Highest with the average:"
                +result[0]+   ",name:" +result[1]);

    }
}
