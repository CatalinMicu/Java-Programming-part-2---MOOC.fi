
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
public class Pipe<T> {
    private T element;
    private Stack<T> stack;
    
    
    public Pipe() {
        this.stack = new Stack<>();
    }
    
    public void putIntoPipe(T value) {
        this.stack.push(value);
    }
    
    public T takeFromPipe() {
        element = stack.peek();
        this.stack.pop();
        return element;
    }
    
    public boolean isInPipe() {
        if (this.stack.empty()) {
            return false;
        }
        return true;
    }
}
