package com.github.diegopacheco.java.elegantobjects.vol2.temporalcoupling;

/**
 * The author does not provide the full implementation on the book.
 * Did my best to make it as reasonable as Possible.
 * Here we are using composable objects, the author gives some sudo code that is no Java.
 * I ported to Java as good as I could. :-)
 * I had to move the code to an eval internal method, still lazy, but cannot be on the
 * contractor otherwise I would get a stack overflow.
 * This is only hypothetical you would need to implement this in the whole
 * type system in java, therefore is another language :-) But is good Thought exercise.
 * Proves the point of Temporal Coupling and reducing to only one statement.
 */
public class Fibonacci extends Number {

    private Number n;

    public Fibonacci(Number n){
        this.n = n;
    }

    private Number eval(){
        return new IF(
                new LessThan(n,3),
                1,
                new Sum(
                        new Fibonacci(new Difference(n,1)),
                        new Fibonacci(new Difference(n,2))
                )
        );
    }

    @Override
    public int intValue() {
        return eval().intValue();
    }

    @Override
    public long longValue() {
        return eval().longValue();
    }

    @Override
    public float floatValue() {
        return eval().floatValue();
    }

    @Override
    public double doubleValue() {
        return eval().doubleValue();
    }
}

class IF extends Number{
    private ToBoolean condition;
    private Number branchTrue;
    private Number branchFalse;

    public IF(ToBoolean condition, Number branchTrue, Number branchFalse) {
        this.condition = condition;
        this.branchTrue = branchTrue;
        this.branchFalse = branchFalse;
    }

    private Number eval(){
        if (condition.eval()){
            return branchTrue;
        }else{
            return branchFalse;
        }
    }

    @Override
    public int intValue() {
        return eval().intValue();
    }

    @Override
    public long longValue() {
        return eval().longValue();
    }

    @Override
    public float floatValue() {
        return eval().floatValue();
    }

    @Override
    public double doubleValue() {
        return eval().doubleValue();
    }
}

class LessThan implements ToBoolean{
    private Number n1;
    private Number n2;

    public LessThan(Number n1, Number n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public boolean eval(){
        return  n1.intValue() < n2.intValue();
    }
}

interface ToBoolean{
    boolean eval();
}

class Difference extends Number{

    private Number n1;
    private Number n2;

    public Difference(Number n1, Number n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public int intValue() {
        return n1.intValue() - n2.intValue();
    }

    @Override
    public long longValue() {
        return n1.longValue() - n2.longValue();
    }

    @Override
    public float floatValue() {
        return n1.floatValue() - n2.floatValue();
    }

    @Override
    public double doubleValue() {
        return n1.doubleValue() - n2.doubleValue();
    }
}

class Sum extends Number{

    private Number n1;
    private Number n2;

    public Sum(Number n1, Number n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public int intValue() {
        return n1.intValue() + n2.intValue();
    }

    @Override
    public long longValue() {
        return n1.longValue() + n2.longValue();
    }

    @Override
    public float floatValue() {
        return n1.floatValue() + n2.floatValue();
    }

    @Override
    public double doubleValue() {
        return n1.doubleValue() + n2.doubleValue();
    }

}