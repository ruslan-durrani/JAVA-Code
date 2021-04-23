package Russi7kd;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        double res = 0;
        if (args.length == 3){
            switch (args[1].charAt(0)){
                case '-':
                {res = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
                }
                case '+':
                {res = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                }
                case '*':
                {res = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                }
            }
        }
        else{
            System.out.println("Enter three entries");
            System.exit(0);
        }
        System.out.println(args[0] + " " + args[1] +"  "+args[2]+" = "+res);
    }
}
