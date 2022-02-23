package com.amazon.ata.music.playlist.service.activity;

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
public final class GetPlaylistSongsActivity_Factory implements Factory<GetPlaylistSongsActivity> {
  private final Provider<PlaylistDao> playlistDaoProvider;

  public GetPlaylistSongsActivity_Factory(Provider<PlaylistDao> playlistDaoProvider) {
    this.playlistDaoProvider = playlistDaoProvider;
  }

  @Override
  public GetPlaylistSongsActivity get() {
    return newInstance(playlistDaoProvider.get());
  }

  public static GetPlaylistSongsActivity_Factory create(Provider<PlaylistDao> playlistDaoProvider) {
    return new GetPlaylistSongsActivity_Factory(playlistDaoProvider);
  }

  public static GetPlaylistSongsActivity newInstance(PlaylistDao playlistDao) {
    return new GetPlaylistSongsActivity(playlistDao);
  }
}
