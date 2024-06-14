package edu.smart_tv;
/**
* <h1>Smart TV</h1>
* A Smart TV apresenta a dinâmica do funcionamento de uma televisão. Por hora apenas as funções básicas foram implementadas.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes para desfrutar dos recursos oferecidos pelo autor
* 
* @author Jairo Machado
* @version 1.0
* @since 14/06/2024
*/
public class SmartTV {
    
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTV(){
        this.ligada = false;
        this.canal =1;
        this.volume =25;
    }

    /**
     * Este método é utilizado para trocar o canal sendo exibido na TV.
     * @param canal é um número inteiro que representa o canal o qual a TV irá passar a exibir.
     */
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
