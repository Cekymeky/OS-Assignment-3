package Schedulers;

public class Processes {
     int id;
     int BurstTime;
     int turnaroundTime;
     int arrivalTime;
     int waitingTime;
     int endTime;

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

    public void setEndTime(int endTime){
        this.endTime = endTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public void setWaitingTime(int waitingTime){
        this.waitingTime = waitingTime;
    }
    public int getWaitingTime(){
        return waitingTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
    public int getTurnaroundTime(){
        return turnaroundTime;
    }

}
