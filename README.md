#Contact Tracing

This program prompts an incoming patient for their contact information, symptoms, and people they have come in contact with.

#VersionHistory

    PatientAppV2
    fixed bug where user is prompted for contacted persons despite saying no contact history
    modified to ask user about each symptom
    modified to add multiple patients to one report
    


    PatientApp
    original submission
    showed menu of symptoms prompting user to add until done



IPO

INPUT
    
    patient information
        patient name
        patient phone number
        patient email
        patient city
        patient state
        patient symptoms
        patient symptoms duration
        
        patient contacts
            contact name
            contact phone number
            contact email
            
            
OUTPUT

    contact tracing report
        patient name
        patient phone number
        patient email
        patient city
        patient state
        
        patient symptoms
            symptom duration
            
            
PROCESS

    create a common parent class that has shared attributes
    
    PERSON (PARENT)
        name
        phone number
        city 
        state
        email address
        
        PATIENT (extends person)
            a collection of SYMPTOM (new class)
                symptom name
                symptom duration
                
        CONTACT (extends person)
            no unique attributes
            
            
    IO
        prompt user for name
        get name
        prompt user for phone number
        get phoneNum
        prompt user for email address
        get email
        prompt user for city
        get city
        prompt user for state
        get state
            create new patient (name,email,phone,city, state)
        
        prompt user for symptoms
        get symptoms
            patient.addSymptoms(sym1,sym2,sym3..)
        
           
        ask user for contacted persons
        prompt for contact name
            get name
        prompt for contact phone number
            get phoneNum
        prompt for email
            get email
        add new contact?
            if yes repeat
            if no break
            
            
    DISPLAY INFORMATION
        print header
        display patient name
        display patient phone
        display patient email
        display patient city, state
        
        
            display symptoms
                symptom 1 for x days
                symptom 2 for x days
                symptom 3 for x days
                
                
        display contacts
            display contact name
            display contact phone
            display contact email
            
            display contact name
            display contact phone
            display contact email
            
END                      
            
            
            
            