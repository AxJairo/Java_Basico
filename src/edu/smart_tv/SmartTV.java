package edu.smart_tv;

public class SmartTV {
    
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTV(){
        this.ligada = false;
        this.canal =1;
        this.volume =25;
    }

    public void trocarCanal(int canal){
        this.canal = canal;
    }
        
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mutar(){
        volume = 0;
    }

    @Override
    public String toString() {
        /*return "SmartTV{" +
                "state=" + ligada +
                ", channel=" + canal +
                ", volume=" + volume +
                '}';
        */
        if (this.ligada){
            return "Estado atual da TV:\nTV Ligada!\nCanal: " + canal + "\nVolume: " + volume + "\n";
        }
        return "Estado atual da TV:\nTV Desligada!\nCanal: N/A\nVolume: N/A\n";
    
    }
}
