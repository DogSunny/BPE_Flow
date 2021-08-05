package com.github.dogsunny.bpeflow.language

import com.intellij.lexer.FlexAdapter
// 词法适配器
class FlowLexerAdapter : FlexAdapter(FlowLexer(null))