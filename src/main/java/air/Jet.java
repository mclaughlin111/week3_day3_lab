package air;

public class Jet implements IJet {

    private String jetType;

    public Jet(String jetType){
    this.jetType = jetType;
    }

    public String getJetType() {
        return jetType;
    }
    public void setJetType(String jetType) {
        this.jetType = jetType;
    }

    @Override
    public void startJet() {
        System.out.println("Jet started");
    } @Override
    public void stopJet() {
        System.out.println("Jet stopped");
    }
}
