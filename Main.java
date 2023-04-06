import java.io.*;

class Main{
    public static void main(String[] args) {
        File file = new File("filename.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File exists");
            }
        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("filename.txt");
            fileWriter.write("Hello World in file");
            fileWriter.write("Hello World in file");
            fileWriter.write("Hello World in file");


            fileWriter.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("An error has occured");
            e.printStackTrace();

        }

    }
}