public class DesafioTemperatura {

    public static void main(String[] args) {
        System.out.println("Calculando a converção de graus celsius para fahrenheit");
        double temperaturaEmCelsius = 32.3;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        //É possível usar o .formatted() ou o String.format() dentro do println.

        System.out.println("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit.".formatted(
                temperaturaEmCelsius, temperaturaEmFahrenheit));
        System.out.println(String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit.",
                temperaturaEmCelsius, temperaturaEmFahrenheit));

        //É possível converter um double em int diretamente no println usando o .formatted() ou String.format().

        //int temperaturaFahrenheitInteira = (int) fahrenheit;

        System.out.println("A temperatura em Fahrenheit inteira é %d.".formatted((int) temperaturaEmFahrenheit));
        System.out.println(String.format("A temperatura em Fahrenheit inteira é %d.", (int) temperaturaEmFahrenheit));
    }
}
