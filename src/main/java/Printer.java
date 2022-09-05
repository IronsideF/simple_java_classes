public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume) {
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }
    public void print(int pages, int copies){
        if (this.sheetsLeft>=(pages*copies)){
        this.sheetsLeft -= (pages*copies);
        this.tonerVolume -= (pages*copies);
        }
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
