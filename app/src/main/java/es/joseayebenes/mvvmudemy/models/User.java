package es.joseayebenes.mvvmudemy.models;

import com.google.gson.annotations.SerializedName;

import androidx.room.Entity;

@Entity(primaryKeys = "login")
public class User {

    @SerializedName("login")
    public final String login;

    @SerializedName("avatar_url")
    public final String avatarURL;

    @SerializedName("name")
    public final String name;

    @SerializedName("company")
    public final String company;

    @SerializedName("repos_url")
    public final String reposURL;

    @SerializedName("blog")
    public final String blog;

    public User(String login, String avatarURL, String name, String company, String reposURL, String blog) {
        this.login = login;
        this.avatarURL = avatarURL;
        this.name = name;
        this.company = company;
        this.reposURL = reposURL;
        this.blog = blog;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getReposURL() {
        return reposURL;
    }

    public String getBlog() {
        return blog;
    }


}
