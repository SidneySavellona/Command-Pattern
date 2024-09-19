public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        TempIncrease tempIncrease = new TempIncrease(thermostat);
        System.out.println(tempIncrease.execute());

        TempDecrease tempDecrease = new TempDecrease(thermostat);
        System.out.println(tempDecrease.execute());




    }
}