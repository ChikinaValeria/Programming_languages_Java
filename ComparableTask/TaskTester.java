public class TaskTester {
    public static void main(String[] args){
        Task task1 = new Task("Buy grocery", "Buy pasta, milk and cheese", 2, 20);
        Task task3 = new Task("Buy flowers", "Buy roses, tulips and  lilias", 2, 20);
        Task task2 = new Task("HW Programming languages", "Do exercises RationalNumber, Priority, Task", 1, 100);
    

        System.out.println("Here are the priorities of tasks: ");
    
        compareTasks(task1, task2);
        compareTasks(task2, task3);
        compareTasks(task3, task1);
    }    

        public static void compareTasks(Task task1, Task task2){
            int result = task1.compareTo(task2);
            if (result < 0) {
                System.out.println(task2.getName() + " is less important than " + task1.getName());
            } else if (result > 0) {
                System.out.println(task1.getName() + " is less important than " + task2.getName());
            } else {
                System.out.println(task1.getName() + " and " + task2.getName() + " have the same priority.");
            }
        }
     
}
