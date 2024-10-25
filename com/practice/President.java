package com.practice;

import java.util.ArrayList;
import java.util.List;

public class President {
    public static int findPresident(int n,int k){
        int current_index=0;
        List<Integer> student=new ArrayList<>();
        // to get students list
        for(int i=1;i<=n;i++){
            student.add(i);
        }
        System.out.println(student);
        //loop until remains only student
        //not sure about the iterations,So we used while loop
        while(student.size()>1){//loop until remains only student
            //not sure about the iterations,So we used while loop

            current_index=(current_index+k-1)%student.size();//cal the index of student needs to eliminate
            student.remove(current_index);//elimination based on index

        }
        return student.get(0);//used the return type as int.So need to use get()
        //otherwise student is enough

    }

    public static void main(String[] args){
        int n=5,k=2;
        System.out.println(findPresident(n,k));
    }
}
