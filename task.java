import java.util.ArrayList;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        Person person1 = new Person("Иван", "Лебедев", 27, "мужской");
        Person person2 = new Person("Тарас", "Иванов", 22, "мужской");
        Person person3 = new Person("Антон", "Мальский", 18, "мужской");

        ArrayList<Person> arrayOfPersons = new ArrayList<>();
        arrayOfPersons.add(person1);
        arrayOfPersons.add(person2);
        arrayOfPersons.add(person3);
        for (int i = 0; i < arrayOfPersons.size(); i++){
            if (arrayOfPersons.get(i).getAge() > 20){
                System.out.println(arrayOfPersons.get(i));
            }
        }
    }

}