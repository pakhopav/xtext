// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.xtext.samples.simple.psi.SimpleTypes.*;
import com.intellij.xtext.samples.simple.psi.impl.SimplePsiCompositeElementImpl;
import com.intellij.xtext.samples.simple.psi.*;
import com.intellij.xtext.samples.simple.psi.impl.SimplePsiImplUtil;

public class SimpleJvmTypeParameterImpl extends SimplePsiCompositeElementImpl implements SimpleJvmTypeParameter {

  public SimpleJvmTypeParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitJvmTypeParameter(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleJvmUpperBoundAnded> getJvmUpperBoundAndedList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleJvmUpperBoundAnded.class);
  }

  @Override
  @NotNull
  public SimpleValidID getValidID() {
    return findNotNullChildByClass(SimpleValidID.class);
  }

  @Override
  @Nullable
  public SimpleJvmUpperBound getConstraints() {
    return findChildByClass(SimpleJvmUpperBound.class);
  }

}
