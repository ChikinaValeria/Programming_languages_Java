public class Task implements Priority, Complexity, Comparable<Task>{
    private String name, description;
    public int priority, complexity;
    public boolean done;

    public Task(String initName, String initDescription, int initPriority, int initComplexity){
        name = initName;
        description = initDescription;
        priority= initPriority;
        complexity = initComplexity;
        done = false;
    }
    public void setPriority(int newPriority){
        priority = newPriority;
    }
    public int getPriority(){
        return priority;
    }
    public void setComplexity(int newComplexity){
        complexity = newComplexity;
    }
    public int getComplexity(){
        return complexity;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String newDescription){
        description = newDescription;
    }
    public String getDone(){
        if (done){
            return "done";
        }else{
            return "not done";
        }    
    }    
    public void setDone(boolean isDone){
        done = isDone;
    }
    public String toString(){
        return "Task: " + name + "\nDescription: " + description + "\nPriority: "
                + priority + "\nComplexity: " + complexity + "\nThe task is " + getDone();
    }
    @Override
    public int compareTo(Task obj2){
        return Integer.compare(this.priority, obj2. priority);
    }
}
