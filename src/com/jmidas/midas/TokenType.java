package com.jmidas.midas;

enum TokenType {
	COLON, COMMA, DO, DOT, END, /* HASH, */ LEFT_PAREN,
	MINUS, PERCENT, PLUS, QUESTION, RIGHT_PAREN,
	SEMICOLON, SLASH, STAR,

	// One or two character tokens
	PLUS_PLUS, /* SLASH_SLASH, */
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