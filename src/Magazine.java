public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
    public static void printMagazines(Printable[] printables){
        for (int i = 0; i < printables.length; i++) {
            if(printables[i] instanceof Magazine){
                printables[i].print();
            }
        }
    }
}
