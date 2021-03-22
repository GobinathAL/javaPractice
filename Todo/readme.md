# Assignment
# Learning Goals

This programming assignment has the following learning goals.

1. Practice writing and using **classes and objects**.
2. Learn about various class relationships like **association, aggregation or composition**.
3. Practice writing and using **constructors.**
4. Practice writing and using **instance/static variables and methods**.
5. Practice **testing your own class**.

# Assignment Specifications

In this assignment, you will be creating a Todo List which will contain several Todo items which in turn have features like task description, due date, status of the item, unique id and so on.

You will then perform several operations with the Todo List you have designed like adding items, deleting items, retrieving the items which are unfinished, updating the list with the items from a file, writing the Todo List into a file and so on.

Below is the description of all the classes:

- **DateTime** class is used to represent any specific date and time. You will use the integer fields **year, month, day, hours** and **mins** to represent the year, month, day, hours and minutes respectively. The class also contains constructors, some getter methods, toString method and compare method which are described in the Methods Section.

- **TodoItem** class is used to represent the todo item to be added to the todo list. It contains the instance variables **task, isComplete, dueDate, id** and a static field **maxId**.
  - The **task** field is a string that holds the description of the item to be done.
  - The boolean **isComplete** holds the status of the item currently, whether it is complete or not.
  - The **dueDate** field is an instance of the **DateTime** class and holds the due date of the to-do item.
  - The **id** field is a unique ID for the item created which is an integer. The static field **maxId** is used so that we can assign the **id** field sequentially to the to-do items. The **id** field needs to be monotonically increasing starting from 1. i.eTodoItem1 gets the id 1, TodoItem2 gets the id 2 and so on.

The methods in this class include constructors, getters and setters, toString methods which are described in the Methods Section.

- **TodoList** class is used to represent a to-do list. It contains the fields **items** and **count**.
  - The **items** field is an array of **TodoItem** which represents the array of todo itemswhich are in the todo list.
  - The **count** field represents the current number of items in the TodoList.

The class also has several methods which are described in detail in the Methods Section.

- **TodoMain** class has an interactive menu based interface using which you can create to-do lists. How to use this file is explained in the &quot;How to Compile and Run your Code&quot; section. **Do NOT modify** the contents of this file. You are **NOT required to submit** this file.

- **DateTimeTester** class is used to fully test the correctness of the DateTime class implementation. All the test cases have been provided for you. You are free to add more tests if you want to test your implementation against those. However, you are NOT required to submit this file.

- **TodoItemTester** class is used to fully test the correctness of the TodoItem class implementation. All the test cases have been provided for you. You are free to add more tests if you want to test your implementation against those. However, you are NOT required to submit this file.

- **TodoListTester** class is used to fully test the correctness of the TodoList class implementation. Some test cases have already been provided for certain methods. Your job is to add more test cases to these methods. In addition, you will have to add test cases for methods where we have not provided test cases.

## **Methods - DateTime**

There are **10 required methods** that you will complete in **DateTime**.

| **DateTime**  **Constructor  1** |
| --- |
| Method Header: public DateTime(int year, int month, int day, int hours, int mins) |
| Description: This constructor creates a DateTime object with the given year, month, day, hours and mins value. You can assume that the value passed in for year will be in the given range 1000 to 3000, the value for month will be in the range 1 to 12, day will be in the range 1 to 31, hours will be in the range 0 to 23, mins will be in the range 0 to 59. You need not add additional checks to verify if the values lie in this range. |

| **DateTime**  **Constructor  2** |
| --- |
| Method Header: public DateTime(String dateTime) |
| Description: This constructor creates a DateTime object with the given string which will be in the format **YYYY-MM-DD@HH:MM**. For example, &quot;2020-04-22@16:15&quot; represents a date time where 2020 represents the year, 04 represents the month, 22 represents the day, 16 represents the hours and 15 represents the mins value. You can assume that the string will be passed in this format and need not add additional checks to verify the same. |

| **getYear** |
| --- |
| Method Header: public int getYear() |
| Description: This is a getter method that returns the year of this DateTime. |

| **getMonth** |
| --- |
| Method Header: public int getMonth() |
| Description: This is a getter method that returns the month of this DateTime. |

