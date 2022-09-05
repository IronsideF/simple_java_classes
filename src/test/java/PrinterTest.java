import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(25, 50);
    }
    @Test
    public void hasSheets(){
        assertEquals(25, myPrinter.getSheetsLeft());
    }
    @Test
    public void canPrint(){
        myPrinter.print(3, 4);
        assertEquals(13, myPrinter.getSheetsLeft());
    }
    @Test
    public void willNotPrintIfNoPaper(){
        myPrinter.print(1, 50);
        assertEquals(25, myPrinter.getSheetsLeft());
    }
    @Test
    public void willReduceToner(){
        myPrinter.print(3, 4);
        assertEquals(38, myPrinter.getTonerVolume());
    }
}
