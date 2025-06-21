import javax.swing.JOptionPane;
public class jogodavelha {
    public static int tamanho = 3;
    public static void main(String[] args) {
    String [][] matriz = new String [tamanho][tamanho];
    int i,j, cont = 0,index = 0;
    String jogadorx = "x", jogadory = "O";
    String escolha = "";
    matriz[0][0] = "0";
    matriz[0][1] = "1";
    matriz[0][2] = "2";
    matriz[1][0] = "3";
    matriz[1][1] = "4";
    matriz[1][2] = "5";
    matriz[2][0] = "6";
    matriz[2][1] = "7";
    matriz[2][2] = "8";
    while(cont < 5)
    {
        System.out.println("Jeito que o jogo da velha está.");
        for(i = 0; i < tamanho; i++)
        {
            for(j = 0; j < tamanho; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        escolha = JOptionPane.showInputDialog(null, "JogadorX digite o número da casa que quer jogar(0 a 8): ");
        for(i = 0; i < tamanho; i++)
        {
            for(j = 0; j < tamanho; j++)
            {
                if(escolha.equals(matriz[i][j]))
                {
                    matriz[i][j] = jogadorx;
                }
            }
        }
        System.out.println("Jeito que o jogo da velha está.");
        for(i = 0; i < tamanho; i++)
        {
            for(j = 0; j < tamanho; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[0][j].equals(matriz[1][j]) && matriz[1][j].equals(matriz[2][j]))
                {
                    if(matriz[i][j].equals(jogadorx))
                    {
                        JOptionPane.showMessageDialog(null, "Jogadorx ganhou!");
                        index++;
                        System.exit(0);
                    }
                }
            }
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[i][0].equals(matriz[i][1]) && matriz[i][1].equals(matriz[i][2]))
                {
                    if(matriz[i][j].equals(jogadorx))
                    {
                        JOptionPane.showMessageDialog(null, "Jogadorx ganhou!");
                        index++;
                        System.exit(0);
                    }
                }
            }
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[0][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][2]))
                {
                    if(matriz[i][j].equals(jogadorx))
                    {
                        JOptionPane.showMessageDialog(null, "Jogadorx ganhou!");
                        index++;
                        System.exit(0);
                    }
                }
            }
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[2][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[0][2]))
                {
                    if(matriz[i][j].equals(jogadorx))
                    {
                        JOptionPane.showMessageDialog(null, "Jogadorx ganhou!");
                        index++;
                        System.exit(0);
                    }
                }
            }
        }
        escolha = JOptionPane.showInputDialog(null, "Jogadory digite o número da casa que quer jogar(0 a 8): ");
        for(i = 0; i < tamanho; i++)
        {
            for(j = 0; j < tamanho; j++)
            {
                if(escolha.equals(matriz[i][j]))
                {
                    matriz[i][j] = jogadory;
                }
            }
        }
        System.out.println("Jeito que o jogo da velha está.");
        for(i = 0; i < tamanho; i++)
        {
            for(j = 0; j < tamanho; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[0][j].equals(matriz[1][j]) && matriz[1][j].equals(matriz[2][j]))
                {
                   if(matriz[i][j].equals(jogadory))
                   {
                       JOptionPane.showMessageDialog(null, "Jogadory ganhou!");
                       index++;
                       System.exit(0);
                   }
                }
            }
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[i][0].equals(matriz[i][1]) && matriz[i][1].equals(matriz[i][2]))
                {
                    if(matriz[i][j].equals(jogadory))
                    {
                        JOptionPane.showMessageDialog(null, "Jogadory ganhou!");
                        index++;
                        System.exit(0);
                    }
                }
            }
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[0][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][2]))
                {
                    if(matriz[i][j].equals(jogadory))
                    {
                        JOptionPane.showMessageDialog(null, "Jogadory ganhou!");
                        index++;
                        System.exit(0);
                    }
                }
            }
        }
        for(i = 0;i<tamanho;i++)
        {
            for(j =  0;j<tamanho;j++)
            {
                if(matriz[2][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[0][2]))
                {
                    if(matriz[i][j].equals(jogadory))
                    {
                        JOptionPane.showMessageDialog(null, "Jogadory ganhou!");
                        index++;
                        System.exit(0);
                    }
                }
            }
        }
        cont++;
    }
    if(cont > 5 )
    {
        JOptionPane.showMessageDialog(null,"Programa Jogo da Velha encerrado");

    }

    }
}
