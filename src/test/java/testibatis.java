import javax.sql.DataSource;
import org.springframework.web.bind.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ui.ModelMap;

import com.sp.dao.DAO;
import com.sp.domain.Book;

public class testibatis {

	public static void main(String[] args) {
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
		ModelMap mm=new ModelMap();
		mm.put("heh ", null);
	}

}
