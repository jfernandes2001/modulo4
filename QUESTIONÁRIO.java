
package questionário;
import java.util.Scanner;
public class QUESTIONÁRIO {

    public static void main(String[] args) {
        Scanner dados= new Scanner(System.in);
        int N_alunos=0, n_perguntas;
        char[] resposta={'a','b'};
        int [] cotaçao = {1,2};
        int [] nota = new int [N_alunos];
        n_perguntas = resposta.length;
        System.out.print("Quantos alunos participam?");
        N_alunos=dados.nextInt();
        char [][]respostas = new char [N_alunos][n_perguntas];
        for (int i=0; i<N_alunos; i++){
            for(int j=0; j<n_perguntas; j++){
             System.out.print("A resposta do aluno" + "à pergunta" + (i+1) + "à pergunta" + (j+1) + " ");
             respostas [i][j] = dados.next().charAt(0);
          }
         }
        for (int i=0; i<N_alunos-1; i++){
            nota [i]=0;
            for (int j=0; j<N_alunos-1; j++){
                 if (respostas [i][j]==resposta[j])
                  nota [i]+=cotaçao[j];
             }
         }
        System.out.print("\n aluno nota");
        for (int i=0; i<N_alunos+1; i++){
        System.out.print(i +"  "+nota[i]);
        
    }}}
    
    

