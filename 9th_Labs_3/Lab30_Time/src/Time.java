//Author: Rithvik Muthyalapati
//Date: 3/19/19
//Version 2.0
//Version Notes:
//v.2.0: I made it so that if the minutes had a single digit, it would be trailing behind a zero like 4:03

import java.time.*;
import java.util.*;


public class Time {

	private int hours;
	private int minutes;
	private boolean isAmPm;
	
	public Time() {// If time object has no parameters, then it sets it to 0
		hours = 0;
		minutes = 0;
	}
	
	public Time(int h, int m) {// Takes the hours and minutes and converts to 24 or AmPm
		hours = h;
		minutes = m;
		if (h < 0|| m < 0 || h > 24 || m >= 60) {
			throw new IllegalArgumentException("Improper time input");
		}
		toMins();
		toString();
	}
	
	public Time(String s) {// Gives the real time
		LocalTime localTime = LocalTime.now();
		hours = localTime.getHour();
		minutes = localTime.getMinute();
	}
	
	public Time(int m) {// Takes total minutes and converts to a proper time
		hours = m / 60;
		minutes = m % 60;
	}
	
	public Time(int h, int m, boolean isAM) {// Checks if time is Am or Pm and converts accordingly
		if (h == 12 && (isAM == false || isAM == true)) {
			h = 12;
		} else if (isAM == false) {
			h += 12;
		}

		while (m >= 60) {
			m -= 60;
			h += 1;
		}

		while (h > 24) {
			h -= 24;
		}

		hours = h;
		minutes = m;
		this.isAmPm = true;
	}

	
	public String toString() {// Formatting of the time
		String zeroFront = minutes + "";
		if (zeroFront.length() < 2) {
			zeroFront = "0" + zeroFront;
		}
		
		if (isAmPm) {
			if (hours < 12) {
				zeroFront += " AM";
				if (hours == 0) {
					return 12 + ":" + zeroFront;
				}
				return hours + ":" + zeroFront;
			} else {
				zeroFront += " PM";
				return (hours - 12) + ":" + zeroFront;
			}
		}
		return hours + ":" + zeroFront;
	}
	
	public int toMins() {// Takes the time and converts into minutes
		int totalMins = hours * 60 + minutes;
		return totalMins;
	}
	
	public int compareTo(Time t) {// Checks which time came earlier
		if (hours > t.hours) {
			return 1;
		} else if (hours < t.hours) {
			return -1;
		} else {
			if (minutes > t.minutes) {
				return 1;
			} else if (minutes < t.minutes) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	
	public int elapsedSince(Time t) {// Checks the amount of time between two given times
		int result = t.toMins();
		int ourResult = hours * 60 + minutes;
		if (result > ourResult) {
			result = result - 24 * 60;
			int finalResult = ourResult - result;
			return finalResult;
		}
		else {
			int finalResult = ourResult - result;
			return finalResult;
		}
	}
	
	public Time timeZone(String s) {// Converts between time zones
		Calendar timeVar = Calendar.getInstance();
		timeVar.setTimeZone(TimeZone.getTimeZone("PST"));
		timeVar.set(Calendar.HOUR, hours);
		timeVar.set(Calendar.MINUTE, minutes);
		
		Calendar zoneVar = new GregorianCalendar(TimeZone.getTimeZone(s));
		zoneVar.setTimeInMillis(timeVar.getTimeInMillis());
		hours = zoneVar.get(Calendar.HOUR);
		minutes = zoneVar.get(Calendar.MINUTE);
		return new Time(hours, minutes);
	}
	
	public Time increment() {// Increases minutes by one
		int hoursResult = hours;
		int minutesResult = minutes + 1;
		if (minutesResult == 60) {
			hoursResult++;
			minutesResult = 0;
			return new Time(hoursResult, minutesResult);
		} else {
			return new Time(hoursResult, minutesResult);
		}
	}
	
	public void setPrintAMPM(boolean isAMPM) {// Sets the field to the given condition
		isAmPm = isAMPM;
	}

}
