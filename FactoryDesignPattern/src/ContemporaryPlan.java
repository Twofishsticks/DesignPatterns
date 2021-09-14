import java.util.ArrayList;

public class ContemporaryPlan extends HousePlan{
    public ContemporaryPlan() {
        super(5, 40, 3000);
    }
    protected void setMaterials() {
        this.materials.add("Ceramics");
        this.materials.add("High-Stength Alloys");
        this.materials.add("Composites");
    }
    protected void setFeatures() {
        this.features.add("Oversized Windows");
        this.features.add("Unconventional Roofs");
        this.features.add("Minimalism");
        this.features.add("Open Floor Plan");
    }
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
