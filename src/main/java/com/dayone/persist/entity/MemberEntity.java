package com.dayone.persist.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Entity(name = "MEMBER")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @ElementCollection
    @CollectionTable(name = "MEMBER_ROLES", joinColumns = @JoinColumn(name = "MEMBER_ID"))
    @Column(name = "ROLE")
    private List<String> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false; // 잠긴 계정이 아님
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false; // 자격 증명이 만료되지 않음
    }

    @Override
    public boolean isEnabled() {
        return false; // 계정이 활성화됨
    }
}
