package src.homeWork13;

public abstract class Calculable {
    abstract Calculable sum(Complex arg);
    abstract Calculable multi(Complex arg);
    abstract Calculable div(Complex arg);
    abstract Calculable minus(Complex arg);
    abstract Complex getResult();
}


