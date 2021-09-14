import java.util.ArrayList;

public class TinyHomePlan extends HousePlan{
    public TinyHomePlan() {
        super(1, 5, 200);
    }
    /**
     * Sets the specific materials of a TinyHome
     * into the HousePlan
     */
    protected void setMaterials() {
        this.materials.add("Lumber");
        this.materials.add("Insulation");
        this.materials.add("Metal Roofing");
        this.materials.add("Hardware");
    }
    /**
     * Sets the specific features of a TinyHome
     * into the HousePlan
     */
    protected void setFeatures() {
        this.features.add("Natural Light");
        this.features.add("Creative Storage");
        this.features.add("Multipurpose areas");
        this.features.add("Multi-use applications");
    }
    /**
     * Converts all items of a TinyHome into a string
     */
    public String toString() {
        String outputter = "Tiny Home \n Square Feet: " + this.getSquareFeet();
        outputter += "\n Room: " + this.getNumRooms();
        outputter += "\n Windows: " + this.getNumWindows() + "\n\n";
        ArrayList<String> holder = this.getMaterials();
        outputter += "Materials :\n";
        for(String mats : holder) {
            outputter += " - " + mats + "\n";
        }
        holder = this.getFeatures();
        outputter += "\nFeatures :\n";
        for(String feats : holder) {
            outputter += " - " + feats + "\n";
        }
        return outputter;
    }
}
