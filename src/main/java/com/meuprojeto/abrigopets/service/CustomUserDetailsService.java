package com.meuprojeto.abrigopets.service;

import com.meuprojeto.abrigopets.exceptions.UserNaoEncontradoException;
import com.meuprojeto.abrigopets.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UserNaoEncontradoException{
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNaoEncontradoException("Usuário não encontrado"));

        return  org.springframework.security.core.userdetails.User.builder()
                .username()
    }
}
