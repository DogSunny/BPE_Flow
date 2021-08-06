package com.github.dogsunny.bpeflow.language

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class FlowColorSettingsPage : ColorSettingsPage {

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Key", FlowSyntaxHighlighter.KEY),
            AttributesDescriptor("Separator", FlowSyntaxHighlighter.SEPARATOR),
            AttributesDescriptor("Value", FlowSyntaxHighlighter.VALUE),
            AttributesDescriptor("Bad Value", FlowSyntaxHighlighter.BAD_CHARACTER)
        )
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = FlowConst.NAME

    override fun getIcon(): Icon = FlowConst.FILE_ICON

    override fun getHighlighter(): SyntaxHighlighter = FlowSyntaxHighlighter()

    override fun getDemoText(): String = """
        |# You are reading the ".properties" entry.
        |! The exclamation mark can also mark text as comments.
        |website = https://en.wikipedia.org/
        |language = English
        |# The backslash below tells the application to continue reading
        |# the value onto the next line.
        |message = Welcome to \
        |          Wikipedia!
        |# Add spaces to the key
        |key\ with\ spaces = This is the value that could be looked up with the key "key with spaces".
        |# Unicode
        |tab : \u0009
        """.trimMargin()

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? = null
}