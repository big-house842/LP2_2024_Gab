package ProvaPOO;

public class MVCPaternBook {
    
    public static void main(String[] args) {
        
        Book model = null;
        BookView view = null;
        Publication t = null;
        BookCategory c = null;
        Publisher m = new Publisher();

        m.setLocation("Rio de Janeiro");
        m.setName("Lumin");

        t.setTitle("TI");
        model.setAuthor("Machado");
        model.setPages(100);
        model.incrementPages(5);
        model.setCategory(c);
        model.setPublisher(m);

        view.printBookDetails(model);

    }

}
