package dk.aau.imi.med4.ooadp2009.calendar;

public class Date implements Comparable<Date> {
	
	//Instance variables
	private Integer dayOfMonth;
	private Integer year;
	private Month month;

	//Constructors
	public Date() {
		setDayOfMonth(null);
		setYear(null);
		setMonth(null);
	}

	public Date(Integer dayOfMonth, Month month, Integer year) {
		setDayOfMonth(dayOfMonth);
		setMonth(month);
		setYear(year);
	}

	//Getters and setters
	public Integer 	getDayOfMonth() { return dayOfMonth; }
	public void 	setDayOfMonth(Integer dayOfMonth) { this.dayOfMonth = dayOfMonth; }
	public Integer 	getYear() { return year; }
	public void 	setYear(Integer year) { this.year = year; }
	public Month 	getMonth() { return month; }
	public void 	setMonth(Month month) { this.month = month; }

	//toString
	public String toString() {
		return 
			getDayOfMonth()+" "+getMonth()+" "+getYear();
	}

	public int compareTo(Date date) {
		if (date == null) return 1;
		if (this.equals(date)) return 0;
		//So they're not equal
		int comp = getYear().compareTo(date.getYear());
		if (comp != 0) return comp;
		//So years are equal
		comp = getMonth().compareTo(date.getMonth());
		if (comp != 0) return comp;
		//So years and months are equal
		return getDayOfMonth().compareTo(date.getDayOfMonth());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Date)) return false;
		Date date = (Date)obj;
		if (!getDayOfMonth().equals(date.getDayOfMonth())) return false;
		if (!getMonth().equals(date.getMonth())) return false;
		if (!getYear().equals(date.getYear())) return false;
		return true;
	}
}
