package com.github.dogsunny.bpeflow.language.psi

import com.github.dogsunny.bpeflow.language.FlowLanguage
import com.intellij.psi.tree.IElementType

class FlowTokenType(debugName: String) : IElementType(debugName, FlowLanguage.INSTANCE) {

    override fun toString(): String {
        return "FlowTokenType." + super.toString()
    }
}