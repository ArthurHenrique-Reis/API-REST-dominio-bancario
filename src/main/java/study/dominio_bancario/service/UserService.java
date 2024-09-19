package study.dominio_bancario.service;

import study.dominio_bancario.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}