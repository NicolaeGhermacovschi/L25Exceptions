package numbers;

public class Numbers {

    public void divideBy(int nr) {
        if( nr == 0 )
            throw new IllegalArgumentException("Cannot divide by 0 ");
        else {
            System.out.println("10 / " + nr + "= " + 10 / nr );
        }
    }

}
