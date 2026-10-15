

import java.util.*;
public class priorityQueue {

    ArrayList<Integer> tree = new ArrayList<>();

    public void add(int val) {
        tree.add(val);
        upheapify(tree.size() - 1);
    }

    public void upheapify(int idx) {

        if (idx == 0)
            return;

        int par = (idx - 1) / 2;

        if (tree.get(idx) < tree.get(par)) {

            int temp = tree.get(par);
            tree.set(par, tree.get(idx));
            tree.set(idx, temp);

            upheapify(par);
        }
    }

    int peek(){
        if(tree.size()==0) return -1;

        return tree.get(0);
    }


    int remove(){
        Collections.swap(tree, 0, tree.size()-1);
        int top = tree.get(tree.size()-1);
        tree.remove(tree.size()-1);
        downheapify(0);
        return top;
    }

    private void downheapify(int idx){

        int leftChild = 2*idx+1;
        int rightChild = 2*idx+2;
        int parIdx = idx;
        if(leftChild<tree.size()&&tree.get(leftChild)<tree.get(parIdx)){
            parIdx = leftChild;
        }

        if(rightChild<tree.size()&&tree.get(rightChild)<tree.get(parIdx)){
            parIdx = rightChild;
        }

        if(parIdx!=idx){
            Collections.swap(tree,parIdx,idx);
            downheapify(parIdx);
        }
    }

    public static void main(String[] args) {

        priorityQueue pq = new priorityQueue();

        pq.add(50);
        pq.add(70);
        pq.add(60);
        pq.add(55);
        pq.add(65);
        pq.add(45);
        pq.add(48);
        pq.add(30);

        System.out.println(pq.tree);
        
        while(pq.tree.size()>0){
            System.out.println(pq.remove());
        }
    }
}