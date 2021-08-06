package com.github.dogsunny.bpeflow.language.psi

import com.github.dogsunny.bpeflow.language.FlowLanguage
import com.intellij.psi.tree.IElementType

class FlowElementType(debugName: String) : IElementType(debugName, FlowLanguage.INSTANCE) {
}