package hashcode2017;

/**
 * Created by The One on 23-Feb-17.
 */
public class Cashe {
    private int casheID;
    private int latency;
    private int casheSize;

    public void setCasheID(int casheID) {
        this.casheID = casheID;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    public void setCasheSize(int casheSize) {
        this.casheSize = casheSize;
    }



    public int getCasheID() {
        return casheID;
    }

    public int getLatency() {
        return latency;
    }

    public int getCasheSize() {
        return casheSize;
    }


}
