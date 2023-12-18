package com.fb.components;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    final private int id;
    private String email;
    private String name;
    private String password;
    private String gender;
    private String birthdate;
    private ArrayList<Post> posts;
    private ArrayList<Message> messages;
    private ArrayList<User> friends;
    private List<Conversation> conversations;

    public User(int id ,String name, String email, String password, String gender, String birthdate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.birthdate = birthdate;
        this.posts = new ArrayList<>();
        this.friends = new ArrayList<>();
    }

    public void createPost(int postId , String content, Privacy privacy) {
        Post post = new Post(postId, this.id, content,privacy);
        posts.add(post);
    }
    // creating new messages
    public void createMessage(int id , User sender, User recipient, String content) {
        Message message = new Message(sender,recipient ,content);
        messages.add(message);
    }

    public int getId() {
        return id;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDate() {
        return birthdate;
    }

    public List<Post> getPosts() {
       return posts;
    }
    public List<Message> getMessages() {
        return messages;
    }
    public List<User> getFriends() {
        return friends;
    }

}