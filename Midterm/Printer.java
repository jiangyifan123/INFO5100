class Printer {
    private Printer(){

    }

    public static Printer getInstance(){
        return new Printer();
    }

    private void getConnection() {
        System.out.println("Your Printer is working");
    }

    static class Main{
        public static void main(String[] args) {
            Printer p1;
            p1 = Printer.getInstance();
            p1.getConnection();
        }
    }
}
