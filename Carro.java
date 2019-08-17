package Exercicio;
		public class Carro{
		   //Criacao de atributos
		   String modelo;
		   String cor;
		   int combustivel;
		   boolean freio;
		   int velocidade;
		   boolean motor_status;
		   //criacao de metodos
		   void Acelerar(){
		       
		           if (motor_status == false)
		           {
		               System.out.println(modelo+": Carro Desligado");
		           }
		           
		           else if(combustivel==0){
		               System.out.println(modelo+": Sem Combustivel");
		           }
		           else{
		               System.out.println(modelo+": Acelerando o Carro!");
		               while(velocidade >= 0 && velocidade <= 90)
		           {
		              System.out.println(modelo+": Andando.... "+velocidade+"Km/h");
		              velocidade += 10  ;
		           }
		           
		               
		           }
		       }
		       
		   void Freiar(){
		       if (motor_status == false)
		           {
		               System.out.println(modelo+":Puxou o freio de mao");
		           }
		           
		       else if(freio){
		           while(velocidade >= 0)
		           {
		              System.out.println(modelo+": Parando.. "+ velocidade+"Km/h");
		              velocidade-= 15; 
		           }
		           
		       }
		       else{
		           System.out.println(modelo+": Vamos bater!!");
		       } 
		   }
		   void Ligar()
		   {
		       if (motor_status == false)
		       {
		          System.out.println(modelo+": Carro ligado!");   
		          motor_status = true;
		       }
		                else
		                {
		                    System.out.println(modelo+": O carro ja esta ligado!");
		                }
		   }
		   void Desligar()
		   {
		       if (motor_status == true)
		       {
		          System.out.println(modelo+": Carro desligado!!");   
		          motor_status = false;
		       }
		                else
		                {
		                    System.out.println(modelo+": O carro ja esta desligado!");
		                }
		   }
		}

