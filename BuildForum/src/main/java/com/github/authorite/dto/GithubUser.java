package com.github.authorite.dto;



public class GithubUser {
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "Username='" + Username + '\'' +
                ", Id=" + Id +
                ", bio='" + bio + '\'' +
                '}';
    }

    private String Username;
    private Long Id;
    private String bio;
}
