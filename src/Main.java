public class Main {


    public static void main(String[] args) {
        Author strugatsky = new Author("Борис и Аркадий", "Стругатские");
        Book mondayBeginsOnSaturday = new Book("Понедельник начинается в суббо" +
                "ту", strugatsky, 1964);
        Author marcusAurelius = new Author("Марк Аврелий", "Марк Элий Аврелий Вер Цезарь");
        Book reasoningAboutYourself = new Book("Рассуждения о самом себ" +
                "е.", marcusAurelius, 1914);
        mondayBeginsOnSaturday.setYearOfPublication(1979);
        System.out.println(reasoningAboutYourself.getNameBook() + " " + reasoningAboutYourself.getFullNameAuthor() +
                " " + reasoningAboutYourself.getYearOfPublication());
        System.out.println(mondayBeginsOnSaturday.getNameBook() + " " + mondayBeginsOnSaturday.getFullNameAuthor() +
                " " + mondayBeginsOnSaturday.getYearOfPublication());

    }

}