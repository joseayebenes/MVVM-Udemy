package es.joseayebenes.mvvmudemy.models;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.TypeConverters;
import es.joseayebenes.mvvmudemy.db.GithubTypeConverters;

@Entity(primaryKeys = {"query"})
@TypeConverters(GithubTypeConverters.class)
public class RepoSearchResult {
    @NonNull
    public final String query;
    public final List<Integer> repoIds;
    public final int totalCount;
    public final Integer next;

    public RepoSearchResult(@NonNull String query, List<Integer> repoIds, int totalCount, Integer next) {
        this.query = query;
        this.repoIds = repoIds;
        this.totalCount = totalCount;
        this.next = next;
    }
}