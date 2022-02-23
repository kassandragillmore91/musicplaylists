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
public final class AlbumTrackDao_Factory implements Factory<AlbumTrackDao> {
  private final Provider<DynamoDBMapper> dynamoDbMapperProvider;

  public AlbumTrackDao_Factory(Provider<DynamoDBMapper> dynamoDbMapperProvider) {
    this.dynamoDbMapperProvider = dynamoDbMapperProvider;
  }

  @Override
  public AlbumTrackDao get() {
    return newInstance(dynamoDbMapperProvider.get());
  }

  public static AlbumTrackDao_Factory create(Provider<DynamoDBMapper> dynamoDbMapperProvider) {
    return new AlbumTrackDao_Factory(dynamoDbMapperProvider);
  }

  public static AlbumTrackDao newInstance(DynamoDBMapper dynamoDbMapper) {
    return new AlbumTrackDao(dynamoDbMapper);
  }
}
