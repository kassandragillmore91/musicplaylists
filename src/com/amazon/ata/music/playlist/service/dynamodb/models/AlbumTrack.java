package com.amazon.ata.music.playlist.service.dynamodb.models;

import com.amazon.ata.music.playlist.service.dependency.DaggerServiceComponent;
import com.amazon.ata.music.playlist.service.dependency.ServiceComponent;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.Objects;

/**
 * Represents a record in the album_tracks table.
 */
@DynamoDBTable(tableName = "album_tracks")
public class AlbumTrack {
    private String asin;
    private Integer trackNumber;
    private String albumName;
    private String songTitle;

    @DynamoDBHashKey(attributeName = "asin")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @DynamoDBRangeKey(attributeName = "track_number")
    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    @DynamoDBAttribute(attributeName = "album_name")
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @DynamoDBAttribute(attributeName = "song_title")
    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumTrack that = (AlbumTrack) o;
        return Objects.equals(getAsin(), that.getAsin()) && Objects.equals(getTrackNumber(), that.getTrackNumber()) && Objects.equals(getAlbumName(), that.getAlbumName()) && Objects.equals(getSongTitle(), that.getSongTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAsin(), getTrackNumber(), getAlbumName(), getSongTitle());
    }

    @Override
    public String toString() {
        return "AlbumTrack{" +
                "asin='" + asin + '\'' +
                ", trackNumber=" + trackNumber +
                ", albumName='" + albumName + '\'' +
                ", songTitle='" + songTitle + '\'' +
                '}';
    }
}
