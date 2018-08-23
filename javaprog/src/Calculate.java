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
     * subtract the arguments
     * @param params args of subtract
     */
    public void delete(int ... params){
        for (Integer param : params)
            this.result += param;
    }

    /**
     * multyply
     * @param first
     * @param second
     */
    public void multiply(int first, int second){
        this.result += first;
        this.result*=second;
    }

    /**
     * degree
     * @param first dividend
     * @param second divider
     */
    public void degree(int first, int second) {
        try{
            this.result += first;
            this.result/=second;
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }

    /**
     * involution
     * @param first number
     * @param second power
     */
    public void pow(int first, int second){
        if (second == 0){
            this.result = 1;
        }else if (second > 0){
            this.result = first;
            for (int i = 2; i <= second; i++)
                this.result *=this.result;
        }else{
            for (int i = 2; i <= Math.abs(second); i++)
                this.result *=this.result/first;
        }
    }

    /**
     * clear result of calculation
     */
    public void clearResult() {
        this.result = 0;
    }
}
