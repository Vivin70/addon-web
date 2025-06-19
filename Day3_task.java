public class Day3_Task {
void payment(String person,double pay) {
System.out.println("No of Person:"+ person);
System.out.println("Amount Paid:"+pay);
}
void payment(String person,double pay,int days) {
double Amt = pay*days;
System.out.println("Salary to be paid:"+Amt);
}
public static void main(String[] args) {
Day3_Task in=new Day3_Task();
in.payment("Surya",1000);
in.payment("Surya", 1000, 30);

}

}
