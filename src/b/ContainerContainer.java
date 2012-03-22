package b;

public class ContainerContainer extends a.ContainerContainer {
  ThingContainer<Thing> thingContainer = new ThingContainer<Thing>();
  @SuppressWarnings("unchecked")
  public a.Container<a.Thing> getContainer() {
    return (a.Container<a.Thing>)(Object)thingContainer;
  }
}
