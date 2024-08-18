public class Account {

    String accHolder;
    Integer accValue;

    public Account(String initHolder, Integer initValue) {
        this.accHolder = initHolder;
        this.accValue = initValue;
    }

    public String getAccHolder() {
        return this.accHolder;
    }

    public void setAccHolder(String newAccHolder) {
        this.accHolder = newAccHolder;
        return;
    }

    public Integer getAccValue() {
        return this.accValue;
    }

    public void setAccValue(Integer newAccValue) {
        this.accValue = newAccValue;
        return;
    }
    
}
