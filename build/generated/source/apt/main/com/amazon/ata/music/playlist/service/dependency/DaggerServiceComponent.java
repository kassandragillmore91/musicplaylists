package com.amazon.ata.music.playlist.service.dependency;

import com.amazon.ata.music.playlist.service.activity.AddSongToPlaylistActivity;
import com.amazon.ata.music.playlist.service.activity.CreatePlaylistActivity;
import com.amazon.ata.music.playlist.service.activity.GetPlaylistActivity;
import com.amazon.ata.music.playlist.service.activity.GetPlaylistSongsActivity;
import com.amazon.ata.music.playlist.service.activity.UpdatePlaylistActivity;
import com.amazon.ata.music.playlist.service.dynamodb.AlbumTrackDao;
import com.amazon.ata.music.playlist.service.dynamodb.PlaylistDao;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
public final class DaggerServiceComponent implements ServiceComponent {
  private final DaggerServiceComponent serviceComponent = this;

  private Provider<DynamoDBMapper> provideDynamoDBMapperProvider;

  private DaggerServiceComponent(DaoModule daoModuleParam) {

    initialize(daoModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ServiceComponent create() {
    return new Builder().build();
  }

  private PlaylistDao playlistDao() {
    return new PlaylistDao(provideDynamoDBMapperProvider.get());
  }

  private AlbumTrackDao albumTrackDao() {
    return new AlbumTrackDao(provideDynamoDBMapperProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final DaoModule daoModuleParam) {
    this.provideDynamoDBMapperProvider = DoubleCheck.provider(DaoModule_ProvideDynamoDBMapperFactory.create(daoModuleParam));
  }

  @Override
  public AddSongToPlaylistActivity provideAddSongToPlaylistActivity() {
    return new AddSongToPlaylistActivity(playlistDao(), albumTrackDao());
  }

  @Override
  public CreatePlaylistActivity provideCreatePlaylistActivity() {
    return new CreatePlaylistActivity(playlistDao());
  }

  @Override
  public GetPlaylistActivity provideGetPlaylistActivity() {
    return new GetPlaylistActivity(playlistDao());
  }

  @Override
  public GetPlaylistSongsActivity provideGetPlaylistSongsActivity() {
    return new GetPlaylistSongsActivity(playlistDao());
  }

  @Override
  public UpdatePlaylistActivity provideUpdatePlaylistActivity() {
    return new UpdatePlaylistActivity(playlistDao());
  }

  public static final class Builder {
    private DaoModule daoModule;

    private Builder() {
    }

    public Builder daoModule(DaoModule daoModule) {
      this.daoModule = Preconditions.checkNotNull(daoModule);
      return this;
    }

    public ServiceComponent build() {
      if (daoModule == null) {
        this.daoModule = new DaoModule();
      }
      return new DaggerServiceComponent(daoModule);
    }
  }
}
