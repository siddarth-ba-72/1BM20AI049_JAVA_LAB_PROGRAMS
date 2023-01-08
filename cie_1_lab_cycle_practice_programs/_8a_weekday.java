package cie_1_lab_cycle_practice_programs;

/* Question:-
Create a public enum Weekday with constants for MONDAY, TUESDAY,... until
SUNDAY. The enum should have an instance method boolean isWeekDay() and an
instance method boolean isHoliday(). The isHoliday() method should return the
opposite of isWeekDay(). Write a program which demonstrates how this enum
could be used, which has a method which takes a Weekday as the argument and
prints a message depending on whether the Weekday is a holiday or not.
*/

enum WeekDay {
    MONDAY,
    TEUSDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        return (this.ordinal() >= MONDAY.ordinal()) && (this.ordinal() <= FRIDAY.ordinal());
    }

    public boolean isHoliDay() {
        return !isWeekDay();
    }
}

public class _8a_weekday {

    public static void displayWeekDay(WeekDay weekday) {
        if (weekday.isWeekDay())
            System.out.println("Weekday");
        else
            System.out.println("Holiday");
    }

    public static void main(String[] args) {
        WeekDay monday = WeekDay.MONDAY;
        System.out.print("Monday is a ");
        displayWeekDay(monday);

        WeekDay saturday = WeekDay.SATURDAY;
        System.out.print("Saturday is a ");
        displayWeekDay(saturday);
    }
}
