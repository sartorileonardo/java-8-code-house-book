package chapter03_lambda_funtional_interface;

@FunctionalInterface
public interface Validator<T> {
    boolean valida(T t);
}
