
package com.mycompany.prototipocarro;

//atributos
public class ProtCarro {
private int velocidade;//em metros
private boolean ligado;
private int kilometragem;
private int direcao;//angulo + 10

//metodos: liga/desliga, direita(+10), esquerda(-10), acelera(limite 45), freia(não pode ficar negativo, atualizar(odometro - formula deslocamento), 
    //construtor
    public ProtCarro() {
        this.velocidade = 0;
        this.ligado = false;
        this.kilometragem = 0;
        this.direcao = 0;
    }
    
    public void ligar(){
        ligado = true;
     }
    
    public void desligar(){
        ligado = false;
    }
    
    public void acelera(){
        if (ligado = true && velocidade < 45){
            velocidade += 1; 
        }
    }
        
    public void freia(){
        if (ligado = true && velocidade < 0){
           velocidade -= 1;
        }
    } 
   
    public void esquerda(){
        if (ligado = true && direcao < 0 && direcao < -90 ){
            direcao +=10;
        }
    }    
    public void direita(){
        if (ligado = true && direcao > 0 && direcao < 90){
            direcao -= 10;
        }
    }    
    
    public void atualizar(){
        //deslocamento = v*t;
        kilometragem = velocidade * 1;
    }    
    
  
    
}
