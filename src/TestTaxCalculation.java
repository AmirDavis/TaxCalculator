import javax.management.openmbean.ArrayType;

public class TestTaxCalculation {

    public static void main(String[] args){
        double[] incomeList = {80000};
        int[] parentList = {61};
        int[] childList = {};

        System.out.println();
        Calculation newCalc = new Calculation();
        //System.out.println("Tax amount: " + newCalc.computeTax(incomeList, childList, parentList));
        //System.out.println("Tax amount: " + newCalc.computeTax(incomeList,parentList,childList));
        newCalc.computeTax(incomeList,parentList,childList);
    }
}
