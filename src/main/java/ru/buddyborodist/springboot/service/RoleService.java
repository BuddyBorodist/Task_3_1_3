package ru.buddyborodist.springboot.service;

import ru.buddyborodist.springboot.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    void saveRole (Role role);

    void saveRoles(Iterable<Role> roles);

    void deleteRoleId(Long id);

    void updateRole (Role role);

    Role getRoleByName(String name);
}