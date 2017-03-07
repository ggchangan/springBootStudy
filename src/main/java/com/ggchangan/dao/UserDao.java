package com.ggchangan.dao;

import com.ggchangan.domain.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);
}
