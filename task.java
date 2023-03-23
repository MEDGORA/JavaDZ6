import java.util.ArrayList;

/**
 * Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля

Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их

В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
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

        // Выводит данные Person'ов в списке, возраст которых больше 20 лет
        for (int i = 0; i < arrayOfPersons.size(); i++){
            if (arrayOfPersons.get(i).getAge() > 20){
                System.out.println(arrayOfPersons.get(i));
            }
        }

        // Выводит имя и фамилию всех Person'ов в списке
        System.out.println();
        for (int i = 0; i < arrayOfPersons.size(); i++){
            System.out.println(arrayOfPersons.get(i).fullName());
        }

    }

}