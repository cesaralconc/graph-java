package data.structure;

public class StackArray {
    private int lenght = 10;
	private int top;

	private Object[] stackArray;

	public StackArray() {
		this.top = -1;
		this.stackArray = new Object[lenght];
	}

	private boolean stackFull() {
		if (this.top == lenght - 1) {
			return true;
		} else {
			return false;
		}
	}

	private boolean stackEmpty() {
		if (this.top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public Object topStack() {
		if (!stackEmpty()) {
			return stackArray[top];
		} else {
			return null;
		}
	}

	public void insert(Object element) {
		if (stackFull()) {
			System.out.println("No se puede insertar, la pila esta llena");
		} else {
			this.top++;
			stackArray[top] = element;
		}
	}

	public Object erase() {
		Object aux = null;
		if (stackEmpty()) {
			System.out.println("No se puede extraer, la pila esta vacía");
		} else {
			aux = stackArray[top];
			top--;
		}

		return aux;
	}

	public void showStack() {
		if ( ! stackEmpty()) {
			for (int i = top; i >= 0; i--) {
				System.out.println(stackArray[i]);
			}
		}
	}

	public void cleanStack() {
		this.top = -1;
	}
}
