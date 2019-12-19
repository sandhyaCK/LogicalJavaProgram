/*#******************************************************************************************************************
        # @purpose :Demonstrate Gambler Logic.
        # @file  :Gambler.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.LogicalPrograms;
import java.util.Scanner;
public class Gambler {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int stake = sc.nextInt();
        int goal = sc.nextInt();
        int trails = sc.nextInt();
        int bets = 0;
        int wins = 0;
        int cash = stake;
        while(cash>0 && cash<goal) {
            bets++;
        }
        if(Math.random()< 0.5) {
            cash++;
        }
        else {
            cash--;

        }
        if(cash == goal) {
            wins++;}

        System.out.println(wins +"wins of" +trails);
        System.out.println("percentage of wins" + (100.0 * wins /trails));

        System.out.println("avg of bets" +(1.0 * bets/trails));}
}
