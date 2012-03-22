package b;

import java.util.List;

public class ThingContainer<T extends a.Thing> 
     implements a.Container<T> {

  @Override
  public List<T> getThings() {
    return null;
  }

}
