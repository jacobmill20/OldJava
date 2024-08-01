public class Week4{
	public static void main(String[] args){

	}
}
class Account{
	private int id;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;

	Account(){
		id = 0;
		balance = 0;
		java.util.Date dateCreated = new java.util.Date();
	}

	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		java.util.Date dateCreated = new java.util.Date();
	}

//Id accessor and mutator
	int getId(){
		return id;}
	void newId(int newId){
		id = newId;}

//Balance accessor and mutator
	double getBalance(){
		return balance;}
	void newBalance(double newBalance){
		balance = newBalance;}

//Interest ac
	double getInterest(){
		return annualInterestRate;}
	void newAnnualInterestRate(double newAIR){
		annualInterestRate = newAIR;}

	String getDate(){
		return dateCreated.toString();}




}