/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatternPr;

/**
 *
 * @author Vaibhavi
 */
public class Pattern1 {
    public static void main(String[] args) {
        patternOne(5);
    }
    static void patternOne(int n){
        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(); 
       }
    }
}
