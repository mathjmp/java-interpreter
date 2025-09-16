# Interpreter made in JAVA

## Scanning
Scanning, also known as lexing or lexical analysis is a technique that takes in raw source code as a series of characters and groups it into a series of chunks we call tokens

## Parsing
Parsing is where the syntax gets a grammar. A parser takes the flat sequence of tokens and builds a tree structure that mirrors the nested nature of the grammar. These trees have a couple of different names (Parse tree or Abstract syntax tree)

## Static Analysis
The first bit of analysis that most languages do is called <strong>binding</strong> or <strong>resolution</strong>. For each identifier, we find out where that name is defined and wire the two together. This is where scope comes into play - the region of source code where a certain name can be used to refer to a certain declaration

