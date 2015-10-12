public class Annuity
{
    private double periodPayment; //PMT
    private double numOfPayments; //n
    private double periodInterest; //i
    private double presentValue; //PV

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void Annuity()
    {
        this.periodPayment = 10000;
        this.numOfPayments = 20;
        this.periodInterest = .08;
        this.presentValue = 0;
        
        //double x = ((1+periodPayment)^(numOfPayments-1)-1)/periodInterest;
    }
}
