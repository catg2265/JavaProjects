package dk.aau.imi.med4.ooadp2009.calendar;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestCalendar {
	public static void main(String[] args) {
		/*
		 * Let's make a calendar by storing some appointments in an ArrayList
		 * which allows duplicate appointments.
		 */
		
		ArrayList<Appointment> arrayCal = new ArrayList<Appointment>();
		
		Appointment apt1 = new Appointment(
				new Date(30,Month.JANUARY,2009),
				new Time(13,00),
				new Time(16,15),
				"4-117",
				"OOADP lecture");
		
		Appointment apt2 = new Appointment(
				new Date(31,Month.JANUARY,2009),
				new Time(13,00),
				new Time(16,15),
				"4-117",
				"OOADP lecture");
		
		Appointment apt3 = new Appointment(
				new Date(30,Month.FEBRUARY,2009),
				new Time(13,00),
				new Time(16,15),
				"4-117",
				"OOADP lecture");

		Appointment apt4 = new Appointment(
				new Date(30,Month.JANUARY,2010),
				new Time(13,00),
				new Time(16,15),
				"4-117",
				"OOADP lecture");

		Appointment apt5 = new Appointment(
				new Date(30,Month.JANUARY,2009),
				new Time(12,00),
				new Time(16,15),
				"4-117",
				"OOADP lecture");

		Appointment apt6 = new Appointment(
				new Date(30,Month.JANUARY,2009),
				new Time(13,00),
				new Time(16,14),
				"4-117",
				"OOADP lecture");

		Appointment apt7 = new Appointment(
				new Date(30,Month.JANUARY,2009),
				new Time(13,00),
				new Time(16,15),
				"4-118",
				"OOADP lecture");
		
		Appointment apt8 = new Appointment(
				new Date(30,Month.JANUARY,2009),
				new Time(13,00),
				new Time(16,15),
				"4-117",
				"OOADP lecture 2");

		arrayCal.add(apt1);
		arrayCal.add(apt1);
		arrayCal.add(apt2);
		arrayCal.add(apt3);
		arrayCal.add(apt4);
		arrayCal.add(apt5);
		arrayCal.add(apt6);
		arrayCal.add(apt7);
		arrayCal.add(apt8);

		System.out.println("Here is arrayCal:\n"+arrayCal);

		/*
		 * Now let's make a calendar that doesn't allow duplicate appointments.
		 */
		
		TreeSet<Appointment> setCal = new TreeSet<Appointment>();

		setCal.add(apt1);
		setCal.add(apt1);
		setCal.add(apt2);
		setCal.add(apt3);
		setCal.add(apt4);
		setCal.add(apt5);
		setCal.add(apt6);
		setCal.add(apt7);
		setCal.add(apt8);
		
		System.out.println("\n\nHere is setCal:\n"+setCal);
	}
}
