package Classwork;
// public class EmployeeBonus {
//     public static void main(String[] args) {
//     int[] salaries = {40000, 60000, 85000, 30000};
//     int[] experience = {2, 5, 10, 1};
//     int[] bonuses = new int[4];
    
//     if (experience[0] > 5) bonuses[0] = (int) (salaries[0] * 0.10);
//     else if (experience[0] > 2) bonuses[0] = (int) (salaries[0] * 0.05);
//     else bonuses[0] = 1000;
    
//     if (experience[1] > 5) bonuses[1] = (int) (salaries[1] * 0.10);
//     else if (experience[1] > 2) bonuses[1] = (int) (salaries[1] * 0.05);
//     else bonuses[1] = 1000;
    
//     if (experience[2] > 5) bonuses[2] = (int) (salaries[2] * 0.10);
//     else if (experience[2] > 2) bonuses[2] = (int) (salaries[2] * 0.05);
//     else bonuses[2] = 1000;
    
//     if (experience[3] > 5) bonuses[3] = (int) (salaries[3] * 0.10);
//     else if (experience[3] > 2) bonuses[3] = (int) (salaries[3] * 0.05);
//     else bonuses[3] = 1000;
    
//     for (int i = 0; i < 4; i++) {
//     System.out.println("Employee " + (i + 1) + " Bonus: $" + bonuses[i]);
//     }
//     }
//     } 


// modified one:

public class EmployeeBonus {
    public static void main(String[] args) {
        int[] salaries = {40000, 60000, 85000, 30000};
        int[] experience = {2, 5, 10, 1};
        int[] bonuses = new int[salaries.length];

        for (int i = 0; i < salaries.length; i++) {
            if (experience[i] > 5) {
                bonuses[i] = (int) (salaries[i] * 0.10); // 10% bonus
            } else if (experience[i] > 2) {
                bonuses[i] = (int) (salaries[i] * 0.05); // 5% bonus
            } else {
                bonuses[i] = 1000; // Fixed bonus
            }
            
            System.out.println("Employee " + (i + 1) + " Bonus: $" + bonuses[i]);
        }
    }
}
