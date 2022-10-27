public class Account{
private double balance=1000.00;
public double getBalance(int accoutid){
return balance;
}
public static void main(String [] args) {
Account accnt=new Account();
double value=accnt.getBalance(123456);
System.out.println("The balance is:"+value);
}
}