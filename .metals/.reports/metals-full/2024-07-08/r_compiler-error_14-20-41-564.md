file:///D:/UCSC/FP/Practical%2004/practical-04/src/question2.scala
### file%3A%2F%2F%2FD%3A%2FUCSC%2FFP%2FPractical%252004%2Fpractical-04%2Fsrc%2Fquestion2.scala:14: error: `end of file` expected but `}` found
}
^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///D:/UCSC/FP/Practical%2004/practical-04/src/question2.scala
text:
```scala
object PatternMatchingExample {

  def main(args: Array[String]): Unit = {
        val input = args(0).toInt
        val result = input match {
          case x if x <= 0 => "Negative/Zero is input"
          case x if x % 2 == 0 => "Even number is given"
          case x if x % 2 != 0 => "Odd number is given"
        }
        println(result)
    }
  }

}

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$expectAt(ScalametaParser.scala:389)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$expectAt(ScalametaParser.scala:393)
	scala.meta.internal.parsers.ScalametaParser.expect(ScalametaParser.scala:395)
	scala.meta.internal.parsers.ScalametaParser.accept(ScalametaParser.scala:411)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:62)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:53)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:116)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:30)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:37)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:22)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:15)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:179)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:462)
```
#### Short summary: 

file%3A%2F%2F%2FD%3A%2FUCSC%2FFP%2FPractical%252004%2Fpractical-04%2Fsrc%2Fquestion2.scala:14: error: `end of file` expected but `}` found
}
^