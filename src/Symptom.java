public class Symptom {
    private String symptomName;
    private int symptomDays;

    public Symptom(){

    }

    public Symptom(String symptomName){
        this.symptomName = symptomName;
    }

    public Symptom(String symptomName, int symptomDays){
        this.symptomName = symptomName;
        this.symptomDays = symptomDays;
    }



    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public int getSymptomDays() {
        return symptomDays;
    }

    public void setSymptomDays(int symptomDays) {
        this.symptomDays = symptomDays;
    }




    //RETRIEVE INFO

    public String symptomNameAndDays(){

        return getSymptomName() + " for " + getSymptomDays() + " days ";

    }

}
