package coreJava.advanced.encapsulation;

public class Account {

    // Encapsulation = Data Hiding + Abstraction.


    String name;
    String city;

    // Data Hiding using private modifier
    private float accountBalance;
    private float availableBalance;
    public  float depostiedAmount;


    public float setAccountBalance(float money){
        this.accountBalance = money;
        return accountBalance;

    }

    public float getAvailableBalance(){
        depostiedAmount += accountBalance;
        return depostiedAmount;
    }




}
