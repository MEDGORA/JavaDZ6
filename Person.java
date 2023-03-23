import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private String sex;
    Person(String personName, String personSurname, Integer personAge, String personSex){
        name = personName;
        surname = personSurname;
        age = personAge;
        sex = personSex;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Integer getAge(){
        return age;
    }

    public String getSex(){
        return sex;
    }

    public String toString(){
        return "[Имя: " + name + ", Фамилия: " + surname + ", Возраст:" + age + ", Пол: " + sex + "]";
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && surname == anotherPerson.surname && age == anotherPerson.age && sex == anotherPerson.sex;
    }

    public int hashCode(){
        return Objects.hash(name, surname, age, sex);
    }
}
