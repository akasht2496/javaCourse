package org.akash.section1;

import java.util.stream.IntStream;

public class DeclarativevsImperative {
    public static void main(String[] args) {
//       Impearative Approch
        int sumOfEven=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                sumOfEven+=i;
            }
        }
        System.out.println(sumOfEven);

        //Declarative Approch
        sumOfEven=
                IntStream.rangeClosed(0,100)
                        .filter(i ->i%2==0)
                        .reduce((x,y)->x+y)
                        .getAsInt();
        System.out.println(sumOfEven);




    }
}
