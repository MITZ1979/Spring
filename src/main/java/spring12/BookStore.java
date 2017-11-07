package spring12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BookStore {

    @Autowired
    BookService service;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bookbean12.xml");
        BookStore store =ctx.getBean(BookStore.class);
        store.service.addNewBook();
    }
}
