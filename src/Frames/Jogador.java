package Frames;

public class Jogador {
    
    int Ponto_ind = 0;
    
    int Controle_Azul = 0;
    int Controle_Vermelho = 0;
    int Controle_Verde = 0;
    
    boolean Aceso = false;
    
    String cor;
           
    public void Zerar(){
        Controle_Azul = 0;
        Controle_Vermelho = 0;
        Controle_Verde = 0;
        
        Aceso = false;
    }
    
    public void Acender_Azul(){
        Controle_Azul++;
        if(Controle_Azul == 5)
            Aceso = true;
            cor = "Azul";
    }
    
    public void Acender_Vermelho(){
        Controle_Vermelho++;
        if(Controle_Vermelho == 5)
            Aceso = true;
            cor = "Vermelho";
    }
    
    public void Acender_Verde(){
        Controle_Verde++;
        if(Controle_Verde == 5)
            Aceso = true;
            cor = "Verde";
    }
}
