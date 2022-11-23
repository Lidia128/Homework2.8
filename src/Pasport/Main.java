package Pasport;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public class Main {
    Passport passport = new Passport (1803568947,"Сухов", "Иван", "Васильевич",
            1982_02_02);
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