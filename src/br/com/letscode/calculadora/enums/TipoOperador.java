package br.com.letscode.calculadora.enums;

public enum TipoOperador {

    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/"),
    RAIZ_QUADRADA("#");

    private String caracter;

    TipoOperador(String caracter){
        this.caracter = caracter;
    }

    public String getCaracter() {
        return caracter;
    }

    public static double calcular(TipoOperador operador, double num1, double num2){
        switch (operador) {
            case RAIZ_QUADRADA:
                num1 = Math.sqrt(num1);
                break;
            case SOMA:
                num1 = num1 + num2;
                break;
            case SUBTRACAO:
                num1 = num1 - num2;
                break;
            case MULTIPLICACAO:
                num1 = num1 * num2;
                break;
            case DIVISAO:
                if (num2 != 0) {
                    num1 = num1 / num2;
                } else {
                    throw new RuntimeException("Divisão por 0 não permitida");
                }
                break;
        }
        return num1;
    }
}
