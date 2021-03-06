package io.dtk;
import java.io.Serializable;

public class Actor implements Serializable {
  private String avatar_url;
  private String gravatar_id;
  private Long id; 
  private String login;
  private String url;

  public Actor(
    String avatar_url,
    String gravatar_id,
    Long id, 
    String login,
    String url
    ) {
      this.avatar_url = avatar_url;
      this.gravatar_id = gravatar_id;
      this.id = id;
      this.login = login;
      this.url = url;
    }

    /**
     * Gets avatar_url
     *
     * @return Value for avatar_url
     */
    public String getAvatar_url() {
        return avatar_url;
    }

    /**
     * Gets gravatar_id
     *
     * @return Value for gravatar_id
     */
    public String getGravatarId() {
        return gravatar_id;
    }

    /**
     * Gets id
     *
     * @return Value for id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets login
     *
     * @return Value for login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Gets url
     *
     * @return Value for url
     */
    public String getUrl() {
        return url;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "Actor [id=" + id +
            ", login=" + login +
            ", avatar_url=" + avatar_url +
            ", gravatar_id=" + gravatar_id +
            ", url=" + url +
            "]";
    }

}
