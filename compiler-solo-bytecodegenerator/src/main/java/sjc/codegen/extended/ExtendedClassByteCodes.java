package sjc.codegen.extended;

import java.util.Map;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.codegen.ClassByteCodes;
import sjc.util.Util;

public class ExtendedClassByteCodes extends ClassByteCodes {
  public final @NonNullElements
  Map<String, byte[]> otherClasses;

  protected ExtendedClassByteCodes(@NonNull final String mainClassName,
      @NonNull final byte[] mainClassBytes,
      @NonNullElements final Map<String, byte[]> otherClasses) {
    super(mainClassName, mainClassBytes);
    assert Util.checkNonNullElements(otherClasses);
    this.otherClasses = otherClasses;
  }
}
