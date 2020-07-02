//V1 with debug statements

import java.util.Scanner;

public class PatientApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        Patient patientObj = null;

        System.out.println("Contact Tracing Program");
        System.out.println("Enter a newly infected person's information:");

        System.out.println("What is the patient name?");
        String patientName = input.nextLine();

        System.out.println("What is the patient phone number?");
        String phoneNumber = input.nextLine();

        System.out.println("What is the the patient email address?");
        String email = input.nextLine();

        System.out.println("What city does the patient live in?");
        String city = input.nextLine();

        System.out.println("What state does the patient live in?");
        String state = input.nextLine();

        patientObj = new Patient(patientName, phoneNumber, city, state, email);



//        //prints patient info                                                                    //CHECK PATIENT INFO
//        System.out.println(patientObj.patientInfo());

//                                              ADDING SYMPTOMS

        while (true) {

            System.out.println("\tDoes the patient have any of the following symptoms?\n");
            System.out.println("1. Fever\t2. Cough\t3. Aches\t4. Chills\t5. Sore throat");
            System.out.println("6. Shortness of breath or difficulty breathing  7. Tiredness");
            System.out.println("8. loss of smell 9. loss of taste 10. headache 11. diarrhea 12. severe vomiting");
            System.out.println("\n\tEnter one number for corresponding symptom (0 when done)");

            String userSymptom = input.nextLine();

            if (userSymptom.equals("0")){
                break;
            }

            System.out.println("How many days?");
            int symptomDays = Integer.valueOf(input.nextLine());

            switch (userSymptom){
                case("1"):
                    Symptom fever = new Symptom("Fever", symptomDays);
                    patientObj.addSymptom(fever);
                    break;
                case("2"):
                    Symptom cough = new Symptom("Cough", symptomDays);
                    patientObj.addSymptom(cough);
                    break;
                case("3"):
                    Symptom aches = new Symptom("Aches", symptomDays);
                    patientObj.addSymptom(aches);
                    break;
                case("4"):
                    Symptom chills = new Symptom("Chills", symptomDays);
                    patientObj.addSymptom(chills);
                    break;
                case("5"):
                    Symptom soreThroat = new Symptom("Sore Throat", symptomDays);
                    patientObj.addSymptom(soreThroat);
                    break;
                case("6"):
                    Symptom shortBreath = new Symptom("Shortness of Breath", symptomDays);
                    patientObj.addSymptom(shortBreath);
                    break;
                case("7"):
                    Symptom tiredness = new Symptom("Tiredness", symptomDays);
                    patientObj.addSymptom(tiredness);
                    break;
                case("8"):
                    Symptom smell = new Symptom("Loss of smell", symptomDays);
                    patientObj.addSymptom(smell);
                    break;
                case("9"):
                    Symptom taste = new Symptom("Loss of taste", symptomDays);
                    patientObj.addSymptom(taste);
                    break;
                case("10"):
                    Symptom headache = new Symptom("Headache", symptomDays);
                    patientObj.addSymptom(headache);
                    break;
                case("11"):
                    Symptom diarrhea = new Symptom("Diarrhea", symptomDays);
                    patientObj.addSymptom(diarrhea);
                    break;
                case("12"):
                    Symptom vomiting = new Symptom("Severe vomiting", symptomDays);
                    patientObj.addSymptom(vomiting);
                    break;
                default:
                    System.out.println("Invalid symptom");
                    break;
            }//END SWITCH


        }//END ADD SYMPTOM


//        //prints symptoms for x days
//        for (Symptom symptom : patientObj.symptoms){
//            System.out.println(symptom.symptomNameAndDays());
//        }
//        System.out.println(patientObj.symptoms.get(0).symptomNameAndDays());                          //CHECK SYMPTOMS


//                                              GETTING CONTACT INFO

        System.out.println("Has the patient come into contact with any persons? (yes / no)");
        String userAnswer = input.nextLine();


        while (!userAnswer.equalsIgnoreCase("no")) {

            Contact contactObj = null;
            System.out.println("What is the contact's name?");
            String contactName = input.nextLine();

            System.out.println("What is the contact's phone number?");
            String contactNum = input.nextLine();

            System.out.println("What is the contact email?");
            String contactEmail = input.nextLine();


            contactObj = new Contact(contactName, contactNum, contactEmail);    //create contact
            patientObj.addContact(contactObj);

            System.out.println("Has the patient come in contact with anyone else? (yes / no)");
            userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase("n")|| userAnswer.equalsIgnoreCase("no")){
                break;
            }

        }

//        //prints all patient contacts                                                                 //CHECK CONTACTS
//        System.out.println("** \t\tContacts:");
//        for(Contact contact : patientObj.contacts){
//            System.out.println(contact.contactInfo()+"\n\n");
//        }
//        System.out.println(patientObj.contacts.get(0).contactInfo());



        //              PRINT ALL INFO TOGETHER

        System.out.println("***** Contact Tracing Report *****");

        System.out.println(patientObj.patientInfo());

        System.out.println("** \t\tSymptoms:");

        for (Symptom symptom : patientObj.symptoms){
            System.out.println(symptom.symptomNameAndDays());
        }

        System.out.println("\n");

        System.out.println("** \t\tContacts:");
        for(Contact contact : patientObj.contacts){
            System.out.println(contact.contactInfo()+"\n\n");
        }

        System.out.println("Application Finished");



    }


}
