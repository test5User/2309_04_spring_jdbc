package by.iyclass._01_spring_jdbc;

import by.iyclass._01_spring_jdbc.db.UserRowMapping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        //DataSource dataSource = new DriverManagerDataSource();
        var dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/po_2309");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        var jdbcTemplate = new JdbcTemplate(dataSource);

        var users = jdbcTemplate.query("SELECT * FROM user", new UserRowMapping());
        users.forEach(System.out::println);
        System.out.println("_______________________________________");
        var usersById = jdbcTemplate.query("SELECT * FROM user WHERE id=? OR name=?", new UserRowMapping(), new Object[]{2, "Ivan Ivanov"});
        usersById.forEach(System.out::println);
        System.out.println("_______________________________________");
        jdbcTemplate.update("UPDATE user SET age=? WHERE name=?", 27, "Ivan Ivanov");
        jdbcTemplate.query("SELECT * FROM user", new UserRowMapping()).forEach(System.out::println);

    }
}
