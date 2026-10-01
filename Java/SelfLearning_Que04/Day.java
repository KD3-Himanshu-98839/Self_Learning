package SelfLearning_Que04;

enum Days {

	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;

	public boolean isWeekend() {
		return this == SATURDAY || this == SUNDAY;
	}

	public boolean Weekday() {
		return !isWeekend();
	}
}

public class Day {
	public static void main(String[] args) {

		for (Days day : Days.values()) {

			System.out.println(day +
					" Weekend: " + day.isWeekend() +
					" Weekday: " + day.Weekday());
		}
	}
}