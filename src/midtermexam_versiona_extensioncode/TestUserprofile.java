/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author reshmee
 */
public class TestUserprofile {
    public static void main(String[] args) {
        //my first commit
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Choose your favourite Genre from the following list: ");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println(i + 1 + ". " + genres[i]);
        }
        int genreChoice = input.nextInt();
        String genre = genres[genreChoice - 1];
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your user profile was created with name: " + userProfile.getUserID() + " and favourite genre: " + userProfile.getGenre());
    }
    
}
