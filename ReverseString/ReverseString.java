import java.lang.StringBuffer;
public class ReverseString {
  StringBuffer sb = new StringBuffer();
  private String backWardsText = "Hello im a private backwards String";

  public String getString() {
    return backWardsText;
  }
  System.out.println(getString());
}
