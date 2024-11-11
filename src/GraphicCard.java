public class GraphicCard {
    private String nameModels;
    private String company;
    private boolean haveRTX;
    private int cudaCores;

    public GraphicCard() {
    }

    public GraphicCard(String nameModels, String company, boolean haveRTX, int cudaCores) {
        this.nameModels = nameModels;
        this.company = company;
        this.haveRTX = haveRTX;
        this.cudaCores = cudaCores;
    }

    public String getNameModels() {
        return nameModels;
    }

    public void setNameModels(String nameModels) {
        this.nameModels = nameModels;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isHaveRTX() {
        return haveRTX;
    }

    public void setHaveRTX(boolean haveRTX) {
        this.haveRTX = haveRTX;
    }

    public int getCudaCores() {
        return cudaCores;
    }

    public void setCudaCores(int cudaCores) {
        this.cudaCores = cudaCores;
    }
}
