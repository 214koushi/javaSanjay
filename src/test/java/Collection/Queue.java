package Collection;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class Queue {
public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();// homogeneous
		pq.add("dog");
		pq.add("23");
		pq.add("f");
		pq.offer("horse");
		PriorityQueue pq1=new PriorityQueue();
		System.out.println(pq);
		System.out.println(pq1.poll());// null
		//System.out.println(pq1.remove());//exception
		System.out.println(pq1.peek());//null
		//System.out.println(pq1.element());//exception
		pq1.addAll(pq);
		pq1.clear(); //pq1.remove()
		System.out.println(pq1);
	}

}
