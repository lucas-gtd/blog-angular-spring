package fr.lgtd.backblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.lgtd.backblog.entities.User;
import fr.lgtd.backblog.payloads.Credentials;
import fr.lgtd.backblog.payloads.UserPayload;
import fr.lgtd.backblog.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = { "*" }, maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    UserService service;

    // récup tout les users
    @GetMapping(value = "/users/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // récup un user via son id
    @GetMapping(value = "/users/find")
    public User getUserById(@RequestParam Long id) {
        return service.findById(id);
    }

    // ajouter un user
    @PostMapping(value = "/users/register")
    public User addUser(@RequestBody UserPayload userPayload) {
        // enregistrer le User dans la bdd
        return service.saveUser(userPayload);
    }

    // supprimer un User via son id
    @GetMapping(value = "/users/delete")
    public String deleteUser(@RequestParam Long id) {
        return service.deleteUser(id);
    }

    // connecter un user
    @PostMapping(value = "/users/connect")
    public User connectUser(@RequestBody Credentials credentials) {
        return service.connectUser(credentials.getEmail(), credentials.getPassword());
    }

}
