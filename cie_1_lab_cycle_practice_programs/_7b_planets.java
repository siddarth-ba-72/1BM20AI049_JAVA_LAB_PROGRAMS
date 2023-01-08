package cie_1_lab_cycle_practice_programs;

/*Questions:-
Back in the Planets enum, add a new field called yearLength.
a. The value of each yearLength should be the number of earth days of a
year on the given planet.
i. Number of earth days on each planet:
i. Mercury: 88
ii. Venus: 225
iii. Earth: 365
iv. Mars: 687
v. Jupiter: 4333
vi. Saturn: 10759
vii. Uranus: 30687
viii. Neptune: 60200
b. Update the constructor and add a getter for this field
 */

enum Planets {
    MERCURY(88),
    VENUS(225),
    EARTH(365),
    MARS(687),
    JUPITER(4333),
    SATURN(10759),
    URANUS(30687),
    NEPTUNE(60200);

    private int yearLength;

    Planets(int yearLength) {
        this.yearLength = yearLength;
    }

    public int getYearLength() {
        return yearLength;
    }
}

public class _7b_planets {
    public static void main(String[] args) {
        Planets mercury = Planets.MERCURY;
        System.out.println("Mercury: " + mercury.getYearLength());

        Planets venus = Planets.VENUS;
        System.out.println("Venus: " + venus.getYearLength());

        Planets earth = Planets.EARTH;
        System.out.println("Earth: " + earth.getYearLength());

        Planets mars = Planets.MARS;
        System.out.println("Mars: " + mars.getYearLength());

        Planets jupiter = Planets.JUPITER;
        System.out.println("Jupiter: " + jupiter.getYearLength());

        Planets saturn = Planets.SATURN;
        System.out.println("Saturn: " + saturn.getYearLength());

        Planets uranus = Planets.URANUS;
        System.out.println("Uranus: " + uranus.getYearLength());

        Planets neptune = Planets.NEPTUNE;
        System.out.println("Neptune: " + neptune.getYearLength());
    }
}