package chapter03;

public class Main {
    public static void main(String[] args) {

        //Created anonymous class
        Validator<String> validatorCep = new Validator<String>() {
            @Override
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        //Lambda call method 1
        Validator<String> validadorCepLambda1 = valor -> {
            return valor.matches("04101-300");
        };

        //Lambda call method 2
        Validator<String> validadorCepLambda2 = valor -> valor.matches("04101-300");
    }
}