| **getDay** |
| --- |
| Method Header: public int getDay() |
| Description: This is a getter method that returns the day of this DateTime. |

| **getHours** |
| --- |
| Method Header: public int getHours() |
| Description: This is a getter method that returns the hours value of this DateTime. |

| **getMins** |
| --- |
| Method Header: public int getMins() |
| Description: This is a getter method that returns the mins value of this DateTime. |

| **toString** |
| --- |
| Method Header: public String toString() |
| Description: This method overrides the Java Object&#39;s toString() method. This method will return a String that represents the value of the DateTime. For example, if the year=2019, month=03, day=20, hours=10, mins=50; then this method should return the string &quot; **2019-03-20@10:50**&quot;Make sure you maintain the exact format ( **YYYY-MM-DD@HH:MM** ) and do not have extra spaces or newlines or different characters. Quotes here are just used to represent it as a string. |

| **compare** |
| --- |
| Method Header: public int compare(DateTime dateTime) |
| Description: This method compares this DateTime object with the other dateTime object passed as an argument and returns either -1, 0, or 1. It returns -1 if _this_ DateTime is smaller, 1 if _this_ is larger, and 0 if _this_ is the same as the other dateTime passed as an argument. You can assume that null will not be passed as an input argument for this method.For example: &quot;2019-03-20@10:50&quot; is considered smaller than &quot;2020-04-22@16:15&quot; since the former comes earlier than the latter. |

| **equals** |
| --- |
| Method Header: public boolean equals(Object obj)  |
| Description: This method overrides the Java Object&#39;s equals(Object obj) method. This method returns true if this DateTime is equivalent to obj. It first checks whether the object is of type DateTime. You may use **i**** nstanceof** to check this. Then it checks whether the values in the fields are the same for both _this_ and _obj_. If the fields have the same value, it returns true. Otherwise, return false. |

## **Methods - TodoItem**

There are **13 required methods** that you will complete in **TodoItem**.

| **TodoItem**  **Constructor 1** |
| --- |
| Method Header: public TodoItem(String task)  |
| Description: This constructor creates a TodoItem object with the given task value. The field isComplete is initialized to the default value of false, the field dueDate is initialized to the default value of null, and the unique id is initialized appropriately with the help of the static field maxId (For example, if the latest TodoItem that was created has an id of n, then this TodoItem should have an id of n+1). |

| **TodoItem**  **Constructor 2** |
| --- |
| Method Header: public TodoItem(String task, DateTime dueDate) |
| Description: This constructor creates a TodoItem object with the given task and dueDate. The field isComplete is initialized to the default value of false and the unique id is initialized appropriately with the help of the static field maxId (For example, if the latest TodoItem that was created has an id of n, then this TodoItem should have an id of n+1). |

| **TodoItem**  **Constructor 3** |
| --- |
| Method Header: public TodoItem(String task, boolean isComplete, DateTime dueDate) |
| Description: This constructor creates a TodoItem object with the given task, isComplete value and the dueDate. The unique id is initialized appropriately with the help of the static field maxId. |

| **getTask** |
| --- |
| Method Header: public String getTask() |
| Description: This is a getter method that returns the task of this TodoItem. |

| **setTask** |
| --- |
| Method Header: public void setTask(String task) |
| Description: This is a setter method that sets the value of the task field of this TodoItem. |

| **isComplete** |
| --- |
| Method Header: public boolean isComplete() |
| Description: This is a getter method that returns the boolean value of isComplete of this TodoItem. |

| **setComplete** |
| --- |
| Method Header: public void setComplete(boolean isComplete) |
| Description: This is a setter method that sets the value of the isComplete field of this TodoItem. |

| **getDueDate** |
| --- |
| Method Header: public DateTime getDueDate() |
| Description: This is a getter method that returns the dueDate of this TodoItem. |

| **setDueDate** |
| --- |
| Method Header: public void setDueDate(DateTime dueDate) |
| Description: This is a setter method that sets the value of the dueDate field of this TodoItem. |

| **getId** |
| --- |
| Method Header: public int getId() |
| Description: This is a getter method that returns the unique id of this TodoItem. |

