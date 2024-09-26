/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhojavamarcelo;

/**
 *
 * @author Wesley
 */
public class Trabalhojavamarcelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Trabalho tarefa1 = new Trabalho("estudar", "java");
	 Trabalho tarefa2 = new Trabalho("lavar roupa", "secar");

	        tarefa1.AdicionarTarefa(tarefa1);
	        tarefa2.AdicionarTarefa(tarefa2);
	        tarefa1.ListaTarefas();
	        tarefa2.ListaTarefas();
    }
    
}
