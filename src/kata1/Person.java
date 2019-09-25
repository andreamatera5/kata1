package kata1;

import java.util.Date;

public class Person {
private final String nome;
private final Date birthday;
private static final int MS_PER_SECOND=1000;
private static final int SECOND_PER_MINUTE=60;
private static final int MINUTES_PER_HOUR=60;
private static final int HOURS_PER_DAY=24;
private static final int DAYS_PER_YEAR=365;
private static final int MS_PER_YEAR=MS_PER_SECOND*SECOND_PER_MINUTE*MINUTES_PER_HOUR*HOURS_PER_DAY*DAYS_PER_YEAR;
       

public Person(String nome, Date birthday) {
        this.nome = nome;
        this.birthday = birthday;
    }

    public String getNome() {
        return nome;
    }

    public Date getBirthday() {
        return birthday;
    }
public int getAge(){
long ms=new Date().getTime()-birthday.getTime();
return toYears(ms);
}
public int toYears(long ms){
return(int)(ms/MS_PER_YEAR);
}

    @Override
    public String toString() {
        return "Person{" + "nome=" + nome + ", birthday=" + birthday + '}';
    }

}