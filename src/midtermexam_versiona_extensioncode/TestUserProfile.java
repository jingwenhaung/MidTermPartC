/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Jingwen
 */
import java.util.Scanner;
public class TestUserProfile {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for(String genre: genres){
            System.out.print(genre + " ");
        }
        System.out.println("Enter your favourite genre: ");
        String genre = input.nextLine();
        
        UserProfile user = new UserProfile(name, genre);
        System.out.println("Welcome! Your profile create successfully.");
        
    }
}
