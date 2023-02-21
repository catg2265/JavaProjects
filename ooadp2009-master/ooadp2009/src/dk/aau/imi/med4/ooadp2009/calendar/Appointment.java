package dk.aau.imi.med4.ooadp2009.calendar;

public class Appointment implements Comparable<Appointment>{
	
	//Instance variables
	private Date date;
	private Time startTime;
	private Time endTime;
	private String place;
	private String description;
	
	//Constructors
	public Appointment() {
		setDate(null);
		setStartTime(null);
		setEndTime(null);
		setPlace(null);
		setDescription(null);
	}
	
	public Appointment(Date date, Time startTime, Time endTime, String place, String description) {
		setDate(date);
		setStartTime(startTime);
		setEndTime(endTime);
		setPlace(place);
		setDescription(description);
	}

	public Appointment(Date date, Time startTime, String description) {
		setDate(date);
		setStartTime(startTime);
		setEndTime(null);
		setPlace(null);
		setDescription(description);
	}
	
	//Methods
	////Getters and Setters
	public Date 	getDate() { return date; }
	public void 	setDate(Date date) { this.date = date; }
	public Time 	getStartTime() { return startTime; }	
	public void 	setStartTime(Time newTime) { startTime = newTime; }
	public Time 	getEndTime() { return endTime; }	
	public void 	setEndTime(Time newTime) { endTime = newTime; }
	public String 	getPlace() { return place; }
	public void 	setPlace(String newPlace) { place = newPlace; }
	public String 	getDescription() { return description; }
	public void 	setDescription(String newDescription) {description = newDescription; }
	
	////Method for displaying information in an appointment
	public String toString() {
		return "\n"+
			getDate()+" "+
			getStartTime()+"-"+
			getEndTime()+" ("+
			getPlace()+") "
			+getDescription();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Appointment)) return false;
		//So obj is an Appointment object
		Appointment apt = (Appointment)obj;
		if (!getDate().equals(apt.getDate())) return false;
		if (!getStartTime().equals(apt.getStartTime())) return false;
		if (!getEndTime().equals(apt.getEndTime())) return false;
		if (!getPlace().equals(apt.getPlace())) return false;
		if (!getDescription().equals(apt.getDescription())) return false;
		return true;
	}
	
	/**
	 * Sorts Appointment objects chronologically 
	 * by date, then start time, then end time;
	 * then alphabetically by place, then description.
	 */
	public int compareTo(Appointment apt) {
		if (apt == null) return 1;
		if (this.equals(apt)) return 0;
		//So appointments are not equal
		int comp = this.getDate().compareTo(apt.getDate());
		if (comp != 0) return comp;
		//So dates are equal
		comp = this.getStartTime().compareTo(apt.getStartTime());
		if (comp != 0) return comp;
		//So start times are equal
		comp = this.getEndTime().compareTo(apt.getEndTime());
		if (comp != 0) return comp;
		//So end times are equal
		comp = this.getPlace().compareTo(apt.getPlace());
		if (comp != 0) return comp;
		//So places are equal
		return this.getDescription().compareTo(apt.getDescription());
	}
}
