package checkNr;

public class CheckNr {
    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        int cout = 0;
        if(inferiorLimit >= superiorLimit)
            throw new InvalidRangeException("Error in rage");
        else {
            for(int i = inferiorLimit; i <= superiorLimit; i++){
                if (i % 7 == 0 )
                    cout++;
            }
        }

        return cout;

    }
}
