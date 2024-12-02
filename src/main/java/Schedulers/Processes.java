package Schedulers;

public class Processes {
     int id;
     int BurstTime;
    public int turnaroundTime;
    public int arrivalTime;
    public int waitingTime;
    public int completionTime;

    public Processes(int id, int burstTime) {
        this.id = id;
        this.BurstTime = burstTime;

    }
    public int getId(){
        return id;
    }
    public int getBurstTime(){
        return BurstTime;
    }

}
