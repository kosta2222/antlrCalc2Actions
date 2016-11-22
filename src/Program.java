import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
 class Program
{
        public static void main (String[] args)
        {

//String input = "public static void main(String[] args) { }";
InputStream is=System.in;
Reader r=new InputStreamReader(is);
BufferedReader br=new BufferedReader(r);
String st="";
 System.out.println("REPL input:");
while(!st.equals("q")){
    try{
  st=br.readLine();
}catch(Exception e)
      {

         System.out.println("Error: "+e);
      }


CharStream cs = new ANTLRInputStream(st);
      CalcLexer lexer = new CalcLexer(cs);
      
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      CalcParser parser = new CalcParser(tokens);
      if(!st.equals("q")){
ParseTree tree = parser.multDivExpr(); // begin parsing at r rule
// print LISP-style tree
System.out.println(tree.toStringTree(parser));

//HelloBaseVisitorImpl visitor = new HelloBaseVisitorImpl();
//        
//        
//        Integer result = visitor.visit(tree);
//        System.out.println("Result: " + result);
        }


      }      
        }
}