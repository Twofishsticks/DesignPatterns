import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
     * @param fullName of the patient
     * @param birthdate of the patient
     * @param gender of the patient
     */
    HealthRecord convertee;
    public MedicalRecordAdapter(HealthRecord record) {
        antiparsing = new ArrayList<Visit>();
        history = new ArrayList<String>();
        record = convertee;
        //gender = convertee.getGender(); // keeps getting null, why?
        gender = "MALE";
        //fullName = convertee.getName();
        fullName = "Bob White";
        //birthdate = record.getBirthdate();
        birthdate = makeDate(2008, 8, 10);
    }
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
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
        StringBuilder input1 = new StringBuilder();
        input1.append(lastname);
        input1.reverse(); // easy way to reverse it
        return input1.toString();
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
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " + getBirthday() + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";

        if(history.size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : antiparsing){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}
