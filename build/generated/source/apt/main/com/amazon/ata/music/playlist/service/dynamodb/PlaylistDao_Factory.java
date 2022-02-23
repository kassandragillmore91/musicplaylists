package com.amazon.ata.music.playlist.service.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
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
public final class PlaylistDao_Factory implements Factory<PlaylistDao> {
  private final Provider<DynamoDBMapper> dynamoDbMapperProvider;

  public PlaylistDao_Factory(Provider<DynamoDBMapper> dynamoDbMapperProvider) {
    this.dynamoDbMapperProvider = dynamoDbMapperProvider;
  }

  @Override
  public PlaylistDao get() {
    return newInstance(dynamoDbMapperProvider.get());
  }

  public static PlaylistDao_Factory create(Provider<DynamoDBMapper> dynamoDbMapperProvider) {
    return new PlaylistDao_Factory(dynamoDbMapperProvider);
  }

  public static PlaylistDao newInstance(DynamoDBMapper dynamoDbMapper) {
    return new PlaylistDao(dynamoDbMapper);
  }
}
