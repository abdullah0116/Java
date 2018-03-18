public class Animals {
  String name;

  //This is a method since it has public in it. it can be called from any class
  public String getName() {
    return name;
  }

  // void means nothing will reachern at all
  // String newName is called a paramater and it means is it will take input for a string
  // but will not return anything
  // When you create a method its called a method signture
  public void setName(String newName) {
    name = newName;
  }
}
