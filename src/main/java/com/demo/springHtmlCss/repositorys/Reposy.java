package com.demo.springHtmlCss.repositorys;

import com.demo.springHtmlCss.Dtos.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reposy extends JpaRepository<User,Long> {
}
