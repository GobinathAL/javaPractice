public class TodoItem {
    String task;
    boolean isComplete;
    DateTime dueDate;
    int id;
    static int maxId = 0;
    public TodoItem(String task) {
        this.task = task;
        isComplete = false;
        dueDate = null;
        id = ++maxId;
    }
    public TodoItem(String task, DateTime dueDate) {
        this.task = task;
        isComplete = false;
        this.dueDate = new DateTime(dueDate.toString());
        id = ++maxId;
    }
    public TodoItem(String task, boolean isComplete, DateTime dueDate) {
        this.task = task;
        this.isComplete = isComplete;
        this.dueDate = new DateTime(dueDate.toString());
        id = ++maxId;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public DateTime getDueDate() {
        return dueDate;
    }
    public void setDueDate(DateTime dueDate) {
        this.dueDate = new DateTime(dueDate.toString());
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "TodoItem [uniqueId=" + id + ", task=" + task + ", isComplete=" + isComplete + ", dueDate=" + dueDate.toString() + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TodoItem) {
            TodoItem todoItem = (TodoItem) obj;
            return (task == todoItem.task && isComplete == todoItem.isComplete && dueDate == todoItem.dueDate && id == todoItem.id);
        }
        return false;
    }
}