package fr.lgtd.backblog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.lgtd.backblog.entities.User;
import fr.lgtd.backblog.payloads.UserPayload;
import fr.lgtd.backblog.repositories.RoleRepo;
import fr.lgtd.backblog.repositories.UserRepo;

@Service("userService")
public class UserService {

    @Autowired
    UserRepo repo;

    @Autowired
    RoleRepo roleRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    public String deleteUser(Long id) {
        repo.deleteById(id);
        return "utilisateur supprimé avec succès !";
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User findById(Long id) {
        return repo.findById(id).get();
    }

    public User saveUser(UserPayload userPayload) {
        // instancier l'entité User
        User newUser = new User();
        // vérifier si les valeurs sont nulles ou non
        if (userPayload.getEmail() != null) {
            newUser.setEmail(userPayload.getEmail());
        }
        if (userPayload.getPassword() != null) {
            newUser.setPassword(passwordEncoder.encode(userPayload.getPassword()));
        }
        if (userPayload.getFirstname() != null) {
            newUser.setFirstname(userPayload.getFirstname());
        }
        if (userPayload.getLastname() != null) {
            newUser.setLastname(userPayload.getLastname());
        }
        if (userPayload.getAge() > 0) {
            newUser.setAge(userPayload.getAge());
        }
        if (userPayload.getAdress() != null) {
            newUser.setAdress(userPayload.getAdress());
        }
        if (userPayload.getRole() == null) {
            newUser.setRole(roleRepo.getById(Long.valueOf(1)));
        } else {
            newUser.setRole(userPayload.getRole());
        }
        // sauvegarder le User et le return
        return repo.save(newUser);
    }

    public User connectUser(String email, String password) {
        if (passwordEncoder.matches(password, repo.findByEmail(email).getPassword())) {
            return repo.findByEmail(email);
        }
        return null;
    }

}
