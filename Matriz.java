package matriz;
import java.util.Scanner;
public class Matriz {

    public static void main(String[] args) {
      int I=0,J=0,E;
      Scanner dados=new Scanner(System.in);
      System.out.print("Quantas linhas tem a matriz?");
      I=dados.nextInt();
      System.out.print("Quantas colunas tem a matriz?");
      J=dados.nextInt();
      int[][]matriz=new int [I][J];
      for (int i=0; i<I; i++){
      for (int j=0; j<J; J++){
          System.out.print("Digite o elemento da linha" + (i+1) + "da coluna" + (j+1));
          matriz[i][j]=dados.nextInt();
          System.out.print("");
          }
      }
         System.out.println("Agora, apresentando a matriz\n\n");
         for (int i=0; i<I; i++){
             for (int j=0; j<J; j++){
                 System.out.print(matriz[i][j] + "  ");
             }
             System.out.println("");
             }
         System.out.println("\nFim");
         }
        }
