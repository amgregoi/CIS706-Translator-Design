package sjc.codegen.extended;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.annotation.ReadOnlyElements;
import sjc.codegen.ByteCodeGenerator;
import sjc.symboltable.extended.ExtendedSymbolTable;
import sjc.type.checker.extended.ExtendedTypeTable;
import sjc.util.Pair;

/**
 * This class is used to translate an ExtendedStaticJava {@link CompilationUnit}
 * to {@link ExtendedClassByteCodes} that represent a Java 1.5 class files.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedByteCodeGenerator extends ByteCodeGenerator {
  /**
   * The visitor for {@link ASTNode} to generate bytecodes.
   * 
   * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
   */
  protected static class Visitor extends ByteCodeGenerator.Visitor {
    public @NonNullElements
    Map<String, byte[]> otherClasses = new HashMap<String, byte[]>();

    protected @NonNullElements
    @ReadOnlyElements
    Map<String, TypeDeclaration> classMap;

    protected @NonNullElements
    @ReadOnlyElements
    Map<Pair<String, String>, FieldDeclaration> fieldMap;

    protected Visitor(@NonNull final ExtendedSymbolTable st,
        @NonNull final ExtendedTypeTable tt) {
      super(st, tt);
      this.classMap = st.classMap;
      this.fieldMap = st.fieldMap;
    }

    @Override
    protected void dispose() {
      super.dispose();
      this.classMap = null;
      this.fieldMap = null;
    }

    /**
     * Determines whether a {@link List} of {@link Modifier}s has a public
     * modifier (a {@link Modifier}'s whose {@link ModifierKeyword} is
     * {@link ModifierKeyword.PUBLIC_KEYWORD}).
     * 
     * @param modifiers
     * @return True, if the {@link List} contains a public modifier.
     */
    protected boolean hasPublicModifier(
        @SuppressWarnings("rawtypes") final List modifiers) {
      for (final Object o : modifiers) {
        if ((o instanceof Modifier)
            && (((Modifier) o).getKeyword() == ModifierKeyword.PUBLIC_KEYWORD)) {
          return true;
        }
      }
      return false;
    }
  }

  /**
   * Generates a {@link ExtendedClassByteCodes} that represents the class files
   * for the given ExtendedStaticJava {@link CompilationUnit} with the given
   * {@link ExtendedSymbolTable} and {@link ExtendedTypeTable}.
   * 
   * @param cu
   *          The StaticJava {@link CompilationUnit}.
   * @param st
   *          The {@link ExtendedSymbolTable} of the {@link CompilationUnit}.
   * @param tt
   *          The {@link ExtendedTypeTable} of the {@link CompilationUnit}.
   * @return The {@link ExtendedClassByteCodes} that represents the class files
   *         for the given ExtendedStaticJava {@link CompilationUnit} with the
   *         given {@link ExtendedSymbolTable} and {@link ExtendedTypeTable}.
   * @throws ByteCodeGenerator.Error
   *           If the generator encounter unexpected error.
   */
  public static @NonNull
  ExtendedClassByteCodes generate(@NonNull final CompilationUnit cu,
      @NonNull final ExtendedSymbolTable est,
      @NonNull final ExtendedTypeTable ett) throws ByteCodeGenerator.Error {
    assert (cu != null) && (est != null) && (ett != null);

    final Visitor v = new Visitor(est, ett);
    cu.accept(v);
    final ExtendedClassByteCodes result = new ExtendedClassByteCodes(
        v.mainClassName, v.mainClassBytes, v.otherClasses);
    v.dispose();
    return result;
  }

  /**
   * Declared as protected to disallow creation of this object outside from the
   * methods of this class.
   */
  protected ExtendedByteCodeGenerator() {
  }
}
