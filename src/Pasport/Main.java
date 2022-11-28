package Pasport;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public class Main {
    Passport ivan = new Passport (1803568947,"Сухов", "Иван", "Васильевич",
            "02.02.1982");
    Passport mariya = new Passport(1803265974, "Лукошкина", "Мария", "Петровна",
            "23.05.2000");
    Passport dmitriy = new Passport(1524369845, "Козловский", "Дмитрий", "Петрович",
            "07.12.1658");
    private final Set<Passport> passports = new HashSet<>();
    public void addOrUpdatePassport(Passport passport) {
        this.passports.add(passport); }
    public Passport findByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }
}