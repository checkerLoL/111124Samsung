public class RAM {
    private int volume;
    private int frequency;
    private int ddrType;

    public RAM() {
    }

    public RAM(int volume, int frequency, int ddrType) {
        this.volume = volume;
        this.frequency = frequency;
        this.ddrType = ddrType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getDdrType() {
        return ddrType;
    }

    public void setDdrType(int ddrType) {
        this.ddrType = ddrType;
    }
}
