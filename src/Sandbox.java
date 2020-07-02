//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Sandbox {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        SymptomDatabase currentSymptoms = new SymptomDatabase();
//        currentSymptoms.preloadDB();
//
////        System.out.println(currentSymptoms.toString());
////        System.out.println(currentSymptoms.size());
//        Symptom malaria = new Symptom("malaria");
//        currentSymptoms.addSymptom(malaria);
////        System.out.println(currentSymptoms.toString());
//        Patient patient = new Patient();
//
//        int symptomDays;
//        String userAnswer;
//
//
//        for (Symptom symptom : currentSymptoms){    //START CHECK SYMPTOMS AGAINST DATABASE
//            System.out.println("Are you experiencing " + symptom.getSymptomName()+ "?");
//            userAnswer = input.nextLine();
//            if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
//                System.out.println("How many days?");
//                symptomDays = Integer.valueOf(input.nextLine());
//
//                Symptom symptomObj = symptom;              //creating new Symptom object with database template
//                symptomObj.setSymptomDays(symptomDays);     //add symptom days before adding to patient's symptoms
//                patient.addSymptom(symptomObj);                                               //adding symptom to arraylist
//            }
//        }//END SYMPTOM DATABASE
//
//        for (Symptom symptom : patient.symptoms) {                      //loop through patientobj symptoms arraylist
//            System.out.println(symptom.symptomNameAndDays());
//        }
//
//
//
//
//
//
//
//
//
//    }
//
//
//}