| **setId** |
| --- |
| Method Header: public int setId() |
| Description: This is a setter method that sets the id of this TodoItem. |

| **toString** |
| --- |
| Method Header: public String toString() |
| Description: This method overrides the Java Object&#39;s toString() method. This method will return a String that represents the value of the TodoItem. For example, if the TodoItem has the following values for its fields: task is &quot;Complete HW1&quot;, dueDate is a DateTime object which represents the value 2010-04-21@16:15, isComplete is false and the unique id assigned to this TodoItem is 1, then it should return the following string:&quot;**TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2010-04-21@16:15]**&quot;Make sure you maintain the exact format and do not have extra spaces or newlines or different characters. Quotes here are just used to represent it as a string. |

| **equals** |
| --- |
| Method Header: public boolean equals(Object obj)  |
| Description: This method overrides the Java Object&#39;s equals(Object obj) method. This method returns true if _this_ TodoItem is equivalent to obj.  It first checks whether the object obj is of type TodoItem. You may use **i**** nstanceof** to check this. Then it checks whether the values in the fields are the same for both _this_ and _obj_. If the fields have the same value, it returns true. Otherwise, return false. |

## **Methods - TodoList**

There are **14 required methods** and **3 optional methods** in **TodoList**.

| **TodoList**  **Constructor  1** |
| --- |
| Method Header: public TodoList() |
| Description: This constructor creates a TodoList object with the following default values for the fields. The items field is created to be an array with a default max size of 10 and the count value is initialized to 0 since no items are added to the TodoList yet. |

| **TodoList Constructor  2** |
| --- |
| Method Header: public TodoList(int numItems) |
| Description: This constructor creates a TodoList object with the following values for the fields. The items field is created to be an array with a given size of numItems passed as an argument and the count value is initialized to 0 since no items are added to the TodoList yet. If an invalid input is provided to the numItems then you can create a TodoList with the default parameters as described in the previous constructor. |

| **TodoList Constructor  3** |
| --- |
| Method Header: public TodoList(String inputFile) throws FileNotFoundException |
| Description: This constructor will initialize the items as per the number of items in the file (each row represents an item). Then, it will read in each TodoItem from the input file and add them to the TodoList appropriately. The input file will have the following format:**1. TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2010-04-21@16:15]****2. TodoItem [uniqueId=3, task=Buy Bread, isComplete=true, dueDate=2020-04-21@10:00]**Each row in the input file represents one TodoItem that should be added to the TodoList. In this above example, there are two items that should be added. Each row will have a serial number, then the word stating TodoItem and the corresponding values for the different fields of that TodoItem.

A sample input file containing TodoItems can be found [here](https://github.com/CSE8B-Spring2020/cse8b-sp20-pa4-starter).

**HINT:** You can use the **addItem()** method of the TodoList (described below) in this constructor. Also, while initializing the items field you can read the file once to count the number of items that the array should be initialized with. Then read the file again to get the items. |

| **getItems** |
| --- |
| Method Header: public TodoItem[] getItems() |
| Description: This is a getter method that returns the items of this TodoList. |

| **getMaxItems** |
| --- |
| Method Header: public int getMaxItems() |
| Description: This is a getter method that returns the maximum items that this TodoList can hold. |

| **getCount** |
| --- |
| Method Header: public int getCount() |
| Description: This is a getter method that returns the current count of items of this TodoList. |

| **addItem** |
| --- |
| Method Header: public boolean addItem(TodoItem item) |
| Description: This method should add the given item to the end of the TodoList if there is space available. It should return true if the method was successfully able to add the item, else return false. For example, one such case would be when there is no more space available to add the item. Also, if the input parameter is null then you should return false. (If the item we are adding somehow has the same id (through some redefinition) of an object within the existing list, then it should add the item and return true.)

**HINT:** Make sure you update the **count** variable appropriately after adding an item. |

| **removeItem** |
| --- |
| Method Header: public boolean removeItem(TodoItem item) |
| Description: This method should **remove the first occurence** of the given item from the TodoList, if it ou should compare the **task** fields of the items to verify if the item exists in the TodoList. It should return true if the method was successfully aexists. Yble to delete the item, else return false. For example, one such case would be when the item does not exist in the TodoList. If the input parameter is null, then you should return false. Make sure to push all the elements of the array to the left after removal while maintaining the maximum size as it is.


For example:If the array&#39;s maximum size is 5 and currently it has 3 items in it. And if you are expected to remove the first item, then after removal, the array size would be 5 and it will have 2 items and all the items should be pushed to the left. Before, if the array looked as follows:[TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2010-04-21@16:15],TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null],TodoItem [uniqueId=3, task=Buy Bread, isComplete=false, dueDate=2020-04-21@16:15],null,null]Then after removal it should be:[TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null],TodoItem [uniqueId=3, task=Buy Bread, isComplete=false, dueDate=2020-04-21@16:15],null,null,null]

**HINT:** Make sure you update the **count** variable appropriately after removing an item. |

| **updateItem** |
| --- |
| Method Header: public TodoItem updateItem(TodoItem item, int index) |
| Description: This method is used to update an existing item at the specified index (represented using zero-based indexing) using the item passed in as a parameter. If the index passed in is invalid or if null is passed as an item, then return null. Else, return the previously available item at this index.

For example: If the TodoList had the following three items previously:**TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2010-04-21@16:15]****TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null]****TodoItem [uniqueId=3, task=Buy Bread, isComplete=false, dueDate=2020-04-21@16:15]**


