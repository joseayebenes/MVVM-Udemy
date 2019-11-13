package es.joseayebenes.mvvmudemy.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import es.joseayebenes.mvvmudemy.models.Contributor;
import es.joseayebenes.mvvmudemy.models.Repo;
import es.joseayebenes.mvvmudemy.models.RepoSearchResponse;
import es.joseayebenes.mvvmudemy.models.User;

@Database(entities = {User.class, Repo.class, Contributor.class, RepoSearchResponse.class}, version=1)
public abstract class GithubDb extends RoomDatabase {

    abstract public UserDao userDao();

    abstract public RepoDao repoDao();

}
