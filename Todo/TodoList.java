import java.io.*;
import java.util.*;
public class TodoList {
    private static final int DEFAULT_MAX_ITEMS = 10;
    TodoItem[] items;
    int count;
    public TodoList() {
        items = new TodoItem[DEFAULT_MAX_ITEMS];
        count = 0;
    }
    public TodoList(int numItems) {
        if(numItems < 0 ) numItems = DEFAULT_MAX_ITEMS;
        items = new TodoItem[numItems];
        count = 0;
    }
    public TodoList(String inputFile) throws FileNotFoundException {
        FileReader f = new FileReader(inputFile);
        int c;
        String s = "";
        try {
            while((c = f.read()) != -1) {
                s += (char) c;
            }
        }
        catch(Exception e) { }
        String[] arr = s.split("\n");
        items = new TodoItem[arr.length - 1];
        TodoItem.maxId = 0;
        for(String ele : arr) {
            if(ele.contains("TodoList")) continue;
            int beginIndex = ele.indexOf(", task") + 7;
            int endIndex = ele.indexOf(", isComplete");
            String task = ele.substring(beginIndex, endIndex);
            beginIndex = endIndex + 13;
            endIndex = ele.indexOf(", dueDate");
            boolean isComplete = Boolean.parseBoolean(ele.substring(beginIndex, endIndex));
            beginIndex = endIndex + 10;
            endIndex = ele.indexOf(']');
            DateTime dueDate = new DateTime(ele.substring(beginIndex, endIndex));
            TodoItem t = new TodoItem(task, isComplete, dueDate);
            this.addItem(t);
        }
    }   
    public TodoItem[] getItems() {
        return items;
    }
    public int getMaxItems() {
        return items.length;
    }
    public int getCount() {
        return count;
    }
    public boolean addItem(TodoItem item) {
        if(count == items.length || item == null) return false;
        items[count++] = item;
        return true;
    }
    public boolean removeItem(TodoItem item) {
        if(item == null) return false;
        int pos = -1;
        for(int i = 0; i < count; i++) {
            if(items[i].getTask().equals(item.getTask())) {
                pos = i;
                break;
            }
        }
        if(pos == -1) return false;
        for(int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
        items[count] = null;
        return true;
    }
    public TodoItem updateItem(TodoItem item, int index) {
        if(index < 0 || index >= count || item == null) return null;

        TodoItem temp = items[index];
        items[index] = item;
        return temp;
    }
    public TodoItem[] getUnfinishedItems() {
        ArrayList<TodoItem> list = new ArrayList<TodoItem>();
        for(TodoItem i : items) {
            if(i == null) continue;
            if(!i.isComplete()) {
                list.add(i);
            }
        }
        return list.toArray(new TodoItem[list.size()]);
    }
    public TodoItem[] findItems(String word) {
        if(word == null) return null;
        ArrayList<TodoItem> list = new ArrayList<TodoItem>();
        for(TodoItem i : items) {
            if(i == null) continue;
            if(i.getTask().toLowerCase().contains(word)) {
                list.add(i);
            }
        }
        return list.toArray(new TodoItem[list.size()]);
    }
    public TodoItem findItem(int id) {
        for(TodoItem i : items) {
            if(i == null) continue;
            if(i.getId() == id)
                return i;
        }
        return null;
    }
    @Override
    public String toString() {
        String res = "TodoList:";
        for(int i = 0; i < count; i++) {
            res += "\n" + (i + 1) + ". " + items[i].toString();
        }
        return res;
    }
    public boolean saveTodoListToFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        try {
            f.createNewFile();
        }
        catch(Exception e) {
            System.out.println("create failed");
           return false;
        }
        try {
            FileWriter w = new FileWriter(fileName);
            if(count == 0)
                w.write("");
            else
                w.write(this.toString());
            w.close();
            return true;
        }
        catch(Exception e) {
            System.out.println("Write failed");
            return false;
        }
    }
    public TodoItem[] nextItemsToWorkOn() {
        DateTime minDueDate = new DateTime(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        for(TodoItem i : items) {
            if(i == null) continue;
            if(i.isComplete() || i.getDueDate() == null) continue;
            if(i.getDueDate().compare(minDueDate) == -1) {
                minDueDate = i.getDueDate();
            }
        }
        ArrayList<TodoItem> list = new ArrayList<TodoItem>();
        for(TodoItem i : items) {
            if(i == null) continue;
            if(i.isComplete() || i.getDueDate() == null) continue;
            if(i.getDueDate().equals(minDueDate)) {
                list.add(i);
            }
        }
        return list.toArray(new TodoItem[list.size()]);
    }
    public TodoItem[] getOverdueItems(DateTime currentDateTime) {
        if(currentDateTime == null) return null;
        ArrayList<TodoItem> list = new ArrayList<TodoItem>();
        for(TodoItem i : items) {
            if(i == null) continue;
            if(i.getDueDate() == null || i.isComplete() || i.getDueDate().compare(currentDateTime) > 0) continue;
            list.add(i);
        }
        return list.toArray(new TodoItem[list.size()]);
    }
    public TodoItem[] findItems(DateTime fromDateTime, DateTime toDateTime) {
        if(fromDateTime == null || toDateTime == null || fromDateTime.compare(toDateTime) > 0) return null;
        ArrayList<TodoItem> list = new ArrayList<TodoItem>();
        for(TodoItem i : items) {
            if(i == null) continue;
            if(i.getDueDate() == null || i.getDueDate().compare(toDateTime) > 0 || i.getDueDate().compare(fromDateTime) < 0 ) continue;
            list.add(i);
        }
        return list.toArray(new TodoItem[list.size()]);
    }
}
