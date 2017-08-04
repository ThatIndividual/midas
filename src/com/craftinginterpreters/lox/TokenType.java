package com.craftinginterpreters.lox;

enum TokenType {
	// Single character tokens
	// LEFT_BRACE, RIGHT_BRACE,
	LEFT_PAREN, RIGHT_PAREN, COMMA, DOT, MINUS,
	PLUS, SEMICOLON, SLASH, STAR,	QUESTION, COLON,
	DO, END,

	// One or two character tokens
	PLUS_PLUS,
	BANG, BANG_EQUAL,
	EQUAL, EQUAL_EQUAL,
	GREATER, GREATER_EQUAL,
	LESS, LESS_EQUAL,

	// Literals
	IDENTIFIER, STRING, NUMBER,

	// Keywords
	AND, BREAK, CLASS, ELSE, TRUE, FALSE, FUN, FOR,
	IF, NIL, OR,	PRINT, RETURN, SUPER, THIS, VAR,
	WHILE,

	EOF
}