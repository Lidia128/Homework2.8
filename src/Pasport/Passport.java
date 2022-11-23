package Pasport;

import java.util.Objects;

public class Passport {

    private final int number;

    private final String surname;

    private final String name;

    private final String secondName;

    private final int dateOfBirth;


    public Passport(int number, String surname, String name, String secondName, int dateOfBirth) {
        this.number = number;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
    }
        public int getNumber() { return number; }

        public String getSurname() {return surname; }

        public String getName() {return name; }

        public String getLastName() {return secondName; }

        public int getDateOfBirth() { return dateOfBirth; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}


