public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    public static void printBook(Printable[] printables){
        for(int i=0;i< printables.length;i++){
            if(printables[i] instanceof Book){
                printables[i].print();
            }
        }
    }
}
