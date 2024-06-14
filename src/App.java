import edu.smart_tv.SmartTV;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTV lg = new SmartTV();
        System.out.println(lg);

        lg.ligar();
        for(int index = 0; index < 10; index++){
            lg.aumentarCanal();
            lg.diminuirVolume();
        }

        System.out.println(lg);
    }
}
