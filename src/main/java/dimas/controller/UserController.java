package dimas.controller;

import dimas.dao.UserDao;
import dimas.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;


@Controller
@Transactional
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("users", userDao.getAllUsers());
        return "listUsers";
    }

    @GetMapping("/addUser")
    public String getUserAddForm(@ModelAttribute("user") User user) {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String create(@ModelAttribute("user") User user) {
        userDao.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/updateUser")
    public String updateForm(@RequestParam int id, Model model) {
        model.addAttribute("user", userDao.getUser(id));
        return "updateUser";
    }

    @PostMapping("/updateUser")
    public String update(@ModelAttribute("user") User user) {
        userDao.updateUser(user);
        return "redirect:/";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam int id, Model model) {
        model.addAttribute("user", userDao.getUser(id));
        return "deleteUser";
    }

    @PostMapping("/deleteUser")
    public String delete(@ModelAttribute("id") int id) {
        userDao.deleteUser(id);
        return "redirect:/";
    }
}