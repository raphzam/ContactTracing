import java.util.ArrayList;

public class Patient extends Person {
    ArrayList<Symptom> symptoms;
    ArrayList<Contact> contacts;

    public Patient(){
        this.symptoms = new ArrayList<Symptom>();
        this.contacts = new ArrayList<Contact>();
    }

    public Patient(String name, String phoneNumber, String city, String state, String email){
        setName(name);
        setPhoneNumber(phoneNumber);
        setCity(city);
        setState(state);
        setEmail(email);
        this.symptoms = new ArrayList<Symptom>();
        this.contacts = new ArrayList<Contact>();
    }


    public void addSymptom(Symptom s){
        this.symptoms.add(s);
    }

    public void addContact(Contact c){
        this.contacts.add(c);
    }



    public String patientInfo(){
        String retval = "";

        retval = "Name: " + getName() +"\n" +
                "Phone: " + getPhoneNumber() + "\n" +
                "Email: " + getEmail() + "\n" +
                "City: " + getCity() + "\t" + "State: " + getState() + "\n";
        return retval;
    }
















    public String symptomInfo(){    //returns symptom portion
        String retval = "";
        /* traverse arrayList of 'symptoms'
                getSymptomName
                getSymptomDuration
                    String oneLine = symptomName + symptomDuration + newline
                retval+= oneLine

           return retval
         */
        return retval;
    }


    public String contactInfo(){    //returns contact info portion
        String retval = "";
        /* traverse arrayList of 'contacts'
                get name
                get phonenumber
                get email
                    String oneLine = name + newline + phoneNumber +newline + email +newline
                retval+= oneLine

            return retval
         */

        return retval;
    }












}
