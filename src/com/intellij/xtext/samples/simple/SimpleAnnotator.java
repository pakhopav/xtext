package com.intellij.xtext.samples.simple;
import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.xtext.samples.simple.psi.SimpleEntity;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("ALL")
public class SimpleAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
//        if (element instanceof PsiLiteralExpression) {
//            PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
//            String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
//
//            if (value != null && value.startsWith("simple" + ":")) {
//                Project project = element.getProject();
//                String key = value.substring(7);
//                List<SimpleEntity> properties = SimpleUtil.findEntities(project, key);
//                if (properties.size() == 1) {
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 7,
//                            element.getTextRange().getEndOffset());
//                    Annotation annotation = holder.createInfoAnnotation(range, null);
//                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
//                } else if (properties.size() == 0) {
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 8,
//                            element.getTextRange().getEndOffset());
//                    holder.createErrorAnnotation(range, "Unresolved property!!1");
//                }
//            }
//        }
    }
}