package com.meuprojeto.abrigopets.service;

import com.meuprojeto.abrigopets.exceptions.RecursoNaoEncontradoException;
import com.meuprojeto.abrigopets.exceptions.UserNaoEncontradoException;
import com.meuprojeto.abrigopets.model.User;
import com.meuprojeto.abrigopets.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User buscarPorUsername(String username){
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNaoEncontradoException("Usuário não encontrado"));
    }

    public void deletarPorUsername(String username){
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNaoEncontradoException("Usuário não encontrado"));
        userRepository.deleteByUsername(username);
    }
}
