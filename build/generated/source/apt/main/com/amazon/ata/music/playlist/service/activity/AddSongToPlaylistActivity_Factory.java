package com.amazon.ata.music.playlist.service.activity;

import com.amazon.ata.music.playlist.service.dynamodb.AlbumTrackDao;
import com.amazon.ata.music.playlist.service.dynamodb.PlaylistDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddSongToPlaylistActivity_Factory implements Factory<AddSongToPlaylistActivity> {
  private final Provider<PlaylistDao> playlistDaoProvider;

  private final Provider<AlbumTrackDao> albumTrackDaoProvider;

  public AddSongToPlaylistActivity_Factory(Provider<PlaylistDao> playlistDaoProvider,
      Provider<AlbumTrackDao> albumTrackDaoProvider) {
    this.playlistDaoProvider = playlistDaoProvider;
    this.albumTrackDaoProvider = albumTrackDaoProvider;
  }

  @Override
  public AddSongToPlaylistActivity get() {
    return newInstance(playlistDaoProvider.get(), albumTrackDaoProvider.get());
  }

  public static AddSongToPlaylistActivity_Factory create(Provider<PlaylistDao> playlistDaoProvider,
      Provider<AlbumTrackDao> albumTrackDaoProvider) {
    return new AddSongToPlaylistActivity_Factory(playlistDaoProvider, albumTrackDaoProvider);
  }

  public static AddSongToPlaylistActivity newInstance(PlaylistDao playlistDao,
      AlbumTrackDao albumTrackDao) {
    return new AddSongToPlaylistActivity(playlistDao, albumTrackDao);
  }
}
