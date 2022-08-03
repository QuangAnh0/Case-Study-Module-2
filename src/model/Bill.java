package model;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class Bill {
    private LocalTime startTime;
    private LocalTime endTime;
    private Date startUsed;
    private Date endUsed;

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

    private boolean done;
    private int minute;

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

}
