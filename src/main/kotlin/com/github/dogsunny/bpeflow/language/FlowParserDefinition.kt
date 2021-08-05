package com.github.dogsunny.bpeflow.language

import com.github.dogsunny.bpeflow.language.parser.FlowParser
import com.github.dogsunny.bpeflow.language.psi.FlowFile
import com.github.dogsunny.bpeflow.language.psi.FlowTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

/**
 * 定义解析器
 * Flow语言解析器由子类定义ParserDefinition。
 */
class FlowParserDefinition : ParserDefinition {
    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(FlowTypes.COMMENT)

        val FILE = IFileElementType(FlowLanguage.INSTANCE)
    }

    override fun createLexer(project: Project?): Lexer = FlowLexerAdapter()

    override fun createParser(project: Project?): PsiParser = FlowParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode?): PsiElement = FlowTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = FlowFile(viewProvider)
}