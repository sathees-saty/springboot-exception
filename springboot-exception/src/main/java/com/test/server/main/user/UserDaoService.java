package com.test.server.main.user;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserDaoService 
{
public static int usersCount=5;
//creating an instance of ArrayList
private static List<User> users=new ArrayList<>();
//static block 
static
{
//adding users to the list
users.add(new User(1, "Ram", new Date()));
users.add(new User(2, "Kumar", new Date()));
users.add(new User(3, "Sita", new Date()));
users.add(new User(4, "Shiva", new Date()));
users.add(new User(5, "Lakshmi", new Date()));
}
//method that retrieve all users from the list
public List<User> findAll()
{
return users;
}
//method that adds a user in the list 
public User save(User user)
{
if(user.getId()==null)
{
user.setId(++usersCount);
}
users.add(user);
return user;
}
//method that find a particular user from the list
public User findOne(int id)
{
for(User user:users)
{
if(user.getId()==id)
return user;
}
return null;
}
}