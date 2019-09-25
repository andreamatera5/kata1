package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthday;
    private final int MS_PER_SECOND = 1000;
    private final int SECOND_PER_MINUTE = 60;
    private final int MINUTES_PER_HOURS = 60;
    private final int HOURS_PER_DAY = 24;
    private final int DAYS_PER_YEAR = 365;
    private final int MS_PER_YEAR = MS_PER_SECOND * SECOND_PER_MINUTE * MINUTES_PER_HOURS * HOURS_PER_DAY * DAYS_PER_YEAR;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        long ms = new Date().getTime() - birthday.getTime();
        return (int) (ms / MS_PER_YEAR);
    }
    


}
