package com.example.mvc_demo1.Contoller;

public class User {

        public String login;
        public String password;


        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }



        public User() {
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }



    }

