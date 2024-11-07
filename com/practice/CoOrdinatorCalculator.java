package com.practice;

public class CoOrdinatorCalculator {
    public static int[] finalCoordinator(String s){
        int x=0,y=0;
        String[] Words={};
        //based on the space,split teh String
        if(s.contains(" ")) {
            Words = s.split(" ");
        }
        else
            Words = s.split("");
        for(String word:Words){
            if(word.equalsIgnoreCase("U") || word.equalsIgnoreCase("UP")){
                y+=1;
            }
            else if(word.equalsIgnoreCase("D") || word.equalsIgnoreCase("DOWN")){
                y-=1;
            }
            else if(word.equalsIgnoreCase("R") || word.equalsIgnoreCase("RIGHT")){
                x+=1;
            }
            else if(word.equalsIgnoreCase("L") || word.equalsIgnoreCase("LEFT")){
                x-=1;
            }
            else{
                //if word having digits and directions then it is having 2 parts
                if (word.matches("\\d+x[A-Za-z]+")){
                    String[] parts = word.split("x");
                    int multiplier = Integer.parseInt(parts[0]); // Parse the number (multiplier)
                    String direction = parts[1].toUpperCase();
//based on the direction
                    switch (direction) {
                        case "UP":
                            y += multiplier;
                            break;
                        case "DOWN":
                            y -= multiplier;
                            break;
                        case "RIGHT":
                            x += multiplier;
                            break;
                        case "LEFT":
                            x -= multiplier;
                            break;
                    }
                }

            }
        }



        return new int[]{x,y};
    }
    public static void main(String[] args) {
        String s="UUU";
        int[] result=finalCoordinator(s);
        System.out.println("("+result[0]+","+result[1]+")");
        //System.out.println(result[1]);

        String s1 = "DOWN UP 2xRIGHT DOWN 3xLEFT";
        int[] result1=finalCoordinator(s1);
        System.out.println("("+result1[0]+","+result1[1]+")");

        String s2 = "UL";
        int[] result2=finalCoordinator(s2);
        System.out.println("("+result2[0]+","+result2[1]+")");
    }
}
