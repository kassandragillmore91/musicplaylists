package com.amazon.ata.music.playlist.service.dependency;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

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

  private DaggerServiceComponent() {


  }

  public static Builder builder() {
    return new Builder();
  }

  public static ServiceComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder daoModule(DaoModule daoModule) {
      Preconditions.checkNotNull(daoModule);
      return this;
    }

    public ServiceComponent build() {
      return new DaggerServiceComponent();
    }
  }
}
