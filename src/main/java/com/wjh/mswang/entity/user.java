package com.wjh.mswang.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class user {
    @Id
    private Integer m_id;
    private String m_username;
    private String m_password;
}
