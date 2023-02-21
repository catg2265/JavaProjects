package dk.aau.imi.med4.ooadp2009.todo;

public class Time implements Comparable<Time>{
	private Integer hour;
	private Integer minute;
	
	public Time() {
		setHour(null);
		setMinute(null);
	}
	
	public Time(Integer hour, Integer minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public Integer 	getHour() { return hour; }
	public void 	setHour(Integer hour) { this.hour = hour; }
	public Integer 	getMinute() { return minute; }
	public void 	setMinute(Integer minute) { this.minute = minute; }
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Time)) return false;
		//So obj is a Time object
		Time time = (Time)obj;
		if (!getHour().equals(time.getHour())) return false;
		if (!getMinute().equals(time.getMinute())) return false;
		return true;
	}
	
	public int compareTo(Time time) {
		if (time == null) return 1;
		if (this.equals(time)) return 0;
		//So times are not equal
		if (getHour() < time.getHour()) return -1;
		if (getHour() > time.getHour()) return 1;
		//So hours are equal
		if (getMinute() < time.getMinute()) return -1;
		//So this minute must be greater than time's minute
		return 1;
	}
	
	@Override
	public String toString() {
		return getHour()+":"+getMinute();
	}
}
