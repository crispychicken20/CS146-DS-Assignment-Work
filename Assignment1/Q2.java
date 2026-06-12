package Assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q2 {
    public static ArrayList<Integer> allSums(ArrayList<Integer> arr) {


        for(int i = 0; i < arr.size(); i++) {
            // work in progress...
        }
        return null;
    }
    public static void main(String[] args) {
        ArrayList<Integer> reslt = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("nums.txt"));
            while(br.ready()){
                reslt.add(Integer.parseInt(br.readLine()));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Integer> sums = allSums(reslt);
    }
}
