public static void main(){
	system.out.println("Welcome to main function");
}
void somefunction(){
	system.out.println("New somefunction is created");
}
void newfunction(){
	system.out.println("New newfunction is created");
}
void create_account(){
	boolean acc=true;
	int bal=1000;
}
void issue_passbook(){
	boolean pb=true;
}
void deposit(int d){
	bal=bal+d;
}
void withdraw(int w){
	bal=bal-w;
}
void issue_loan(){
	boolean loan=true;
	loan_bal=10000;
}
void pay_emi(int emi){
	loan_bal=loan_bal-emi;
}
void close_loan(int fullpayment){
	loan_bal=loan_bal-fullpayment;
	boolean loan=false;
}
