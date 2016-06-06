import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sp.dao.DAO;
import com.sp.domain.Book;

public class test_mybatis {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new  FileSystemXmlApplicationContext("C://Users//NetEase//workspace//SpringMVC4//src//main//webapp//WEB-INF//applicationContext.xml");
		DAO dao=(DAO) ctx.getBean("DAO");
		System.out.println("asas");
//		dao.findAll();
		Book book=new Book();
		book.setPage("99");
		book.setId(44);
		book.setName("wanwan");
		dao.insert(book);
		System.out.println(dao.findAll());
		DataSource da=(DataSource) ctx.getBean("dataSource");
		System.out.println(da.getConnection());
		
	}

}
