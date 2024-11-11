public class Processor {
    private String model;
    private String clock_frequency;
    private String number_of_Core;
    private String number_of_streams;

    public Processor() {
    }

    public Processor(String model, String clock_frequency, String number_of_Core, String number_of_streams) {
        this.model = model;
        this.clock_frequency = clock_frequency;
        this.number_of_Core = number_of_Core;
        this.number_of_streams = number_of_streams;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClock_frequency() {
        return clock_frequency;
    }

    public void setClock_frequency(String clock_frequency) {
        this.clock_frequency = clock_frequency;
    }

    public String getNumber_of_Core() {
        return number_of_Core;
    }

    public void setNumber_of_Core(String number_of_Core) {
        this.number_of_Core = number_of_Core;
    }

    public String getNumber_of_streams() {
        return number_of_streams;
    }

    public void setNumber_of_streams(String number_of_streams) {
        this.number_of_streams = number_of_streams;
    }
}
