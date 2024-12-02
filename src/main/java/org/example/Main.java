package org.example;
import Schedulers.Processes;
import Schedulers.SJF;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Processes> processes = new ArrayList<>();
        SJF sjf = new SJF(processes);

        processes.add(new Processes(1,17));
        processes.add(new Processes(2,6));
        processes.add(new Processes(3,10));
        processes.add(new Processes(4,4));

       sjf.sjfExecutionOutput(processes);

    }
}