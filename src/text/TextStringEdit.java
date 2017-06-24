/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author Iric
 */
public class TextStringEdit {
    private String value;
    private String[] wordsArray;
        public TextStringEdit(String value) {
            this.value = value;
            this.wordsArray=value.split(" ");
        }

        @Override
        public String toString() {
            return "TextStringEdit{" + "value=" + value + '}';
        }
        
        public int getWordsNumber(){
            return wordsArray.length;
            
        }
        public char[] getSymbols(){
            char[] result=new char[10];
            for(int i=0; i<10; i++)
               try{
                   result[i]=wordsArray[i].charAt(1);
               }catch(Exception e){
                   System.out.println("Word in position "+i+" is too short");
               }
               return result;
            
        }
        
}
