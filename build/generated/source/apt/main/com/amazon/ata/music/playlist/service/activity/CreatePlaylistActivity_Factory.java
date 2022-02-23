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
public final class CreatePlaylistActivity_Factory implements Factory<CreatePlaylistActivity> {
  private final Provider<PlaylistDao> playlistDaoProvider;

  public CreatePlaylistActivity_Factory(Provider<PlaylistDao> playlistDaoProvider) {
    this.playlistDaoProvider = playlistDaoProvider;
  }

  @Override
  public CreatePlaylistActivity get() {
    return newInstance(playlistDaoProvider.get());
  }

  public static CreatePlaylistActivity_Factory create(Provider<PlaylistDao> playlistDaoProvider) {
    return new CreatePlaylistActivity_Factory(playlistDaoProvider);
  }

  public static CreatePlaylistActivity newInstance(PlaylistDao playlistDao) {
    return new CreatePlaylistActivity(playlistDao);
  }
}
