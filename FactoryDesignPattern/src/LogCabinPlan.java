import java.util.ArrayList;

public class LogCabinPlan extends HousePlan{
    public LogCabinPlan() {
        super(2, 10, 1800);
    }
    /**
     * Sets the specific materials of a LogCabin
     * into the HousePlan
     */
    protected void setMaterials() {
        this.materials.add("Log Siding");
        this.materials.add("Board and Batten Siding");
        this.materials.add("White Pine");
    }
    /**
     * Sets the specific features of a LogCabin
     * into the HousePlan
     */
    protected void setFeatures() {
        this.features.add("Timbered Roof");
        this.features.add("High Insulation");
        this.features.add("Rustic Effect");
    }
    /**
     * Converts all items of a LogCabin into a string
     */
    public String toString() {
        String outputter = "Log Cabin \n Square Feet: " + this.getSquareFeet();
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
