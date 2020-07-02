import java.util.ArrayList;
import java.util.Scanner;

public class PatientAppV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Patient>patientArrayList = new ArrayList<Patient>();


        Patient patientObj = null;
            System.out.println("Contact Tracing Program");
            System.out.println("Enter a newly infected person's information:");

        while (true) {

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

            patientObj = new Patient(patientName, phoneNumber, city, state, email); //creating a new Patient object


//                                              ADDING SYMPTOMS
            String userAnswer = "";
            int symptomDays;


            System.out.println("Does " + patientName + " have any symptoms of fever? (yes/no)");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom fever = new Symptom("Fever", symptomDays);              //creating new Symptom object
                patientObj.addSymptom(fever);                                               //adding symptom to arraylist
            }

            System.out.println("Does " + patientName + " have any symptoms for cough?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom cough = new Symptom("Cough", symptomDays);
                patientObj.addSymptom(cough);
            }

            System.out.println("Does " + patientName + " have any symptoms of aches?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom aches = new Symptom("Aches", symptomDays);
                patientObj.addSymptom(aches);
            }

            System.out.println("Does " + patientName + " have any symptoms of chills?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom chills = new Symptom("Chills", symptomDays);
                patientObj.addSymptom(chills);
            }

            System.out.println("Does " + patientName + " have any symptoms of sore throat?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom soreThroat = new Symptom("Sore Throat", symptomDays);
                patientObj.addSymptom(soreThroat);
            }

            System.out.println("Does " + patientName + " have any symptoms of shortness of breath or difficulty breathing?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom shortBreath = new Symptom("Shortness of Breath", symptomDays);
                patientObj.addSymptom(shortBreath);
            }

            System.out.println("Does " + patientName + " have any symptoms of tiredness?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom tiredness = new Symptom("Tiredness", symptomDays);
                patientObj.addSymptom(tiredness);
            }

            System.out.println("Does " + patientName + " have any symptoms of loss of smell?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom smell = new Symptom("Loss of smell", symptomDays);
                patientObj.addSymptom(smell);
            }

            System.out.println("Does " + patientName + " have any symptoms of loss of taste?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom taste = new Symptom("Loss of taste", symptomDays);
                patientObj.addSymptom(taste);
            }

            System.out.println("Does " + patientName + " have any symptoms of headache?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom headache = new Symptom("Headache", symptomDays);
                patientObj.addSymptom(headache);
            }

            System.out.println("Does " + patientName + " have any symptoms of diarrhea?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom diarrhea = new Symptom("Diarrhea", symptomDays);
                patientObj.addSymptom(diarrhea);
            }

            System.out.println("Does " + patientName + " have any symptoms of severe vomiting?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("How many days?");
                symptomDays = Integer.valueOf(input.nextLine());
                Symptom vomiting = new Symptom("Severe vomiting", symptomDays);
                patientObj.addSymptom(vomiting);
            }
            //END ADD SYMPTOMS


//                                              GETTING CONTACT INFO

            userAnswer = "";
            System.out.println("Has the patient come into contact with any persons? (yes / no)");
            userAnswer = input.nextLine();

            while (userAnswer.equalsIgnoreCase("yes")||userAnswer.equalsIgnoreCase("y")) {

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

                if (userAnswer.equalsIgnoreCase("n") || userAnswer.equalsIgnoreCase("no")) {
                    break;
                }

            }//END ADD CONTACT

            //patient creation is complete at this point
            patientArrayList.add(patientObj);   //add Patient to patient array list


//                                                ADD ANOTHER PATIENT?

            userAnswer = "";
            System.out.println("Add another patient?");
            userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("n") || userAnswer.equalsIgnoreCase("no")) {
                break;
            }
        }//END ADD PATIENT

//                                                    DISPLAYING OUTPUT



        System.out.println("***** Contact Tracing Report *****");           //report header

        for (Patient patient : patientArrayList) {                          //loop through Patients in patient arraylist
            //LOOP THIS
            System.out.println("** \t\tPatient Info:");
            System.out.println(patient.patientInfo());
            System.out.println("** \t\tSymptoms:");
            for (Symptom symptom : patient.symptoms) {                      //loop through patientobj symptoms arraylist
                System.out.println(symptom.symptomNameAndDays());
            }
            System.out.println("\n");
            System.out.println("** \t\tContacts:");
            for (Contact contact : patient.contacts) {                      //loop through patient obj contacts arraylist
                System.out.println(contact.contactInfo() + "\n\n");
            }
            System.out.println("\t\t---------");
        }//END PRINT PATIENT

        System.out.println("Application Finished");

        }//END MAIN

    }//END CLASS
