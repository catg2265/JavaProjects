package dk.aau.imi.med4.ooadp2009.todo;

import java.util.TreeSet;

public class TestToDoList {
	public static void main(String[] args) {
		//Create a TreeSet to hold the ToDoItems
		TreeSet<ToDoItem> toDoList = new TreeSet<ToDoItem>();
		
		ToDoItem item1 = new ToDoItem(
				new Date(16,Month.FEBRUARY,2009), //Deadline date
				new Time(13,0), //Deadline time
				"Second OOADP exercise", //Description
				Priority.HIGH, //Priority
				Completion.STARTED //Degree of completion
				);

		ToDoItem item2 = new ToDoItem(
				new Date(16,Month.MARCH,2009), //Deadline date
				new Time(13,0), //Deadline time
				"Second OOADP exercise", //Description
				Priority.HIGH, //Priority
				Completion.STARTED //Degree of completion
				);

		ToDoItem item3 = new ToDoItem(
				new Date(16,Month.FEBRUARY,2010), //Deadline date
				new Time(13,0), //Deadline time
				"Second OOADP exercise", //Description
				Priority.HIGH, //Priority
				Completion.STARTED //Degree of completion
				);

		ToDoItem item4 = new ToDoItem(
				new Date(16,Month.FEBRUARY,2009), //Deadline date
				new Time(14,0), //Deadline time
				"Second OOADP exercise", //Description
				Priority.HIGH, //Priority
				Completion.STARTED //Degree of completion
				);

		ToDoItem item5 = new ToDoItem(
				new Date(16,Month.FEBRUARY,2009), //Deadline date
				new Time(13,1), //Deadline time
				"Second OOADP exercise", //Description
				Priority.HIGH, //Priority
				Completion.STARTED //Degree of completion
				);

		ToDoItem item6 = new ToDoItem(
				new Date(16,Month.FEBRUARY,2009), //Deadline date
				new Time(13,0), //Deadline time
				"Third OOADP exercise", //Description
				Priority.HIGH, //Priority
				Completion.STARTED //Degree of completion
				);

		ToDoItem item7 = new ToDoItem(
				new Date(16,Month.FEBRUARY,2009), //Deadline date
				new Time(13,0), //Deadline time
				"Second OOADP exercise", //Description
				Priority.MEDIUM, //Priority
				Completion.STARTED //Degree of completion
				);

		ToDoItem item8 = new ToDoItem(
				new Date(16,Month.FEBRUARY,2009), //Deadline date
				new Time(13,0), //Deadline time
				"Second OOADP exercise", //Description
				Priority.HIGH, //Priority
				Completion.NOT_STARTED //Degree of completion
				);

		toDoList.add(item1);
		toDoList.add(item2);
		toDoList.add(item3);
		toDoList.add(item4);
		toDoList.add(item5);
		toDoList.add(item6);
		toDoList.add(item7);
		toDoList.add(item8);

		System.out.println(toDoList);
	}
}
