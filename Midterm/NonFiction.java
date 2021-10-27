public class NonFiction extends Book implements iBorrowable{
    private int BorrowDay;
    private int ReturnDay;

    NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return "Anne Frank(" + this.getTitle() + ") all events are true and based on real fact";
    }

    @Override
    public void setBorrowDate(int day) {
        this.BorrowDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.ReturnDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        return day < this.BorrowDay || day > this.ReturnDay;
    }
}
