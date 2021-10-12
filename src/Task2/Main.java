package Task2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Document document = new Document(new String[] {"shahid", "fanan"}, new Date());
        document.addAuthor("agung");
        StringBuilder authors = new StringBuilder();
        for (String x : document.getAuthors()) {
            authors.append(x).append(",");
        }
        System.out.println("Authors : " + String.valueOf(authors).replaceAll(",$", "").replace(",",", "));
        System.out.println("Date : " + document.getDate() + "\n");

        Book book = new Book(new String[] {String.valueOf(authors)}, new Date(), "StatS");
        StringBuilder authors_book = new StringBuilder();
        for (String numBook : book.getAuthors()) {
            authors_book.append(numBook);
        }
        System.out.println("List Authors : " + String.valueOf(authors_book).replaceAll(",$", "").replace(",",", "));
        System.out.println("Date : " + book.getDate());
        System.out.println("Title : "+ book.getTitle() + "\n");

        Email email = new Email(new String[] {String.valueOf(authors)}, new Date(), "TEC ", new String[] { "Daniel", "Fauzi" });
        StringBuilder authors_email = new StringBuilder();
        StringBuilder to = new StringBuilder();

        for (String numEmail : email.getAuthors()) {
            authors_email.append(numEmail);
        }
        for (String numTo : email.getTo()) {
            to.append(numTo).append(",");
        }

        System.out.println("List Authors : " + String.valueOf(authors_email).replaceAll(",$", "").replace(",",", "));
        System.out.println("Date : " + email.getDate());
        System.out.println("Subject : "+ email.getSubject() );
        System.out.println("To : " + String.valueOf(to).replaceAll(",$", "").replace(",",", "));





    }
}
