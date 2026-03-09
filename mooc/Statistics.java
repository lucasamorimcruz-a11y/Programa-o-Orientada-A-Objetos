
import java.util.ArrayList;

public class Statistics {
    private int count;
    private ArrayList<Integer> listOfNumbers = new ArrayList<>();
    Statistics (){
        this.count = 0;
    }
    
    public void addNumber(int number){
        this.count++;
        listOfNumbers.add(number);
    }
    public int getCount(){
        return this.count;
    }
    public int sum(){
        int sum = 0;
        for (int i = 0; i < this.listOfNumbers.size(); i++){
            sum += listOfNumbers.get(i);
        }
        return sum;
    }
    public int getSizeOfList(){
        return this.listOfNumbers.size();
    }
    public double average (){
        return this.sum() / this.getSizeOfList();
    }


}
