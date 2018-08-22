/**
 * calculator implementation
 */
public class Calculate {
    /**
     * result of calculation
     */
    private int result;

    /**
     * constructor
     * @param result
     */
    public Calculate(int result) {
        this.result = result;
    }

    /**
     * getting the result
     * @return result of calculation
     */
    public int getResult() {
        return this.result;
    }

    /**
     * summarize the arguments
     * @param params argument of summation
     */
    public void add(int ... params){
        for (Integer param : params)
            this.result += param;
    }

    /**
     * clear result of calculation
     */
    public void clearResult() {
        this.result = 0;
    }
}
