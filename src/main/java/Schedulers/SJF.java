package Schedulers;

import java.util.*;

public class SJF{
    private List<Processes> processes;
    private double avgWaitingTime = 0.0;
    private double avgTurnaroundTime = 0.0;

    public SJF(List<Processes> processes) {
        this.processes = new ArrayList<>(processes);
    }
    public double getAvgWaitingTime() {
        return avgWaitingTime;
    }

    public void setAvgWaitingTime(double avgWaitingTime) {
        this.avgWaitingTime = avgWaitingTime;
    }

    public double getAvgTurnaroundTime() {
        return avgTurnaroundTime;
    }

    public void setAvgTurnaroundTime(double avgTurnaroundTime) {
        this.avgTurnaroundTime = avgTurnaroundTime;
    }

    public void getExecutionOrder(List<Processes> processes){
        Collections.sort(processes, Comparator.comparingInt(Processes::getBurstTime));
    }

    public void calcEndTime(List<Processes> processes){
        int startTime= 0;
        for(Processes p : processes){
            int x = startTime + p.getBurstTime();
            p.setEndTime(x);
            startTime += p.getBurstTime();
        }
    }

    public void calcWaitingTime(List<Processes> processes){
        for(Processes p : processes){
            int x = p.getEndTime() - p.getBurstTime();
            p.setWaitingTime(x);
        }
    }

    public void calcTurnaroundTime(List<Processes> processes){
        for(Processes p : processes){
            int x = p.getWaitingTime() + p.getBurstTime();
            p.setTurnaroundTime(x);

        }
    }
    public void calcAvgWaitingTime(List<Processes> processes){
        int processCounter=0;
        double cumulativeWaitngTime=0;

        for(Processes p : processes){
            processCounter ++ ;
            cumulativeWaitngTime += p.getWaitingTime();
        }
        setAvgWaitingTime(cumulativeWaitngTime / processCounter);

    }

    public void calcAvgTurnaroundTime(List<Processes> processes){
        int processCounter=0;
        double cumulativeTurnaroundTime=0;

        for(Processes p : processes){
            processCounter ++ ;
            cumulativeTurnaroundTime += p.getTurnaroundTime();
        }
        setAvgTurnaroundTime(cumulativeTurnaroundTime / processCounter);

    }
    public void printAvgWaitingTime(){
            System.out.println("Average Waiting Time: " + getAvgWaitingTime());
    }
    public void printAvgTurnaroundTime(){
        System.out.println("Average Turnaround Time: " + getAvgTurnaroundTime());
    }

    public void printTurnaroundTime(List<Processes> processes){
        System.out.println("Turnaround Time: ");
        for (Processes p : processes) {
            System.out.println("P"+p.id +" turnaround time: " + p.getTurnaroundTime());
        }

    }

    public void printWaitingTime(List<Processes> processes){
        System.out.println("Waiting Time: ");
        for (Processes p : processes) {
            System.out.println("P"+p.id +" waiting time: " + p.getWaitingTime());
        }

    }

    public void printEndTime(List<Processes> processes){
        System.out.println("End Time: ");
        for (Processes p : processes) {
            System.out.println("P"+p.id +" end time: " + p.getEndTime());
        }

    }

    public  void printExecutionOrder(List<Processes> processes){
        System.out.print("Execution order: ");
        for (Processes p : processes) {
            System.out.print("P" + p.getId() +",");
        }
        System.out.println();
    }

    public  void sjfExecutionOutput(List<Processes> processes){
       getExecutionOrder(processes);
       printExecutionOrder(processes);
       calcEndTime(processes);
       calcWaitingTime(processes);
       printWaitingTime(processes);
       calcTurnaroundTime(processes);
       printTurnaroundTime(processes);
       calcAvgWaitingTime(processes);
       printAvgWaitingTime();
       calcAvgTurnaroundTime(processes);
       printAvgTurnaroundTime();
    }

}
