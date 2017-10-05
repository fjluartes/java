public class Doctor {
    boolean worksAtHospital;
    void treatPatient() {
        // perform a checkup
    }
}

public class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;
    void giveAdvice() {
        // give homespun advice
    }
}

public class Surgeon extends Doctor {
    void treatPatient() {
        // perform surgery
    }

    void makeIncision() {
        // make incision
    }
}

/* 
Surgeon instance variables = 1
FamilyDoctor instance variables = 2
Doctor methods = 1
Surgeon methods = 2
FamilyDoctor methods = 2
FamilyDoctor treatPatient() = yes
FamilyDoctor makeIncision() = no
 */
