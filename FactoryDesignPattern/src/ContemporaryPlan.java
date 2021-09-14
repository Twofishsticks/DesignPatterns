import java.util.ArrayList;

public class ContemporaryPlan extends HousePlan{
    public ContemporaryPlan() {
        super(5, 40, 3000);
    }
    /**
     * Sets the specific materials of a ContemporaryHome
     * into the HousePlan
     */
    protected void setMaterials() {
        this.materials.add("Ceramics");
        this.materials.add("High-Stength Alloys");
        this.materials.add("Composites");
    }
    /**
     * Sets the specific features of a ContemporaryHome
     * into the HousePlan
     */
    protected void setFeatures() {
        this.features.add("Oversized Windows");
        this.features.add("Unconventional Roofs");
        this.features.add("Minimalism");
        this.features.add("Open Floor Plan");
    }
    /**
     * Converts all items of a ContemporaryHome into a string
     */
    public String toString() {
        String outputter = "Contemporary Plan \n Square Feet: " + this.getSquareFeet();
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
