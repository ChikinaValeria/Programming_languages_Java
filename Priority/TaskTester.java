public class TaskTester {
    public static void main(String[] args){
        Task task1 = new Task("Buy grocery", "Buy pasta, milk and cheese", 2);
        Task task2 = new Task("HW Programming languages", "Do exercises RationalNumber, Priority, Task", 1);
    

    System.out.println(task1.getName());
    System.out.println(task2.getDescription());
    System.out.println(task2.getPriority());
    System.out.println(task1);
    System.out.println(task2);

    task1.setDescription("Buy beer and cheeps");
    task1.setPriority(3);
    task2.setDone(true);
    task2.setName("Home Work");

    System.out.println(task1);
    System.out.println(task2);

    } 
}
