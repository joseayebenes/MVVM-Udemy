package es.joseayebenes.mvvmudemy.models;

import com.google.gson.annotations.SerializedName;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;

@Entity(indices = {@Index("id"), @Index("owner_login")},
        primaryKeys = {"name", "owner_login"})
public class Repo {

    public final int id;

    @SerializedName("name")
    public final String name;

    @SerializedName("full_name")
    public final String fullName;

    @SerializedName("description")
    public final String description;

    @SerializedName("stars")
    public final int stars;

    @SerializedName("owner")
    @Embedded(prefix = "owner")
    public final Owner owner;

    public Repo(int id, String name, String fullName, String description, int stars, Owner owner) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.description = description;
        this.stars = stars;
        this.owner = owner;
    }

    public static class Owner{
        @SerializedName("login")
        public final String login;

        @SerializedName("url")
        public final String url;

        public Owner(String login, String url) {
            this.login = login;
            this.url = url;
        }
    }
}
