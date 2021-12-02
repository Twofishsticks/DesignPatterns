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
    private ArrayList<Visit> antiparsing;
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
        gender = record.getGender(); // keeps getting null
        fullName = record.getName();
    }
    public String getFirstName() {
        int i = 0;
        String lastname = "";
        while (i <= fullName.length()) {
            if (fullName.substring(i, i+1).equals(" ")) {
                break;
            }
            lastname += fullName.substring(i, i+1);
            i ++;
        }
        return lastname;
    }
    public String getLastName() {
        int i = fullName.length()-1;
        String lastname = "";
        while (i >= 0) {
            if (fullName.substring(i, i+1).equals(" ")) {
                break;
            }
            lastname += fullName.substring(i, i+1);
            i --;
        }
        return lastname;
    }
    public Date getBirthday() {
        return birthdate;
    }
    public Gender getGender() {
        switch (gender.toUpperCase()) {
            case "MALE":
                return Gender.MALE;
            case "FEMALE":
                return Gender.FEMALE;
            case "OTHER":
                return Gender.OTHER;
            default:
                return Gender.OTHER;
        }
    }
    public void addVisit(Date visitDate, boolean well, String details) {
        String item = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd, MM, yyyy");

        item += "Visit: " + simpleDateFormat.format(visitDate) + "\n";
        item += "Well visit: " + well + "\n";
        item += "Comments: " + details +  "\n";
        Visit helper = new Visit(visitDate, well, details);
        antiparsing.add(helper);
        history.add(item);
    }
    public ArrayList<Visit> getVisitHistory() {
        return antiparsing;
    }
    public String toString() {
        String tostring = "";
        for(String visit : history) {
            tostring += visit;
        }
        return tostring;
    }
}
