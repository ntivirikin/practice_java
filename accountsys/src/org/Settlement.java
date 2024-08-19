package accountsys.src.org;

public class Settlement extends Balance {

    String defendant;
    String plaintiff;
    Integer settleAmt;

    public Settlement(String initDef, String initPlaint, Integer initAmt) {
        this.defendant = initDef;
        this.plaintiff = initPlaint;
        this.settleAmt = initAmt;
    }

    @Override
    public void printInfo() {
        System.out.println("The settlement concerns the following parties for the amount:");
        System.out.println(defendant);
        System.out.println(plaintiff);
        System.out.println(settleAmt.toString());
    }
    
}
