package a;

public class ContainerContainer {
  public Container<Thing> getThingContainer() {
    return new ThingContainer<Thing>();
  }
}
