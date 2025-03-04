public class Main {
    public static void main(String[] args) {
        Author teodorDrizer = new Author("Теодор", "Драйзер");
        Book finansist = new Book("Финансист", teodorDrizer, 1912);
        Author adityaBhargava = new Author("Адитья", "Бхаргава");
        Book grokaemAlgoritms = new Book("Грокаем алгоритмы 2", adityaBhargava, 2024);
        System.out.println(finansist.getNameBook() + " " + teodorDrizer.getFirstName() + " " + teodorDrizer.getLastName() + " " + finansist.getYearPublication());
        System.out.println(grokaemAlgoritms.getNameBook() + " " + adityaBhargava.getFirstName() + " " + adityaBhargava.getLastName() + " " + grokaemAlgoritms.getYearPublication());
        grokaemAlgoritms.setYearPublication(2019);
        System.out.println(grokaemAlgoritms.getNameBook() + " " + adityaBhargava.getFirstName() + " " + adityaBhargava.getLastName() + " " + grokaemAlgoritms.getYearPublication());
    }
}