public class EmpWageBuilder{
    public static final int IS_PART_TIME=2;
    public static final int IS_FULL_TIME=1;
    public static final int RATE_PER_HOUR=20;
    public static final int NO_OF_WORKING_DAYS=20;
    public static final int MAX_WORKING_HOURS=100;
    

    public static int computeEmpWage(){
      int empHours=0;
      int totalWorkingHours=0;
      int totalWorkingDays=0;

    while(totalWorkingHours <= MAX_WORKING_HOURS && totalWorkingDays <= NO_OF_WORKING_DAYS){

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

         int totalEmpWage = totalWorkingHours * RATE_PER_HOUR;
 
         System.out.println("Total Employee Wage Is : " + totalEmpWage);
         return totalEmpWage;
    }
     
    public static void main(String[] args){
     System.out.println("Welcome to Employee Wage Computation Program");    
     computeEmpWage(); 
   }
 }

