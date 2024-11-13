package com.practice;

import java.util.*;

public class CountIpAddr {
    public static void main(String[] args) {
        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.4 bytes=32 time=50ms TTL=93"
        };
        String ip = countIpAddr(str);
        System.out.println(ip);
    }

    public static String  countIpAddr(String[] str) {

        String max="";
        int maxValue=Integer.MIN_VALUE;
        Map<String,Integer> freqMap=new HashMap<>();//to find the max ip we will use freqMap

        for(String s:str) {
            String ipParts=s.split(" ")[0];//based the Space split the ip
            if(isValid(ipParts)) {
                if(freqMap.containsKey(ipParts)) {
                    freqMap.put(ipParts,freqMap.getOrDefault(ipParts,0)+1);
                }else {
                    freqMap.put(ipParts, 1);
                }

            }
        }
        for(Map.Entry<String,Integer> entry:freqMap.entrySet()) {//iterating the freqMap
            if(entry.getValue()>maxValue) {
                max=entry.getKey();
                maxValue=entry.getValue();
            }
        }

        if(freqMap.isEmpty()) {
            System.out.println("there is no valid entries");

        }


        return max;


    }
    public static boolean isValid(String ip) {//to check the Ip is valid or not
        String[] validIp = ip.split("\\.");//split the ip based on the.
        if (validIp.length != 4) {//if length is not equal to 4 then it's not a valid
            return false;
        }

        for (int i = 0; i < validIp.length; i++) {

            try {
                int val = Integer.parseInt(validIp[i]);//ip is in String format.So need to change to int
                if (val < 0 || val > 255) {//if values are more than 255 and less than 0.ie also not valid
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }

        }
            return true;
        }

    }
