/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;
/**
 *
 * @author Andrew
 */
public class Clock {
    private int hr;
    private int mi;
    private int se;
    private boolean is12Hour;

    public Clock() {
        this.hr = 0;
        this.mi = 0;
        this.se = 0;
    }
    
    public Clock(int hr, int mi, int se) {
        this.hr = hr;
        this.mi = mi;
        this.se = se;
    }

    public Clock(Clock clock) {
        this.hr = clock.hr;
        this.mi = clock.mi;
        this.se = clock.se;
    }

    public void increaseHour() {
        hr++;
        if (hr == 24) 
            hr = 0;
    }
    
    public void increaseMinute() {
        mi++;
        if (mi == 60) {
            mi = 0;
            increaseHour();
        }
    }
    
    public void increaseSecond() {
        se++;
        if (se == 60) {
            se = 0;
            increaseMinute();
        }
    }
    
    public boolean equals(Clock clock) {
        return this.hr == clock.hr &&
                this.mi == clock.mi &&
                this.se == clock.se;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d\n", hr, mi, se);
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMi() {
        return mi;
    }

    public void setMi(int mi) {
        this.mi = mi;
    }

    public int getSe() {
        return se;
    }

    public void setSe(int se) {
        this.se = se;
    }
    
    
}
