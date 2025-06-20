/*4. A matrícula dos alunos da Faculdade Dom Bosco de Porto é formada pelas seguintes
informações: os quatro (04) primeiros caracteres indicam o ano em que o aluno se
matriculou na Faculdade; o próximo caractere indica o semestre (1 – para o primeiro; 2 –
para o segundo); o próximo caractere indica o curso ( 1 – ADM; 2 – CON; 3 – SIS; 4 –
ENG; 5 – DIR) e os próximos seis (06) são números aleatórios que formam identificadores
únicos (esta informação não é relevante para a solução do problema). Escrever um
programa que leia um número indeterminado de matrículas e ao final da leitura mostre as
seguintes informações:
a. total geral de alunos lidos;
b. total de alunos para cada curso;
c. percentual de alunos do curso de ADM;
d. total de alunos matriculados por semestre;
e. percentual de alunos dos cursos de SIS e ENG, sobre o total de alunos lidos.*/
#include <stdio.h>
#include <strings.h>
#define tamanho 12
int main (void)
{
	char alunos[13];
	int i = 0,adm = 0,con = 0,sis = 0,eng = 0,dir = 0,sem1 = 0,sem2 = 0;
	float percentual1,percentual2;
	printf("Analisando matriculas do 1 e 2 semestre apenas!\n");
	printf("digite as matriculas dos alunos.(digite 'fim' para parar de digitar)\n");
	while(1)
	{
		gets(alunos);
		if(strcmp(alunos, "fim") == 0)
		{
			break;
		}
		else if(strlen(alunos) < 12)
		{
			printf("Matricula invalida diigte novamente.\n");
			continue;	
		}
		else 
		{
			if(alunos[4] == '1')
			{
				sem1++;
			}
			else if(alunos[4] == '2')
			{
				sem2++;
			}
			else
			{
				printf("matricula invalida");
				continue;
			}
			switch(alunos[5])
			{
				case 1: adm++; break;
				case 2: con++; break;
				case 3: sis++; break;
				case 4: eng++; break;
				case 5: dir++; break;
				default:
				printf("codigo invslido");
				continue;
				break;
			}
		}
		i++;
	}
	percentual1 = (float) adm*100/i;
	percentual2 = (float)(sis + eng)*100/i;
	printf("O total de alunos lidos foi de: %d.\n",i);
	printf("Total de alunos para cada curso: ADM = %d, CON = %d, SIS = %d, ENG = %d, DIR = %d.\n",adm,con,sis,eng,dir);
	printf("O percentua de alunos do curso de adm eh: %2.f%\n",percentual1);
	printf("O total de alunos no semestre 1 eh %d e no semestre 2 eh %d.\n",sem1,sem2);
	printf("O percentua de alunos de SIS e ENG sobre o total de alunos eh: %.2f",percentual2);
		
}
