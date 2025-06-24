package ProvaPOO;

public class BookView{

    public void printBookDetails(Book bookModel) {
        System.out.println(bookModel.getAuthor());
        System.out.println(bookModel.getPages());
        System.out.println(bookModel.getPublisher().getName());
    }

}
