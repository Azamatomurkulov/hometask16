public class Main {

    public static void main(String[] args){

        Book book1 = new Book("book 1");
        Book book2 = new Book("book 2");
        Book book3 = new Book("book 3");

        Magazine magazine1 = new Magazine("magazine 4");
        Magazine magazine2 = new Magazine("magazine 5");
        Magazine magazine3 = new Magazine("magazine 8");

        Printable[] array = {book1,book2,book3,magazine1,magazine2,magazine3};

//        for(int i = 0;i< array.length;i++){
//            array[i].print();
//        }

        Magazine.printMagazines(array);
        Book.printBook(array);
    }
}
