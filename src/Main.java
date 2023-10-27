import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.println("1 . Create User");
            System.out.println("2 . Read User ");
            System.out.println("3 . Update User");
            System.out.println("4 . Delete User");
            System.out.println("5 . Exist");
            System.out.print("Enter your choices :");
            int option = input.nextInt();

            switch (option){
                case 1 :
                        System.out.println("Enter ID :");
                        int id = input.nextInt();
                        System.out.println("Enter Name :");
                        String name = input.next();
                        System.out.println("Enter Age :");
                        int age = input.nextInt();

                        User newUser = new User(id , name ,age);
                        userList.add(newUser);
                        System.out.println("User Created Successfully");
                    break;
                case 2 :
                        System.out.println("Enter ID :");
                        int readID = input.nextInt();
                        User readUser =  User.findUserByID(userList, readID);
                        if (readUser!=null){
                            System.out.println("User ID :"+ readUser.getId());
                            System.out.println("User Name :" + readUser.getName());
                            System.out.println("User Age : " + readUser.getAge());
                        }else {
                            System.out.println("User not Found!!");
                        }
                    break;
                case 3 :
                        System.out.println("Enter ID : ");
                        int updateID = input.nextInt();
                        User updateUser = User.findUserByID(userList,updateID);
                        if (updateUser!=null){
                            System.out.println("Enter New User Name :");
                            String newName = input.next();
                            System.out.println("Enter New age :");
                            int newAge = input.nextInt();
                            updateUser.setName(newName);
                            updateUser.setAge(newAge);
                            System.out.println("User Updated Successfully!");
                        }else {
                            System.out.println("User not Found");
                        }
                    break;
                case 4:
                        System.out.println("Enter ID : ");
                        int deleteID = input.nextInt();
                        User deleteUser = User.findUserByID(userList,deleteID);
                        if (deleteUser!=null){
                            userList.remove(deleteUser);
                            System.out.println("Deleted Successfully!");
                        }else {
                            System.out.println("User not Found!");
                        }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choices!");
                    break;
            }
        }

    }

}