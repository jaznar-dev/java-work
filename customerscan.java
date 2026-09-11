/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENT;
import  java.util.Scanner;
/**
 *
 * @author Dell
 */
public class customerscan {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");
        String cusname=scanner.nextLine();
        System.out.println("id");
        int cusid = scanner.nextInt();
        scanner.nextLine();
        System.out.println("contact");
        String contact=scanner.nextLine();
        System.out.println("info");
        System.out.println("name."+cusname);
        System.out.println("id+" +cusname);
        System.out.println("contact:"+contact);
      }
  }

}