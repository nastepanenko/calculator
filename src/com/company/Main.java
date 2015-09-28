package com.company;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        if (args.length > 3)
            System.out.println("Invalid number of arguments!");

        else
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            String operation = args[1];
            switch(operation)	{
                case "+": System.out.println(a  + operation + b + "=" + (a+b)); break;
                case "-": System.out.println(a  + operation + b + "=" + (a-b)); break;
                case "*": System.out.println(a  + operation + b + "=" + (a*b)); break;
                case "/": System.out.println(a  + operation + b + "=" + (a/b)); break;
                default: System.out.println("Unknown operation!");
            }
        }
    }
}
