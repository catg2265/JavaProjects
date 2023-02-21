package dk.aau.imi.med4.ooadp2009.todo;

public class ToDoItem implements Comparable<ToDoItem> {
	
	private Date deadlineDate;
	private Time deadlineTime;
	private String description;
	private Priority priority;
	private Completion completion;
	
	public ToDoItem() {
		setDeadlineDate(null);
		setDeadlineTime(null);
		setDescription(null);
		setPriority(null);
		setCompletion(null);
	}
	
	public ToDoItem(
			Date deadlineDate,
			Time deadlineTime,
			String description,
			Priority priority,
			Completion completion) {
		setDeadlineDate(deadlineDate);
		setDeadlineTime(deadlineTime);
		setDescription(description);
		setPriority(priority);
		setCompletion(completion);
	}

	public Date getDeadlineDate() {
		return deadlineDate;
	}
	public void setDeadlineDate(Date deadlineDate) {
		this.deadlineDate = deadlineDate;
	}
	public Time getDeadlineTime() {
		return deadlineTime;
	}
	public void setDeadlineTime(Time deadlineTime) {
		this.deadlineTime = deadlineTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public Completion getCompletion() {
		return completion;
	}
	public void setCompletion(Completion completion) {
		this.completion = completion;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof ToDoItem)) return false;
		ToDoItem toDo = (ToDoItem)obj;
		if (!getDeadlineDate().equals(toDo.getDeadlineDate())) return false;
		if (!getDeadlineTime().equals(toDo.getDeadlineTime())) return false;
		if (!getDescription().equals(toDo.getDescription())) return false;
		if (!getPriority().equals(toDo.getPriority())) return false;
		if (!getCompletion().equals(toDo.getCompletion())) return false;
		return true;
	}
	
	public int compareTo(ToDoItem toDo) {
		if (toDo == null) return 1;
		if (this.equals(toDo)) return 0;
		int comp = getDeadlineDate().compareTo(toDo.getDeadlineDate());
		if (comp != 0) return comp;
		comp = getDeadlineTime().compareTo(toDo.getDeadlineTime());
		if (comp != 0) return comp;
		comp = getPriority().compareTo(toDo.getPriority());
		if (comp != 0) return comp;
		comp = getCompletion().compareTo(toDo.getCompletion());
		if (comp != 0) return comp;
		return getDescription().compareTo(toDo.getDescription());
	}
	
	@Override
	public String toString() {
		return
			getDeadlineDate() + " " +
			getDeadlineTime() + " " +
			getDescription() + " (" +
			getPriority() + " priority, " +
			getCompletion() + ")\n";
	}
}
