package com.github.dogsunny.bpeflow.language.psi

import com.github.dogsunny.bpeflow.language.FlowFileType
import com.github.dogsunny.bpeflow.language.FlowLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

/**
 * 根文件
 * 该FlowFile实现是的顶级节点的树PsiElements一个简单的语言文件。
 */
class FlowFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, FlowLanguage.INSTANCE) {
    override fun getFileType() = FlowFileType.INSTANCE

    override fun toString(): String {
        return "Flow File"
    }
}