import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class SymptomDatabase implements Iterable<Symptom> {
    ArrayList<Symptom> allCovidSymptoms;

    public SymptomDatabase(){
        this.allCovidSymptoms = new ArrayList<>();
    }

    public void preloadDB(){
        Symptom cough = new Symptom("cough");
        Symptom fever = new Symptom("fever");              //creating new Symptom object
        Symptom aches = new Symptom("aches");
        Symptom chills = new Symptom("chills");
        Symptom soreThroat = new Symptom("sore throat");
        Symptom shortBreath = new Symptom("shortness of breath");
        Symptom tiredness = new Symptom("tiredness");
        Symptom smell = new Symptom("loss of smell");
        Symptom taste = new Symptom("loss of taste");
        Symptom headache = new Symptom("headache");
        Symptom diarrhea = new Symptom("diarrhea");
        Symptom vomiting = new Symptom("severe vomiting");


        allCovidSymptoms.add(cough);
        allCovidSymptoms.add(chills);
        allCovidSymptoms.add(fever);
        allCovidSymptoms.add(aches);
        allCovidSymptoms.add(soreThroat);
        allCovidSymptoms.add(shortBreath);
        allCovidSymptoms.add(tiredness);
        allCovidSymptoms.add(smell);
        allCovidSymptoms.add(taste);
        allCovidSymptoms.add(headache);
        allCovidSymptoms.add(diarrhea);
        allCovidSymptoms.add(vomiting);

    }

    public int size(){
        return allCovidSymptoms.size();     //return the length of the list
    }


    public void addSymptom(Symptom name){
        this.allCovidSymptoms.add(name);         //add symptoms to list
    }

    @Override
    public String toString(){               //return a list of all symptoms
        String retval = "";
        for (Symptom symptom : this.allCovidSymptoms){
            retval += symptom.getSymptomName() + ", ";
        }
        return retval;
    }


    @Override
    public Iterator<Symptom> iterator() {
        return allCovidSymptoms.iterator();
    }



//    @Override
//    public void forEach(Consumer<? super Symptom> action) {
//        return allCovidSymptoms.iterator();
//    }

}
