import org.junit.Test;

public class Dec2HexTest1 {
    @Test
    public void testValueInt (){
        Dec2Hex dec2HexVI = new Dec2Hex();

        dec2HexVI.main(new String[] {"S"});

    }

    @Test
    public void testValue (){
        Dec2Hex dec2HexV = new Dec2Hex();

        dec2HexV.main(new String[] {"1", "2"});

    }

    @Test
    public void testNonValue () {
        Dec2Hex dec2HexNv = new Dec2Hex();

        dec2HexNv.main(new String[0]);
    }
}
