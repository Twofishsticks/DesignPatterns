import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter implements MedicalRecord {
    // For each method, use the information from the health record, to return the data in the same format as the Medical Record.  
    // Make sure your format looks the same as the provided output.txt

    // convert from health record into Medical Record, for each thingy
    private String fullName;
    private Date birthdate;
    private String gender;
    private ArrayList<String> history;
    /**
     * Creates a new Health Record
     * @param firstName of the patient
     * @param lastName of the patient
     * @param birthdate of the patient
     * @param gender of the patient
     */
    HealthRecord convertee;
    public MedicalRecordAdapter(HealthRecord record) {
        record = convertee;
        gender = record.getGender();
        fullName = record.getName();
    }
    public String getFirstName() {
        // string split stuff w the space being the delimiter
        return fullName;
    }
    public String getLastName() {
        return fullName;
    }
    public Date getBirthday() {
        return birthdate;
    }
    public Gender getGender() {
        // enums :(
            return null;
    }
    public void addVisit(Date visitDate, boolean well, String details) {
        String item = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd, MM, yyyy");

        item += "Visit: " + simpleDateFormat.format(visitDate) + "\n";
        item += "Well visit: " + well + "\n";
        item += "Comments: " + details +  "\n";

        history.add(item);
    }
    public ArrayList<Visit> getVisitHistory() {
        return null;
    }
    public String toString() {
        return null;
    }
}
