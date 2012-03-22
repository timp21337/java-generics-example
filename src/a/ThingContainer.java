package a;

import java.util.List;

public class ThingContainer<T extends a.Thing> implements Container<T> {

  @Override
  public List<T> getThings() {
    return null;
  }

}
