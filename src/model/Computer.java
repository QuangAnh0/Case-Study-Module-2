package model;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class Computer implements Runnable, Serializable {
    private String type;
    private int numberComputer;
    private int price;
    private boolean status;
    private String usedTime = "0:00:00";
    private LocalTime startTime;
    private LocalTime endTime;
    private Date startUsed;
    private Date endUsed;

    public Computer(String type, int numberComputer, int price) {
        this.type = type;
        this.numberComputer = numberComputer;
        this.price = price;
    }

    public Computer() {
    }

    public String getType() {
        return type;
    }

    public int getNumberComputer() {
        return numberComputer;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


    public String getUsedTime() {
        return usedTime;
    }



    public void setUsedTime(String usedTime) {
        this.usedTime = usedTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Date getStartUsed() {
        return startUsed;
    }

    public void setStartUsed(Date startUsed) {
        this.startUsed = startUsed;
    }

    public Date getEndUsed() {
        return endUsed;
    }

    public void setEndUsed(Date endUsed) {
        this.endUsed = endUsed;
    }

    public String getType(int s) {
        return type;
    }

    public void setType(String s) {
        this.type = type;
    }

    public void setNumberComputer(int number) {
        this.numberComputer = number;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    private boolean done;
    private int minute;
    public void run() {
        startTime = LocalTime.now();
        while (!done) {
            endTime = LocalTime.now();
            long duration = Duration.between(startTime, endTime).getSeconds();
            minute = (int) ((duration % 3600) / 60);
            usedTime = String.format("%d:%02d:%02d", duration / 3600, minute, duration % 60);
        }
        if (done) {
            setUsedTime("0:00:00");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", numberComputer='" + numberComputer + '\'' +
                ", price=" + price +
                '}';
    }
}
