public class Fiction extends Book implements iBorrowable{
    private int BorrowtDay;
    private int ReturnDay;
    Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return this.getTitle() + " all events are true and based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        this.BorrowtDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.ReturnDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        return day < this.BorrowtDay || day > this.ReturnDay;
    }
}
