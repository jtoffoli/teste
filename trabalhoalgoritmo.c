/* FACULDADE DOM BOSCO DE PORTO ALEGRE
* Sistemas de Informação – Análise e Desenvolvimento de Sistemas
* Algoritmos
*
* Programa SegundoT1:
* -------------------------
* Objetivo do Programa:
* Autores: joão toffoli, Antônio e matheus.
* Data da entrega do arquivo fonte:
*/
/*Uma loja online deseja implementar um sistema de descontos automáticos baseado no valor total da
compra e no tipo de cliente (C - comum ou P - premium). As regras são:
C - Clientes Comuns:
• Se o valor da compra for maior que R$ 200,00, recebe 5% de desconto.
• Se for maior que R$ 500,00, recebe 10% de desconto.
• Caso contrário, não há desconto e seu programa deve mostrar mensagem adequada.
P - Clientes Premium:
• Se o valor da compra for maior que R$ 100,00, recebe 10% de desconto.
• Se for maior que R$ 300,00, recebe 20% de desconto.
• Caso contrário, recebe 5% de desconto (que é o benefício padrão para clientes premium).
Escreva um programa que solicite ao usuário o tipo do cliente (comum ou premium) e o valor total
da compra. Calcule e mostre o valor final a ser pago, considerando as regras acima.
Faça isso para 3 clientes.*/
#include<stdio.h>
int main (void){
	double conta,desconto, conta1,desconto1;
	int cliente;
	int i ;
    for(i = 0; i <=3; i++)
   {
    	printf("bem vindo! caso seja cliente comum digite 1 caso seja cliente premium digite 0\n");
    	scanf("%d",& cliente);
	    if(cliente == 1){
	    	printf("qual o valor total da compra?\n");
	    	scanf("%lf",&conta);
	    	if(conta > 200 & conta<=500){
	    		desconto = conta*0.05;
		    	conta = conta - desconto;
		    	printf("total da sua conta:%0.2lf\n" , conta);
		    }if(conta > 500){
		    	desconto = conta * 0.10;
			conta = conta - desconto;
			printf("total da sua conta: %0.2lf\n" , conta);
		    }else{
		    	printf("compra sem desconto\n");
		    	printf("total da compra: %0.2lf\n", conta);
	    	}
		
    	}if(cliente == 0){
		    printf("qual o valor total da compra?\n");
	        scanf("%lf",& conta1);
	    	if(conta1 > 100 & conta <= 300){
	    		desconto1 = conta1 * 0.10;
		    	conta1 = conta1 - desconto1;
		    	printf("total da compra: %0.2lf\n", conta1);
		  }if(conta1 > 300 ){
		  	    desconto1 = conta1 * 0.20;
		    	conta1 = conta1 - desconto1;
		    	printf("total da compra:%0.2lf\n", conta1);
		  }else{
		  	    desconto1 = conta1 * 0.05; 
			    conta1 = conta1 - desconto1;
			    printf("total da compra: %0.2lf\n", conta1 );
		   }
	}
   }
}
