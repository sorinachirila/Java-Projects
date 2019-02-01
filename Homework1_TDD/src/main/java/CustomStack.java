import java.util.ArrayList;
import java.util.List;

public class CustomStack {

    private List<Integer> stack = new ArrayList<Integer>();

    public boolean isEmpty() {
        return stack.size( ) == 0;
    }

    public int size(){
        return stack.size();
    }

    public Integer push(Integer i) {
        stack.add(i);
        return stack.get(stack.size()-1);
    }


    public int peek() {
        if (stack.size() == 0){
            throw  new RuntimeException();
        }
        return stack.get(stack.size()-1);
    }

    public Integer pop() {
        if(stack.size() == 0){
            throw new RuntimeException();
        }else{
            stack.get(stack.size()-1);

        }
        return stack.remove(stack.size()-1);
    }


    public int search(Integer valueToSearch) {
        if(stack.size() == 0){
            throw new RuntimeException();
        }else if(stack.contains(valueToSearch)){
            return stack.indexOf(valueToSearch);
        }else{
            return -1;
        }
    }
}