Now let the new item be **new TodoItem(&quot;Complete survey&quot;, new DateTime(&quot;2020-04-21@11:00&quot;).** Then after calling the method **updateItem(item, 1)**. The item at the index 1 (zero-based indexing) is changed accordingly.

The new TodoList will be as follows:**TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2010-04-21@16:15]****TodoItem [uniqueId=4, task=Complete survey, isComplete=false, dueDate=2020-04-21@11:00]****TodoItem [uniqueId=3, task=Buy Bread, isComplete=false, dueDate=2020-04-21@16:15]** |

| **getUnfinishedItems** |
| --- |
| Method Header: public TodoItem[] getUnfinishedItems() |
| Description: This method should return all the unfinished items in the TodoList (i.e., all items that have a value of isComplete of the TodoItem to be false) as an array of TodoItems. If there are no unfinished items, then return null. |

| **findItems** |
| --- |
| Method Header: public TodoItem[] findItems(String word) |
| Description: This method should return all the items whose task description contains the string passed in as a parameter. The search is **case insensitive**. As long as the _word_ is found in the _task_ description of a TodoItem, then the TodoItem contains the _word_. If no such items are found, then return null. Or if the input parameter is null then you can return null. Make sure to convert everything to lowercase and then compare. If an empty string is passed then return all the items in the TodoList. Whitespaces are to be considered as it is (should not be removed).For example:If the word &quot;read&quot; is passed in as a parameter, and if the TodoList contains four items whose task description is as follows:Item 1 has task=&quot;Read first chapter&quot;Item 2 has task=&quot;Pending reading quiz&quot;Item 3 has task=&quot;Buy bread&quot;Item 4 has task=&quot;Finish PA4&quot;Then this method should return items 1, 2 and 3 (since these 3 items contain read as part of their task description). Remember, this search is **case insensitive**. |

| **findItem** |
| --- |
| Method Header: public TodoItem findItem(int id) |
| Description: This method should return the item from the TodoList that matches the id. Remember all items have unique ids. If no such item is found, then return null. |

| **toString** |
| --- |
| Method Header: public String toString() |
| Description: This method overrides the Java Object&#39;s toString() method. This method will return a String that represents the contents of the TodoList. The null items of the todoList should not be printed. If the TodoList is empty then only print &quot;TodoList:&quot;.It should be in the following format: **TodoList:**** 1. TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2010-04-21@16:15]****2. TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null]****3. TodoItem [uniqueId=3, task=Buy Bread, isComplete=false, dueDate=2020-04-21@16:15] **Make sure that the keyword** TodoList:** is the first line and then each line in the output should represent the details of each item in the TodoList as shown above. Make sure you maintain the exact format and do not have extra spaces or newlines or different characters.  |

