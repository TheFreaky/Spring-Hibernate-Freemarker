package ru.kpfu.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kpfu.itis.config.AppConfig;
import ru.kpfu.itis.models.User;
import ru.kpfu.itis.repository.UserDao;

import java.util.List;

/**
 * 02.11.2017
 *
 * @author Kuznetsov Maxim
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao usersDao = context.getBean(UserDao.class);
        List<User> userList = usersDao.findAll();
        System.out.println(userList);

        User user = userList.get(0);
        System.out.println(user);
    }
}
