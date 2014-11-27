package ProgramCore;

/**
 * Created by Michal on 27.11.2014.
 */
public class Human {

    private int idNumber;
    private String HumansName;
    private double StartTime;
    private boolean VIPFlag;
    private int FreeTime;
    private boolean Open;


    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getHumansName() {
        return HumansName;
    }

    public void setHumansName(String humansName) {
        HumansName = humansName;
    }

    public double getStartTime() {
        return StartTime;
    }

    public void setStartTime(double startTime) {
        StartTime = startTime;
    }

    public boolean isVIPFlag() {
        return VIPFlag;
    }

    public void setVIPFlag(boolean VIPFlag) {
        this.VIPFlag = VIPFlag;
    }

    public int getFreeTime() {
        return FreeTime;
    }

    public void setFreeTime(int freeTime) {
        FreeTime = freeTime;
    }

    public boolean isOpen() {
        return Open;
    }

    public void setOpen(boolean open) {
        Open = open;
    }

    public void AddNewHuman(){


    }
}
