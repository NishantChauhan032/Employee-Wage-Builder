public class EmpWageBuilder{
    public static final int IS_PART_TIME=2;
    public static final int IS_FULL_TIME=1;

    public static int computeEmpWage(String company, int empRate, int noOfDays, int maxHrs){
      int empHours=0;
      int totalWorkingHours=0;
      int totalWorkingDays=0;

    while(totalWorkingHours <= maxHrs && totalWorkingDays < noOfDays){

      double attendence = Math.floor(Math.random()*10) % 3;
           switch ((int)attendence){
                 case IS_FULL_TIME:
                      empHours=8;
                      break;
                 case IS_PART_TIME:
                      empHours=4;
                      break;
                 default :
                      empHours=0;
                 }
         
         totalWorkingDays++;
         totalWorkingHours += empHours;
         System.out.println("Day#:" + totalWorkingDays+" Emp Hr:"+totalWorkingHours);
         }

         int totalEmpWage = totalWorkingHours * empRate;
 
         System.out.println("Total Employee Wage for Company "+ company + " is " + totalEmpWage);
         return totalEmpWage;
    }
     
    public static void main(String[] args){
     System.out.println("Welcome to Employee Wage Computation Program");    
     computeEmpWage("D-Mart" , 20 , 2 , 10);
     computeEmpWage("Reliance" , 10 , 4 , 20);
   }
 }

