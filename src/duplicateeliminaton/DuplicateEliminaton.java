/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package duplicateeliminaton;
import java.util.Scanner;
/**
 *
 * @author eljam3239
 */
public class DuplicateEliminaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int[] answers = new int[5];
    int[] array = new int[5];
    int a = array[0];
    int b = array[1];
    int c = array[2];
    int d = array[3];
    int e = array[4];
    
    
   
    
    
    for (int i = 0; i<array.length;i++){
        System.out.println("Please input a number between 10 and 100: ");
        array[i]=input.nextInt();
        answers[0]=array[0];
        if(array[1]>array[0]){
            answers[1]=array[1];
        }
        if(array[2]>array[1]&&array[2]>array[0]){
            answers[2]=array[2];
        }if(array[3]>array[2]&&array[3]>array[1]&&array[3]>array[0]){
            answers[3]=array[3];
        }if(array[4]>array[3]&&array[4]>array[2]&&array[4]>array[1]&&array[4]>array[0]){
            answers[4]=array[4];
        }
        
    }System.out.println("Answers:");
    
    for (int o = 0;o<answers.length;o++){
        if (answers[o]>0){
        System.out.println(answers[o]);
    }
    }    
  }
    

}