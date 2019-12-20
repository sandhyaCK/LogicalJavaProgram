/*#******************************************************************************************************************
        # @purpose :Demonstrate StopWatch Logic.
        # @file  :StopWatch.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.LogicalPrograms;

public class StopWatch {
    private final long start;
    public StopWatch() {
        start = System.currentTimeMillis();
    }
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now-start)/1000.0;
    }
    public static void main(String[] args) {
        StopWatch timer1 = new StopWatch();
        int n = Integer.parseInt(args[0]);
        double sum1 = 0.0;
        for(int i=1;i<n;i++) {
            sum1+= Math.sqrt(i);

        }
        double time1 = timer1.elapsedTime();
        System.out.println(sum1 +" "  +time1);
    }


}
