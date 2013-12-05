package name.abhijitsarkar.datastructure;

public interface Stack<E> {
	public E push(E element);

	public E pop();
	
	public E peek();

	public boolean isEmpty();
}
