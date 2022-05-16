package pro.sky;

public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Andrei","Bulochkin");
        Author author2 = new Author("Oleg","Ivanov");
        Author author3 = new Author("Sergey","Gergeev");


        Book book1 = new Book("Моя книга",author1,1977);
        Book book2 = new Book("Другая книга",author2,1877);
        Book book3 = new Book("Библия",author3,109);

        book3.setYear(1999);
    }
}
