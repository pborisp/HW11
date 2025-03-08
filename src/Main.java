public class Main {
    public static void main(String[] args) {
        Author teodorDrizer = new Author("Теодор", "Драйзер");
        Book finansist = new Book("Финансист", teodorDrizer, 1912);
        Author adityaBhargava = new Author("Адитья", "Бхаргава");
        Book grokaemAlgoritms = new Book("Грокаем алгоритмы 2", adityaBhargava, 2024);
        System.out.println(finansist.toString());
        System.out.println(grokaemAlgoritms.toString());
        grokaemAlgoritms.setYearPublication(2019);
        System.out.println(grokaemAlgoritms.toString());
    }
}