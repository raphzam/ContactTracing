public class Contact extends Person {


    public Contact(){

    }

    public Contact(String name, String phoneNumber, String email){
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }



    //RETRIEVE INFO

    public String contactInfo(){
        String retval = "";

        retval = "Name: " + getName() +
                "\n" + "Phone: " + getPhoneNumber() +
                "\n" + "Email: " + getEmail();

        return retval;
    }


}
