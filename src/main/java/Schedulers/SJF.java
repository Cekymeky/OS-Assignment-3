package Schedulers;

import java.util.*;

public class SJF{

    public static void getExecutionOrder(List<Processes> processes){
        Collections.sort(processes, Comparator.comparingInt(Processes::getBurstTime));
    }

    public static void printExecutionOrder(List<Processes> processes){
        for (Processes p : processes) {
            System.out.println("Process ID: " + p.getId() + " | "+"Process BurstTime: " + p.getBurstTime());
        }
    }

}
