package data.structure;

public class Queue {
    private int length = 5;
	private int front;
	private int end;

	private Object[] queue;

	// Constructor
	public Queue() {
		front = 0;
		end = -1;
		queue = new Object[length];
	}

	// Operaciones

	public boolean queueFull() {
		if (end == length - 1) {
			return true;
		} else {
			return false;
		}
	}
	public Object erase() {
		Object aux = null;
		if (!emptyQueue()) {
			aux = queue[front];
			front++;
		} else {
			System.out.println("No se puede extraer por que estaba vacia");
		}

		return aux;
	}
	public Object front() {
		return queue[front];
	}

	public boolean emptyQueue() {
		if (end == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(Object data) {
		if (!queueFull()) {
			end++;
			queue[end] = data;
		} else {
			System.out.println("No se puede insertar, la cola está llena.");
		}
	}

	public void showQueue() {
		System.out.println("Cola actual:");
		for (int i = front; i <= end; i++) {
			System.out.print(queue[i] + "\t");
		}
	}
}
