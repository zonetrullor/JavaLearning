package com.example.javalearning;

public class Statements {

    public static void main(String[]args){

        int x = 5;
        System.out.println(x);
        x = x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;

        System.out.println(x>y);

        System.out.println(y>x);

        y= 30 ;

        System.out.println(x>y);

        System.out.println(x>=y);

        System.out.println(x==y);

        System.out.println(x!=y);

        // and(ve)  &&
        // or(veya) ||

        x=3;
        y=4;
        int z = 5;
        System.out.println(x<y || z<y);

        // if Statements

        if(x < y){
            System.out.println("y is bigger");
        }
        else if (y < x){
            System.out.println("x is bigger");
        }
        else {
            System.out.println("x=y");
        }


        //switch

        int day = 1 ;
        String dayString="";

        /*
        if(day==1){
            dayString="Monday";
        }else if (day==2){
            dayString = "Tuesday";
        }else if(day==3){
            dayString="Wendesday";
        }else{
            dayString="Sunday";
        }
        
         */


        switch (day){

            case 1:
                dayString ="Monday";
                        break;
            case 2:
                dayString ="Tuesday";
                break;
            case 3:
                dayString ="Wendesday";
                break;
            default:
                dayString ="Sunday";
                break;

        }


        System.out.println(dayString);


    }

}
