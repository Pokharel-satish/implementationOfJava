class Account {       // class declaration 
    private String custID;    // private and protected field declaration 
    private String custName;
    private String custAddress;
    private int custPhone;
    protected double balance;
//constructor(non-default )  parameterized that takes input 
public Account(String custID, String custName, String custAddress, int custPhone, double balance) {
    this.custID = custID;
    this.custName = custName;
    this.custAddress = custAddress;
    this.custPhone = custPhone;
    this.balance = balance;
}
 //get(accessor) is added to all method and hence declared as public with return type 
public String getCustID() {
    return custID;
}

public String getCustName() {
    return custName;
}

public String getCustAddress() {
    return custAddress;
}

public int getCustPhone() {
    return custPhone;
}

public double getBalance() {
    return balance;
}
//set(mutator) is added which reset the value of private variable 
public void setCustID(String custID) {
    this.custID = custID;
}

public void setCustName(String custName) {
    this.custName = custName;
}

public void setCustAddress(String custAddress) {
    this.custAddress = custAddress;
}

public void setCustPhone(int custPhone) {
    this.custPhone = custPhone;
}
// Method named add is inserted with parameters and its execution addition of amount 
public void add(double amount) {
    balance += amount;
}
// method named subtract is inserted with parameters and its execution subtraction of amount
public void subtract(double amount) {
    balance -= amount;
}
// method named yearlyinterest is inserted with default and its execution 3% increment 
public void yearlyinterest() {
    balance *= (1 + 3.0 / 100); // Corrected calculation
}

// we need to override the parents for accessing data 
@Override
public String toString() {
    return "Account Details:\n" +
           "Customer ID: " + custID + "\n" +
           "Customer Name: " + custName + "\n" +
           "Customer Address: " + custAddress + "\n" +
           "Customer Phone: " + custPhone + "\n" +
           "Balance: AUS$" + balance;
}
public class Main {    // main method must be declare to run any program in java 
    public static void main(String[] args) {
    
    Account myAccount = new Account("25A", "Arun paudel", "2B sydney", 2211, 600);
  
    System.out.println(myAccount);
    myAccount.add(400);
    myAccount.subtract(30);
    myAccount.yearlyinterest();
    System.out.println(myAccount);
    }
}


}