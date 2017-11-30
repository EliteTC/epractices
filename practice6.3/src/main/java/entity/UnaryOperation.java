package entity;

public class UnaryOperation {
    private double valueHolder;

    public UnaryOperation(){
        this.valueHolder = 0;
    }

    public UnaryOperation(double valueHolder){
        this.valueHolder = valueHolder;
    }

    public UnaryOperation increment(){
        ++valueHolder;
        return this;
    }

    public UnaryOperation decrement(){
        --valueHolder;
        return this;
    }

    public UnaryOperation changeSign(){
        valueHolder = -valueHolder;
        return this;
    }

    public double getValueHolder() {
        return valueHolder;
    }

    public void setValueHolder(double valueHolder) {
        this.valueHolder = valueHolder;
    }

    @Override
    public String toString() {
        return "UnaryOperation{" +
                "valueHolder=" + valueHolder +
                '}';
    }
}
