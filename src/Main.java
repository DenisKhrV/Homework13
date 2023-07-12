public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1447);
        warAndPeace.setPublicationYear(1867);
        System.out.println("warAndPeace.getBookTitle() = " + warAndPeace.getBookTitle());
        System.out.println("warAndPeace.getAuthor() = " + warAndPeace.getAuthor().getFirstName());
        System.out.println("warAndPeace.getAuthor().getLastName() = " + warAndPeace.getAuthor().getLastName());
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
        System.out.println();

        Author nikolayNosov = new Author("Nikolay", "Nosov");
        Book neznaykaNaLune = new Book("Dunno on the Moon", nikolayNosov, 1965);

        Author nikolayNosovCopy = new Author("Nikolay", "Nosov");
        Book neznaykaNaLuneCopy = new Book("Dunno on the Moon", nikolayNosov, 1965);

        System.out.println(warAndPeace);
        System.out.println(neznaykaNaLune);
        System.out.println();

        if (nikolayNosov.equals(nikolayNosovCopy)) {
            System.out.println("Автор одинаковый");
        }
        if (neznaykaNaLune.equals(neznaykaNaLuneCopy)) {
            System.out.println("Книги полностью одинаковые");
        }
    }
}
