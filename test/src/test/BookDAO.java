package test;

import java.util.List;

public interface BookDAO {

	public List<Book>searchBooksByKeyword(String keyword);
	public List<Category>findAllCategories();
	public void insert(Book book);
	public void update(Book book);
	public void delete(Book bookId);
	public List<Book> findAllBooks();

}
