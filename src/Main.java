import controllers.ControllerMahasiswa;
import model.Mahasiswa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    run();
  }

  static void run(){
    Scanner input = new Scanner(System.in);
    ControllerMahasiswa controllerMahasiswa = new ControllerMahasiswa();
    System.out.println("SISTEM INFORMASI MAHASISWA");
    menu(input, controllerMahasiswa);
  }

   static void menu(Scanner input, ControllerMahasiswa controllerMahasiswa){

    boolean counter = true;
    do{
      System.out.println("1. List Mahasiswa.");
      System.out.println("2. Add Mahasiswa");
      System.out.println("3. Delete Mahasiswa");
      System.out.println("Other number to close!");
      System.out.print("Masukan number menu: ");

      String numberMenu = input.nextLine();
      switch (numberMenu){
        case "1":
          controllerMahasiswa.show();
          break;
        case "2":
          addMahasiswa(input, controllerMahasiswa);
          break;
        default:
          counter = !counter;
          break;
      }
    }while(counter);
  }

  static void addMahasiswa(Scanner input, ControllerMahasiswa controllerMahasiswa){
    System.out.print("Masukan nama mahasiswa: ");
    String name = input.nextLine();
    System.out.print("Masukan nim mahasiswa: ");
    String nim = input.nextLine();
    System.out.print("Masukan alamat mahasiswa: ");
    String alamat = input.nextLine();

    controllerMahasiswa.store(name, nim, alamat);
  }
}
