package com.github.dogsunny.bpeflow.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class FlowFileType: LanguageFileType(FlowLanguage.INSTANCE) {
    companion object {
        val INSTANCE = FlowFileType()
    }

    override fun getName() = "Flow File"

    override fun getDescription() = "Flow language file"

    override fun getDefaultExtension() = FlowConst.EXT_NAME

    override fun getIcon(): Icon = FlowConst.FILE_ICON
}