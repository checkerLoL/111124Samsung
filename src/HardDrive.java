public class HardDrive {
    private int size;
    private int readSpeed;
    private int writeSpeed;
    private String model;

    public HardDrive() {
    }

    public HardDrive(int size, int readSpeed, int writeSpeed, String model) {
        this.size = size;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
