package home.work12;

public class Weather {
    /*Write program which has method isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny).
    In this method you have to verify variables and if it’s raining, temperature is below 10, and is not sunny then
    throw Exception("Weather is not good")*/

    int temp;
    boolean isItRaining = true;
    boolean isItSunny = true;

    public void isWeatherGood (int temperature, boolean isItRaining, boolean isItSunny) {
        try {
            if (temperature < 10 && isItRaining && !isItSunny) {
                throw new Exception("The weather is not good!");
            } else if (isItRaining) {
                    System.out.println("The weather is rainy.");
                } else {
                System.out.println("The weather is good!");
            }
        } catch (Exception e) {
            System.out.println("The weather is not good! (Exception occurs)");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Weather today = new Weather();
        today.isWeatherGood(20,true, true);
        today.isWeatherGood(9,true,false);
        today.isWeatherGood(25,true,false);
        today.isWeatherGood(23,false,false);
        today.isWeatherGood(2,true,true);
    }
}
