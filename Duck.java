package OOP;

import java.time.LocalDate;

public class Duck extends Animal {
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }
}
