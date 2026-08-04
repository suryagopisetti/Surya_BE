package Com.Inheritance;

import java.util.Scanner;
class Policy {

    String customerName;
    String policyType;
    double policyAmount;
    double approvedAmount;
    String policyStatus;

    public Policy(String customerName, String policyType,
                  double policyAmount, double approvedAmount,
                  String policyStatus) {

        this.customerName = customerName;
        this.policyType = policyType;
        this.policyAmount = policyAmount;
        this.approvedAmount = approvedAmount;
        this.policyStatus = policyStatus;

        System.out.println("\nThe Policy Record has been Created.");
    }

    public void displayPolicyDetails() {

        System.out.println("\n----- POLICY SUMMARY -----");
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Policy Type     : " + policyType);
        System.out.println("Policy Amount   : " + policyAmount);
    }

    public void updateApprovedAmount(double amount) {

        if (amount < 0 || amount > policyAmount) {
            System.out.println("Invalid Approved Amount.");
        } else {
            approvedAmount = amount;
            System.out.println("Approved Amount Updated Successfully.");
        }
    }

    public void changePolicyStatus(String status) {

        if (status == null || status.equals("")) {
            System.out.println("Invalid Policy Status.");
        } else {
            policyStatus = status;
            System.out.println("Policy Status Updated Successfully.");
        }
    }

    public void policySummary() {

        displayPolicyDetails();
        System.out.println("Approved Amount : " + approvedAmount);
        System.out.println("Policy Status   : " + policyStatus);
    }
}

public class InsurancePolicyRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Policy Type : ");
        String policyType = sc.nextLine();

        System.out.print("Enter Policy Amount : ");
        double amount = sc.nextDouble();

        System.out.print("Enter Approved Amount : ");
        double approvedAmount = sc.nextDouble();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Policy Status : ");
        String status = sc.nextLine();

        Policy ip = new Policy(name, policyType, amount, approvedAmount, status);

        int choice;
        boolean exit = false;

        while (!exit) {

            System.out.println("\n------ MENU ------");
            System.out.println("1. Update Approved Amount");
            System.out.println("2. Change Policy Status");
            System.out.println("3. View Policy Summary");
            System.out.println("4. Exit");
            System.out.print("\nEnter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Approved Amount : ");
                    double approved = sc.nextDouble();
                    sc.nextLine();
                    ip.updateApprovedAmount(approved);
                    break;

                case 2:
                    System.out.print("Enter Policy Status : ");
                    String pStatus = sc.nextLine();
                    ip.changePolicyStatus(pStatus);
                    break;

                case 3:
                    ip.policySummary();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}