| **saveTodoListToFile** |
| --- |
| Method Header: public boolean saveTodoListToFile(String fileName) throws FileNotFoundException |
| Description: This method should write the items in the TodoList to the file specified in the input argument. If the input parameter is null, this method should return false or if there are no items in the list, then this method should create an empty file. The null items of the todoList should not be printed into the file.For example: The contents of the file should look like this:**1. TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2010-04-21@16:15]****2. TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null]****3. TodoItem [uniqueId=3, task=Buy Bread, isComplete=false, dueDate=2020-04-21@16:15]**Each row in the output file represents one TodoItem that was in the TodoList. In this above example, there were three items in the TodoList so there are 3 rows in the output file. Each row will have a serial number, then the word stating TodoItem and the corresponding values for the different fields of that TodoItem. Make sure you maintain the exact format and do not have extra spaces or newlines or different characters.  |

| **nextItemsToWorkOn (OPTIONAL METHOD)** |
| --- |
| Method Header: public TodoItem[] nextItemsToWorkOn() |
| Description: This method should return the unfinished TodoItems to work on with the earliest due dates.For example: If the TodoList has the following items:**1. TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2020-04-21@16:15]****2. TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null]****3. TodoItem [uniqueId=3, task=Buy Bread, isComplete=true, dueDate=2020-04-21@16:15]****4. TodoItem [uniqueId=4, task=Pay Rent, isComplete=false, dueDate=2020-04-20@16:00]****5. TodoItem [uniqueId=5, task=Check mail, isComplete=false, dueDate=2020-04-20@16:00]**Then, you need to return item 4 and item 5 only since they are not complete and also are due before the other pending tasks. You can ignore the items with null as dueDate. (This method could return unfinished items with the earliest due date which could occur in the past as well.)

**HINT:** You can use the **compare()** method defined in the DateTime class to implement this method. |

| **getOverdueItems (OPTIONAL METHOD)** |
| --- |
| Method Header: public TodoItem[] getOverdueItems(DateTime currentDateTime) |
| Description: This method should return the unfinished TodoItems to work on before the specified DateTime which is given as an argument. If the input parameter is null, then you should return null.For example: If the TodoList has the following items:**1. TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2020-04-21@16:15]****2. TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null]****3. TodoItem [uniqueId=3, task=Buy Bread, isComplete=true, dueDate=2020-04-21@16:15]****4. TodoItem [uniqueId=4, task=Pay Rent, isComplete=false, dueDate=2020-04-20@16:00]****5. TodoItem [uniqueId=5, task=Check mail, isComplete=false, dueDate=2020-04-20@16:00]**And we call the method with the DateTime &quot; **2020-04-21@16:15**&quot;  you need to return items 1, 4 and 5 only since they are not complete and also are due on or before the given DateTime. You can ignore the items with null as dueDate.

**HINT:** You can use the compare() method defined in the DateTime class |

| **findItems by Dates (OPTIONAL METHOD)** |
| --- |
| Method Header: public TodoItem[] findItems(DateTime fromDateTime, DateTime toDateTime) |
| Description: This method should return all the items within the specified from and to DateTime duration (inclusive). If the input parameters are null or if the fromDateTime is greater than toDateTime then you can return null.For example: If the TodoList has the following items:**1. TodoItem [uniqueId=1, task=Complete HW1, isComplete=false, dueDate=2020-04-21@16:15]****2. TodoItem [uniqueId=2, task=Prepare for RQ, isComplete=false, dueDate=null]****3. TodoItem [uniqueId=3, task=Buy Bread, isComplete=true, dueDate=2020-04-21@16:15]****4. TodoItem [uniqueId=4, task=Pay Rent, isComplete=false, dueDate=2020-04-20@16:00]****5. TodoItem [uniqueId=5, task=Check mail, isComplete=false, dueDate=2020-04-20@16:00]**And we call the method with the fromDateTime as &quot; **2020-04-10@16:15**&quot; and toDateTime as &quot; **2020-04-21@16:15**&quot; you need to return items 1, 3, 4 and 5 only since they are not complete and also are due on or before the given DateTime. You can ignore the items with null as dueDate.

**HINT:** You can use the **compare()** method defined in the DateTime class to implement this method. |
