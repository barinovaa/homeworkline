public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = " ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание 2");
        System.out.println(fullName.toUpperCase());

        System.out.println("Задание 3");
        String abc = "ёжик";
        abc = abc.replace("ё", "е");
        System.out.println(abc);



    }
}