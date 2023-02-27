public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
    }
    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }
    public static void task2() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.println("" + fullName);
    }



}