package event;

public class Capacity {
    protected int maxCap;
    protected int curCap;
    protected int usedCap;

    public Capacity() {

    }

    public Capacity(int maxCap) {
        this.maxCap = maxCap;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public int getCurCap() {
        return curCap;
    }

    public int getUsedCap() {
        return usedCap;
    }

    public void setMaxCap(int maxCap1) {
        maxCap = maxCap1;
    }

    public void setCurCap(int curCap1) {
        curCap = curCap1;
    }

    public int makeBooking(int seatsReserved) {
        usedCap += seatsReserved;
       return curCap -= seatsReserved;
    }

    public int cancelBooking(int seatsCancel) {
        usedCap -= seatsCancel;
        return curCap += seatsCancel;
    }
}
