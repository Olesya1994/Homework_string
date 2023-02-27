public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
    }

    public static void task1_2() {
        System.out.println("Задача 1-2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("" + fullName);
    }
}