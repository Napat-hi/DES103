public class FamilyMember{

   static String familyName = "Hilton";
    String firstname;
    static double commonFund = 100000.00;
    double privateFund;

    public FamilyMember(String familyName, double privateFund) {
        this.firstname = familyName;
        this.privateFund = privateFund;
    }

    void printPrivateFund(){
        System.out.println(firstname + " " + familyName + "has $" + privateFund);
    }

    void contributeToCommonFund(double amount){
        commonFund += amount;
        privateFund -= amount;
    }

    static void payFromCommonFund(double amount){
        commonFund -= amount;
    }

    static void printFamilyFund(){
        System.out.println("The " + familyName + "family has $" + commonFund);
        
    }

}