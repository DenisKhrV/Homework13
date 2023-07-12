public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1867);
        System.out.println("warAndPeace.getBookTitle() = " + warAndPeace.getBookTitle());
        System.out.println("levTolstoy.getFirstName() = " + levTolstoy.getFirstName());
        System.out.println("levTolstoy.getLastName() = " + levTolstoy.getLastName());
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
        warAndPeace.setPublicationYear(2002);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
        System.out.println();

        Author nikolayNosov = new Author("Nikolay", "Nosov");
        Book neznaykaNaLune = new Book("Dunno on the Moon", nikolayNosov, 1965);
        System.out.println("neznaykaNaLune.getBookTitle() = " + neznaykaNaLune.getBookTitle());
        System.out.println("nikolayNosov.getFirstName() = " + nikolayNosov.getFirstName());
        System.out.println("nikolayNosov.getLastName() = " + nikolayNosov.getLastName());
        System.out.println("neznaykaNaLune.getPublicationYear() = " + neznaykaNaLune.getPublicationYear());

    }
}