package com.example;

public class activity2 {
    public static void main(String[] args){
        int[] arr = {10, 77, 10, 54, -11, 10};
        int a=0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]%10==0){
                a+=arr[i];

            }
        
        }
        if (a==30){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
    
}
