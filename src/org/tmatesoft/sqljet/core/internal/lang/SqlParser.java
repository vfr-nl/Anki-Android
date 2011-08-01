// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g 2011-07-19 16:15:31

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

@SuppressWarnings({"unused", "rawtypes", "unchecked"}) public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "BIND", "BIND_NAME", "BLOB_LITERAL", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "CREATE_VIEW", "CREATE_TRIGGER", "DROP_INDEX", "DROP_TABLE", "FLOAT_LITERAL", "FUNCTION_LITERAL", "FUNCTION_EXPRESSION", "ID_LITERAL", "IN_VALUES", "IN_TABLE", "INTEGER_LITERAL", "IS_NULL", "IS_NOT", "NOT_NULL", "OPTIONS", "ORDERING", "SELECT_CORE", "STRING_LITERAL", "STATEMENT", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS", "SEMI", "EXPLAIN", "QUERY", "PLAN", "DOT", "INDEXED", "BY", "NOT", "OR", "AND", "ESCAPE", "IN", "LPAREN", "COMMA", "RPAREN", "EQUALS", "ISNULL", "NOTNULL", "IS", "NULL", "BETWEEN", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LIKE", "GLOB", "REGEXP", "MATCH", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DOUBLE_PIPE", "TILDA", "COLLATE", "ID", "DISTINCT", "CAST", "AS", "CASE", "ELSE", "END", "WHEN", "THEN", "INTEGER", "FLOAT", "STRING", "BLOB", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "QUESTION", "COLON", "AT", "RAISE", "IGNORE", "ROLLBACK", "ABORT", "FAIL", "PRAGMA", "ATTACH", "DATABASE", "DETACH", "ANALYZE", "REINDEX", "VACUUM", "REPLACE", "ASC", "DESC", "ORDER", "LIMIT", "OFFSET", "UNION", "ALL", "INTERSECT", "EXCEPT", "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "NATURAL", "LEFT", "OUTER", "INNER", "CROSS", "JOIN", "ON", "USING", "INSERT", "INTO", "VALUES", "DEFAULT", "UPDATE", "SET", "DELETE", "BEGIN", "DEFERRED", "IMMEDIATE", "EXCLUSIVE", "TRANSACTION", "COMMIT", "TO", "SAVEPOINT", "RELEASE", "CONFLICT", "CREATE", "VIRTUAL", "TABLE", "TEMPORARY", "IF", "EXISTS", "CONSTRAINT", "PRIMARY", "KEY", "AUTOINCREMENT", "UNIQUE", "CHECK", "FOREIGN", "REFERENCES", "CASCADE", "RESTRICT", "DEFERRABLE", "INITIALLY", "DROP", "ALTER", "RENAME", "ADD", "COLUMN", "VIEW", "INDEX", "TRIGGER", "BEFORE", "AFTER", "INSTEAD", "OF", "FOR", "EACH", "ROW", "BACKSLASH", "DOLLAR", "QUOTE_DOUBLE", "QUOTE_SINGLE", "APOSTROPHE", "LPAREN_SQUARE", "RPAREN_SQUARE", "UNDERSCORE", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "STRING_ESCAPE_SINGLE", "STRING_ESCAPE_DOUBLE", "STRING_CORE", "STRING_CORE_SINGLE", "STRING_CORE_DOUBLE", "STRING_SINGLE", "STRING_DOUBLE", "ID_START", "ID_CORE", "ID_PLAIN", "ID_QUOTED_CORE", "ID_QUOTED_CORE_SQUARE", "ID_QUOTED_CORE_APOSTROPHE", "ID_QUOTED_SQUARE", "ID_QUOTED_APOSTROPHE", "ID_QUOTED", "FLOAT_EXP", "COMMENT", "LINE_COMMENT", "WS"
    };
    public static final int ROW=183;
    public static final int BLOB_LITERAL=7;
    public static final int TYPE_PARAMS=35;
    public static final int NOT=43;
    public static final int EXCEPT=120;
    public static final int EOF=-1;
    public static final int FOREIGN=163;
    public static final int STATEMENT=32;
    public static final int TYPE=34;
    public static final int RPAREN=50;
    public static final int CREATE=151;
    public static final int STRING_LITERAL=31;
    public static final int IS_NULL=25;
    public static final int USING=133;
    public static final int BIND=5;
    public static final int CREATE_TRIGGER=15;
    public static final int BEGIN=141;
    public static final int REGEXP=62;
    public static final int ANALYZE=108;
    public static final int FUNCTION_LITERAL=19;
    public static final int CONFLICT=150;
    public static final int APOSTROPHE=188;
    public static final int LESS_OR_EQ=65;
    public static final int ATTACH=105;
    public static final int VIRTUAL=152;
    public static final int D=195;
    public static final int E=196;
    public static final int F=197;
    public static final int ID_QUOTED=233;
    public static final int G=198;
    public static final int BLOB=92;
    public static final int A=192;
    public static final int B=193;
    public static final int C=194;
    public static final int ASC=112;
    public static final int L=203;
    public static final int M=204;
    public static final int N=205;
    public static final int O=206;
    public static final int TRANSACTION=145;
    public static final int KEY=159;
    public static final int H=199;
    public static final int I=200;
    public static final int BIND_NAME=6;
    public static final int J=201;
    public static final int ELSE=85;
    public static final int K=202;
    public static final int U=212;
    public static final int T=211;
    public static final int W=214;
    public static final int IN_VALUES=22;
    public static final int V=213;
    public static final int UNDERSCORE=191;
    public static final int Q=208;
    public static final int P=207;
    public static final int S=210;
    public static final int R=209;
    public static final int ROLLBACK=101;
    public static final int FAIL=103;
    public static final int Y=216;
    public static final int RESTRICT=166;
    public static final int X=215;
    public static final int Z=217;
    public static final int INTERSECT=119;
    public static final int GROUP=124;
    public static final int DROP_INDEX=16;
    public static final int WS=237;
    public static final int PLAN=39;
    public static final int ALIAS=4;
    public static final int END=86;
    public static final int RPAREN_SQUARE=190;
    public static final int CONSTRAINT=157;
    public static final int RENAME=171;
    public static final int ALTER=170;
    public static final int ID_PLAIN=227;
    public static final int STRING_CORE_DOUBLE=222;
    public static final int ISNULL=52;
    public static final int TABLE=153;
    public static final int FLOAT=90;
    public static final int STRING_CORE_SINGLE=221;
    public static final int ID_QUOTED_CORE_SQUARE=229;
    public static final int NOTNULL=53;
    public static final int NOT_EQUALS=58;
    public static final int ASTERISK=74;
    public static final int LPAREN=48;
    public static final int NOT_NULL=27;
    public static final int GREATER_OR_EQ=67;
    public static final int DOUBLE_PIPE=77;
    public static final int AT=98;
    public static final int AS=83;
    public static final int SLASH=75;
    public static final int IS_NOT=26;
    public static final int THEN=88;
    public static final int ID_QUOTED_CORE=228;
    public static final int OFFSET=116;
    public static final int REPLACE=111;
    public static final int LEFT=127;
    public static final int COLUMN=173;
    public static final int PLUS=72;
    public static final int PIPE=71;
    public static final int EXISTS=156;
    public static final int LIKE=60;
    public static final int COLLATE=79;
    public static final int ADD=172;
    public static final int INTEGER=89;
    public static final int OUTER=128;
    public static final int BY=42;
    public static final int DEFERRABLE=167;
    public static final int TO=147;
    public static final int ID_CORE=226;
    public static final int AMPERSAND=70;
    public static final int SET=139;
    public static final int HAVING=125;
    public static final int MINUS=73;
    public static final int IGNORE=100;
    public static final int SEMI=36;
    public static final int UNION=117;
    public static final int COLUMN_CONSTRAINT=8;
    public static final int COLON=97;
    public static final int FLOAT_EXP=234;
    public static final int COLUMNS=10;
    public static final int COMMIT=146;
    public static final int IN_TABLE=23;
    public static final int DATABASE=106;
    public static final int VACUUM=110;
    public static final int DROP=169;
    public static final int DETACH=107;
    public static final int WHEN=87;
    public static final int ID_QUOTED_APOSTROPHE=232;
    public static final int STRING_DOUBLE=224;
    public static final int STRING_SINGLE=223;
    public static final int NATURAL=126;
    public static final int BETWEEN=56;
    public static final int OPTIONS=28;
    public static final int STRING=91;
    public static final int CAST=82;
    public static final int STRING_CORE=220;
    public static final int TABLE_CONSTRAINT=33;
    public static final int ID_LITERAL=21;
    public static final int CURRENT_TIME=93;
    public static final int TRIGGER=176;
    public static final int CASE=84;
    public static final int EQUALS=51;
    public static final int CASCADE=165;
    public static final int RELEASE=149;
    public static final int EXPLAIN=37;
    public static final int GREATER=66;
    public static final int ESCAPE=46;
    public static final int INSERT=134;
    public static final int SAVEPOINT=148;
    public static final int LESS=64;
    public static final int RAISE=99;
    public static final int LPAREN_SQUARE=189;
    public static final int EACH=182;
    public static final int COMMENT=235;
    public static final int ABORT=102;
    public static final int SELECT=121;
    public static final int INTO=135;
    public static final int UNIQUE=161;
    public static final int GLOB=61;
    public static final int VIEW=174;
    public static final int LINE_COMMENT=236;
    public static final int NULL=55;
    public static final int QUOTE_DOUBLE=186;
    public static final int ON=132;
    public static final int MATCH=63;
    public static final int PRIMARY=158;
    public static final int DELETE=140;
    public static final int OF=180;
    public static final int SHIFT_LEFT=68;
    public static final int SHIFT_RIGHT=69;
    public static final int INTEGER_LITERAL=24;
    public static final int FUNCTION_EXPRESSION=20;
    public static final int OR=44;
    public static final int QUERY=38;
    public static final int CHECK=162;
    public static final int QUOTE_SINGLE=187;
    public static final int STRING_ESCAPE_DOUBLE=219;
    public static final int FROM=122;
    public static final int DISTINCT=81;
    public static final int TEMPORARY=154;
    public static final int CURRENT_DATE=94;
    public static final int BACKSLASH=184;
    public static final int DOLLAR=185;
    public static final int CONSTRAINTS=11;
    public static final int WHERE=123;
    public static final int COLUMN_EXPRESSION=9;
    public static final int INNER=129;
    public static final int STRING_ESCAPE_SINGLE=218;
    public static final int ORDER=114;
    public static final int LIMIT=115;
    public static final int PRAGMA=104;
    public static final int UPDATE=138;
    public static final int DEFERRED=142;
    public static final int FOR=181;
    public static final int SELECT_CORE=30;
    public static final int EXCLUSIVE=144;
    public static final int ID=80;
    public static final int AND=45;
    public static final int CROSS=130;
    public static final int IF=155;
    public static final int INDEX=175;
    public static final int TILDA=78;
    public static final int IN=47;
    public static final int COMMA=49;
    public static final int CREATE_TABLE=13;
    public static final int REFERENCES=164;
    public static final int IS=54;
    public static final int ALL=118;
    public static final int DOT=40;
    public static final int CURRENT_TIMESTAMP=95;
    public static final int CREATE_VIEW=14;
    public static final int INITIALLY=168;
    public static final int REINDEX=109;
    public static final int EQUALS2=57;
    public static final int PERCENT=76;
    public static final int AUTOINCREMENT=160;
    public static final int NOT_EQUALS2=59;
    public static final int DEFAULT=137;
    public static final int VALUES=136;
    public static final int BEFORE=177;
    public static final int AFTER=178;
    public static final int INSTEAD=179;
    public static final int ID_QUOTED_CORE_APOSTROPHE=230;
    public static final int JOIN=131;
    public static final int ID_QUOTED_SQUARE=231;
    public static final int FLOAT_LITERAL=18;
    public static final int INDEXED=41;
    public static final int CREATE_INDEX=12;
    public static final int QUESTION=96;
    public static final int ORDERING=29;
    public static final int IMMEDIATE=143;
    public static final int DESC=113;
    public static final int DROP_TABLE=17;
    public static final int ID_START=225;

    // delegates
    // delegators


        public SqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g"; }



    // Disable error recovery.
    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);
    }

    // Delegate error reporting to caller.
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[").append(getErrorHeader(e)).append("] ");
        buffer.append(getErrorMessage(e, tokenNames));
        if(e.token!=null) {
          final CharStream stream = e.token.getInputStream();
          if(stream!=null) {
            int size = stream.size();
            if(size>0) {
              buffer.append("\n").append(stream.substring(0, size-1));
            }
          }
        }
        throw new SqlJetParserException(buffer.toString(), e);
    }

    // unquotes identifier
    private String unquoteId(String id) {
      if(id==null) {
        return null;
      }
      int len = id.length();
      if(len==0) {
        return "";
      }
      char first = id.charAt(0);
      char last = id.charAt(len-1);
      switch(first) {
        case '[' :
          first = ']';
        case '\'' :
        case '"' :
        case '`' :
          if(first==last) {
            return id.substring(1,len-1);
          }
        default:
          return id;
      }
    }



    public static class sql_stmt_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt_list"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:1: sql_stmt_list : sql_stmt ( SEMI ( sql_stmt SEMI )* )? EOF ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI2=null;
        Token SEMI4=null;
        Token EOF5=null;
        SqlParser.sql_stmt_return sql_stmt1 = null;

        SqlParser.sql_stmt_return sql_stmt3 = null;


        Object SEMI2_tree=null;
        Object SEMI4_tree=null;
        Object EOF5_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:14: ( sql_stmt ( SEMI ( sql_stmt SEMI )* )? EOF )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:16: sql_stmt ( SEMI ( sql_stmt SEMI )* )? EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list223);
            sql_stmt1=sql_stmt();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt1.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:25: ( SEMI ( sql_stmt SEMI )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SEMI) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:26: SEMI ( sql_stmt SEMI )*
                    {
                    SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_list226); 
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:32: ( sql_stmt SEMI )*
                    loop1:
                    do {
                        int alt1=2;
                        alt1 = dfa1.predict(input);
                        switch (alt1) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:33: sql_stmt SEMI
                    	    {
                    	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list230);
                    	    sql_stmt3=sql_stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, sql_stmt3.getTree());
                    	    SEMI4=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_list232); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sql_stmt_list240); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_list"

    public static class sql_stmt_itself_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt_itself"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:1: sql_stmt_itself : sql_stmt ( SEMI )? EOF ;
    public final SqlParser.sql_stmt_itself_return sql_stmt_itself() throws RecognitionException {
        SqlParser.sql_stmt_itself_return retval = new SqlParser.sql_stmt_itself_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI7=null;
        Token EOF8=null;
        SqlParser.sql_stmt_return sql_stmt6 = null;


        Object SEMI7_tree=null;
        Object EOF8_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:16: ( sql_stmt ( SEMI )? EOF )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:18: sql_stmt ( SEMI )? EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sql_stmt_in_sql_stmt_itself248);
            sql_stmt6=sql_stmt();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt6.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:27: ( SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMI) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:28: SEMI
                    {
                    SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_itself251); 

                    }
                    break;

            }

            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_sql_stmt_itself256); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_itself"

    public static class sql_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core ;
    public final SqlParser.sql_stmt_return sql_stmt() throws RecognitionException {
        SqlParser.sql_stmt_return retval = new SqlParser.sql_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPLAIN9=null;
        Token QUERY10=null;
        Token PLAN11=null;
        SqlParser.sql_stmt_core_return sql_stmt_core12 = null;


        Object EXPLAIN9_tree=null;
        Object QUERY10_tree=null;
        Object PLAN11_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core
            {
            root_0 = (Object)adaptor.nil();

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN9=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt265); 
                    EXPLAIN9_tree = (Object)adaptor.create(EXPLAIN9);
                    adaptor.addChild(root_0, EXPLAIN9_tree);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:20: ( QUERY PLAN )?
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:21: QUERY PLAN
                            {
                            QUERY10=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt268); 
                            QUERY10_tree = (Object)adaptor.create(QUERY10);
                            adaptor.addChild(root_0, QUERY10_tree);

                            PLAN11=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt270); 
                            PLAN11_tree = (Object)adaptor.create(PLAN11);
                            adaptor.addChild(root_0, PLAN11_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt276);
            sql_stmt_core12=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core12.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_stmt"

    public static class sql_stmt_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt_core"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:148:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
    public final SqlParser.sql_stmt_core_return sql_stmt_core() throws RecognitionException {
        SqlParser.sql_stmt_core_return retval = new SqlParser.sql_stmt_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.pragma_stmt_return pragma_stmt13 = null;

        SqlParser.attach_stmt_return attach_stmt14 = null;

        SqlParser.detach_stmt_return detach_stmt15 = null;

        SqlParser.analyze_stmt_return analyze_stmt16 = null;

        SqlParser.reindex_stmt_return reindex_stmt17 = null;

        SqlParser.vacuum_stmt_return vacuum_stmt18 = null;

        SqlParser.select_stmt_return select_stmt19 = null;

        SqlParser.insert_stmt_return insert_stmt20 = null;

        SqlParser.update_stmt_return update_stmt21 = null;

        SqlParser.delete_stmt_return delete_stmt22 = null;

        SqlParser.begin_stmt_return begin_stmt23 = null;

        SqlParser.commit_stmt_return commit_stmt24 = null;

        SqlParser.rollback_stmt_return rollback_stmt25 = null;

        SqlParser.savepoint_stmt_return savepoint_stmt26 = null;

        SqlParser.release_stmt_return release_stmt27 = null;

        SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt28 = null;

        SqlParser.create_table_stmt_return create_table_stmt29 = null;

        SqlParser.drop_table_stmt_return drop_table_stmt30 = null;

        SqlParser.alter_table_stmt_return alter_table_stmt31 = null;

        SqlParser.create_view_stmt_return create_view_stmt32 = null;

        SqlParser.drop_view_stmt_return drop_view_stmt33 = null;

        SqlParser.create_index_stmt_return create_index_stmt34 = null;

        SqlParser.drop_index_stmt_return drop_index_stmt35 = null;

        SqlParser.create_trigger_stmt_return create_trigger_stmt36 = null;

        SqlParser.drop_trigger_stmt_return drop_trigger_stmt37 = null;



        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:149:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt6=25;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:149:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core286);
                    pragma_stmt13=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt13.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:150:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core292);
                    attach_stmt14=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt14.getTree());

                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:151:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core298);
                    detach_stmt15=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt15.getTree());

                    }
                    break;
                case 4 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:152:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core304);
                    analyze_stmt16=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt16.getTree());

                    }
                    break;
                case 5 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:153:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core310);
                    reindex_stmt17=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt17.getTree());

                    }
                    break;
                case 6 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:154:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core316);
                    vacuum_stmt18=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt18.getTree());

                    }
                    break;
                case 7 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:156:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core325);
                    select_stmt19=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt19.getTree());

                    }
                    break;
                case 8 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:157:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core331);
                    insert_stmt20=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt20.getTree());

                    }
                    break;
                case 9 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:158:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core337);
                    update_stmt21=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt21.getTree());

                    }
                    break;
                case 10 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:159:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core343);
                    delete_stmt22=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt22.getTree());

                    }
                    break;
                case 11 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:160:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core349);
                    begin_stmt23=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt23.getTree());

                    }
                    break;
                case 12 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:161:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core355);
                    commit_stmt24=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt24.getTree());

                    }
                    break;
                case 13 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:162:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core361);
                    rollback_stmt25=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt25.getTree());

                    }
                    break;
                case 14 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:163:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core367);
                    savepoint_stmt26=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt26.getTree());

                    }
                    break;
                case 15 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:164:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core373);
                    release_stmt27=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt27.getTree());

                    }
                    break;
                case 16 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:166:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core382);
                    create_virtual_table_stmt28=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt28.getTree());

                    }
                    break;
                case 17 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:167:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core388);
                    create_table_stmt29=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt29.getTree());

                    }
                    break;
                case 18 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:168:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core394);
                    drop_table_stmt30=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt30.getTree());

                    }
                    break;
                case 19 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:169:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core400);
                    alter_table_stmt31=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt31.getTree());

                    }
                    break;
                case 20 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:170:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core406);
                    create_view_stmt32=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt32.getTree());

                    }
                    break;
                case 21 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:171:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core412);
                    drop_view_stmt33=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt33.getTree());

                    }
                    break;
                case 22 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:172:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core418);
                    create_index_stmt34=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt34.getTree());

                    }
                    break;
                case 23 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:173:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core424);
                    drop_index_stmt35=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt35.getTree());

                    }
                    break;
                case 24 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:174:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core430);
                    create_trigger_stmt36=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt36.getTree());

                    }
                    break;
                case 25 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:175:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core436);
                    drop_trigger_stmt37=drop_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_trigger_stmt37.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_core"

    public static class schema_create_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "schema_create_table_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:1: schema_create_table_stmt : ( create_virtual_table_stmt | create_table_stmt );
    public final SqlParser.schema_create_table_stmt_return schema_create_table_stmt() throws RecognitionException {
        SqlParser.schema_create_table_stmt_return retval = new SqlParser.schema_create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt38 = null;

        SqlParser.create_table_stmt_return create_table_stmt39 = null;



        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:25: ( create_virtual_table_stmt | create_table_stmt )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CREATE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==VIRTUAL) ) {
                    alt7=1;
                }
                else if ( ((LA7_1>=TABLE && LA7_1<=TEMPORARY)) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:27: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_schema_create_table_stmt446);
                    create_virtual_table_stmt38=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt38.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:55: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_schema_create_table_stmt450);
                    create_table_stmt39=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "schema_create_table_stmt"

    public static class qualified_table_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualified_table_name"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
    public final SqlParser.qualified_table_name_return qualified_table_name() throws RecognitionException {
        SqlParser.qualified_table_name_return retval = new SqlParser.qualified_table_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT40=null;
        Token INDEXED41=null;
        Token BY42=null;
        Token NOT43=null;
        Token INDEXED44=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return index_name = null;


        Object DOT40_tree=null;
        Object INDEXED41_tree=null;
        Object BY42_tree=null;
        Object NOT43_tree=null;
        Object INDEXED44_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:23: (database_name= id DOT )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name460);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT40=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name462); 
                    DOT40_tree = (Object)adaptor.create(DOT40);
                    adaptor.addChild(root_0, DOT40_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name468);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:61: ( INDEXED BY index_name= id | NOT INDEXED )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INDEXED) ) {
                alt9=1;
            }
            else if ( (LA9_0==NOT) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:62: INDEXED BY index_name= id
                    {
                    INDEXED41=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name471); 
                    INDEXED41_tree = (Object)adaptor.create(INDEXED41);
                    adaptor.addChild(root_0, INDEXED41_tree);

                    BY42=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name473); 
                    BY42_tree = (Object)adaptor.create(BY42);
                    adaptor.addChild(root_0, BY42_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name477);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:89: NOT INDEXED
                    {
                    NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name481); 
                    NOT43_tree = (Object)adaptor.create(NOT43);
                    adaptor.addChild(root_0, NOT43_tree);

                    INDEXED44=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name483); 
                    INDEXED44_tree = (Object)adaptor.create(INDEXED44);
                    adaptor.addChild(root_0, INDEXED44_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qualified_table_name"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR46=null;
        SqlParser.or_subexpr_return or_subexpr45 = null;

        SqlParser.or_subexpr_return or_subexpr47 = null;


        Object OR46_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:5: ( or_subexpr ( OR or_subexpr )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr492);
            or_subexpr45=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr45.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:18: ( OR or_subexpr )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:19: OR or_subexpr
            	    {
            	    OR46=(Token)match(input,OR,FOLLOW_OR_in_expr495); 
            	    OR46_tree = (Object)adaptor.create(OR46);
            	    root_0 = (Object)adaptor.becomeRoot(OR46_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr498);
            	    or_subexpr47=or_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_subexpr47.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class or_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND49=null;
        SqlParser.and_subexpr_return and_subexpr48 = null;

        SqlParser.and_subexpr_return and_subexpr50 = null;


        Object AND49_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:11: ( and_subexpr ( AND and_subexpr )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr507);
            and_subexpr48=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr48.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:25: ( AND and_subexpr )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:26: AND and_subexpr
            	    {
            	    AND49=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr510); 
            	    AND49_tree = (Object)adaptor.create(AND49);
            	    root_0 = (Object)adaptor.becomeRoot(AND49_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr513);
            	    and_subexpr50=and_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_subexpr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_subexpr"

    public static class and_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:1: and_subexpr : eq_subexpr ( cond_expr )? ;
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.eq_subexpr_return eq_subexpr51 = null;

        SqlParser.cond_expr_return cond_expr52 = null;



        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:12: ( eq_subexpr ( cond_expr )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:14: eq_subexpr ( cond_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr522);
            eq_subexpr51=eq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, eq_subexpr51.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:34: ( cond_expr )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:34: cond_expr
                    {
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr524);
                    cond_expr52=cond_expr();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(cond_expr52.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_subexpr"

    public static class cond_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cond_expr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:188:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN LPAREN ( select_stmt )? RPAREN | ( NOT )? EQUALS LPAREN ( select_stmt )? RPAREN | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );
    public final SqlParser.cond_expr_return cond_expr() throws RecognitionException {
        SqlParser.cond_expr_return retval = new SqlParser.cond_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT53=null;
        Token ESCAPE55=null;
        Token NOT56=null;
        Token IN57=null;
        Token LPAREN58=null;
        Token COMMA60=null;
        Token RPAREN62=null;
        Token NOT63=null;
        Token IN64=null;
        Token DOT65=null;
        Token NOT66=null;
        Token IN67=null;
        Token LPAREN68=null;
        Token RPAREN70=null;
        Token NOT71=null;
        Token EQUALS72=null;
        Token LPAREN73=null;
        Token RPAREN75=null;
        Token ISNULL76=null;
        Token NOTNULL77=null;
        Token IS78=null;
        Token NULL79=null;
        Token NOT80=null;
        Token NULL81=null;
        Token IS82=null;
        Token NOT83=null;
        Token NULL84=null;
        Token IS85=null;
        Token NOT86=null;
        Token NOT88=null;
        Token BETWEEN89=null;
        Token AND90=null;
        Token set91=null;
        SqlParser.eq_subexpr_return match_expr = null;

        SqlParser.eq_subexpr_return escape_expr = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.eq_subexpr_return e1 = null;

        SqlParser.eq_subexpr_return e2 = null;

        SqlParser.match_op_return match_op54 = null;

        SqlParser.expr_return expr59 = null;

        SqlParser.expr_return expr61 = null;

        SqlParser.select_stmt_return select_stmt69 = null;

        SqlParser.select_stmt_return select_stmt74 = null;

        SqlParser.eq_subexpr_return eq_subexpr87 = null;

        SqlParser.eq_subexpr_return eq_subexpr92 = null;


        Object NOT53_tree=null;
        Object ESCAPE55_tree=null;
        Object NOT56_tree=null;
        Object IN57_tree=null;
        Object LPAREN58_tree=null;
        Object COMMA60_tree=null;
        Object RPAREN62_tree=null;
        Object NOT63_tree=null;
        Object IN64_tree=null;
        Object DOT65_tree=null;
        Object NOT66_tree=null;
        Object IN67_tree=null;
        Object LPAREN68_tree=null;
        Object RPAREN70_tree=null;
        Object NOT71_tree=null;
        Object EQUALS72_tree=null;
        Object LPAREN73_tree=null;
        Object RPAREN75_tree=null;
        Object ISNULL76_tree=null;
        Object NOTNULL77_tree=null;
        Object IS78_tree=null;
        Object NULL79_tree=null;
        Object NOT80_tree=null;
        Object NULL81_tree=null;
        Object IS82_tree=null;
        Object NOT83_tree=null;
        Object NULL84_tree=null;
        Object IS85_tree=null;
        Object NOT86_tree=null;
        Object NOT88_tree=null;
        Object BETWEEN89_tree=null;
        Object AND90_tree=null;
        Object set91_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_ISNULL=new RewriteRuleTokenStream(adaptor,"token ISNULL");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_NOTNULL=new RewriteRuleTokenStream(adaptor,"token NOTNULL");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_match_op=new RewriteRuleSubtreeStream(adaptor,"rule match_op");
        RewriteRuleSubtreeStream stream_eq_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule eq_subexpr");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:3: ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN LPAREN ( select_stmt )? RPAREN | ( NOT )? EQUALS LPAREN ( select_stmt )? RPAREN | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ )
            int alt26=9;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )?
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: ( NOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: NOT
                            {
                            NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr536);  
                            stream_NOT.add(NOT53);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_match_op_in_cond_expr539);
                    match_op54=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op54.getTree());
                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr543);
                    match_expr=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(match_expr.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:41: ( ESCAPE escape_expr= eq_subexpr )?
                    int alt14=2;
                    alt14 = dfa14.predict(input);
                    switch (alt14) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:42: ESCAPE escape_expr= eq_subexpr
                            {
                            ESCAPE55=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr546);  
                            stream_ESCAPE.add(ESCAPE55);

                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr550);
                            escape_expr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_expr.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: match_op, NOT, match_expr, ESCAPE, escape_expr
                    // token labels: 
                    // rule labels: retval, match_expr, escape_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_match_expr=new RewriteRuleSubtreeStream(adaptor,"rule match_expr",match_expr!=null?match_expr.tree:null);
                    RewriteRuleSubtreeStream stream_escape_expr=new RewriteRuleSubtreeStream(adaptor,"rule escape_expr",escape_expr!=null?escape_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:74: -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:77: ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_match_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_match_expr.nextTree());
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:100: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:105: ( ^( ESCAPE $escape_expr) )?
                        if ( stream_ESCAPE.hasNext()||stream_escape_expr.hasNext() ) {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:105: ^( ESCAPE $escape_expr)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_ESCAPE.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_escape_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ESCAPE.reset();
                        stream_escape_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: ( NOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NOT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: NOT
                            {
                            NOT56=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr578);  
                            stream_NOT.add(NOT56);


                            }
                            break;

                    }

                    IN57=(Token)match(input,IN,FOLLOW_IN_in_cond_expr581);  
                    stream_IN.add(IN57);

                    LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr583);  
                    stream_LPAREN.add(LPAREN58);

                    pushFollow(FOLLOW_expr_in_cond_expr585);
                    expr59=expr();

                    state._fsp--;

                    stream_expr.add(expr59.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:25: ( COMMA expr )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:26: COMMA expr
                    	    {
                    	    COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_cond_expr588);  
                    	    stream_COMMA.add(COMMA60);

                    	    pushFollow(FOLLOW_expr_in_cond_expr590);
                    	    expr61=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr594);  
                    stream_RPAREN.add(RPAREN62);



                    // AST REWRITE
                    // elements: expr, NOT, IN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:46: -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:49: ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_VALUES, "IN_VALUES"), root_1);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:61: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:66: ^( IN ( expr )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: ( NOT )? IN (database_name= id DOT )? table_name= id
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: ( NOT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: NOT
                            {
                            NOT63=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr616);  
                            stream_NOT.add(NOT63);


                            }
                            break;

                    }

                    IN64=(Token)match(input,IN,FOLLOW_IN_in_cond_expr619);  
                    stream_IN.add(IN64);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:13: (database_name= id DOT )?
                    int alt18=2;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:14: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_cond_expr624);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT65=(Token)match(input,DOT,FOLLOW_DOT_in_cond_expr626);  
                            stream_DOT.add(DOT65);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_cond_expr632);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());


                    // AST REWRITE
                    // elements: database_name, IN, NOT, table_name
                    // token labels: 
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:51: -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:54: ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_TABLE, "IN_TABLE"), root_1);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:65: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:70: ^( IN ^( $table_name ( $database_name)? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:75: ^( $table_name ( $database_name)? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:89: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_3, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: ( NOT )? IN LPAREN ( select_stmt )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: ( NOT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NOT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: NOT
                            {
                            NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr660); 
                            NOT66_tree = (Object)adaptor.create(NOT66);
                            adaptor.addChild(root_0, NOT66_tree);


                            }
                            break;

                    }

                    IN67=(Token)match(input,IN,FOLLOW_IN_in_cond_expr663); 
                    IN67_tree = (Object)adaptor.create(IN67);
                    root_0 = (Object)adaptor.becomeRoot(IN67_tree, root_0);

                    LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr666); 
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:22: ( select_stmt )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==SELECT) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:22: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_cond_expr669);
                            select_stmt69=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt69.getTree());

                            }
                            break;

                    }

                    RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr672); 

                    }
                    break;
                case 5 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: ( NOT )? EQUALS LPAREN ( select_stmt )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: ( NOT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NOT) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: NOT
                            {
                            NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr679); 
                            NOT71_tree = (Object)adaptor.create(NOT71);
                            adaptor.addChild(root_0, NOT71_tree);


                            }
                            break;

                    }

                    EQUALS72=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond_expr682); 
                    EQUALS72_tree = (Object)adaptor.create(EQUALS72);
                    root_0 = (Object)adaptor.becomeRoot(EQUALS72_tree, root_0);

                    LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr685); 
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:26: ( select_stmt )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==SELECT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:26: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_cond_expr688);
                            select_stmt74=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt74.getTree());

                            }
                            break;

                    }

                    RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr691); 

                    }
                    break;
                case 6 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    int alt23=5;
                    switch ( input.LA(1) ) {
                    case ISNULL:
                        {
                        alt23=1;
                        }
                        break;
                    case NOTNULL:
                        {
                        alt23=2;
                        }
                        break;
                    case IS:
                        {
                        int LA23_3 = input.LA(2);

                        if ( (LA23_3==NULL) ) {
                            alt23=3;
                        }
                        else if ( (LA23_3==NOT) ) {
                            alt23=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT:
                        {
                        alt23=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:6: ISNULL
                            {
                            ISNULL76=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr699);  
                            stream_ISNULL.add(ISNULL76);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:26: NOTNULL
                            {
                            NOTNULL77=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr707);  
                            stream_NOTNULL.add(NOTNULL77);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:48: IS NULL
                            {
                            IS78=(Token)match(input,IS,FOLLOW_IS_in_cond_expr715);  
                            stream_IS.add(IS78);

                            NULL79=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr717);  
                            stream_NULL.add(NULL79);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:69: NOT NULL
                            {
                            NOT80=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr725);  
                            stream_NOT.add(NOT80);

                            NULL81=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr727);  
                            stream_NULL.add(NULL81);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:78: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 5 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:92: IS NOT NULL
                            {
                            IS82=(Token)match(input,IS,FOLLOW_IS_in_cond_expr735);  
                            stream_IS.add(IS82);

                            NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr737);  
                            stream_NOT.add(NOT83);

                            NULL84=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr739);  
                            stream_NULL.add(NULL84);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:104: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:195:5: IS NOT eq_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    IS85=(Token)match(input,IS,FOLLOW_IS_in_cond_expr750); 
                    IS85_tree = (Object)adaptor.create(IS85);
                    adaptor.addChild(root_0, IS85_tree);

                    NOT86=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr752); 
                    NOT86_tree = (Object)adaptor.create(NOT86);
                    root_0 = (Object)adaptor.becomeRoot(NOT86_tree, root_0);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr755);
                    eq_subexpr87=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr87.getTree());

                    }
                    break;
                case 8 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: ( NOT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NOT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: NOT
                            {
                            NOT88=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr761);  
                            stream_NOT.add(NOT88);


                            }
                            break;

                    }

                    BETWEEN89=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr764);  
                    stream_BETWEEN.add(BETWEEN89);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr768);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND90=(Token)match(input,AND,FOLLOW_AND_in_cond_expr770);  
                    stream_AND.add(AND90);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr774);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());


                    // AST REWRITE
                    // elements: NOT, AND, e2, BETWEEN, e1
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:50: -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:53: ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:63: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:68: ^( AND $e1 $e2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_e1.nextTree());
                        adaptor.addChild(root_2, stream_e2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:6: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
                    	    {
                    	    set91=(Token)input.LT(1);
                    	    set91=(Token)input.LT(1);
                    	    if ( input.LA(1)==EQUALS||(input.LA(1)>=EQUALS2 && input.LA(1)<=NOT_EQUALS2) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set91), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr817);
                    	    eq_subexpr92=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr92.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cond_expr"

    public static class match_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_op"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:200:1: match_op : ( LIKE | GLOB | REGEXP | MATCH );
    public final SqlParser.match_op_return match_op() throws RecognitionException {
        SqlParser.match_op_return retval = new SqlParser.match_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:200:9: ( LIKE | GLOB | REGEXP | MATCH )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();

            set93=(Token)input.LT(1);
            if ( (input.LA(1)>=LIKE && input.LA(1)<=MATCH) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set93));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "match_op"

    public static class eq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eq_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set95=null;
        SqlParser.neq_subexpr_return neq_subexpr94 = null;

        SqlParser.neq_subexpr_return neq_subexpr96 = null;


        Object set95_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr850);
            neq_subexpr94=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr94.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
            	    {
            	    set95=(Token)input.LT(1);
            	    set95=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER_OR_EQ) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set95), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr870);
            	    neq_subexpr96=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr96.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eq_subexpr"

    public static class neq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "neq_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set98=null;
        SqlParser.bit_subexpr_return bit_subexpr97 = null;

        SqlParser.bit_subexpr_return bit_subexpr99 = null;


        Object set98_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr879);
            bit_subexpr97=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr97.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
            	    {
            	    set98=(Token)input.LT(1);
            	    set98=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFT_LEFT && input.LA(1)<=PIPE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set98), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr899);
            	    bit_subexpr99=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr99.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "neq_subexpr"

    public static class bit_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bit_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set101=null;
        SqlParser.add_subexpr_return add_subexpr100 = null;

        SqlParser.add_subexpr_return add_subexpr102 = null;


        Object set101_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr908);
            add_subexpr100=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr100.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:27: ( PLUS | MINUS ) add_subexpr
            	    {
            	    set101=(Token)input.LT(1);
            	    set101=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set101), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr920);
            	    add_subexpr102=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr102.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bit_subexpr"

    public static class add_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set104=null;
        SqlParser.mul_subexpr_return mul_subexpr103 = null;

        SqlParser.mul_subexpr_return mul_subexpr105 = null;


        Object set104_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr929);
            mul_subexpr103=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr103.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
            	    {
            	    set104=(Token)input.LT(1);
            	    set104=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ASTERISK && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set104), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr945);
            	    mul_subexpr105=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr105.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_subexpr"

    public static class mul_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE107=null;
        SqlParser.con_subexpr_return con_subexpr106 = null;

        SqlParser.con_subexpr_return con_subexpr108 = null;


        Object DOUBLE_PIPE107_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr954);
            con_subexpr106=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr106.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:26: ( DOUBLE_PIPE con_subexpr )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE107=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr957); 
            	    DOUBLE_PIPE107_tree = (Object)adaptor.create(DOUBLE_PIPE107);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE107_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr960);
            	    con_subexpr108=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr108.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mul_subexpr"

    public static class con_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "con_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.unary_subexpr_return unary_subexpr109 = null;

        SqlParser.unary_op_return unary_op110 = null;

        SqlParser.unary_subexpr_return unary_subexpr111 = null;


        RewriteRuleSubtreeStream stream_unary_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule unary_subexpr");
        RewriteRuleSubtreeStream stream_unary_op=new RewriteRuleSubtreeStream(adaptor,"rule unary_op");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:12: ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:14: unary_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr969);
                    unary_subexpr109=unary_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_subexpr109.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:30: unary_op unary_subexpr
                    {
                    pushFollow(FOLLOW_unary_op_in_con_subexpr973);
                    unary_op110=unary_op();

                    state._fsp--;

                    stream_unary_op.add(unary_op110.getTree());
                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr975);
                    unary_subexpr111=unary_subexpr();

                    state._fsp--;

                    stream_unary_subexpr.add(unary_subexpr111.getTree());


                    // AST REWRITE
                    // elements: unary_op, unary_subexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:53: -> ^( unary_op unary_subexpr )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:56: ^( unary_op unary_subexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_unary_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unary_subexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "con_subexpr"

    public static class unary_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_op"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:214:1: unary_op : ( PLUS | MINUS | TILDA | NOT );
    public final SqlParser.unary_op_return unary_op() throws RecognitionException {
        SqlParser.unary_op_return retval = new SqlParser.unary_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set112=null;

        Object set112_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:214:9: ( PLUS | MINUS | TILDA | NOT )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();

            set112=(Token)input.LT(1);
            if ( input.LA(1)==NOT||(input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==TILDA ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set112));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_op"

    public static class unary_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_subexpr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
    public final SqlParser.unary_subexpr_return unary_subexpr() throws RecognitionException {
        SqlParser.unary_subexpr_return retval = new SqlParser.unary_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE114=null;
        SqlParser.atom_expr_return atom_expr113 = null;


        Object collation_name_tree=null;
        Object COLLATE114_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr1009);
            atom_expr113=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr113.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:26: ( COLLATE collation_name= ID )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:27: COLLATE collation_name= ID
                    {
                    COLLATE114=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr1012); 
                    COLLATE114_tree = (Object)adaptor.create(COLLATE114);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE114_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr1017); 
                    collation_name_tree = (Object)adaptor.create(collation_name);
                    adaptor.addChild(root_0, collation_name_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_subexpr"

    public static class atom_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_expr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:218:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token name=null;
        Token DOT117=null;
        Token DOT118=null;
        Token LPAREN119=null;
        Token DISTINCT120=null;
        Token COMMA121=null;
        Token ASTERISK122=null;
        Token RPAREN123=null;
        Token LPAREN124=null;
        Token RPAREN126=null;
        Token CAST127=null;
        Token LPAREN128=null;
        Token AS130=null;
        Token RPAREN132=null;
        Token CASE133=null;
        Token ELSE135=null;
        Token END136=null;
        List list_args=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return case_expr = null;

        SqlParser.expr_return else_expr = null;

        SqlParser.literal_value_return literal_value115 = null;

        SqlParser.bind_parameter_return bind_parameter116 = null;

        SqlParser.expr_return expr125 = null;

        SqlParser.expr_return expr129 = null;

        SqlParser.type_name_return type_name131 = null;

        SqlParser.when_expr_return when_expr134 = null;

        SqlParser.raise_function_return raise_function137 = null;

        SqlParser.expr_return args = null;
         args = null;
        Object column_name_tree=null;
        Object name_tree=null;
        Object DOT117_tree=null;
        Object DOT118_tree=null;
        Object LPAREN119_tree=null;
        Object DISTINCT120_tree=null;
        Object COMMA121_tree=null;
        Object ASTERISK122_tree=null;
        Object RPAREN123_tree=null;
        Object LPAREN124_tree=null;
        Object RPAREN126_tree=null;
        Object CAST127_tree=null;
        Object LPAREN128_tree=null;
        Object AS130_tree=null;
        Object RPAREN132_tree=null;
        Object CASE133_tree=null;
        Object ELSE135_tree=null;
        Object END136_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_when_expr=new RewriteRuleSubtreeStream(adaptor,"rule when_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:219:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function )
            int alt42=8;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:219:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr1029);
                    literal_value115=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value115.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:220:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr1035);
                    bind_parameter116=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter116.getTree());

                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt35=2;
                    alt35 = dfa35.predict(input);
                    switch (alt35) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:6: (database_name= id DOT )?
                            int alt34=2;
                            alt34 = dfa34.predict(input);
                            switch (alt34) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr1045);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT117=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr1047);  
                                    stream_DOT.add(DOT117);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr1053);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT118=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr1055);  
                            stream_DOT.add(DOT118);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr1061);  
                    stream_ID.add(column_name);



                    // AST REWRITE
                    // elements: database_name, column_name, table_name
                    // token labels: column_name
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_name=new RewriteRuleTokenStream(adaptor,"token column_name",column_name);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:117: ( $database_name)?
                            if ( stream_database_name.hasNext() ) {
                                adaptor.addChild(root_3, stream_database_name.nextTree());

                            }
                            stream_database_name.reset();

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_database_name.reset();
                        stream_table_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:5: name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr1090);  
                    stream_ID.add(name);

                    LPAREN119=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1092);  
                    stream_LPAREN.add(LPAREN119);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt38=3;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: ( DISTINCT )?
                            int alt36=2;
                            alt36 = dfa36.predict(input);
                            switch (alt36) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: DISTINCT
                                    {
                                    DISTINCT120=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr1095);  
                                    stream_DISTINCT.add(DISTINCT120);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr1100);
                            args=expr();

                            state._fsp--;

                            stream_expr.add(args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:42: ( COMMA args+= expr )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==COMMA) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:43: COMMA args+= expr
                            	    {
                            	    COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr1103);  
                            	    stream_COMMA.add(COMMA121);

                            	    pushFollow(FOLLOW_expr_in_atom_expr1107);
                            	    args=expr();

                            	    state._fsp--;

                            	    stream_expr.add(args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:64: ASTERISK
                            {
                            ASTERISK122=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr1113);  
                            stream_ASTERISK.add(ASTERISK122);


                            }
                            break;

                    }

                    RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1117);  
                    stream_RPAREN.add(RPAREN123);



                    // AST REWRITE
                    // elements: DISTINCT, name, ASTERISK, args
                    // token labels: name
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: args
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
                    root_0 = (Object)adaptor.nil();
                    // 222:82: -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:85: ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_EXPRESSION, "FUNCTION_EXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:113: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:123: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:130: ( ASTERISK )?
                        if ( stream_ASTERISK.hasNext() ) {
                            adaptor.addChild(root_1, stream_ASTERISK.nextNode());

                        }
                        stream_ASTERISK.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:223:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN124=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1142); 
                    pushFollow(FOLLOW_expr_in_atom_expr1145);
                    expr125=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr125.getTree());
                    RPAREN126=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1147); 

                    }
                    break;
                case 6 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:224:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST127=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr1154); 
                    CAST127_tree = (Object)adaptor.create(CAST127);
                    root_0 = (Object)adaptor.becomeRoot(CAST127_tree, root_0);

                    LPAREN128=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1157); 
                    pushFollow(FOLLOW_expr_in_atom_expr1160);
                    expr129=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr129.getTree());
                    AS130=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1162); 
                    pushFollow(FOLLOW_type_name_in_atom_expr1165);
                    type_name131=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name131.getTree());
                    RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1167); 

                    }
                    break;
                case 7 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:5: CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END
                    {
                    CASE133=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1176);  
                    stream_CASE.add(CASE133);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:10: (case_expr= expr )?
                    int alt39=2;
                    alt39 = dfa39.predict(input);
                    switch (alt39) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:11: case_expr= expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1181);
                            case_expr=expr();

                            state._fsp--;

                            stream_expr.add(case_expr.getTree());

                            }
                            break;

                    }

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:28: ( when_expr )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==WHEN) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:28: when_expr
                    	    {
                    	    pushFollow(FOLLOW_when_expr_in_atom_expr1185);
                    	    when_expr134=when_expr();

                    	    state._fsp--;

                    	    stream_when_expr.add(when_expr134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:39: ( ELSE else_expr= expr )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==ELSE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:40: ELSE else_expr= expr
                            {
                            ELSE135=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1189);  
                            stream_ELSE.add(ELSE135);

                            pushFollow(FOLLOW_expr_in_atom_expr1193);
                            else_expr=expr();

                            state._fsp--;

                            stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }

                    END136=(Token)match(input,END,FOLLOW_END_in_atom_expr1197);  
                    stream_END.add(END136);



                    // AST REWRITE
                    // elements: CASE, case_expr, when_expr, else_expr
                    // token labels: 
                    // rule labels: retval, case_expr, else_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr",case_expr!=null?case_expr.tree:null);
                    RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr",else_expr!=null?else_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:66: -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:69: ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:76: ( $case_expr)?
                        if ( stream_case_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_case_expr.nextTree());

                        }
                        stream_case_expr.reset();
                        if ( !(stream_when_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_when_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_when_expr.nextTree());

                        }
                        stream_when_expr.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:99: ( $else_expr)?
                        if ( stream_else_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_else_expr.nextTree());

                        }
                        stream_else_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:228:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr1220);
                    raise_function137=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function137.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom_expr"

    public static class when_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "when_expr"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:1: when_expr : WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) ;
    public final SqlParser.when_expr_return when_expr() throws RecognitionException {
        SqlParser.when_expr_return retval = new SqlParser.when_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN138=null;
        Token THEN139=null;
        SqlParser.expr_return e1 = null;

        SqlParser.expr_return e2 = null;


        Object WHEN138_tree=null;
        Object THEN139_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:10: ( WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:12: WHEN e1= expr THEN e2= expr
            {
            WHEN138=(Token)match(input,WHEN,FOLLOW_WHEN_in_when_expr1230);  
            stream_WHEN.add(WHEN138);

            pushFollow(FOLLOW_expr_in_when_expr1234);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            THEN139=(Token)match(input,THEN,FOLLOW_THEN_in_when_expr1236);  
            stream_THEN.add(THEN139);

            pushFollow(FOLLOW_expr_in_when_expr1240);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());


            // AST REWRITE
            // elements: WHEN, e2, e1
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 231:38: -> ^( WHEN $e1 $e2)
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:41: ^( WHEN $e1 $e2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_WHEN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());
                adaptor.addChild(root_1, stream_e2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "when_expr"

    public static class literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal_value"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:233:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER140=null;
        Token FLOAT141=null;
        Token STRING142=null;
        Token BLOB143=null;
        Token NULL144=null;
        Token CURRENT_TIME145=null;
        Token CURRENT_DATE146=null;
        Token CURRENT_TIMESTAMP147=null;

        Object INTEGER140_tree=null;
        Object FLOAT141_tree=null;
        Object STRING142_tree=null;
        Object BLOB143_tree=null;
        Object NULL144_tree=null;
        Object CURRENT_TIME145_tree=null;
        Object CURRENT_DATE146_tree=null;
        Object CURRENT_TIMESTAMP147_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
            int alt43=8;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt43=1;
                }
                break;
            case FLOAT:
                {
                alt43=2;
                }
                break;
            case STRING:
                {
                alt43=3;
                }
                break;
            case BLOB:
                {
                alt43=4;
                }
                break;
            case NULL:
                {
                alt43=5;
                }
                break;
            case CURRENT_TIME:
                {
                alt43=6;
                }
                break;
            case CURRENT_DATE:
                {
                alt43=7;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt43=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:5: INTEGER
                    {
                    INTEGER140=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1262);  
                    stream_INTEGER.add(INTEGER140);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:16: ^( INTEGER_LITERAL INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INTEGER_LITERAL, "INTEGER_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_INTEGER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:235:5: FLOAT
                    {
                    FLOAT141=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1276);  
                    stream_FLOAT.add(FLOAT141);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:235:14: ^( FLOAT_LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:236:5: STRING
                    {
                    STRING142=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1290);  
                    stream_STRING.add(STRING142);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:12: -> ^( STRING_LITERAL STRING )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:236:15: ^( STRING_LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRING_LITERAL, "STRING_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:237:5: BLOB
                    {
                    BLOB143=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1304);  
                    stream_BLOB.add(BLOB143);



                    // AST REWRITE
                    // elements: BLOB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:237:13: ^( BLOB_LITERAL BLOB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOB_LITERAL, "BLOB_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_BLOB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:238:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL144=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1318); 
                    NULL144_tree = (Object)adaptor.create(NULL144);
                    adaptor.addChild(root_0, NULL144_tree);


                    }
                    break;
                case 6 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:239:5: CURRENT_TIME
                    {
                    CURRENT_TIME145=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1324);  
                    stream_CURRENT_TIME.add(CURRENT_TIME145);



                    // AST REWRITE
                    // elements: CURRENT_TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:239:21: ^( FUNCTION_LITERAL CURRENT_TIME )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_CURRENT_TIME.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:240:5: CURRENT_DATE
                    {
                    CURRENT_DATE146=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1338);  
                    stream_CURRENT_DATE.add(CURRENT_DATE146);



                    // AST REWRITE
                    // elements: CURRENT_DATE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:240:21: ^( FUNCTION_LITERAL CURRENT_DATE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_CURRENT_DATE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:241:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP147=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1352);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP147);



                    // AST REWRITE
                    // elements: CURRENT_TIMESTAMP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:241:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_CURRENT_TIMESTAMP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal_value"

    public static class bind_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bind_parameter"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:244:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token position=null;
        Token QUESTION148=null;
        Token QUESTION149=null;
        Token COLON150=null;
        Token AT151=null;
        SqlParser.id_return name = null;


        Object position_tree=null;
        Object QUESTION148_tree=null;
        Object QUESTION149_tree=null;
        Object COLON150_tree=null;
        Object AT151_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:245:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt44=4;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:245:5: QUESTION
                    {
                    QUESTION148=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1373);  
                    stream_QUESTION.add(QUESTION148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:246:5: QUESTION position= INTEGER
                    {
                    QUESTION149=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1383);  
                    stream_QUESTION.add(QUESTION149);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1387);  
                    stream_INTEGER.add(position);



                    // AST REWRITE
                    // elements: position
                    // token labels: position
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_position=new RewriteRuleTokenStream(adaptor,"token position",position);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:31: -> ^( BIND $position)
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:246:34: ^( BIND $position)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BIND, "BIND"), root_1);

                        adaptor.addChild(root_1, stream_position.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:247:5: COLON name= id
                    {
                    COLON150=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1402);  
                    stream_COLON.add(COLON150);

                    pushFollow(FOLLOW_id_in_bind_parameter1406);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());


                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:19: -> ^( BIND_NAME $name)
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:247:22: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BIND_NAME, "BIND_NAME"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:248:5: AT name= id
                    {
                    AT151=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1421);  
                    stream_AT.add(AT151);

                    pushFollow(FOLLOW_id_in_bind_parameter1425);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());


                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:16: -> ^( BIND_NAME $name)
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:248:19: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BIND_NAME, "BIND_NAME"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bind_parameter"

    public static class raise_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_function"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE152=null;
        Token LPAREN153=null;
        Token IGNORE154=null;
        Token set155=null;
        Token COMMA156=null;
        Token RPAREN157=null;

        Object error_message_tree=null;
        Object RAISE152_tree=null;
        Object LPAREN153_tree=null;
        Object IGNORE154_tree=null;
        Object set155_tree=null;
        Object COMMA156_tree=null;
        Object RPAREN157_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE152=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1446); 
            RAISE152_tree = (Object)adaptor.create(RAISE152);
            root_0 = (Object)adaptor.becomeRoot(RAISE152_tree, root_0);

            LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1449); 
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==IGNORE) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=ROLLBACK && LA45_0<=FAIL)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:33: IGNORE
                    {
                    IGNORE154=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1453); 
                    IGNORE154_tree = (Object)adaptor.create(IGNORE154);
                    adaptor.addChild(root_0, IGNORE154_tree);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set155=(Token)input.LT(1);
                    if ( (input.LA(1)>=ROLLBACK && input.LA(1)<=FAIL) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set155));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1469); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1474); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN157=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1477); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "raise_function"

    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_name"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN158=null;
        Token COMMA159=null;
        Token RPAREN160=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 = null;

        SqlParser.signed_number_return size2 = null;


        Object LPAREN158_tree=null;
        Object COMMA159_tree=null;
        Object RPAREN160_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:17: (names+= ID )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1487);  
            	    stream_ID.add(names);

            	    if (list_names==null) list_names=new ArrayList();
            	    list_names.add(names);


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN158=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1491);  
                    stream_LPAREN.add(LPAREN158);

                    pushFollow(FOLLOW_signed_number_in_type_name1495);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:51: ( COMMA size2= signed_number )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==COMMA) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:52: COMMA size2= signed_number
                            {
                            COMMA159=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1498);  
                            stream_COMMA.add(COMMA159);

                            pushFollow(FOLLOW_signed_number_in_type_name1502);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN160=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1506);  
                    stream_RPAREN.add(RPAREN160);


                    }
                    break;

            }



            // AST REWRITE
            // elements: names, size2, size1
            // token labels: 
            // rule labels: retval, size2, size1
            // token list labels: names
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_names=new RewriteRuleTokenStream(adaptor,"token names", list_names);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_size2=new RewriteRuleSubtreeStream(adaptor,"rule size2",size2!=null?size2.tree:null);
            RewriteRuleSubtreeStream stream_size1=new RewriteRuleSubtreeStream(adaptor,"rule size1",size1!=null?size1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 256:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:33: ( $size2)?
                if ( stream_size2.hasNext() ) {
                    adaptor.addChild(root_2, stream_size2.nextTree());

                }
                stream_size2.reset();

                adaptor.addChild(root_1, root_2);
                }
                if ( !(stream_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_names.hasNext() ) {
                    adaptor.addChild(root_1, stream_names.nextNode());

                }
                stream_names.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_name"

    public static class signed_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signed_number"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set161=null;
        Token set162=null;

        Object set161_tree=null;
        Object set162_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:16: ( PLUS | MINUS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=PLUS && LA49_0<=MINUS)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set161=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set161));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            set162=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=FLOAT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set162));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signed_number"

    public static class pragma_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? ) ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA163=null;
        Token DOT164=null;
        Token EQUALS165=null;
        Token LPAREN167=null;
        Token RPAREN169=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return pragma_name = null;

        SqlParser.pragma_value_return pragma_value166 = null;

        SqlParser.pragma_value_return pragma_value168 = null;


        Object PRAGMA163_tree=null;
        Object DOT164_tree=null;
        Object EQUALS165_tree=null;
        Object LPAREN167_tree=null;
        Object RPAREN169_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_PRAGMA=new RewriteRuleTokenStream(adaptor,"token PRAGMA");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_pragma_value=new RewriteRuleSubtreeStream(adaptor,"rule pragma_value");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            PRAGMA163=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1560);  
            stream_PRAGMA.add(PRAGMA163);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:21: (database_name= id DOT )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1565);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT164=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1567);  
                    stream_DOT.add(DOT164);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1573);
            pragma_name=id();

            state._fsp--;

            stream_id.add(pragma_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==EQUALS) ) {
                alt51=1;
            }
            else if ( (LA51_0==LPAREN) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:61: EQUALS pragma_value
                    {
                    EQUALS165=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1576);  
                    stream_EQUALS.add(EQUALS165);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1578);
                    pragma_value166=pragma_value();

                    state._fsp--;

                    stream_pragma_value.add(pragma_value166.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN167=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1582);  
                    stream_LPAREN.add(LPAREN167);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1584);
                    pragma_value168=pragma_value();

                    state._fsp--;

                    stream_pragma_value.add(pragma_value168.getTree());
                    RPAREN169=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1586);  
                    stream_RPAREN.add(RPAREN169);


                    }
                    break;

            }



            // AST REWRITE
            // elements: database_name, pragma_name, PRAGMA, pragma_value
            // token labels: 
            // rule labels: database_name, retval, pragma_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pragma_name=new RewriteRuleSubtreeStream(adaptor,"rule pragma_name",pragma_name!=null?pragma_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 262:1: -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:4: ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRAGMA.nextNode(), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:13: ^( $pragma_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_pragma_name.nextNode(), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:28: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:45: ( pragma_value )?
                if ( stream_pragma_value.hasNext() ) {
                    adaptor.addChild(root_1, stream_pragma_value.nextTree());

                }
                stream_pragma_value.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma_stmt"

    public static class pragma_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma_value"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:264:1: pragma_value : ( signed_number -> ^( FLOAT_LITERAL signed_number ) | ID -> ^( ID_LITERAL ID ) | STRING -> ^( STRING_LITERAL STRING ) );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID171=null;
        Token STRING172=null;
        SqlParser.signed_number_return signed_number170 = null;


        Object ID171_tree=null;
        Object STRING172_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:2: ( signed_number -> ^( FLOAT_LITERAL signed_number ) | ID -> ^( ID_LITERAL ID ) | STRING -> ^( STRING_LITERAL STRING ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
            case INTEGER:
            case FLOAT:
                {
                alt52=1;
                }
                break;
            case ID:
                {
                alt52=2;
                }
                break;
            case STRING:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:4: signed_number
                    {
                    pushFollow(FOLLOW_signed_number_in_pragma_value1615);
                    signed_number170=signed_number();

                    state._fsp--;

                    stream_signed_number.add(signed_number170.getTree());


                    // AST REWRITE
                    // elements: signed_number
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 265:18: -> ^( FLOAT_LITERAL signed_number )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:21: ^( FLOAT_LITERAL signed_number )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_signed_number.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:266:4: ID
                    {
                    ID171=(Token)match(input,ID,FOLLOW_ID_in_pragma_value1628);  
                    stream_ID.add(ID171);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:7: -> ^( ID_LITERAL ID )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:266:10: ^( ID_LITERAL ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LITERAL, "ID_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:267:4: STRING
                    {
                    STRING172=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1641);  
                    stream_STRING.add(STRING172);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 267:11: -> ^( STRING_LITERAL STRING )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:267:14: ^( STRING_LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRING_LITERAL, "STRING_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma_value"

    public static class attach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attach_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:1: attach_stmt : ATTACH ( DATABASE )? filename= id AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ATTACH173=null;
        Token DATABASE174=null;
        Token AS175=null;
        SqlParser.id_return filename = null;

        SqlParser.id_return database_name = null;


        Object ATTACH173_tree=null;
        Object DATABASE174_tree=null;
        Object AS175_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:12: ( ATTACH ( DATABASE )? filename= id AS database_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:14: ATTACH ( DATABASE )? filename= id AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH173=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1659); 
            ATTACH173_tree = (Object)adaptor.create(ATTACH173);
            adaptor.addChild(root_0, ATTACH173_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:21: ( DATABASE )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:22: DATABASE
                    {
                    DATABASE174=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1662); 
                    DATABASE174_tree = (Object)adaptor.create(DATABASE174);
                    adaptor.addChild(root_0, DATABASE174_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_attach_stmt1668);
            filename=id();

            state._fsp--;

            adaptor.addChild(root_0, filename.getTree());
            AS175=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1670); 
            AS175_tree = (Object)adaptor.create(AS175);
            adaptor.addChild(root_0, AS175_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1674);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attach_stmt"

    public static class detach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "detach_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DETACH176=null;
        Token DATABASE177=null;
        SqlParser.id_return database_name = null;


        Object DETACH176_tree=null;
        Object DATABASE177_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:12: ( DETACH ( DATABASE )? database_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH176=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1682); 
            DETACH176_tree = (Object)adaptor.create(DETACH176);
            adaptor.addChild(root_0, DETACH176_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:21: ( DATABASE )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==DATABASE) ) {
                int LA54_1 = input.LA(2);

                if ( ((LA54_1>=EXPLAIN && LA54_1<=PLAN)||(LA54_1>=INDEXED && LA54_1<=BY)||(LA54_1>=OR && LA54_1<=ESCAPE)||(LA54_1>=IS && LA54_1<=BETWEEN)||(LA54_1>=COLLATE && LA54_1<=THEN)||LA54_1==STRING||(LA54_1>=CURRENT_TIME && LA54_1<=CURRENT_TIMESTAMP)||(LA54_1>=RAISE && LA54_1<=ROW)) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:22: DATABASE
                    {
                    DATABASE177=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1685); 
                    DATABASE177_tree = (Object)adaptor.create(DATABASE177);
                    adaptor.addChild(root_0, DATABASE177_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1691);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "detach_stmt"

    public static class analyze_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "analyze_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE178=null;
        Token DOT179=null;
        SqlParser.id_return database_or_table_name = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object ANALYZE178_tree=null;
        Object DOT179_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE178=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1699); 
            ANALYZE178_tree = (Object)adaptor.create(ANALYZE178);
            adaptor.addChild(root_0, ANALYZE178_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
            int alt55=3;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1704);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1710);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT179=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1712); 
                    DOT179_tree = (Object)adaptor.create(DOT179);
                    adaptor.addChild(root_0, DOT179_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1716);
                    table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "analyze_stmt"

    public static class reindex_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reindex_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REINDEX180=null;
        Token DOT181=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return collation_or_table_or_index_name = null;


        Object REINDEX180_tree=null;
        Object DOT181_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX180=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1726); 
            REINDEX180_tree = (Object)adaptor.create(REINDEX180);
            adaptor.addChild(root_0, REINDEX180_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:23: (database_name= id DOT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ID||LA56_0==STRING) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==DOT) ) {
                    alt56=1;
                }
            }
            else if ( ((LA56_0>=EXPLAIN && LA56_0<=PLAN)||(LA56_0>=INDEXED && LA56_0<=BY)||(LA56_0>=OR && LA56_0<=ESCAPE)||(LA56_0>=IS && LA56_0<=BETWEEN)||LA56_0==COLLATE||(LA56_0>=DISTINCT && LA56_0<=THEN)||(LA56_0>=CURRENT_TIME && LA56_0<=CURRENT_TIMESTAMP)||(LA56_0>=RAISE && LA56_0<=ROW)) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==DOT) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1731);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT181=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1733); 
                    DOT181_tree = (Object)adaptor.create(DOT181);
                    adaptor.addChild(root_0, DOT181_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1739);
            collation_or_table_or_index_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_or_table_or_index_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reindex_stmt"

    public static class vacuum_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vacuum_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:283:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM182=null;

        Object VACUUM182_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:283:12: ( VACUUM )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:283:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM182=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1747); 
            VACUUM182_tree = (Object)adaptor.create(VACUUM182);
            adaptor.addChild(root_0, VACUUM182_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vacuum_stmt"

    public static class operation_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_conflict_clause"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:289:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR183=null;
        Token set184=null;

        Object OR183_tree=null;
        Object set184_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:289:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:289:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR183=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1758); 
            OR183_tree = (Object)adaptor.create(OR183);
            adaptor.addChild(root_0, OR183_tree);

            set184=(Token)input.LT(1);
            if ( (input.LA(1)>=IGNORE && input.LA(1)<=FAIL)||input.LA(1)==REPLACE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set184));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation_conflict_clause"

    public static class ordering_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordering_term"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC186=null;
        Token DESC187=null;
        SqlParser.expr_return expr185 = null;


        Object ASC186_tree=null;
        Object DESC187_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1785);
            expr185=expr();

            state._fsp--;

            stream_expr.add(expr185.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:82: ( ASC | DESC )?
            int alt57=3;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:83: ASC
                    {
                    ASC186=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1790);  
                    stream_ASC.add(ASC186);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:89: DESC
                    {
                    DESC187=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1794);  
                    stream_DESC.add(DESC187);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expr, DESC, ASC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:292:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:292:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:292:27: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, stream_DESC.nextNode());

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ordering_term"

    public static class operation_limited_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_limited_clause"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER188=null;
        Token BY189=null;
        Token COMMA191=null;
        Token LIMIT193=null;
        Token set194=null;
        SqlParser.ordering_term_return ordering_term190 = null;

        SqlParser.ordering_term_return ordering_term192 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER188_tree=null;
        Object BY189_tree=null;
        Object COMMA191_tree=null;
        Object LIMIT193_tree=null;
        Object set194_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ORDER) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER188=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1824); 
                    ORDER188_tree = (Object)adaptor.create(ORDER188);
                    adaptor.addChild(root_0, ORDER188_tree);

                    BY189=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1826); 
                    BY189_tree = (Object)adaptor.create(BY189);
                    adaptor.addChild(root_0, BY189_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1828);
                    ordering_term190=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term190.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:27: ( COMMA ordering_term )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==COMMA) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:28: COMMA ordering_term
                    	    {
                    	    COMMA191=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1831); 
                    	    COMMA191_tree = (Object)adaptor.create(COMMA191);
                    	    adaptor.addChild(root_0, COMMA191_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1833);
                    	    ordering_term192=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term192.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT193=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1841); 
            LIMIT193_tree = (Object)adaptor.create(LIMIT193);
            adaptor.addChild(root_0, LIMIT193_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1845); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:296:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COMMA||LA60_0==OFFSET) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:296:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set194=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set194));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1858); 
                    offset_tree = (Object)adaptor.create(offset);
                    adaptor.addChild(root_0, offset_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation_limited_clause"

    public static class select_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER196=null;
        Token BY197=null;
        Token COMMA199=null;
        Token LIMIT201=null;
        Token OFFSET202=null;
        Token COMMA203=null;
        SqlParser.select_list_return select_list195 = null;

        SqlParser.ordering_term_return ordering_term198 = null;

        SqlParser.ordering_term_return ordering_term200 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER196_tree=null;
        Object BY197_tree=null;
        Object COMMA199_tree=null;
        Object LIMIT201_tree=null;
        Object OFFSET202_tree=null;
        Object COMMA203_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1868);
            select_list195=select_list();

            state._fsp--;

            stream_select_list.add(select_list195.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==ORDER) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER196=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1873);  
                    stream_ORDER.add(ORDER196);

                    BY197=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1875);  
                    stream_BY.add(BY197);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1877);
                    ordering_term198=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term198.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:27: ( COMMA ordering_term )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:28: COMMA ordering_term
                    	    {
                    	    COMMA199=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1880);  
                    	    stream_COMMA.add(COMMA199);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1882);
                    	    ordering_term200=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term200.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LIMIT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT201=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1891);  
                    stream_LIMIT.add(LIMIT201);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1895);  
                    stream_INTEGER.add(limit);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==COMMA||LA64_0==OFFSET) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:25: ( OFFSET | COMMA )
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==OFFSET) ) {
                                alt63=1;
                            }
                            else if ( (LA63_0==COMMA) ) {
                                alt63=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 63, 0, input);

                                throw nvae;
                            }
                            switch (alt63) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:26: OFFSET
                                    {
                                    OFFSET202=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1899);  
                                    stream_OFFSET.add(OFFSET202);


                                    }
                                    break;
                                case 2 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:35: COMMA
                                    {
                                    COMMA203=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1903);  
                                    stream_COMMA.add(COMMA203);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1908);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: limit, ordering_term, LIMIT, offset, select_list, ORDER
            // token labels: limit, offset
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleTokenStream stream_offset=new RewriteRuleTokenStream(adaptor,"token offset",offset);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 302:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:302:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:22: ^( ORDER ( ordering_term )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_ORDER.nextNode(), root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ordering_term.reset();
                stream_ORDER.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_limit.hasNext()||stream_LIMIT.hasNext()||stream_offset.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:62: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();
                stream_LIMIT.reset();
                stream_offset.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_stmt"

    public static class select_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_list"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:306:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core204 = null;

        SqlParser.select_op_return select_op205 = null;

        SqlParser.select_core_return select_core206 = null;



        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:306:12: ( select_core ( select_op select_core )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:307:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1953);
            select_core204=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core204.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:307:15: ( select_op select_core )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==UNION||(LA66_0>=INTERSECT && LA66_0<=EXCEPT)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:307:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1956);
            	    select_op205=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op205.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1959);
            	    select_core206=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core206.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_list"

    public static class select_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_op"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION207=null;
        Token ALL208=null;
        Token INTERSECT209=null;
        Token EXCEPT210=null;

        Object UNION207_tree=null;
        Object ALL208_tree=null;
        Object INTERSECT209_tree=null;
        Object EXCEPT210_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
            int alt68=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt68=1;
                }
                break;
            case INTERSECT:
                {
                alt68=2;
                }
                break;
            case EXCEPT:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION207=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1968); 
                    UNION207_tree = (Object)adaptor.create(UNION207);
                    root_0 = (Object)adaptor.becomeRoot(UNION207_tree, root_0);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:19: ( ALL )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==ALL) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:20: ALL
                            {
                            ALL208=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1972); 
                            ALL208_tree = (Object)adaptor.create(ALL208);
                            adaptor.addChild(root_0, ALL208_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT209=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1978); 
                    INTERSECT209_tree = (Object)adaptor.create(INTERSECT209);
                    adaptor.addChild(root_0, INTERSECT209_tree);


                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT210=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1982); 
                    EXCEPT210_tree = (Object)adaptor.create(EXCEPT210);
                    adaptor.addChild(root_0, EXCEPT210_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_op"

    public static class select_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_core"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT211=null;
        Token ALL212=null;
        Token DISTINCT213=null;
        Token COMMA215=null;
        Token FROM217=null;
        Token WHERE219=null;
        Token GROUP220=null;
        Token BY221=null;
        Token COMMA223=null;
        Token HAVING225=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column214 = null;

        SqlParser.result_column_return result_column216 = null;

        SqlParser.join_source_return join_source218 = null;

        SqlParser.ordering_term_return ordering_term222 = null;

        SqlParser.ordering_term_return ordering_term224 = null;


        Object SELECT211_tree=null;
        Object ALL212_tree=null;
        Object DISTINCT213_tree=null;
        Object COMMA215_tree=null;
        Object FROM217_tree=null;
        Object WHERE219_tree=null;
        Object GROUP220_tree=null;
        Object BY221_tree=null;
        Object COMMA223_tree=null;
        Object HAVING225_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        RewriteRuleSubtreeStream stream_result_column=new RewriteRuleSubtreeStream(adaptor,"rule result_column");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_join_source=new RewriteRuleSubtreeStream(adaptor,"rule join_source");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT211=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1991);  
            stream_SELECT.add(SELECT211);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:10: ( ALL | DISTINCT )?
            int alt69=3;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:11: ALL
                    {
                    ALL212=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1994);  
                    stream_ALL.add(ALL212);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:17: DISTINCT
                    {
                    DISTINCT213=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1998);  
                    stream_DISTINCT.add(DISTINCT213);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core2002);
            result_column214=result_column();

            state._fsp--;

            stream_result_column.add(result_column214.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:42: ( COMMA result_column )*
            loop70:
            do {
                int alt70=2;
                alt70 = dfa70.predict(input);
                switch (alt70) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:43: COMMA result_column
            	    {
            	    COMMA215=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core2005);  
            	    stream_COMMA.add(COMMA215);

            	    pushFollow(FOLLOW_result_column_in_select_core2007);
            	    result_column216=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column216.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:65: ( FROM join_source )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:66: FROM join_source
                    {
                    FROM217=(Token)match(input,FROM,FOLLOW_FROM_in_select_core2012);  
                    stream_FROM.add(FROM217);

                    pushFollow(FOLLOW_join_source_in_select_core2014);
                    join_source218=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source218.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:85: ( WHERE where_expr= expr )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:86: WHERE where_expr= expr
                    {
                    WHERE219=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core2019);  
                    stream_WHERE.add(WHERE219);

                    pushFollow(FOLLOW_expr_in_select_core2023);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP220=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core2031);  
                    stream_GROUP.add(GROUP220);

                    BY221=(Token)match(input,BY,FOLLOW_BY_in_select_core2033);  
                    stream_BY.add(BY221);

                    pushFollow(FOLLOW_ordering_term_in_select_core2035);
                    ordering_term222=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term222.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:28: ( COMMA ordering_term )*
                    loop73:
                    do {
                        int alt73=2;
                        alt73 = dfa73.predict(input);
                        switch (alt73) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:29: COMMA ordering_term
                    	    {
                    	    COMMA223=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core2038);  
                    	    stream_COMMA.add(COMMA223);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core2040);
                    	    ordering_term224=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term224.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:51: ( HAVING having_expr= expr )?
                    int alt74=2;
                    alt74 = dfa74.predict(input);
                    switch (alt74) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:52: HAVING having_expr= expr
                            {
                            HAVING225=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core2045);  
                            stream_HAVING.add(HAVING225);

                            pushFollow(FOLLOW_expr_in_select_core2049);
                            having_expr=expr();

                            state._fsp--;

                            stream_expr.add(having_expr.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: having_expr, result_column, GROUP, join_source, DISTINCT, where_expr, FROM, HAVING, WHERE, ordering_term
            // token labels: 
            // rule labels: retval, having_expr, where_expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_having_expr=new RewriteRuleSubtreeStream(adaptor,"rule having_expr",having_expr!=null?having_expr.tree:null);
            RewriteRuleSubtreeStream stream_where_expr=new RewriteRuleSubtreeStream(adaptor,"rule where_expr",where_expr!=null?where_expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:27: ^( COLUMNS ( result_column )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_result_column.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_result_column.hasNext() ) {
                    adaptor.addChild(root_2, stream_result_column.nextTree());

                }
                stream_result_column.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:53: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:74: ( ^( WHERE $where_expr) )?
                if ( stream_where_expr.hasNext()||stream_WHERE.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_expr.reset();
                stream_WHERE.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_having_expr.hasNext()||stream_GROUP.hasNext()||stream_HAVING.hasNext()||stream_ordering_term.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_GROUP.nextNode(), root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:26: ( ^( HAVING $having_expr) )?
                    if ( stream_having_expr.hasNext()||stream_HAVING.hasNext() ) {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:26: ^( HAVING $having_expr)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_HAVING.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_having_expr.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                    }
                    stream_having_expr.reset();
                    stream_HAVING.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_having_expr.reset();
                stream_GROUP.reset();
                stream_HAVING.reset();
                stream_ordering_term.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_core"

    public static class result_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "result_column"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:319:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK226=null;
        Token DOT227=null;
        Token ASTERISK228=null;
        Token AS230=null;
        SqlParser.id_return table_name = null;

        SqlParser.id_return column_alias = null;

        SqlParser.expr_return expr229 = null;


        Object ASTERISK226_tree=null;
        Object DOT227_tree=null;
        Object ASTERISK228_tree=null;
        Object AS230_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:320:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:320:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK226=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column2119); 
                    ASTERISK226_tree = (Object)adaptor.create(ASTERISK226);
                    adaptor.addChild(root_0, ASTERISK226_tree);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column2127);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT227=(Token)match(input,DOT,FOLLOW_DOT_in_result_column2129);  
                    stream_DOT.add(DOT227);

                    ASTERISK228=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column2131);  
                    stream_ASTERISK.add(ASTERISK228);



                    // AST REWRITE
                    // elements: table_name, ASTERISK
                    // token labels: 
                    // rule labels: retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:32: -> ^( ASTERISK $table_name)
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:35: ^( ASTERISK $table_name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ASTERISK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_table_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column2146);
                    expr229=expr();

                    state._fsp--;

                    stream_expr.add(expr229.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:10: ( ( AS )? column_alias= id )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:11: ( AS )? column_alias= id
                            {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:11: ( AS )?
                            int alt76=2;
                            alt76 = dfa76.predict(input);
                            switch (alt76) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:12: AS
                                    {
                                    AS230=(Token)match(input,AS,FOLLOW_AS_in_result_column2150);  
                                    stream_AS.add(AS230);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column2156);
                            column_alias=id();

                            state._fsp--;

                            stream_id.add(column_alias.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: column_alias, expr
                    // token labels: 
                    // rule labels: retval, column_alias
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_alias",column_alias!=null?column_alias.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 322:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:51: ( $column_alias)?
                        if ( stream_column_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_alias.nextTree());

                        }
                        stream_column_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "result_column"

    public static class join_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_source"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source231 = null;

        SqlParser.join_op_return join_op232 = null;

        SqlParser.single_source_return single_source233 = null;

        SqlParser.join_constraint_return join_constraint234 = null;



        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source2177);
            single_source231=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source231.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:28: ( join_op single_source ( join_constraint )? )*
            loop80:
            do {
                int alt80=2;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source2180);
            	    join_op232=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op232.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source2183);
            	    single_source233=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source233.getTree());
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:52: ( join_constraint )?
            	    int alt79=2;
            	    alt79 = dfa79.predict(input);
            	    switch (alt79) {
            	        case 1 :
            	            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source2186);
            	            join_constraint234=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint234.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_source"

    public static class single_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single_source"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT235=null;
        Token AS236=null;
        Token INDEXED237=null;
        Token BY238=null;
        Token NOT239=null;
        Token INDEXED240=null;
        Token LPAREN241=null;
        Token RPAREN243=null;
        Token AS244=null;
        Token LPAREN245=null;
        Token RPAREN247=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.select_stmt_return select_stmt242 = null;

        SqlParser.join_source_return join_source246 = null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT235_tree=null;
        Object AS236_tree=null;
        Object INDEXED237_tree=null;
        Object BY238_tree=null;
        Object NOT239_tree=null;
        Object INDEXED240_tree=null;
        Object LPAREN241_tree=null;
        Object RPAREN243_tree=null;
        Object AS244_tree=null;
        Object LPAREN245_tree=null;
        Object RPAREN247_tree=null;
        RewriteRuleTokenStream stream_INDEXED=new RewriteRuleTokenStream(adaptor,"token INDEXED");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt87=3;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:5: (database_name= id DOT )?
                    int alt81=2;
                    alt81 = dfa81.predict(input);
                    switch (alt81) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source2203);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT235=(Token)match(input,DOT,FOLLOW_DOT_in_single_source2205);  
                            stream_DOT.add(DOT235);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source2211);  
                    stream_ID.add(table_name);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:43: ( ( AS )? table_alias= ID )?
                    int alt83=2;
                    alt83 = dfa83.predict(input);
                    switch (alt83) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:44: ( AS )? table_alias= ID
                            {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:44: ( AS )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==AS) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:45: AS
                                    {
                                    AS236=(Token)match(input,AS,FOLLOW_AS_in_single_source2215);  
                                    stream_AS.add(AS236);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2221);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt84=3;
                    alt84 = dfa84.predict(input);
                    switch (alt84) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:68: INDEXED BY index_name= id
                            {
                            INDEXED237=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2226);  
                            stream_INDEXED.add(INDEXED237);

                            BY238=(Token)match(input,BY,FOLLOW_BY_in_single_source2228);  
                            stream_BY.add(BY238);

                            pushFollow(FOLLOW_id_in_single_source2232);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:95: NOT INDEXED
                            {
                            NOT239=(Token)match(input,NOT,FOLLOW_NOT_in_single_source2236);  
                            stream_NOT.add(NOT239);

                            INDEXED240=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2238);  
                            stream_INDEXED.add(INDEXED240);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: database_name, table_name, index_name, INDEXED, NOT, table_alias
                    // token labels: table_name, table_alias
                    // rule labels: index_name, database_name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_index_name.hasNext()||stream_INDEXED.hasNext()||stream_NOT.hasNext() ) {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_index_name.reset();
                        stream_INDEXED.reset();
                        stream_NOT.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN241=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2279);  
                    stream_LPAREN.add(LPAREN241);

                    pushFollow(FOLLOW_select_stmt_in_single_source2281);
                    select_stmt242=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt242.getTree());
                    RPAREN243=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2283);  
                    stream_RPAREN.add(RPAREN243);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:31: ( ( AS )? table_alias= ID )?
                    int alt86=2;
                    alt86 = dfa86.predict(input);
                    switch (alt86) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:32: ( AS )? table_alias= ID
                            {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:32: ( AS )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==AS) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:33: AS
                                    {
                                    AS244=(Token)match(input,AS,FOLLOW_AS_in_single_source2287);  
                                    stream_AS.add(AS244);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2293);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: table_alias, select_stmt
                    // token labels: table_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:330:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:330:26: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:331:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2315); 
                    pushFollow(FOLLOW_join_source_in_single_source2318);
                    join_source246=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source246.getTree());
                    RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2320); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "single_source"

    public static class join_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_op"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:333:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA248=null;
        Token NATURAL249=null;
        Token LEFT250=null;
        Token OUTER251=null;
        Token INNER252=null;
        Token CROSS253=null;
        Token JOIN254=null;

        Object COMMA248_tree=null;
        Object NATURAL249_tree=null;
        Object LEFT250_tree=null;
        Object OUTER251_tree=null;
        Object INNER252_tree=null;
        Object CROSS253_tree=null;
        Object JOIN254_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==COMMA) ) {
                alt92=1;
            }
            else if ( ((LA92_0>=NATURAL && LA92_0<=JOIN)) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2331); 
                    COMMA248_tree = (Object)adaptor.create(COMMA248);
                    adaptor.addChild(root_0, COMMA248_tree);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:5: ( NATURAL )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NATURAL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:6: NATURAL
                            {
                            NATURAL249=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2338); 
                            NATURAL249_tree = (Object)adaptor.create(NATURAL249);
                            adaptor.addChild(root_0, NATURAL249_tree);


                            }
                            break;

                    }

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt91=3;
                    switch ( input.LA(1) ) {
                    case LEFT:
                    case OUTER:
                    case JOIN:
                        {
                        alt91=1;
                        }
                        break;
                    case INNER:
                        {
                        alt91=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt91=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }

                    switch (alt91) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:17: ( LEFT )? ( OUTER )?
                            {
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:17: ( LEFT )?
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==LEFT) ) {
                                alt89=1;
                            }
                            switch (alt89) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:18: LEFT
                                    {
                                    LEFT250=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2344); 
                                    LEFT250_tree = (Object)adaptor.create(LEFT250);
                                    adaptor.addChild(root_0, LEFT250_tree);


                                    }
                                    break;

                            }

                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:25: ( OUTER )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==OUTER) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:26: OUTER
                                    {
                                    OUTER251=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2349); 
                                    OUTER251_tree = (Object)adaptor.create(OUTER251);
                                    adaptor.addChild(root_0, OUTER251_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:36: INNER
                            {
                            INNER252=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2355); 
                            INNER252_tree = (Object)adaptor.create(INNER252);
                            adaptor.addChild(root_0, INNER252_tree);


                            }
                            break;
                        case 3 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:44: CROSS
                            {
                            CROSS253=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2359); 
                            CROSS253_tree = (Object)adaptor.create(CROSS253);
                            adaptor.addChild(root_0, CROSS253_tree);


                            }
                            break;

                    }

                    JOIN254=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2362); 
                    JOIN254_tree = (Object)adaptor.create(JOIN254);
                    root_0 = (Object)adaptor.becomeRoot(JOIN254_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_op"

    public static class join_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_constraint"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:337:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON255=null;
        Token USING257=null;
        Token LPAREN258=null;
        Token COMMA259=null;
        Token RPAREN260=null;
        List list_column_names=null;
        SqlParser.expr_return expr256 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object ON255_tree=null;
        Object USING257_tree=null;
        Object LPAREN258_tree=null;
        Object COMMA259_tree=null;
        Object RPAREN260_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ON) ) {
                alt94=1;
            }
            else if ( (LA94_0==USING) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON255=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2373); 
                    ON255_tree = (Object)adaptor.create(ON255);
                    root_0 = (Object)adaptor.becomeRoot(ON255_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2376);
                    expr256=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr256.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING257=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2382);  
                    stream_USING.add(USING257);

                    LPAREN258=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2384);  
                    stream_LPAREN.add(LPAREN258);

                    pushFollow(FOLLOW_id_in_join_constraint2388);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:35: ( COMMA column_names+= id )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==COMMA) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:36: COMMA column_names+= id
                    	    {
                    	    COMMA259=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2391);  
                    	    stream_COMMA.add(COMMA259);

                    	    pushFollow(FOLLOW_id_in_join_constraint2395);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    RPAREN260=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2399);  
                    stream_RPAREN.add(RPAREN260);



                    // AST REWRITE
                    // elements: USING, column_names
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: column_names
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
                    root_0 = (Object)adaptor.nil();
                    // 339:68: -> ^( USING ( $column_names)+ )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:71: ^( USING ( $column_names)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_USING.nextNode(), root_1);

                        if ( !(stream_column_names.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_column_names.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_names.nextTree());

                        }
                        stream_column_names.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_constraint"

    public static class insert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT261=null;
        Token REPLACE263=null;
        Token INTO264=null;
        Token DOT265=null;
        Token LPAREN266=null;
        Token COMMA267=null;
        Token RPAREN268=null;
        Token VALUES269=null;
        Token LPAREN270=null;
        Token COMMA271=null;
        Token RPAREN272=null;
        Token DEFAULT274=null;
        Token VALUES275=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause262 = null;

        SqlParser.select_stmt_return select_stmt273 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        SqlParser.expr_return values = null;
         values = null;
        Object INSERT261_tree=null;
        Object REPLACE263_tree=null;
        Object INTO264_tree=null;
        Object DOT265_tree=null;
        Object LPAREN266_tree=null;
        Object COMMA267_tree=null;
        Object RPAREN268_tree=null;
        Object VALUES269_tree=null;
        Object LPAREN270_tree=null;
        Object COMMA271_tree=null;
        Object RPAREN272_tree=null;
        Object DEFAULT274_tree=null;
        Object VALUES275_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==INSERT) ) {
                alt96=1;
            }
            else if ( (LA96_0==REPLACE) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT261=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2418); 
                    INSERT261_tree = (Object)adaptor.create(INSERT261);
                    adaptor.addChild(root_0, INSERT261_tree);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:22: ( operation_conflict_clause )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==OR) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2421);
                            operation_conflict_clause262=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause262.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:53: REPLACE
                    {
                    REPLACE263=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2427); 
                    REPLACE263_tree = (Object)adaptor.create(REPLACE263);
                    adaptor.addChild(root_0, REPLACE263_tree);


                    }
                    break;

            }

            INTO264=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2430); 
            INTO264_tree = (Object)adaptor.create(INTO264);
            adaptor.addChild(root_0, INTO264_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:67: (database_name= id DOT )?
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2435);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT265=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2437); 
                    DOT265_tree = (Object)adaptor.create(DOT265);
                    adaptor.addChild(root_0, DOT265_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2443);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LPAREN||LA102_0==SELECT||LA102_0==VALUES) ) {
                alt102=1;
            }
            else if ( (LA102_0==DEFAULT) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==LPAREN) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2450); 
                            LPAREN266_tree = (Object)adaptor.create(LPAREN266);
                            adaptor.addChild(root_0, LPAREN266_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2454);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:30: ( COMMA column_names+= id )*
                            loop98:
                            do {
                                int alt98=2;
                                int LA98_0 = input.LA(1);

                                if ( (LA98_0==COMMA) ) {
                                    alt98=1;
                                }


                                switch (alt98) {
                            	case 1 :
                            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:31: COMMA column_names+= id
                            	    {
                            	    COMMA267=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2457); 
                            	    COMMA267_tree = (Object)adaptor.create(COMMA267);
                            	    adaptor.addChild(root_0, COMMA267_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2461);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop98;
                                }
                            } while (true);

                            RPAREN268=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2465); 
                            RPAREN268_tree = (Object)adaptor.create(RPAREN268);
                            adaptor.addChild(root_0, RPAREN268_tree);


                            }
                            break;

                    }

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==VALUES) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==SELECT) ) {
                        alt101=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 0, input);

                        throw nvae;
                    }
                    switch (alt101) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES269=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2474); 
                            VALUES269_tree = (Object)adaptor.create(VALUES269);
                            adaptor.addChild(root_0, VALUES269_tree);

                            LPAREN270=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2476); 
                            LPAREN270_tree = (Object)adaptor.create(LPAREN270);
                            adaptor.addChild(root_0, LPAREN270_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2480);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:33: ( COMMA values+= expr )*
                            loop100:
                            do {
                                int alt100=2;
                                int LA100_0 = input.LA(1);

                                if ( (LA100_0==COMMA) ) {
                                    alt100=1;
                                }


                                switch (alt100) {
                            	case 1 :
                            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:34: COMMA values+= expr
                            	    {
                            	    COMMA271=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2483); 
                            	    COMMA271_tree = (Object)adaptor.create(COMMA271);
                            	    adaptor.addChild(root_0, COMMA271_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2487);
                            	    values=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, values.getTree());
                            	    if (list_values==null) list_values=new ArrayList();
                            	    list_values.add(values.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop100;
                                }
                            } while (true);

                            RPAREN272=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2491); 
                            RPAREN272_tree = (Object)adaptor.create(RPAREN272);
                            adaptor.addChild(root_0, RPAREN272_tree);


                            }
                            break;
                        case 2 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2495);
                            select_stmt273=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt273.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:345:5: DEFAULT VALUES
                    {
                    DEFAULT274=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2502); 
                    DEFAULT274_tree = (Object)adaptor.create(DEFAULT274);
                    adaptor.addChild(root_0, DEFAULT274_tree);

                    VALUES275=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2504); 
                    VALUES275_tree = (Object)adaptor.create(VALUES275);
                    adaptor.addChild(root_0, VALUES275_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_stmt"

    public static class update_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE276=null;
        Token SET279=null;
        Token COMMA280=null;
        Token WHERE281=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause277 = null;

        SqlParser.qualified_table_name_return qualified_table_name278 = null;

        SqlParser.expr_return expr282 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause283 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE276_tree=null;
        Object SET279_tree=null;
        Object COMMA280_tree=null;
        Object WHERE281_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE276=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2514); 
            UPDATE276_tree = (Object)adaptor.create(UPDATE276);
            adaptor.addChild(root_0, UPDATE276_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:21: ( operation_conflict_clause )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==OR) ) {
                int LA103_1 = input.LA(2);

                if ( ((LA103_1>=IGNORE && LA103_1<=FAIL)||LA103_1==REPLACE) ) {
                    alt103=1;
                }
            }
            switch (alt103) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2517);
                    operation_conflict_clause277=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause277.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2521);
            qualified_table_name278=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name278.getTree());
            SET279=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2525); 
            SET279_tree = (Object)adaptor.create(SET279);
            adaptor.addChild(root_0, SET279_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2529);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:26: ( COMMA values+= update_set )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==COMMA) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:27: COMMA values+= update_set
            	    {
            	    COMMA280=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2532); 
            	    COMMA280_tree = (Object)adaptor.create(COMMA280);
            	    adaptor.addChild(root_0, COMMA280_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2536);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:54: ( WHERE expr )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==WHERE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:55: WHERE expr
                    {
                    WHERE281=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2541); 
                    WHERE281_tree = (Object)adaptor.create(WHERE281);
                    adaptor.addChild(root_0, WHERE281_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2543);
                    expr282=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr282.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:68: ( operation_limited_clause )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=ORDER && LA106_0<=LIMIT)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2548);
                    operation_limited_clause283=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause283.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_stmt"

    public static class update_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_set"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:351:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS284=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr285 = null;


        Object EQUALS284_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:351:11: (column_name= id EQUALS expr )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:351:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2559);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS284=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2561); 
            EQUALS284_tree = (Object)adaptor.create(EQUALS284);
            adaptor.addChild(root_0, EQUALS284_tree);

            pushFollow(FOLLOW_expr_in_update_set2563);
            expr285=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr285.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_set"

    public static class delete_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE286=null;
        Token FROM287=null;
        Token WHERE289=null;
        SqlParser.qualified_table_name_return qualified_table_name288 = null;

        SqlParser.expr_return expr290 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause291 = null;


        Object DELETE286_tree=null;
        Object FROM287_tree=null;
        Object WHERE289_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE286=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2571); 
            DELETE286_tree = (Object)adaptor.create(DELETE286);
            adaptor.addChild(root_0, DELETE286_tree);

            FROM287=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2573); 
            FROM287_tree = (Object)adaptor.create(FROM287);
            adaptor.addChild(root_0, FROM287_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2575);
            qualified_table_name288=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name288.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:47: ( WHERE expr )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==WHERE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:48: WHERE expr
                    {
                    WHERE289=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2578); 
                    WHERE289_tree = (Object)adaptor.create(WHERE289);
                    adaptor.addChild(root_0, WHERE289_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2580);
                    expr290=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr290.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:61: ( operation_limited_clause )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( ((LA108_0>=ORDER && LA108_0<=LIMIT)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2585);
                    operation_limited_clause291=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause291.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_stmt"

    public static class begin_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "begin_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN292=null;
        Token set293=null;
        Token TRANSACTION294=null;

        Object BEGIN292_tree=null;
        Object set293_tree=null;
        Object TRANSACTION294_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN292=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2595); 
            BEGIN292_tree = (Object)adaptor.create(BEGIN292);
            adaptor.addChild(root_0, BEGIN292_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=DEFERRED && LA109_0<=EXCLUSIVE)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set293=(Token)input.LT(1);
                    if ( (input.LA(1)>=DEFERRED && input.LA(1)<=EXCLUSIVE) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set293));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:55: ( TRANSACTION )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==TRANSACTION) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:56: TRANSACTION
                    {
                    TRANSACTION294=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2611); 
                    TRANSACTION294_tree = (Object)adaptor.create(TRANSACTION294);
                    adaptor.addChild(root_0, TRANSACTION294_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "begin_stmt"

    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set295=null;
        Token TRANSACTION296=null;

        Object set295_tree=null;
        Object TRANSACTION296_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set295=(Token)input.LT(1);
            if ( input.LA(1)==END||input.LA(1)==COMMIT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set295));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:29: ( TRANSACTION )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==TRANSACTION) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:30: TRANSACTION
                    {
                    TRANSACTION296=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2630); 
                    TRANSACTION296_tree = (Object)adaptor.create(TRANSACTION296);
                    adaptor.addChild(root_0, TRANSACTION296_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commit_stmt"

    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK297=null;
        Token TRANSACTION298=null;
        Token TO299=null;
        Token SAVEPOINT300=null;
        SqlParser.id_return savepoint_name = null;


        Object ROLLBACK297_tree=null;
        Object TRANSACTION298_tree=null;
        Object TO299_tree=null;
        Object SAVEPOINT300_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK297=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2640); 
            ROLLBACK297_tree = (Object)adaptor.create(ROLLBACK297);
            adaptor.addChild(root_0, ROLLBACK297_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:25: ( TRANSACTION )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==TRANSACTION) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:26: TRANSACTION
                    {
                    TRANSACTION298=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2643); 
                    TRANSACTION298_tree = (Object)adaptor.create(TRANSACTION298);
                    adaptor.addChild(root_0, TRANSACTION298_tree);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==TO) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO299=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2648); 
                    TO299_tree = (Object)adaptor.create(TO299);
                    adaptor.addChild(root_0, TO299_tree);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:44: ( SAVEPOINT )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==SAVEPOINT) ) {
                        int LA113_1 = input.LA(2);

                        if ( ((LA113_1>=EXPLAIN && LA113_1<=PLAN)||(LA113_1>=INDEXED && LA113_1<=BY)||(LA113_1>=OR && LA113_1<=ESCAPE)||(LA113_1>=IS && LA113_1<=BETWEEN)||(LA113_1>=COLLATE && LA113_1<=THEN)||LA113_1==STRING||(LA113_1>=CURRENT_TIME && LA113_1<=CURRENT_TIMESTAMP)||(LA113_1>=RAISE && LA113_1<=ROW)) ) {
                            alt113=1;
                        }
                    }
                    switch (alt113) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:45: SAVEPOINT
                            {
                            SAVEPOINT300=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2651); 
                            SAVEPOINT300_tree = (Object)adaptor.create(SAVEPOINT300);
                            adaptor.addChild(root_0, SAVEPOINT300_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2657);
                    savepoint_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rollback_stmt"

    public static class savepoint_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "savepoint_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:366:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT301=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT301_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:366:15: ( SAVEPOINT savepoint_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:366:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT301=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2667); 
            SAVEPOINT301_tree = (Object)adaptor.create(SAVEPOINT301);
            adaptor.addChild(root_0, SAVEPOINT301_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2671);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "savepoint_stmt"

    public static class release_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "release_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELEASE302=null;
        Token SAVEPOINT303=null;
        SqlParser.id_return savepoint_name = null;


        Object RELEASE302_tree=null;
        Object SAVEPOINT303_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE302=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2679); 
            RELEASE302_tree = (Object)adaptor.create(RELEASE302);
            adaptor.addChild(root_0, RELEASE302_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:23: ( SAVEPOINT )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==SAVEPOINT) ) {
                int LA115_1 = input.LA(2);

                if ( ((LA115_1>=EXPLAIN && LA115_1<=PLAN)||(LA115_1>=INDEXED && LA115_1<=BY)||(LA115_1>=OR && LA115_1<=ESCAPE)||(LA115_1>=IS && LA115_1<=BETWEEN)||(LA115_1>=COLLATE && LA115_1<=THEN)||LA115_1==STRING||(LA115_1>=CURRENT_TIME && LA115_1<=CURRENT_TIMESTAMP)||(LA115_1>=RAISE && LA115_1<=ROW)) ) {
                    alt115=1;
                }
            }
            switch (alt115) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:24: SAVEPOINT
                    {
                    SAVEPOINT303=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2682); 
                    SAVEPOINT303_tree = (Object)adaptor.create(SAVEPOINT303);
                    adaptor.addChild(root_0, SAVEPOINT303_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2688);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "release_stmt"

    public static class table_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_conflict_clause"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:376:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON304=null;
        Token CONFLICT305=null;
        Token set306=null;

        Object ON304_tree=null;
        Object CONFLICT305_tree=null;
        Object set306_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:376:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:376:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON304=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2700); 
            CONFLICT305=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2703); 
            CONFLICT305_tree = (Object)adaptor.create(CONFLICT305);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT305_tree, root_0);

            set306=(Token)input.LT(1);
            if ( (input.LA(1)>=IGNORE && input.LA(1)<=FAIL)||input.LA(1)==REPLACE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set306));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_conflict_clause"

    public static class create_virtual_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_virtual_table_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? ) ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE307=null;
        Token VIRTUAL308=null;
        Token TABLE309=null;
        Token DOT310=null;
        Token USING311=null;
        Token LPAREN312=null;
        Token COMMA314=null;
        Token RPAREN316=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return module_name = null;

        SqlParser.column_def_return column_def313 = null;

        SqlParser.column_def_return column_def315 = null;


        Object CREATE307_tree=null;
        Object VIRTUAL308_tree=null;
        Object TABLE309_tree=null;
        Object DOT310_tree=null;
        Object USING311_tree=null;
        Object LPAREN312_tree=null;
        Object COMMA314_tree=null;
        Object RPAREN316_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_VIRTUAL=new RewriteRuleTokenStream(adaptor,"token VIRTUAL");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            CREATE307=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2733);  
            stream_CREATE.add(CREATE307);

            VIRTUAL308=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2735);  
            stream_VIRTUAL.add(VIRTUAL308);

            TABLE309=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2737);  
            stream_TABLE.add(TABLE309);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:49: (database_name= id DOT )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==ID||LA116_0==STRING) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==DOT) ) {
                    alt116=1;
                }
            }
            else if ( ((LA116_0>=EXPLAIN && LA116_0<=PLAN)||(LA116_0>=INDEXED && LA116_0<=BY)||(LA116_0>=OR && LA116_0<=ESCAPE)||(LA116_0>=IS && LA116_0<=BETWEEN)||LA116_0==COLLATE||(LA116_0>=DISTINCT && LA116_0<=THEN)||(LA116_0>=CURRENT_TIME && LA116_0<=CURRENT_TIMESTAMP)||(LA116_0>=RAISE && LA116_0<=ROW)) ) {
                int LA116_2 = input.LA(2);

                if ( (LA116_2==DOT) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2742);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT310=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2744);  
                    stream_DOT.add(DOT310);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2750);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            USING311=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2754);  
            stream_USING.add(USING311);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2758);
            module_name=id();

            state._fsp--;

            stream_id.add(module_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==LPAREN) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN312=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2761);  
                    stream_LPAREN.add(LPAREN312);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2763);
                    column_def313=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def313.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:43: ( COMMA column_def )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==COMMA) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:44: COMMA column_def
                    	    {
                    	    COMMA314=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2766);  
                    	    stream_COMMA.add(COMMA314);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2768);
                    	    column_def315=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def315.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    RPAREN316=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2772);  
                    stream_RPAREN.add(RPAREN316);


                    }
                    break;

            }



            // AST REWRITE
            // elements: table_name, database_name, VIRTUAL, column_def, module_name
            // token labels: 
            // rule labels: database_name, retval, table_name, module_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_module_name=new RewriteRuleSubtreeStream(adaptor,"rule module_name",module_name!=null?module_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 382:3: -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:6: ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:21: ^( OPTIONS VIRTUAL )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                adaptor.addChild(root_2, stream_VIRTUAL.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:40: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:54: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:71: ^( $module_name)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_module_name.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:87: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:87: ^( COLUMNS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                    if ( !(stream_column_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_column_def.hasNext() ) {
                        adaptor.addChild(root_2, stream_column_def.nextTree());

                    }
                    stream_column_def.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_column_def.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_virtual_table_stmt"

    public static class create_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_table_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE317=null;
        Token TEMPORARY318=null;
        Token TABLE319=null;
        Token IF320=null;
        Token NOT321=null;
        Token EXISTS322=null;
        Token DOT323=null;
        Token LPAREN324=null;
        Token COMMA326=null;
        Token COMMA328=null;
        Token RPAREN330=null;
        Token AS331=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.column_def_return column_def325 = null;

        SqlParser.column_def_return column_def327 = null;

        SqlParser.table_constraint_return table_constraint329 = null;

        SqlParser.select_stmt_return select_stmt332 = null;


        Object CREATE317_tree=null;
        Object TEMPORARY318_tree=null;
        Object TABLE319_tree=null;
        Object IF320_tree=null;
        Object NOT321_tree=null;
        Object EXISTS322_tree=null;
        Object DOT323_tree=null;
        Object LPAREN324_tree=null;
        Object COMMA326_tree=null;
        Object COMMA328_tree=null;
        Object RPAREN330_tree=null;
        Object AS331_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        RewriteRuleSubtreeStream stream_table_constraint=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE317=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2818);  
            stream_CREATE.add(CREATE317);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:27: ( TEMPORARY )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==TEMPORARY) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:27: TEMPORARY
                    {
                    TEMPORARY318=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2820);  
                    stream_TEMPORARY.add(TEMPORARY318);


                    }
                    break;

            }

            TABLE319=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2823);  
            stream_TABLE.add(TABLE319);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:44: ( IF NOT EXISTS )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==IF) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==NOT) ) {
                    alt120=1;
                }
            }
            switch (alt120) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:45: IF NOT EXISTS
                    {
                    IF320=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2826);  
                    stream_IF.add(IF320);

                    NOT321=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2828);  
                    stream_NOT.add(NOT321);

                    EXISTS322=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2830);  
                    stream_EXISTS.add(EXISTS322);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:61: (database_name= id DOT )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==ID||LA121_0==STRING) ) {
                int LA121_1 = input.LA(2);

                if ( (LA121_1==DOT) ) {
                    alt121=1;
                }
            }
            else if ( ((LA121_0>=EXPLAIN && LA121_0<=PLAN)||(LA121_0>=INDEXED && LA121_0<=BY)||(LA121_0>=OR && LA121_0<=ESCAPE)||(LA121_0>=IS && LA121_0<=BETWEEN)||LA121_0==COLLATE||(LA121_0>=DISTINCT && LA121_0<=THEN)||(LA121_0>=CURRENT_TIME && LA121_0<=CURRENT_TIMESTAMP)||(LA121_0>=RAISE && LA121_0<=ROW)) ) {
                int LA121_2 = input.LA(2);

                if ( (LA121_2==DOT) ) {
                    alt121=1;
                }
            }
            switch (alt121) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2837);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT323=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2839);  
                    stream_DOT.add(DOT323);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2845);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==LPAREN) ) {
                alt124=1;
            }
            else if ( (LA124_0==AS) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN324=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2851);  
                    stream_LPAREN.add(LPAREN324);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2853);
                    column_def325=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def325.getTree());
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:23: ( COMMA column_def )*
                    loop122:
                    do {
                        int alt122=2;
                        alt122 = dfa122.predict(input);
                        switch (alt122) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:24: COMMA column_def
                    	    {
                    	    COMMA326=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2856);  
                    	    stream_COMMA.add(COMMA326);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2858);
                    	    column_def327=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def327.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:43: ( COMMA table_constraint )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==COMMA) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:44: COMMA table_constraint
                    	    {
                    	    COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2863);  
                    	    stream_COMMA.add(COMMA328);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2865);
                    	    table_constraint329=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint329.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    RPAREN330=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2869);  
                    stream_RPAREN.add(RPAREN330);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:5: AS select_stmt
                    {
                    AS331=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2875);  
                    stream_AS.add(AS331);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2877);
                    select_stmt332=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt332.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_def, TEMPORARY, table_name, EXISTS, select_stmt, table_constraint, database_name
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 388:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:3: ^( COLUMNS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                    if ( !(stream_column_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_column_def.hasNext() ) {
                        adaptor.addChild(root_2, stream_column_def.nextTree());

                    }
                    stream_column_def.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_column_def.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:61: ( select_stmt )?
                if ( stream_select_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_select_stmt.nextTree());

                }
                stream_select_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_table_stmt"

    public static class column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_def"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_column_def_return name = null;

        SqlParser.type_name_return type_name333 = null;

        SqlParser.column_constraint_return column_constraint334 = null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2933);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:32: ( type_name )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2935);
                    type_name333=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name333.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:43: ( column_constraint )*
            loop126:
            do {
                int alt126=2;
                alt126 = dfa126.predict(input);
                switch (alt126) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2938);
            	    column_constraint334=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint334.getTree());

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);



            // AST REWRITE
            // elements: type_name, name, column_constraint
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 392:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:46: ( type_name )?
                if ( stream_type_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_type_name.nextTree());

                }
                stream_type_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_def"

    public static class column_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT335=null;
        SqlParser.id_return name = null;

        SqlParser.column_constraint_pk_return column_constraint_pk336 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null337 = null;

        SqlParser.column_constraint_null_return column_constraint_null338 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique339 = null;

        SqlParser.column_constraint_check_return column_constraint_check340 = null;

        SqlParser.column_constraint_default_return column_constraint_default341 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate342 = null;

        SqlParser.fk_clause_return fk_clause343 = null;


        Object CONSTRAINT335_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_column_constraint_default=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_default");
        RewriteRuleSubtreeStream stream_column_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_check");
        RewriteRuleSubtreeStream stream_column_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_pk");
        RewriteRuleSubtreeStream stream_column_constraint_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_null");
        RewriteRuleSubtreeStream stream_column_constraint_collate=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_collate");
        RewriteRuleSubtreeStream stream_column_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_unique");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        RewriteRuleSubtreeStream stream_column_constraint_not_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_not_null");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:20: ( CONSTRAINT name= id )?
            int alt127=2;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:21: CONSTRAINT name= id
                    {
                    CONSTRAINT335=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2964);  
                    stream_CONSTRAINT.add(CONSTRAINT335);

                    pushFollow(FOLLOW_id_in_column_constraint2968);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:395:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt128=8;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt128=1;
                }
                break;
            case NOT:
                {
                alt128=2;
                }
                break;
            case NULL:
                {
                alt128=3;
                }
                break;
            case UNIQUE:
                {
                alt128=4;
                }
                break;
            case CHECK:
                {
                alt128=5;
                }
                break;
            case DEFAULT:
                {
                alt128=6;
                }
                break;
            case COLLATE:
                {
                alt128=7;
                }
                break;
            case REFERENCES:
                {
                alt128=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:395:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2976);
                    column_constraint_pk336=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk336.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:396:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2982);
                    column_constraint_not_null337=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null337.getTree());

                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:397:5: column_constraint_null
                    {
                    pushFollow(FOLLOW_column_constraint_null_in_column_constraint2988);
                    column_constraint_null338=column_constraint_null();

                    state._fsp--;

                    stream_column_constraint_null.add(column_constraint_null338.getTree());

                    }
                    break;
                case 4 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:398:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2994);
                    column_constraint_unique339=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique339.getTree());

                    }
                    break;
                case 5 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:399:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint3000);
                    column_constraint_check340=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check340.getTree());

                    }
                    break;
                case 6 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:400:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint3006);
                    column_constraint_default341=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default341.getTree());

                    }
                    break;
                case 7 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:401:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint3012);
                    column_constraint_collate342=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate342.getTree());

                    }
                    break;
                case 8 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:402:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint3018);
                    fk_clause343=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause343.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_collate, column_constraint_pk, column_constraint_check, column_constraint_null, column_constraint_not_null, name, fk_clause, column_constraint_default, column_constraint_unique
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 403:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:403:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:404:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:405:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:406:3: ( column_constraint_null )?
                if ( stream_column_constraint_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_null.nextTree());

                }
                stream_column_constraint_null.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:407:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:408:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:409:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:410:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:411:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:412:3: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint"

    public static class column_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_pk"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY344=null;
        Token KEY345=null;
        Token set346=null;
        Token AUTOINCREMENT348=null;
        SqlParser.table_conflict_clause_return table_conflict_clause347 = null;


        Object PRIMARY344_tree=null;
        Object KEY345_tree=null;
        Object set346_tree=null;
        Object AUTOINCREMENT348_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY344=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk3078); 
            PRIMARY344_tree = (Object)adaptor.create(PRIMARY344);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY344_tree, root_0);

            KEY345=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk3081); 
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:37: ( ASC | DESC )?
            int alt129=2;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set346=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set346));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:51: ( table_conflict_clause )?
            int alt130=2;
            alt130 = dfa130.predict(input);
            switch (alt130) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk3093);
                    table_conflict_clause347=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause347.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:74: ( AUTOINCREMENT )?
            int alt131=2;
            alt131 = dfa131.predict(input);
            switch (alt131) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT348=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk3097); 
                    AUTOINCREMENT348_tree = (Object)adaptor.create(AUTOINCREMENT348);
                    adaptor.addChild(root_0, AUTOINCREMENT348_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_pk"

    public static class column_constraint_not_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_not_null"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT349=null;
        Token NULL350=null;
        SqlParser.table_conflict_clause_return table_conflict_clause351 = null;


        Object NOT349_tree=null;
        Object NULL350_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:29: NOT NULL ( table_conflict_clause )?
            {
            NOT349=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null3106);  
            stream_NOT.add(NOT349);

            NULL350=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null3108);  
            stream_NULL.add(NULL350);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:38: ( table_conflict_clause )?
            int alt132=2;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null3110);
                    table_conflict_clause351=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause351.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 416:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:75: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_not_null"

    public static class column_constraint_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_null"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:1: column_constraint_null : NULL ( table_conflict_clause )? -> ^( IS_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_null_return column_constraint_null() throws RecognitionException {
        SqlParser.column_constraint_null_return retval = new SqlParser.column_constraint_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL352=null;
        SqlParser.table_conflict_clause_return table_conflict_clause353 = null;


        Object NULL352_tree=null;
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:23: ( NULL ( table_conflict_clause )? -> ^( IS_NULL ( table_conflict_clause )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:25: NULL ( table_conflict_clause )?
            {
            NULL352=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_null3127);  
            stream_NULL.add(NULL352);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:30: ( table_conflict_clause )?
            int alt133=2;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:30: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_null3129);
                    table_conflict_clause353=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause353.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 418:53: -> ^( IS_NULL ( table_conflict_clause )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:56: ^( IS_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IS_NULL, "IS_NULL"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:66: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_null"

    public static class column_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_unique"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE354=null;
        SqlParser.table_conflict_clause_return table_conflict_clause355 = null;


        Object UNIQUE354_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:25: ( UNIQUE ( table_conflict_clause )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE354=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique3146); 
            UNIQUE354_tree = (Object)adaptor.create(UNIQUE354);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE354_tree, root_0);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:35: ( table_conflict_clause )?
            int alt134=2;
            alt134 = dfa134.predict(input);
            switch (alt134) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique3149);
                    table_conflict_clause355=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause355.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_unique"

    public static class column_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_check"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:422:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK356=null;
        Token LPAREN357=null;
        Token RPAREN359=null;
        SqlParser.expr_return expr358 = null;


        Object CHECK356_tree=null;
        Object LPAREN357_tree=null;
        Object RPAREN359_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:422:24: ( CHECK LPAREN expr RPAREN )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:422:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK356=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check3157); 
            CHECK356_tree = (Object)adaptor.create(CHECK356);
            root_0 = (Object)adaptor.becomeRoot(CHECK356_tree, root_0);

            LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check3160); 
            pushFollow(FOLLOW_expr_in_column_constraint_check3163);
            expr358=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr358.getTree());
            RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check3165); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_check"

    public static class numeric_literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_literal_value"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:424:1: numeric_literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) );
    public final SqlParser.numeric_literal_value_return numeric_literal_value() throws RecognitionException {
        SqlParser.numeric_literal_value_return retval = new SqlParser.numeric_literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER360=null;
        Token FLOAT361=null;

        Object INTEGER360_tree=null;
        Object FLOAT361_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==INTEGER) ) {
                alt135=1;
            }
            else if ( (LA135_0==FLOAT) ) {
                alt135=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:5: INTEGER
                    {
                    INTEGER360=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numeric_literal_value3176);  
                    stream_INTEGER.add(INTEGER360);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:16: ^( INTEGER_LITERAL INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INTEGER_LITERAL, "INTEGER_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_INTEGER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:426:5: FLOAT
                    {
                    FLOAT361=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numeric_literal_value3190);  
                    stream_FLOAT.add(FLOAT361);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:426:14: ^( FLOAT_LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_literal_value"

    public static class signed_default_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signed_default_number"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:429:1: signed_default_number : ( PLUS | MINUS ) numeric_literal_value ;
    public final SqlParser.signed_default_number_return signed_default_number() throws RecognitionException {
        SqlParser.signed_default_number_return retval = new SqlParser.signed_default_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set362=null;
        SqlParser.numeric_literal_value_return numeric_literal_value363 = null;


        Object set362_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:429:22: ( ( PLUS | MINUS ) numeric_literal_value )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:429:24: ( PLUS | MINUS ) numeric_literal_value
            {
            root_0 = (Object)adaptor.nil();

            set362=(Token)input.LT(1);
            set362=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set362), root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_numeric_literal_value_in_signed_default_number3217);
            numeric_literal_value363=numeric_literal_value();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal_value363.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signed_default_number"

    public static class column_constraint_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_default"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:1: column_constraint_default : DEFAULT ( signed_default_number | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT364=null;
        Token LPAREN367=null;
        Token RPAREN369=null;
        SqlParser.signed_default_number_return signed_default_number365 = null;

        SqlParser.literal_value_return literal_value366 = null;

        SqlParser.expr_return expr368 = null;


        Object DEFAULT364_tree=null;
        Object LPAREN367_tree=null;
        Object RPAREN369_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:26: ( DEFAULT ( signed_default_number | literal_value | LPAREN expr RPAREN ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:28: DEFAULT ( signed_default_number | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT364=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default3225); 
            DEFAULT364_tree = (Object)adaptor.create(DEFAULT364);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT364_tree, root_0);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:37: ( signed_default_number | literal_value | LPAREN expr RPAREN )
            int alt136=3;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:38: signed_default_number
                    {
                    pushFollow(FOLLOW_signed_default_number_in_column_constraint_default3229);
                    signed_default_number365=signed_default_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_default_number365.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:62: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default3233);
                    literal_value366=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value366.getTree());

                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:78: LPAREN expr RPAREN
                    {
                    LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default3237); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default3240);
                    expr368=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr368.getTree());
                    RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default3242); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_default"

    public static class column_constraint_collate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_collate"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:434:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE370=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE370_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:434:26: ( COLLATE collation_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:434:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE370=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate3251); 
            COLLATE370_tree = (Object)adaptor.create(COLLATE370);
            root_0 = (Object)adaptor.becomeRoot(COLLATE370_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate3256);
            collation_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_collate"

    public static class table_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT371=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk372 = null;

        SqlParser.table_constraint_unique_return table_constraint_unique373 = null;

        SqlParser.table_constraint_check_return table_constraint_check374 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk375 = null;


        Object CONSTRAINT371_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:19: ( CONSTRAINT name= id )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==CONSTRAINT) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:20: CONSTRAINT name= id
                    {
                    CONSTRAINT371=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint3265);  
                    stream_CONSTRAINT.add(CONSTRAINT371);

                    pushFollow(FOLLOW_id_in_table_constraint3269);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:437:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            int alt138=4;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt138=1;
                }
                break;
            case UNIQUE:
                {
                alt138=2;
                }
                break;
            case CHECK:
                {
                alt138=3;
                }
                break;
            case FOREIGN:
                {
                alt138=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:437:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint3277);
                    table_constraint_pk372=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk372.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:438:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint3283);
                    table_constraint_unique373=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique373.getTree());

                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:439:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint3289);
                    table_constraint_check374=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check374.getTree());

                    }
                    break;
                case 4 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:440:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint3295);
                    table_constraint_fk375=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk375.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_constraint_check, name, table_constraint_unique, table_constraint_pk, table_constraint_fk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 441:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:441:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:442:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:443:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:444:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:445:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:446:3: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint"

    public static class table_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_pk"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY376=null;
        Token KEY377=null;
        Token LPAREN378=null;
        Token COMMA379=null;
        Token RPAREN380=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause381 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY376_tree=null;
        Object KEY377_tree=null;
        Object LPAREN378_tree=null;
        Object COMMA379_tree=null;
        Object RPAREN380_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY376=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk3335);  
            stream_PRIMARY.add(PRIMARY376);

            KEY377=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk3337);  
            stream_KEY.add(KEY377);

            LPAREN378=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk3341);  
            stream_LPAREN.add(LPAREN378);

            pushFollow(FOLLOW_id_in_table_constraint_pk3345);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:30: ( COMMA indexed_columns+= id )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==COMMA) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:31: COMMA indexed_columns+= id
            	    {
            	    COMMA379=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk3348);  
            	    stream_COMMA.add(COMMA379);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk3352);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);

            RPAREN380=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3356);  
            stream_RPAREN.add(RPAREN380);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:66: ( table_conflict_clause )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ON) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3358);
                    table_conflict_clause381=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause381.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: indexed_columns, table_conflict_clause, PRIMARY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 450:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:450:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:450:14: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:450:43: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_pk"

    public static class table_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_unique"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE382=null;
        Token LPAREN383=null;
        Token COMMA384=null;
        Token RPAREN385=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause386 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object UNIQUE382_tree=null;
        Object LPAREN383_tree=null;
        Object COMMA384_tree=null;
        Object RPAREN385_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE382=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3383);  
            stream_UNIQUE.add(UNIQUE382);

            LPAREN383=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3387);  
            stream_LPAREN.add(LPAREN383);

            pushFollow(FOLLOW_id_in_table_constraint_unique3391);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:30: ( COMMA indexed_columns+= id )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==COMMA) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:31: COMMA indexed_columns+= id
            	    {
            	    COMMA384=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3394);  
            	    stream_COMMA.add(COMMA384);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique3398);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);

            RPAREN385=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3402);  
            stream_RPAREN.add(RPAREN385);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:66: ( table_conflict_clause )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==ON) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3404);
                    table_conflict_clause386=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause386.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause, indexed_columns, UNIQUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 454:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:454:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:454:13: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:454:42: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_unique"

    public static class table_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_check"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:456:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK387=null;
        Token LPAREN388=null;
        Token RPAREN390=null;
        SqlParser.expr_return expr389 = null;


        Object CHECK387_tree=null;
        Object LPAREN388_tree=null;
        Object RPAREN390_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:456:23: ( CHECK LPAREN expr RPAREN )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:456:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK387=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3429); 
            CHECK387_tree = (Object)adaptor.create(CHECK387);
            root_0 = (Object)adaptor.becomeRoot(CHECK387_tree, root_0);

            LPAREN388=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3432); 
            pushFollow(FOLLOW_expr_in_table_constraint_check3435);
            expr389=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr389.getTree());
            RPAREN390=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3437); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_check"

    public static class table_constraint_fk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_fk"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN391=null;
        Token KEY392=null;
        Token LPAREN393=null;
        Token COMMA394=null;
        Token RPAREN395=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause396 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN391_tree=null;
        Object KEY392_tree=null;
        Object LPAREN393_tree=null;
        Object COMMA394_tree=null;
        Object RPAREN395_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN391=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3445);  
            stream_FOREIGN.add(FOREIGN391);

            KEY392=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3447);  
            stream_KEY.add(KEY392);

            LPAREN393=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3449);  
            stream_LPAREN.add(LPAREN393);

            pushFollow(FOLLOW_id_in_table_constraint_fk3453);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:58: ( COMMA column_names+= id )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==COMMA) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:59: COMMA column_names+= id
            	    {
            	    COMMA394=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3456);  
            	    stream_COMMA.add(COMMA394);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3460);
            	    column_names=id();

            	    state._fsp--;

            	    stream_id.add(column_names.getTree());
            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names.getTree());


            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);

            RPAREN395=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3464);  
            stream_RPAREN.add(RPAREN395);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3466);
            fk_clause396=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause396.getTree());


            // AST REWRITE
            // elements: FOREIGN, fk_clause, column_names
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 459:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:459:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:459:14: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_fk_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_fk"

    public static class fk_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES397=null;
        Token LPAREN398=null;
        Token COMMA399=null;
        Token RPAREN400=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action401 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable402 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES397_tree=null;
        Object LPAREN398_tree=null;
        Object COMMA399_tree=null;
        Object RPAREN400_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )?
            {
            REFERENCES397=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3489);  
            stream_REFERENCES.add(REFERENCES397);

            pushFollow(FOLLOW_id_in_fk_clause3493);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt145=2;
            alt145 = dfa145.predict(input);
            switch (alt145) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN398=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3496);  
                    stream_LPAREN.add(LPAREN398);

                    pushFollow(FOLLOW_id_in_fk_clause3500);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:65: ( COMMA column_names+= id )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==COMMA) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:66: COMMA column_names+= id
                    	    {
                    	    COMMA399=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3503);  
                    	    stream_COMMA.add(COMMA399);

                    	    pushFollow(FOLLOW_id_in_fk_clause3507);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    RPAREN400=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3511);  
                    stream_RPAREN.add(RPAREN400);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:3: ( fk_clause_action )*
            loop146:
            do {
                int alt146=2;
                alt146 = dfa146.predict(input);
                switch (alt146) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3517);
            	    fk_clause_action401=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action401.getTree());

            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:21: ( fk_clause_deferrable )?
            int alt147=2;
            alt147 = dfa147.predict(input);
            switch (alt147) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3520);
                    fk_clause_deferrable402=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable402.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fk_clause_deferrable, column_names, REFERENCES, fk_clause_action, foreign_table
            // token labels: 
            // rule labels: retval, foreign_table
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_foreign_table=new RewriteRuleSubtreeStream(adaptor,"rule foreign_table",foreign_table!=null?foreign_table.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 463:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:32: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:58: ( fk_clause_action )*
                while ( stream_fk_clause_action.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_action.nextTree());

                }
                stream_fk_clause_action.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:76: ( fk_clause_deferrable )?
                if ( stream_fk_clause_deferrable.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_deferrable.nextTree());

                }
                stream_fk_clause_deferrable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fk_clause"

    public static class fk_clause_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause_action"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON403=null;
        Token set404=null;
        Token SET405=null;
        Token NULL406=null;
        Token SET407=null;
        Token DEFAULT408=null;
        Token CASCADE409=null;
        Token RESTRICT410=null;
        Token MATCH411=null;
        SqlParser.id_return id412 = null;


        Object ON403_tree=null;
        Object set404_tree=null;
        Object SET405_tree=null;
        Object NULL406_tree=null;
        Object SET407_tree=null;
        Object DEFAULT408_tree=null;
        Object CASCADE409_tree=null;
        Object RESTRICT410_tree=null;
        Object MATCH411_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==ON) ) {
                alt149=1;
            }
            else if ( (LA149_0==MATCH) ) {
                alt149=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON403=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3554); 
                    ON403_tree = (Object)adaptor.create(ON403);
                    root_0 = (Object)adaptor.becomeRoot(ON403_tree, root_0);

                    set404=(Token)input.LT(1);
                    if ( input.LA(1)==INSERT||input.LA(1)==UPDATE||input.LA(1)==DELETE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set404));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    int alt148=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA148_1 = input.LA(2);

                        if ( (LA148_1==NULL) ) {
                            alt148=1;
                        }
                        else if ( (LA148_1==DEFAULT) ) {
                            alt148=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt148=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt148=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;
                    }

                    switch (alt148) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:37: SET NULL
                            {
                            SET405=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3570); 
                            NULL406=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3573); 
                            NULL406_tree = (Object)adaptor.create(NULL406);
                            adaptor.addChild(root_0, NULL406_tree);


                            }
                            break;
                        case 2 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:49: SET DEFAULT
                            {
                            SET407=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3577); 
                            DEFAULT408=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3580); 
                            DEFAULT408_tree = (Object)adaptor.create(DEFAULT408);
                            adaptor.addChild(root_0, DEFAULT408_tree);


                            }
                            break;
                        case 3 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:64: CASCADE
                            {
                            CASCADE409=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3584); 
                            CASCADE409_tree = (Object)adaptor.create(CASCADE409);
                            adaptor.addChild(root_0, CASCADE409_tree);


                            }
                            break;
                        case 4 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:74: RESTRICT
                            {
                            RESTRICT410=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3588); 
                            RESTRICT410_tree = (Object)adaptor.create(RESTRICT410);
                            adaptor.addChild(root_0, RESTRICT410_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:467:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH411=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3595); 
                    MATCH411_tree = (Object)adaptor.create(MATCH411);
                    root_0 = (Object)adaptor.becomeRoot(MATCH411_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3598);
                    id412=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id412.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fk_clause_action"

    public static class fk_clause_deferrable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause_deferrable"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT413=null;
        Token DEFERRABLE414=null;
        Token INITIALLY415=null;
        Token DEFERRED416=null;
        Token INITIALLY417=null;
        Token IMMEDIATE418=null;

        Object NOT413_tree=null;
        Object DEFERRABLE414_tree=null;
        Object INITIALLY415_tree=null;
        Object DEFERRED416_tree=null;
        Object INITIALLY417_tree=null;
        Object IMMEDIATE418_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:23: ( NOT )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==NOT) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:24: NOT
                    {
                    NOT413=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3606); 
                    NOT413_tree = (Object)adaptor.create(NOT413);
                    adaptor.addChild(root_0, NOT413_tree);


                    }
                    break;

            }

            DEFERRABLE414=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3610); 
            DEFERRABLE414_tree = (Object)adaptor.create(DEFERRABLE414);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE414_tree, root_0);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt151=3;
            alt151 = dfa151.predict(input);
            switch (alt151) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:43: INITIALLY DEFERRED
                    {
                    INITIALLY415=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3614); 
                    DEFERRED416=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3617); 
                    DEFERRED416_tree = (Object)adaptor.create(DEFERRED416);
                    adaptor.addChild(root_0, DEFERRED416_tree);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY417=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3621); 
                    IMMEDIATE418=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3624); 
                    IMMEDIATE418_tree = (Object)adaptor.create(IMMEDIATE418);
                    adaptor.addChild(root_0, IMMEDIATE418_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fk_clause_deferrable"

    public static class drop_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_table_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP419=null;
        Token TABLE420=null;
        Token IF421=null;
        Token EXISTS422=null;
        Token DOT423=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP419_tree=null;
        Object TABLE420_tree=null;
        Object IF421_tree=null;
        Object EXISTS422_tree=null;
        Object DOT423_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP419=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3634);  
            stream_DROP.add(DROP419);

            TABLE420=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3636);  
            stream_TABLE.add(TABLE420);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:29: ( IF EXISTS )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==IF) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==EXISTS) ) {
                    alt152=1;
                }
            }
            switch (alt152) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:30: IF EXISTS
                    {
                    IF421=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3639);  
                    stream_IF.add(IF421);

                    EXISTS422=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3641);  
                    stream_EXISTS.add(EXISTS422);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:42: (database_name= id DOT )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ID||LA153_0==STRING) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==DOT) ) {
                    alt153=1;
                }
            }
            else if ( ((LA153_0>=EXPLAIN && LA153_0<=PLAN)||(LA153_0>=INDEXED && LA153_0<=BY)||(LA153_0>=OR && LA153_0<=ESCAPE)||(LA153_0>=IS && LA153_0<=BETWEEN)||LA153_0==COLLATE||(LA153_0>=DISTINCT && LA153_0<=THEN)||(LA153_0>=CURRENT_TIME && LA153_0<=CURRENT_TIMESTAMP)||(LA153_0>=RAISE && LA153_0<=ROW)) ) {
                int LA153_2 = input.LA(2);

                if ( (LA153_2==DOT) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3648);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT423=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3650);  
                    stream_DOT.add(DOT423);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3656);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());


            // AST REWRITE
            // elements: database_name, EXISTS, table_name
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 473:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:50: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_table_stmt"

    public static class alter_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alter_table_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER424=null;
        Token TABLE425=null;
        Token DOT426=null;
        Token RENAME427=null;
        Token TO428=null;
        Token ADD429=null;
        Token COLUMN430=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def431 = null;


        Object ALTER424_tree=null;
        Object TABLE425_tree=null;
        Object DOT426_tree=null;
        Object RENAME427_tree=null;
        Object TO428_tree=null;
        Object ADD429_tree=null;
        Object COLUMN430_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER424=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3686); 
            ALTER424_tree = (Object)adaptor.create(ALTER424);
            adaptor.addChild(root_0, ALTER424_tree);

            TABLE425=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3688); 
            TABLE425_tree = (Object)adaptor.create(TABLE425);
            adaptor.addChild(root_0, TABLE425_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:31: (database_name= id DOT )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==ID||LA154_0==STRING) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==DOT) ) {
                    alt154=1;
                }
            }
            else if ( ((LA154_0>=EXPLAIN && LA154_0<=PLAN)||(LA154_0>=INDEXED && LA154_0<=BY)||(LA154_0>=OR && LA154_0<=ESCAPE)||(LA154_0>=IS && LA154_0<=BETWEEN)||LA154_0==COLLATE||(LA154_0>=DISTINCT && LA154_0<=THEN)||(LA154_0>=CURRENT_TIME && LA154_0<=CURRENT_TIMESTAMP)||(LA154_0>=RAISE && LA154_0<=ROW)) ) {
                int LA154_2 = input.LA(2);

                if ( (LA154_2==DOT) ) {
                    alt154=1;
                }
            }
            switch (alt154) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3693);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT426=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3695); 
                    DOT426_tree = (Object)adaptor.create(DOT426);
                    adaptor.addChild(root_0, DOT426_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3701);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==RENAME) ) {
                alt156=1;
            }
            else if ( (LA156_0==ADD) ) {
                alt156=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:70: RENAME TO new_table_name= id
                    {
                    RENAME427=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3704); 
                    RENAME427_tree = (Object)adaptor.create(RENAME427);
                    adaptor.addChild(root_0, RENAME427_tree);

                    TO428=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3706); 
                    TO428_tree = (Object)adaptor.create(TO428);
                    adaptor.addChild(root_0, TO428_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3710);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:100: ADD ( COLUMN )? column_def
                    {
                    ADD429=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3714); 
                    ADD429_tree = (Object)adaptor.create(ADD429);
                    adaptor.addChild(root_0, ADD429_tree);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:104: ( COLUMN )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==COLUMN) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:105: COLUMN
                            {
                            COLUMN430=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3717); 
                            COLUMN430_tree = (Object)adaptor.create(COLUMN430);
                            adaptor.addChild(root_0, COLUMN430_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3721);
                    column_def431=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def431.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alter_table_stmt"

    public static class create_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_view_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) ) ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE432=null;
        Token TEMPORARY433=null;
        Token VIEW434=null;
        Token IF435=null;
        Token NOT436=null;
        Token EXISTS437=null;
        Token DOT438=null;
        Token AS439=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return t = null;


        Object CREATE432_tree=null;
        Object TEMPORARY433_tree=null;
        Object VIEW434_tree=null;
        Object IF435_tree=null;
        Object NOT436_tree=null;
        Object EXISTS437_tree=null;
        Object DOT438_tree=null;
        Object AS439_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt
            {
            CREATE432=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3730);  
            stream_CREATE.add(CREATE432);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:26: ( TEMPORARY )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==TEMPORARY) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:26: TEMPORARY
                    {
                    TEMPORARY433=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3732);  
                    stream_TEMPORARY.add(TEMPORARY433);


                    }
                    break;

            }

            VIEW434=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3735);  
            stream_VIEW.add(VIEW434);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:42: ( IF NOT EXISTS )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==IF) ) {
                int LA158_1 = input.LA(2);

                if ( (LA158_1==NOT) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:43: IF NOT EXISTS
                    {
                    IF435=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3738);  
                    stream_IF.add(IF435);

                    NOT436=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3740);  
                    stream_NOT.add(NOT436);

                    EXISTS437=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3742);  
                    stream_EXISTS.add(EXISTS437);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:59: (database_name= id DOT )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==ID||LA159_0==STRING) ) {
                int LA159_1 = input.LA(2);

                if ( (LA159_1==DOT) ) {
                    alt159=1;
                }
            }
            else if ( ((LA159_0>=EXPLAIN && LA159_0<=PLAN)||(LA159_0>=INDEXED && LA159_0<=BY)||(LA159_0>=OR && LA159_0<=ESCAPE)||(LA159_0>=IS && LA159_0<=BETWEEN)||LA159_0==COLLATE||(LA159_0>=DISTINCT && LA159_0<=THEN)||(LA159_0>=CURRENT_TIME && LA159_0<=CURRENT_TIMESTAMP)||(LA159_0>=RAISE && LA159_0<=ROW)) ) {
                int LA159_2 = input.LA(2);

                if ( (LA159_2==DOT) ) {
                    alt159=1;
                }
            }
            switch (alt159) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3749);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT438=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3751);  
                    stream_DOT.add(DOT438);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3757);
            view_name=id();

            state._fsp--;

            stream_id.add(view_name.getTree());
            AS439=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3759);  
            stream_AS.add(AS439);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3763);
            t=select_stmt();

            state._fsp--;

            stream_select_stmt.add(t.getTree());


            // AST REWRITE
            // elements: t, EXISTS, TEMPORARY, database_name, view_name
            // token labels: 
            // rule labels: view_name, database_name, retval, t
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_view_name=new RewriteRuleSubtreeStream(adaptor,"rule view_name",view_name!=null?view_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

            root_0 = (Object)adaptor.nil();
            // 480:1: -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:4: ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_VIEW, "CREATE_VIEW"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:18: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:28: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:39: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:48: ^( $view_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_view_name.nextNode(), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:61: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:78: ^( STATEMENT $t)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENT, "STATEMENT"), root_2);

                adaptor.addChild(root_2, stream_t.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_view_stmt"

    public static class drop_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_view_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP440=null;
        Token VIEW441=null;
        Token IF442=null;
        Token EXISTS443=null;
        Token DOT444=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP440_tree=null;
        Object VIEW441_tree=null;
        Object IF442_tree=null;
        Object EXISTS443_tree=null;
        Object DOT444_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP440=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3804); 
            DROP440_tree = (Object)adaptor.create(DROP440);
            adaptor.addChild(root_0, DROP440_tree);

            VIEW441=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3806); 
            VIEW441_tree = (Object)adaptor.create(VIEW441);
            adaptor.addChild(root_0, VIEW441_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:27: ( IF EXISTS )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==IF) ) {
                int LA160_1 = input.LA(2);

                if ( (LA160_1==EXISTS) ) {
                    alt160=1;
                }
            }
            switch (alt160) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:28: IF EXISTS
                    {
                    IF442=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3809); 
                    IF442_tree = (Object)adaptor.create(IF442);
                    adaptor.addChild(root_0, IF442_tree);

                    EXISTS443=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3811); 
                    EXISTS443_tree = (Object)adaptor.create(EXISTS443);
                    adaptor.addChild(root_0, EXISTS443_tree);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:40: (database_name= id DOT )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==ID||LA161_0==STRING) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==DOT) ) {
                    alt161=1;
                }
            }
            else if ( ((LA161_0>=EXPLAIN && LA161_0<=PLAN)||(LA161_0>=INDEXED && LA161_0<=BY)||(LA161_0>=OR && LA161_0<=ESCAPE)||(LA161_0>=IS && LA161_0<=BETWEEN)||LA161_0==COLLATE||(LA161_0>=DISTINCT && LA161_0<=THEN)||(LA161_0>=CURRENT_TIME && LA161_0<=CURRENT_TIMESTAMP)||(LA161_0>=RAISE && LA161_0<=ROW)) ) {
                int LA161_2 = input.LA(2);

                if ( (LA161_2==DOT) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3818);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT444=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3820); 
                    DOT444_tree = (Object)adaptor.create(DOT444);
                    adaptor.addChild(root_0, DOT444_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3826);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_view_stmt"

    public static class create_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_index_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE445=null;
        Token UNIQUE446=null;
        Token INDEX447=null;
        Token IF448=null;
        Token NOT449=null;
        Token EXISTS450=null;
        Token DOT451=null;
        Token ON452=null;
        Token LPAREN453=null;
        Token COMMA454=null;
        Token RPAREN455=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE445_tree=null;
        Object UNIQUE446_tree=null;
        Object INDEX447_tree=null;
        Object IF448_tree=null;
        Object NOT449_tree=null;
        Object EXISTS450_tree=null;
        Object DOT451_tree=null;
        Object ON452_tree=null;
        Object LPAREN453_tree=null;
        Object COMMA454_tree=null;
        Object RPAREN455_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_indexed_column=new RewriteRuleSubtreeStream(adaptor,"rule indexed_column");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE445=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3834);  
            stream_CREATE.add(CREATE445);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:27: ( UNIQUE )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==UNIQUE) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:28: UNIQUE
                    {
                    UNIQUE446=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3837);  
                    stream_UNIQUE.add(UNIQUE446);


                    }
                    break;

            }

            INDEX447=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3841);  
            stream_INDEX.add(INDEX447);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:43: ( IF NOT EXISTS )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==IF) ) {
                int LA163_1 = input.LA(2);

                if ( (LA163_1==NOT) ) {
                    alt163=1;
                }
            }
            switch (alt163) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:44: IF NOT EXISTS
                    {
                    IF448=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3844);  
                    stream_IF.add(IF448);

                    NOT449=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3846);  
                    stream_NOT.add(NOT449);

                    EXISTS450=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3848);  
                    stream_EXISTS.add(EXISTS450);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:60: (database_name= id DOT )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==ID||LA164_0==STRING) ) {
                int LA164_1 = input.LA(2);

                if ( (LA164_1==DOT) ) {
                    alt164=1;
                }
            }
            else if ( ((LA164_0>=EXPLAIN && LA164_0<=PLAN)||(LA164_0>=INDEXED && LA164_0<=BY)||(LA164_0>=OR && LA164_0<=ESCAPE)||(LA164_0>=IS && LA164_0<=BETWEEN)||LA164_0==COLLATE||(LA164_0>=DISTINCT && LA164_0<=THEN)||(LA164_0>=CURRENT_TIME && LA164_0<=CURRENT_TIMESTAMP)||(LA164_0>=RAISE && LA164_0<=ROW)) ) {
                int LA164_2 = input.LA(2);

                if ( (LA164_2==DOT) ) {
                    alt164=1;
                }
            }
            switch (alt164) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3855);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT451=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3857);  
                    stream_DOT.add(DOT451);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3863);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON452=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3867);  
            stream_ON.add(ON452);

            pushFollow(FOLLOW_id_in_create_index_stmt3871);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN453=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3873);  
            stream_LPAREN.add(LPAREN453);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3877);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:51: ( COMMA columns+= indexed_column )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==COMMA) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:52: COMMA columns+= indexed_column
            	    {
            	    COMMA454=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3880);  
            	    stream_COMMA.add(COMMA454);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3884);
            	    columns=indexed_column();

            	    state._fsp--;

            	    stream_indexed_column.add(columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);

            RPAREN455=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3888);  
            stream_RPAREN.add(RPAREN455);



            // AST REWRITE
            // elements: table_name, index_name, UNIQUE, database_name, columns, EXISTS
            // token labels: 
            // rule labels: database_name, index_name, retval, table_name
            // token list labels: 
            // rule list labels: columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_columns=new RewriteRuleSubtreeStream(adaptor,"token columns",list_columns);
            root_0 = (Object)adaptor.nil();
            // 489:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:89: ^( COLUMNS ( $columns)+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                    if ( !(stream_columns.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_columns.hasNext() ) {
                        adaptor.addChild(root_2, stream_columns.nextTree());

                    }
                    stream_columns.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_columns.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_index_stmt"

    public static class indexed_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexed_column"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE456=null;
        Token ASC457=null;
        Token DESC458=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE456_tree=null;
        Object ASC457_tree=null;
        Object DESC458_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3934);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:32: ( COLLATE collation_name= id )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==COLLATE) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:33: COLLATE collation_name= id
                    {
                    COLLATE456=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3937);  
                    stream_COLLATE.add(COLLATE456);

                    pushFollow(FOLLOW_id_in_indexed_column3941);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:61: ( ASC | DESC )?
            int alt167=3;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==ASC) ) {
                alt167=1;
            }
            else if ( (LA167_0==DESC) ) {
                alt167=2;
            }
            switch (alt167) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:62: ASC
                    {
                    ASC457=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3946);  
                    stream_ASC.add(ASC457);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:68: DESC
                    {
                    DESC458=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3950);  
                    stream_DESC.add(DESC458);


                    }
                    break;

            }



            // AST REWRITE
            // elements: COLLATE, collation_name, DESC, column_name, ASC
            // token labels: 
            // rule labels: retval, collation_name, column_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_collation_name=new RewriteRuleSubtreeStream(adaptor,"rule collation_name",collation_name!=null?collation_name.tree:null);
            RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name",column_name!=null?column_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 492:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:19: ( ^( COLLATE $collation_name) )?
                if ( stream_COLLATE.hasNext()||stream_collation_name.hasNext() ) {
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_COLLATE.reset();
                stream_collation_name.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:52: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, stream_DESC.nextNode());

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indexed_column"

    public static class drop_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_index_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP459=null;
        Token INDEX460=null;
        Token IF461=null;
        Token EXISTS462=null;
        Token DOT463=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP459_tree=null;
        Object INDEX460_tree=null;
        Object IF461_tree=null;
        Object EXISTS462_tree=null;
        Object DOT463_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP459=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3981);  
            stream_DROP.add(DROP459);

            INDEX460=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3983);  
            stream_INDEX.add(INDEX460);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:29: ( IF EXISTS )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==IF) ) {
                int LA168_1 = input.LA(2);

                if ( (LA168_1==EXISTS) ) {
                    alt168=1;
                }
            }
            switch (alt168) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:30: IF EXISTS
                    {
                    IF461=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3986);  
                    stream_IF.add(IF461);

                    EXISTS462=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3988);  
                    stream_EXISTS.add(EXISTS462);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:42: (database_name= id DOT )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==ID||LA169_0==STRING) ) {
                int LA169_1 = input.LA(2);

                if ( (LA169_1==DOT) ) {
                    alt169=1;
                }
            }
            else if ( ((LA169_0>=EXPLAIN && LA169_0<=PLAN)||(LA169_0>=INDEXED && LA169_0<=BY)||(LA169_0>=OR && LA169_0<=ESCAPE)||(LA169_0>=IS && LA169_0<=BETWEEN)||LA169_0==COLLATE||(LA169_0>=DISTINCT && LA169_0<=THEN)||(LA169_0>=CURRENT_TIME && LA169_0<=CURRENT_TIMESTAMP)||(LA169_0>=RAISE && LA169_0<=ROW)) ) {
                int LA169_2 = input.LA(2);

                if ( (LA169_2==DOT) ) {
                    alt169=1;
                }
            }
            switch (alt169) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3995);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT463=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3997);  
                    stream_DOT.add(DOT463);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt4003);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());


            // AST REWRITE
            // elements: database_name, index_name, EXISTS
            // token labels: 
            // rule labels: index_name, database_name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 496:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:50: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_index_stmt"

    public static class create_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_trigger_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) ) ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE464=null;
        Token TEMPORARY465=null;
        Token TRIGGER466=null;
        Token IF467=null;
        Token NOT468=null;
        Token EXISTS469=null;
        Token DOT470=null;
        Token BEFORE471=null;
        Token AFTER472=null;
        Token INSTEAD473=null;
        Token OF474=null;
        Token DELETE475=null;
        Token INSERT476=null;
        Token UPDATE477=null;
        Token OF478=null;
        Token COMMA479=null;
        Token ON480=null;
        Token FOR481=null;
        Token EACH482=null;
        Token ROW483=null;
        Token WHEN484=null;
        Token BEGIN486=null;
        Token SEMI491=null;
        Token END492=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr485 = null;

        SqlParser.update_stmt_return update_stmt487 = null;

        SqlParser.insert_stmt_return insert_stmt488 = null;

        SqlParser.delete_stmt_return delete_stmt489 = null;

        SqlParser.select_stmt_return select_stmt490 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE464_tree=null;
        Object TEMPORARY465_tree=null;
        Object TRIGGER466_tree=null;
        Object IF467_tree=null;
        Object NOT468_tree=null;
        Object EXISTS469_tree=null;
        Object DOT470_tree=null;
        Object BEFORE471_tree=null;
        Object AFTER472_tree=null;
        Object INSTEAD473_tree=null;
        Object OF474_tree=null;
        Object DELETE475_tree=null;
        Object INSERT476_tree=null;
        Object UPDATE477_tree=null;
        Object OF478_tree=null;
        Object COMMA479_tree=null;
        Object ON480_tree=null;
        Object FOR481_tree=null;
        Object EACH482_tree=null;
        Object ROW483_tree=null;
        Object WHEN484_tree=null;
        Object BEGIN486_tree=null;
        Object SEMI491_tree=null;
        Object END492_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_ROW=new RewriteRuleTokenStream(adaptor,"token ROW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_TRIGGER=new RewriteRuleTokenStream(adaptor,"token TRIGGER");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_INSTEAD=new RewriteRuleTokenStream(adaptor,"token INSTEAD");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_insert_stmt=new RewriteRuleSubtreeStream(adaptor,"rule insert_stmt");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_delete_stmt=new RewriteRuleSubtreeStream(adaptor,"rule delete_stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_update_stmt=new RewriteRuleSubtreeStream(adaptor,"rule update_stmt");
        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            CREATE464=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt4033);  
            stream_CREATE.add(CREATE464);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:29: ( TEMPORARY )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==TEMPORARY) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:29: TEMPORARY
                    {
                    TEMPORARY465=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt4035);  
                    stream_TEMPORARY.add(TEMPORARY465);


                    }
                    break;

            }

            TRIGGER466=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt4038);  
            stream_TRIGGER.add(TRIGGER466);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:48: ( IF NOT EXISTS )?
            int alt171=2;
            alt171 = dfa171.predict(input);
            switch (alt171) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:49: IF NOT EXISTS
                    {
                    IF467=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt4041);  
                    stream_IF.add(IF467);

                    NOT468=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt4043);  
                    stream_NOT.add(NOT468);

                    EXISTS469=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt4045);  
                    stream_EXISTS.add(EXISTS469);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:65: (database_name= id DOT )?
            int alt172=2;
            alt172 = dfa172.predict(input);
            switch (alt172) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt4052);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT470=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt4054);  
                    stream_DOT.add(DOT470);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt4060);
            trigger_name=id();

            state._fsp--;

            stream_id.add(trigger_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt173=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt173=1;
                    }
                    break;
                case AFTER:
                    {
                    alt173=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt173=3;
                    }
                    break;
            }

            switch (alt173) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:4: BEFORE
                    {
                    BEFORE471=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt4065);  
                    stream_BEFORE.add(BEFORE471);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:13: AFTER
                    {
                    AFTER472=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt4069);  
                    stream_AFTER.add(AFTER472);


                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:21: INSTEAD OF
                    {
                    INSTEAD473=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt4073);  
                    stream_INSTEAD.add(INSTEAD473);

                    OF474=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt4075);  
                    stream_OF.add(OF474);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt176=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt176=1;
                }
                break;
            case INSERT:
                {
                alt176=2;
                }
                break;
            case UPDATE:
                {
                alt176=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }

            switch (alt176) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:35: DELETE
                    {
                    DELETE475=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt4080);  
                    stream_DELETE.add(DELETE475);


                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:44: INSERT
                    {
                    INSERT476=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt4084);  
                    stream_INSERT.add(INSERT476);


                    }
                    break;
                case 3 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE477=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt4088);  
                    stream_UPDATE.add(UPDATE477);

                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==OF) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF478=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt4091);  
                            stream_OF.add(OF478);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt4095);
                            column_names=id();

                            state._fsp--;

                            stream_id.add(column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:81: ( COMMA column_names+= id )*
                            loop174:
                            do {
                                int alt174=2;
                                int LA174_0 = input.LA(1);

                                if ( (LA174_0==COMMA) ) {
                                    alt174=1;
                                }


                                switch (alt174) {
                            	case 1 :
                            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:82: COMMA column_names+= id
                            	    {
                            	    COMMA479=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt4098);  
                            	    stream_COMMA.add(COMMA479);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt4102);
                            	    column_names=id();

                            	    state._fsp--;

                            	    stream_id.add(column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop174;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            ON480=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt4111);  
            stream_ON.add(ON480);

            pushFollow(FOLLOW_id_in_create_trigger_stmt4115);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:20: ( FOR EACH ROW )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==FOR) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:21: FOR EACH ROW
                    {
                    FOR481=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt4118);  
                    stream_FOR.add(FOR481);

                    EACH482=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt4120);  
                    stream_EACH.add(EACH482);

                    ROW483=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt4122);  
                    stream_ROW.add(ROW483);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:36: ( WHEN expr )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==WHEN) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:37: WHEN expr
                    {
                    WHEN484=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt4127);  
                    stream_WHEN.add(WHEN484);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt4129);
                    expr485=expr();

                    state._fsp--;

                    stream_expr.add(expr485.getTree());

                    }
                    break;

            }

            BEGIN486=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt4135);  
            stream_BEGIN.add(BEGIN486);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt180=0;
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==REPLACE||LA180_0==SELECT||LA180_0==INSERT||LA180_0==UPDATE||LA180_0==DELETE) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt179=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt179=1;
            	        }
            	        break;
            	    case REPLACE:
            	    case INSERT:
            	        {
            	        alt179=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt179=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt179=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 179, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt179) {
            	        case 1 :
            	            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt4139);
            	            update_stmt487=update_stmt();

            	            state._fsp--;

            	            stream_update_stmt.add(update_stmt487.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt4143);
            	            insert_stmt488=insert_stmt();

            	            state._fsp--;

            	            stream_insert_stmt.add(insert_stmt488.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt4147);
            	            delete_stmt489=delete_stmt();

            	            state._fsp--;

            	            stream_delete_stmt.add(delete_stmt489.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt4151);
            	            select_stmt490=select_stmt();

            	            state._fsp--;

            	            stream_select_stmt.add(select_stmt490.getTree());

            	            }
            	            break;

            	    }

            	    SEMI491=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt4154);  
            	    stream_SEMI.add(SEMI491);


            	    }
            	    break;

            	default :
            	    if ( cnt180 >= 1 ) break loop180;
                        EarlyExitException eee =
                            new EarlyExitException(180, input);
                        throw eee;
                }
                cnt180++;
            } while (true);

            END492=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt4158);  
            stream_END.add(END492);



            // AST REWRITE
            // elements: table_name, TEMPORARY, database_name, trigger_name
            // token labels: 
            // rule labels: database_name, retval, table_name, trigger_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_trigger_name=new RewriteRuleSubtreeStream(adaptor,"rule trigger_name",trigger_name!=null?trigger_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 503:1: -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) )
            {
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:4: ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TRIGGER, "CREATE_TRIGGER"), root_1);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:21: ^( OPTIONS ( TEMPORARY )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:31: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:43: ^( $trigger_name $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_trigger_name.nextNode(), root_2);

                adaptor.addChild(root_2, stream_table_name.nextTree());
                // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:71: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_trigger_stmt"

    public static class drop_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_trigger_stmt"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP493=null;
        Token TRIGGER494=null;
        Token IF495=null;
        Token EXISTS496=null;
        Token DOT497=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP493_tree=null;
        Object TRIGGER494_tree=null;
        Object IF495_tree=null;
        Object EXISTS496_tree=null;
        Object DOT497_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP493=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt4191); 
            DROP493_tree = (Object)adaptor.create(DROP493);
            adaptor.addChild(root_0, DROP493_tree);

            TRIGGER494=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt4193); 
            TRIGGER494_tree = (Object)adaptor.create(TRIGGER494);
            adaptor.addChild(root_0, TRIGGER494_tree);

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:33: ( IF EXISTS )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==IF) ) {
                int LA181_1 = input.LA(2);

                if ( (LA181_1==EXISTS) ) {
                    alt181=1;
                }
            }
            switch (alt181) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:34: IF EXISTS
                    {
                    IF495=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt4196); 
                    IF495_tree = (Object)adaptor.create(IF495);
                    adaptor.addChild(root_0, IF495_tree);

                    EXISTS496=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt4198); 
                    EXISTS496_tree = (Object)adaptor.create(EXISTS496);
                    adaptor.addChild(root_0, EXISTS496_tree);


                    }
                    break;

            }

            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:46: (database_name= id DOT )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==ID||LA182_0==STRING) ) {
                int LA182_1 = input.LA(2);

                if ( (LA182_1==DOT) ) {
                    alt182=1;
                }
            }
            else if ( ((LA182_0>=EXPLAIN && LA182_0<=PLAN)||(LA182_0>=INDEXED && LA182_0<=BY)||(LA182_0>=OR && LA182_0<=ESCAPE)||(LA182_0>=IS && LA182_0<=BETWEEN)||LA182_0==COLLATE||(LA182_0>=DISTINCT && LA182_0<=THEN)||(LA182_0>=CURRENT_TIME && LA182_0<=CURRENT_TIMESTAMP)||(LA182_0>=RAISE && LA182_0<=ROW)) ) {
                int LA182_2 = input.LA(2);

                if ( (LA182_2==DOT) ) {
                    alt182=1;
                }
            }
            switch (alt182) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt4205);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT497=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt4207); 
                    DOT497_tree = (Object)adaptor.create(DOT497);
                    adaptor.addChild(root_0, DOT497_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt4213);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_trigger_stmt"

    public static class id_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id_core"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:509:1: id_core : str= ( ID | STRING ) ;
    public final SqlParser.id_core_return id_core() throws RecognitionException {
        SqlParser.id_core_return retval = new SqlParser.id_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token str=null;

        Object str_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:509:8: (str= ( ID | STRING ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:509:10: str= ( ID | STRING )
            {
            root_0 = (Object)adaptor.nil();

            str=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(str));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             str.setText(unquoteId((str!=null?str.getText():null)));

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id_core"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:1: id : ( id_core | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_core_return id_core498 = null;

        SqlParser.keyword_return keyword499 = null;



        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:3: ( id_core | keyword )
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==ID||LA183_0==STRING) ) {
                alt183=1;
            }
            else if ( ((LA183_0>=EXPLAIN && LA183_0<=PLAN)||(LA183_0>=INDEXED && LA183_0<=BY)||(LA183_0>=OR && LA183_0<=ESCAPE)||(LA183_0>=IS && LA183_0<=BETWEEN)||LA183_0==COLLATE||(LA183_0>=DISTINCT && LA183_0<=THEN)||(LA183_0>=CURRENT_TIME && LA183_0<=CURRENT_TIMESTAMP)||(LA183_0>=RAISE && LA183_0<=ROW)) ) {
                alt183=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;
            }
            switch (alt183) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:5: id_core
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_core_in_id4242);
                    id_core498=id_core();

                    state._fsp--;

                    adaptor.addChild(root_0, id_core498.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:15: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id4246);
                    keyword499=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword499.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:515:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set500=null;

        Object set500_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:515:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:515:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set500=(Token)input.LT(1);
            if ( (input.LA(1)>=EXPLAIN && input.LA(1)<=PLAN)||(input.LA(1)>=INDEXED && input.LA(1)<=BY)||(input.LA(1)>=OR && input.LA(1)<=ESCAPE)||(input.LA(1)>=IS && input.LA(1)<=BETWEEN)||input.LA(1)==COLLATE||(input.LA(1)>=DISTINCT && input.LA(1)<=THEN)||(input.LA(1)>=CURRENT_TIME && input.LA(1)<=CURRENT_TIMESTAMP)||(input.LA(1)>=RAISE && input.LA(1)<=ROW) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set500));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword"

    public static class id_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id_column_def"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:1: id_column_def : ( id_core | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_core_return id_core501 = null;

        SqlParser.keyword_column_def_return keyword_column_def502 = null;



        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:14: ( id_core | keyword_column_def )
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==ID||LA184_0==STRING) ) {
                alt184=1;
            }
            else if ( ((LA184_0>=EXPLAIN && LA184_0<=PLAN)||(LA184_0>=INDEXED && LA184_0<=IN)||(LA184_0>=ISNULL && LA184_0<=BETWEEN)||(LA184_0>=LIKE && LA184_0<=MATCH)||LA184_0==COLLATE||(LA184_0>=DISTINCT && LA184_0<=THEN)||(LA184_0>=CURRENT_TIME && LA184_0<=CURRENT_TIMESTAMP)||(LA184_0>=RAISE && LA184_0<=EXISTS)||(LA184_0>=PRIMARY && LA184_0<=ADD)||(LA184_0>=VIEW && LA184_0<=ROW)) ) {
                alt184=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 184, 0, input);

                throw nvae;
            }
            switch (alt184) {
                case 1 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:16: id_core
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_core_in_id_column_def4920);
                    id_core501=id_core();

                    state._fsp--;

                    adaptor.addChild(root_0, id_core501.getTree());

                    }
                    break;
                case 2 :
                    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:26: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4924);
                    keyword_column_def502=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def502.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id_column_def"

    public static class keyword_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword_column_def"
    // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:636:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set503=null;

        Object set503_tree=null;

        try {
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:636:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // /home/kitaev/sqljet-1.0.7-rc1/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:636:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set503=(Token)input.LT(1);
            if ( (input.LA(1)>=EXPLAIN && input.LA(1)<=PLAN)||(input.LA(1)>=INDEXED && input.LA(1)<=IN)||(input.LA(1)>=ISNULL && input.LA(1)<=BETWEEN)||(input.LA(1)>=LIKE && input.LA(1)<=MATCH)||input.LA(1)==COLLATE||(input.LA(1)>=DISTINCT && input.LA(1)<=THEN)||(input.LA(1)>=CURRENT_TIME && input.LA(1)<=CURRENT_TIMESTAMP)||(input.LA(1)>=RAISE && input.LA(1)<=EXISTS)||(input.LA(1)>=PRIMARY && input.LA(1)<=ADD)||(input.LA(1)>=VIEW && input.LA(1)<=ROW) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set503));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword_column_def"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA126 dfa126 = new DFA126(this);
    protected DFA127 dfa127 = new DFA127(this);
    protected DFA129 dfa129 = new DFA129(this);
    protected DFA130 dfa130 = new DFA130(this);
    protected DFA131 dfa131 = new DFA131(this);
    protected DFA132 dfa132 = new DFA132(this);
    protected DFA133 dfa133 = new DFA133(this);
    protected DFA134 dfa134 = new DFA134(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA145 dfa145 = new DFA145(this);
    protected DFA146 dfa146 = new DFA146(this);
    protected DFA147 dfa147 = new DFA147(this);
    protected DFA151 dfa151 = new DFA151(this);
    protected DFA171 dfa171 = new DFA171(this);
    protected DFA172 dfa172 = new DFA172(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\1\1\25\uffff";
    static final String DFA1_minS =
        "\1\45\25\uffff";
    static final String DFA1_maxS =
        "\1\u00aa\25\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\1\23\uffff";
    static final String DFA1_specialS =
        "\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\60\uffff\1\2\16\uffff\1\2\2\uffff\2\2\1\uffff\5\2\11\uffff"+
            "\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\21\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 142:32: ( sql_stmt SEMI )*";
        }
    }
    static final String DFA5_eotS =
        "\25\uffff";
    static final String DFA5_eofS =
        "\25\uffff";
    static final String DFA5_minS =
        "\1\45\24\uffff";
    static final String DFA5_maxS =
        "\1\u00aa\24\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA5_specialS =
        "\25\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\60\uffff\1\2\16\uffff\1\2\2\uffff\2\2\1\uffff\5\2\11\uffff"+
            "\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\21\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "146:11: ( EXPLAIN ( QUERY PLAN )? )?";
        }
    }
    static final String DFA4_eotS =
        "\25\uffff";
    static final String DFA4_eofS =
        "\25\uffff";
    static final String DFA4_minS =
        "\1\46\24\uffff";
    static final String DFA4_maxS =
        "\1\u00aa\24\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA4_specialS =
        "\25\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\57\uffff\1\2\16\uffff\1\2\2\uffff\2\2\1\uffff\5\2\11\uffff"+
            "\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\21\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "146:20: ( QUERY PLAN )?";
        }
    }
    static final String DFA6_eotS =
        "\42\uffff";
    static final String DFA6_eofS =
        "\42\uffff";
    static final String DFA6_minS =
        "\1\126\20\uffff\1\u0098\1\u0099\2\uffff\1\u0099\14\uffff";
    static final String DFA6_maxS =
        "\1\u00aa\20\uffff\2\u00b0\2\uffff\1\u00b0\14\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\30\1\26\1\uffff"+
        "\1\24\1\21\1\22\1\25\1\27\1\31\3\uffff";
    static final String DFA6_specialS =
        "\42\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\15\16\uffff\1\16\2\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6"+
            "\1\10\11\uffff\1\7\14\uffff\1\10\3\uffff\1\12\1\uffff\1\13\1"+
            "\14\4\uffff\1\15\1\uffff\1\17\1\20\1\uffff\1\21\21\uffff\1\22"+
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\32\1\25\6\uffff\1\27\14\uffff\1\31\1\27\1\26",
            "\1\33\24\uffff\1\34\1\35\1\36",
            "",
            "",
            "\1\32\24\uffff\1\31\1\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "148:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
        }
    }
    static final String DFA8_eotS =
        "\25\uffff";
    static final String DFA8_eofS =
        "\1\uffff\2\3\22\uffff";
    static final String DFA8_minS =
        "\1\45\2\44\22\uffff";
    static final String DFA8_maxS =
        "\1\u00b7\2\u008b\22\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\2\7\uffff\1\1\11\uffff";
    static final String DFA8_specialS =
        "\25\uffff}>";
    static final String[] DFA8_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\1\1\uffff\3\2\3\uffff\125\2",
            "\1\3\3\uffff\1\13\1\3\1\uffff\1\3\106\uffff\2\3\7\uffff\1\3"+
            "\17\uffff\1\3",
            "\1\3\3\uffff\1\13\1\3\1\uffff\1\3\106\uffff\2\3\7\uffff\1\3"+
            "\17\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "180:23: (database_name= id DOT )?";
        }
    }
    static final String DFA10_eotS =
        "\142\uffff";
    static final String DFA10_eofS =
        "\1\1\34\uffff\1\1\104\uffff";
    static final String DFA10_minS =
        "\1\44\34\uffff\1\44\21\uffff\1\45\2\uffff\1\45\6\50\51\uffff";
    static final String DFA10_maxS =
        "\1\u00b7\34\uffff\1\u00b7\21\uffff\1\u00b7\2\uffff\1\u00b7\1\52"+
        "\3\171\1\52\1\131\51\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\35\uffff\1\1\102\uffff";
    static final String DFA10_specialS =
        "\142\uffff}>";
    static final String[] DFA10_transitionS = {
            "\4\1\1\uffff\2\1\1\uffff\1\35\2\1\2\uffff\2\1\3\uffff\3\1\26"+
            "\uffff\12\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\3\37\1\uffff\6\37\1\uffff\1\37\2\1\3\uffff\3\37\17\uffff"+
            "\2\37\4\uffff\44\37\1\67\1\70\1\37\1\64\1\37\1\65\1\66\1\37"+
            "\1\57\1\62\1\63\73\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\37\2\1\1\uffff\3\1\1\uffff\1\1\5\uffff\3\1\26\uffff"+
            "\12\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "\3\1\1\37\6\1\1\uffff\1\1\5\uffff\3\1\17\uffff\2\1\4\uffff"+
            "\152\1",
            "\1\37\1\uffff\1\1",
            "\1\37\115\uffff\1\1\2\uffff\1\1",
            "\1\37\120\uffff\1\1",
            "\1\37\120\uffff\1\1",
            "\1\37\1\uffff\1\1",
            "\1\37\60\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 182:18: ( OR or_subexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\143\uffff";
    static final String DFA11_eofS =
        "\1\1\35\uffff\1\1\104\uffff";
    static final String DFA11_minS =
        "\1\44\35\uffff\1\44\2\uffff\2\45\6\50\72\uffff";
    static final String DFA11_maxS =
        "\1\u00b7\35\uffff\1\u00b7\2\uffff\2\u00b7\1\52\3\171\1\52\1\131"+
        "\72\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\52\uffff\1\1\66\uffff";
    static final String DFA11_specialS =
        "\143\uffff}>";
    static final String[] DFA11_transitionS = {
            "\4\1\1\uffff\2\1\1\uffff\1\1\1\36\1\1\2\uffff\2\1\3\uffff\3"+
            "\1\26\uffff\12\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\3\54\1\uffff\6\54\1\uffff\1\54\2\1\3\uffff\3\54\17\uffff"+
            "\2\54\4\uffff\44\54\1\47\1\50\1\54\1\44\1\54\1\45\1\46\1\54"+
            "\1\41\1\42\1\43\73\54",
            "",
            "",
            "\3\1\1\54\2\1\1\uffff\3\1\1\uffff\1\1\5\uffff\3\1\26\uffff"+
            "\12\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "\3\1\1\54\6\1\1\uffff\1\1\5\uffff\3\1\17\uffff\2\1\4\uffff"+
            "\152\1",
            "\1\54\1\uffff\1\1",
            "\1\54\115\uffff\1\1\2\uffff\1\1",
            "\1\54\120\uffff\1\1",
            "\1\54\120\uffff\1\1",
            "\1\54\1\uffff\1\1",
            "\1\54\60\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 184:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA12_eotS =
        "\172\uffff";
    static final String DFA12_eofS =
        "\1\12\6\uffff\2\12\161\uffff";
    static final String DFA12_minS =
        "\1\44\6\uffff\2\44\57\uffff\2\45\6\50\72\uffff";
    static final String DFA12_maxS =
        "\1\u00b7\6\uffff\1\174\1\u00b7\57\uffff\2\u00b7\1\52\3\171\1\52"+
        "\1\131\72\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\157\uffff";
    static final String DFA12_specialS =
        "\172\uffff}>";
    static final String[] DFA12_transitionS = {
            "\4\12\1\uffff\2\12\1\1\3\12\1\1\1\uffff\2\12\3\1\1\7\1\12\1"+
            "\10\7\1\17\uffff\12\12\2\uffff\1\12\1\uffff\3\12\3\uffff\125"+
            "\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\6\uffff\1\1\5\uffff\2\12\4\uffff\1\1\72\uffff\2\12\1"+
            "\uffff\1\12\1\uffff\2\12\1\uffff\3\12",
            "\1\12\3\1\1\uffff\6\1\1\uffff\1\1\2\12\3\uffff\3\1\17\uffff"+
            "\2\1\4\uffff\44\1\1\76\1\77\1\1\1\73\1\1\1\74\1\75\1\1\1\70"+
            "\1\71\1\72\73\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\12\1\1\2\12\1\uffff\3\12\1\uffff\1\12\5\uffff\3\12\26\uffff"+
            "\12\12\2\uffff\1\12\1\uffff\3\12\3\uffff\125\12",
            "\3\12\1\1\6\12\1\uffff\1\12\5\uffff\3\12\17\uffff\2\12\4\uffff"+
            "\152\12",
            "\1\1\1\uffff\1\12",
            "\1\1\115\uffff\1\12\2\uffff\1\12",
            "\1\1\120\uffff\1\12",
            "\1\1\120\uffff\1\12",
            "\1\1\1\uffff\1\12",
            "\1\1\60\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "186:34: ( cond_expr )?";
        }
    }
    static final String DFA26_eotS =
        "\u00a3\uffff";
    static final String DFA26_eofS =
        "\u00a3\uffff";
    static final String DFA26_minS =
        "\1\53\1\57\1\uffff\2\45\2\uffff\1\53\3\uffff\1\45\3\uffff\1\45\2"+
        "\uffff\1\45\22\uffff\2\45\22\uffff\1\45\3\uffff\1\45\145\uffff";
    static final String DFA26_maxS =
        "\2\77\1\uffff\2\u00b7\2\uffff\1\67\3\uffff\1\u00b7\3\uffff\1\u00b7"+
        "\2\uffff\1\u00b7\22\uffff\2\u00b7\22\uffff\1\u00b7\3\uffff\1\u00b7"+
        "\145\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\2\uffff\1\6\2\uffff\1\10\1\11\4\uffff\1\5\1\uffff\1"+
        "\3\30\uffff\1\2\22\uffff\1\4\24\uffff\1\6\1\7\40\uffff\1\2\57\uffff";
    static final String DFA26_specialS =
        "\u00a3\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\3\uffff\1\3\3\uffff\1\4\2\5\1\7\1\uffff\1\10\3\11\4\2",
            "\1\13\3\uffff\1\16\3\uffff\1\5\1\10\3\uffff\4\2",
            "",
            "\3\20\1\uffff\2\20\1\uffff\3\20\1\uffff\1\17\5\uffff\3\20\26"+
            "\uffff\12\20\2\uffff\1\20\1\uffff\3\20\3\uffff\125\20",
            "\3\11\1\uffff\6\11\1\uffff\1\22\5\uffff\3\11\17\uffff\2\11"+
            "\4\uffff\152\11",
            "",
            "",
            "\1\45\13\uffff\1\5",
            "",
            "",
            "",
            "\3\20\1\uffff\2\20\1\uffff\3\20\1\uffff\1\46\5\uffff\3\20\26"+
            "\uffff\12\20\2\uffff\1\20\1\uffff\3\20\3\uffff\125\20",
            "",
            "",
            "",
            "\3\51\1\uffff\6\51\1\uffff\1\51\1\uffff\1\74\3\uffff\3\51\17"+
            "\uffff\2\51\4\uffff\53\51\1\71\76\51",
            "",
            "",
            "\3\11\1\uffff\6\11\1\uffff\1\11\1\uffff\1\16\3\uffff\3\11\17"+
            "\uffff\2\11\4\uffff\53\11\1\75\76\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\122\1\uffff\6\122\1\uffff\1\122\5\uffff\1\122\1\121\1\122"+
            "\17\uffff\2\122\4\uffff\152\122",
            "\3\51\1\uffff\6\51\1\uffff\1\51\1\uffff\1\74\3\uffff\3\51\17"+
            "\uffff\2\51\4\uffff\53\51\1\163\76\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\74\1\51\6\74\1\uffff\1\74\5\uffff\3\74\17\uffff\3\74\3\uffff"+
            "\152\74",
            "",
            "",
            "",
            "\3\16\1\11\6\16\1\uffff\1\16\5\uffff\3\16\17\uffff\3\16\3\uffff"+
            "\152\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "188:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN LPAREN ( select_stmt )? RPAREN | ( NOT )? EQUALS LPAREN ( select_stmt )? RPAREN | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );";
        }
    }
    static final String DFA14_eotS =
        "\144\uffff";
    static final String DFA14_eofS =
        "\2\2\142\uffff";
    static final String DFA14_minS =
        "\2\44\40\uffff\2\45\6\50\72\uffff";
    static final String DFA14_maxS =
        "\2\u00b7\40\uffff\2\u00b7\1\52\3\171\1\52\1\131\72\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\52\uffff\1\1\66\uffff";
    static final String DFA14_specialS =
        "\144\uffff}>";
    static final String[] DFA14_transitionS = {
            "\4\2\1\uffff\2\2\1\uffff\2\2\1\1\2\uffff\2\2\3\uffff\3\2\26"+
            "\uffff\12\2\2\uffff\1\2\1\uffff\3\2\3\uffff\125\2",
            "\1\2\3\55\1\uffff\6\55\1\uffff\1\55\2\2\3\uffff\3\55\17\uffff"+
            "\2\55\4\uffff\44\55\1\50\1\51\1\55\1\45\1\55\1\46\1\47\1\55"+
            "\1\42\1\43\1\44\73\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\2\1\55\2\2\1\uffff\3\2\1\uffff\1\2\5\uffff\3\2\26\uffff"+
            "\12\2\2\uffff\1\2\1\uffff\3\2\3\uffff\125\2",
            "\3\2\1\55\6\2\1\uffff\1\2\5\uffff\3\2\17\uffff\2\2\4\uffff"+
            "\152\2",
            "\1\55\1\uffff\1\2",
            "\1\55\115\uffff\1\2\2\uffff\1\2",
            "\1\55\120\uffff\1\2",
            "\1\55\120\uffff\1\2",
            "\1\55\1\uffff\1\2",
            "\1\55\60\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "189:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA18_eotS =
        "\103\uffff";
    static final String DFA18_eofS =
        "\1\uffff\2\3\100\uffff";
    static final String DFA18_minS =
        "\1\45\2\44\100\uffff";
    static final String DFA18_maxS =
        "\3\u00b7\100\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\2\36\uffff\1\1\40\uffff";
    static final String DFA18_specialS =
        "\103\uffff}>";
    static final String[] DFA18_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\1\1\uffff\3\2\3\uffff\125\2",
            "\4\3\1\42\2\3\1\uffff\3\3\2\uffff\2\3\3\uffff\3\3\26\uffff"+
            "\12\3\2\uffff\1\3\1\uffff\3\3\3\uffff\125\3",
            "\4\3\1\42\2\3\1\uffff\3\3\2\uffff\2\3\3\uffff\3\3\26\uffff"+
            "\12\3\2\uffff\1\3\1\uffff\3\3\3\uffff\125\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "191:13: (database_name= id DOT )?";
        }
    }
    static final String DFA25_eotS =
        "\41\uffff";
    static final String DFA25_eofS =
        "\1\1\40\uffff";
    static final String DFA25_minS =
        "\1\44\40\uffff";
    static final String DFA25_maxS =
        "\1\u00b7\40\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\36\uffff\1\1";
    static final String DFA25_specialS =
        "\41\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\1\1\uffff\2\1\1\uffff\3\1\2\uffff\2\1\1\40\2\uffff\3\1\3"+
            "\40\23\uffff\12\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()+ loopback of 197:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+";
        }
    }
    static final String DFA27_eotS =
        "\53\uffff";
    static final String DFA27_eofS =
        "\1\1\52\uffff";
    static final String DFA27_minS =
        "\1\44\52\uffff";
    static final String DFA27_maxS =
        "\1\u00b7\52\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\50\uffff\1\1";
    static final String DFA27_specialS =
        "\53\uffff}>";
    static final String[] DFA27_transitionS = {
            "\4\1\1\uffff\7\1\1\uffff\17\1\4\52\13\uffff\12\1\2\uffff\1\1"+
            "\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 202:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*";
        }
    }
    static final String DFA28_eotS =
        "\54\uffff";
    static final String DFA28_eofS =
        "\1\1\53\uffff";
    static final String DFA28_minS =
        "\1\44\53\uffff";
    static final String DFA28_maxS =
        "\1\u00b7\53\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\51\uffff\1\1";
    static final String DFA28_specialS =
        "\54\uffff}>";
    static final String[] DFA28_transitionS = {
            "\4\1\1\uffff\7\1\1\uffff\23\1\4\53\7\uffff\12\1\2\uffff\1\1"+
            "\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 204:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*";
        }
    }
    static final String DFA29_eotS =
        "\55\uffff";
    static final String DFA29_eofS =
        "\1\1\54\uffff";
    static final String DFA29_minS =
        "\1\44\54\uffff";
    static final String DFA29_maxS =
        "\1\u00b7\54\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\2\52\uffff\1\1";
    static final String DFA29_specialS =
        "\55\uffff}>";
    static final String[] DFA29_transitionS = {
            "\4\1\1\uffff\7\1\1\uffff\27\1\2\54\5\uffff\12\1\2\uffff\1\1"+
            "\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 206:26: ( ( PLUS | MINUS ) add_subexpr )*";
        }
    }
    static final String DFA30_eotS =
        "\56\uffff";
    static final String DFA30_eofS =
        "\1\1\55\uffff";
    static final String DFA30_minS =
        "\1\44\55\uffff";
    static final String DFA30_maxS =
        "\1\u00b7\55\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\2\53\uffff\1\1";
    static final String DFA30_specialS =
        "\56\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\1\1\uffff\7\1\1\uffff\31\1\3\55\2\uffff\12\1\2\uffff\1\1"+
            "\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 208:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*";
        }
    }
    static final String DFA31_eotS =
        "\57\uffff";
    static final String DFA31_eofS =
        "\1\1\56\uffff";
    static final String DFA31_minS =
        "\1\44\56\uffff";
    static final String DFA31_maxS =
        "\1\u00b7\56\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\54\uffff\1\1";
    static final String DFA31_specialS =
        "\57\uffff}>";
    static final String[] DFA31_transitionS = {
            "\4\1\1\uffff\7\1\1\uffff\34\1\1\56\1\uffff\12\1\2\uffff\1\1"+
            "\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 210:26: ( DOUBLE_PIPE con_subexpr )*";
        }
    }
    static final String DFA32_eotS =
        "\23\uffff";
    static final String DFA32_eofS =
        "\23\uffff";
    static final String DFA32_minS =
        "\1\45\22\uffff";
    static final String DFA32_maxS =
        "\1\u00b7\22\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA32_specialS =
        "\23\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\1\1\uffff\2\1\1\22\3\1\1\uffff\1\1\5\uffff\3\1\17\uffff\2"+
            "\22\4\uffff\1\22\151\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "212:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );";
        }
    }
    static final String DFA33_eotS =
        "\75\uffff";
    static final String DFA33_eofS =
        "\2\2\73\uffff";
    static final String DFA33_minS =
        "\2\44\73\uffff";
    static final String DFA33_maxS =
        "\1\u00b7\1\174\73\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\55\uffff\1\1\14\uffff";
    static final String DFA33_specialS =
        "\75\uffff}>";
    static final String[] DFA33_transitionS = {
            "\4\2\1\uffff\7\2\1\uffff\35\2\1\uffff\1\1\11\2\2\uffff\1\2\1"+
            "\uffff\3\2\3\uffff\125\2",
            "\1\2\14\uffff\2\2\35\uffff\1\60\41\uffff\2\2\1\uffff\1\2\1"+
            "\uffff\2\2\1\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "216:26: ( COLLATE collation_name= ID )?";
        }
    }
    static final String DFA42_eotS =
        "\u014b\uffff";
    static final String DFA42_eofS =
        "\3\uffff\1\1\1\uffff\4\1\3\uffff\1\21\u013e\uffff";
    static final String DFA42_minS =
        "\1\45\2\uffff\1\44\1\uffff\4\44\3\uffff\1\44\1\50\1\uffff\1\45\1"+
        "\50\u013a\uffff";
    static final String DFA42_maxS =
        "\1\u00b7\2\uffff\1\u00b7\1\uffff\4\u00b7\3\uffff\1\u00b7\1\60\1"+
        "\uffff\1\u00b7\1\60\u013a\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\4\uffff\1\5\2\uffff\1\3\u00f0\uffff\1\4"+
        "\60\uffff\1\6\2\uffff\1\7\22\uffff\1\10\1\uffff";
    static final String DFA42_specialS =
        "\u014b\uffff}>";
    static final String[] DFA42_transitionS = {
            "\3\21\1\uffff\2\21\1\uffff\3\21\1\uffff\1\16\5\uffff\1\21\1"+
            "\5\1\21\26\uffff\1\21\1\14\1\21\1\15\1\21\1\17\4\21\2\1\1\3"+
            "\1\1\1\6\1\7\1\10\3\11\1\20\124\21",
            "",
            "",
            "\4\1\1\21\7\1\1\uffff\35\1\1\uffff\12\1\2\uffff\1\1\1\uffff"+
            "\3\1\3\uffff\125\1",
            "",
            "\4\1\1\21\7\1\1\uffff\35\1\1\uffff\12\1\2\uffff\1\1\1\uffff"+
            "\3\1\3\uffff\125\1",
            "\4\1\1\21\7\1\1\uffff\35\1\1\uffff\12\1\2\uffff\1\1\1\uffff"+
            "\3\1\3\uffff\125\1",
            "\4\1\1\21\7\1\1\uffff\35\1\1\uffff\12\1\2\uffff\1\1\1\uffff"+
            "\3\1\3\uffff\125\1",
            "\4\1\1\21\7\1\1\uffff\35\1\1\uffff\12\1\2\uffff\1\1\1\uffff"+
            "\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "\14\21\1\u0102\35\21\1\uffff\12\21\2\uffff\1\21\1\uffff\3\21"+
            "\3\uffff\125\21",
            "\1\21\7\uffff\1\u0133",
            "",
            "\3\u0136\1\21\6\u0136\1\uffff\1\u0136\5\uffff\3\u0136\17\uffff"+
            "\2\u0136\4\uffff\152\u0136",
            "\1\21\7\uffff\1\u0149",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "218:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );";
        }
    }
    static final String DFA35_eotS =
        "\64\uffff";
    static final String DFA35_eofS =
        "\1\uffff\1\5\62\uffff";
    static final String DFA35_minS =
        "\1\45\1\44\62\uffff";
    static final String DFA35_maxS =
        "\2\u00b7\62\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\56\uffff";
    static final String DFA35_specialS =
        "\64\uffff}>";
    static final String[] DFA35_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\2\1\uffff\3\2\3\uffff\125\2",
            "\4\5\1\2\7\5\1\uffff\35\5\1\uffff\12\5\2\uffff\1\5\1\uffff"+
            "\3\5\3\uffff\125\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "221:5: ( (database_name= id DOT )? table_name= id DOT )?";
        }
    }
    static final String DFA34_eotS =
        "\153\uffff";
    static final String DFA34_eofS =
        "\5\uffff\1\14\2\uffff\1\14\142\uffff";
    static final String DFA34_minS =
        "\1\45\2\50\2\45\1\44\2\uffff\1\44\142\uffff";
    static final String DFA34_maxS =
        "\1\u00b7\2\50\3\u00b7\2\uffff\1\u00b7\142\uffff";
    static final String DFA34_acceptS =
        "\6\uffff\1\1\5\uffff\1\2\136\uffff";
    static final String DFA34_specialS =
        "\153\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\1\1\uffff\3\2\3\uffff\125\2",
            "\1\3",
            "\1\4",
            "\3\6\1\uffff\2\6\1\uffff\3\6\7\uffff\3\6\26\uffff\1\6\1\5\10"+
            "\6\2\uffff\1\6\1\uffff\3\6\3\uffff\125\6",
            "\3\6\1\uffff\2\6\1\uffff\3\6\7\uffff\3\6\26\uffff\1\6\1\10"+
            "\10\6\2\uffff\1\6\1\uffff\3\6\3\uffff\125\6",
            "\4\14\1\6\7\14\1\uffff\35\14\1\uffff\12\14\2\uffff\1\14\1\uffff"+
            "\3\14\3\uffff\125\14",
            "",
            "",
            "\4\14\1\6\7\14\1\uffff\35\14\1\uffff\12\14\2\uffff\1\14\1\uffff"+
            "\3\14\3\uffff\125\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "221:6: (database_name= id DOT )?";
        }
    }
    static final String DFA38_eotS =
        "\26\uffff";
    static final String DFA38_eofS =
        "\26\uffff";
    static final String DFA38_minS =
        "\1\45\25\uffff";
    static final String DFA38_maxS =
        "\1\u00b7\25\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\1\3";
    static final String DFA38_specialS =
        "\26\uffff}>";
    static final String[] DFA38_transitionS = {
            "\3\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\25\3\uffff\3\1\17\uffff"+
            "\2\1\1\24\3\uffff\152\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "222:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?";
        }
    }
    static final String DFA36_eotS =
        "\47\uffff";
    static final String DFA36_eofS =
        "\47\uffff";
    static final String DFA36_minS =
        "\2\45\45\uffff";
    static final String DFA36_maxS =
        "\2\u00b7\45\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\22\uffff\1\1\21\uffff";
    static final String DFA36_specialS =
        "\47\uffff}>";
    static final String[] DFA36_transitionS = {
            "\3\2\1\uffff\6\2\1\uffff\1\2\5\uffff\3\2\17\uffff\2\2\4\uffff"+
            "\3\2\1\1\146\2",
            "\3\25\1\2\6\25\1\uffff\1\25\5\uffff\3\25\17\uffff\2\25\4\uffff"+
            "\152\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "222:21: ( DISTINCT )?";
        }
    }
    static final String DFA39_eotS =
        "\47\uffff";
    static final String DFA39_eofS =
        "\47\uffff";
    static final String DFA39_minS =
        "\1\45\20\uffff\1\45\25\uffff";
    static final String DFA39_maxS =
        "\1\u00b7\20\uffff\1\u00b7\25\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\22\uffff";
    static final String DFA39_specialS =
        "\47\uffff}>";
    static final String[] DFA39_transitionS = {
            "\3\1\1\uffff\6\1\1\uffff\1\1\5\uffff\3\1\17\uffff\2\1\4\uffff"+
            "\11\1\1\21\140\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\24\1\1\6\24\1\uffff\1\24\5\uffff\3\24\17\uffff\2\24\4\uffff"+
            "\152\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "227:10: (case_expr= expr )?";
        }
    }
    static final String DFA44_eotS =
        "\64\uffff";
    static final String DFA44_eofS =
        "\1\uffff\1\5\62\uffff";
    static final String DFA44_minS =
        "\1\140\1\44\62\uffff";
    static final String DFA44_maxS =
        "\1\142\1\u00b7\62\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\3\1\4\1\2\1\1\56\uffff";
    static final String DFA44_specialS =
        "\64\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\1\2\1\3",
            "\4\5\1\uffff\7\5\1\uffff\35\5\1\uffff\12\5\1\4\1\uffff\1\5"+
            "\1\uffff\3\5\3\uffff\125\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "244:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );";
        }
    }
    static final String DFA46_eotS =
        "\20\uffff";
    static final String DFA46_eofS =
        "\1\1\17\uffff";
    static final String DFA46_minS =
        "\1\44\17\uffff";
    static final String DFA46_maxS =
        "\1\u00a4\17\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA46_specialS =
        "\20\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\6\uffff\1\1\4\uffff\3\1\4\uffff\1\1\27\uffff\1\1\1\17\70"+
            "\uffff\1\1\23\uffff\2\1\2\uffff\2\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "()+ loopback of 255:17: (names+= ID )+";
        }
    }
    static final String DFA48_eotS =
        "\17\uffff";
    static final String DFA48_eofS =
        "\1\2\16\uffff";
    static final String DFA48_minS =
        "\1\44\16\uffff";
    static final String DFA48_maxS =
        "\1\u00a4\16\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA48_specialS =
        "\17\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\2\6\uffff\1\2\4\uffff\1\1\2\2\4\uffff\1\2\27\uffff\1\2\71"+
            "\uffff\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "255:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?";
        }
    }
    static final String DFA50_eotS =
        "\15\uffff";
    static final String DFA50_eofS =
        "\1\uffff\2\4\12\uffff";
    static final String DFA50_minS =
        "\1\45\2\44\12\uffff";
    static final String DFA50_maxS =
        "\1\u00b7\2\63\12\uffff";
    static final String DFA50_acceptS =
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA50_specialS =
        "\15\uffff}>";
    static final String[] DFA50_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\1\1\uffff\3\2\3\uffff\125\2",
            "\1\4\3\uffff\1\3\7\uffff\1\4\2\uffff\1\4",
            "\1\4\3\uffff\1\3\7\uffff\1\4\2\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "261:21: (database_name= id DOT )?";
        }
    }
    static final String DFA53_eotS =
        "\16\uffff";
    static final String DFA53_eofS =
        "\7\uffff\1\2\6\uffff";
    static final String DFA53_minS =
        "\2\45\3\uffff\1\45\1\uffff\1\44\6\uffff";
    static final String DFA53_maxS =
        "\2\u00b7\3\uffff\1\u00b7\1\uffff\1\u00b7\6\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\11\uffff";
    static final String DFA53_specialS =
        "\16\uffff}>";
    static final String[] DFA53_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\12\2\2\uffff"+
            "\1\2\1\uffff\3\2\3\uffff\7\2\1\1\115\2",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\26\uffff\4\4\1\5\5"+
            "\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\4\2\1\7\5"+
            "\2\2\uffff\1\2\1\uffff\3\2\3\uffff\125\2",
            "",
            "\1\2\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\26\uffff\12\4"+
            "\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "271:21: ( DATABASE )?";
        }
    }
    static final String DFA55_eotS =
        "\13\uffff";
    static final String DFA55_eofS =
        "\1\3\2\5\10\uffff";
    static final String DFA55_minS =
        "\3\44\10\uffff";
    static final String DFA55_maxS =
        "\1\u00b7\2\50\10\uffff";
    static final String DFA55_acceptS =
        "\3\uffff\1\3\1\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String DFA55_specialS =
        "\13\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\3\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1"+
            "\1\10\2\2\uffff\1\1\1\uffff\3\2\3\uffff\125\2",
            "\1\5\3\uffff\1\7",
            "\1\5\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "277:23: (database_or_table_name= id | database_name= id DOT table_name= id )?";
        }
    }
    static final String DFA57_eotS =
        "\15\uffff";
    static final String DFA57_eofS =
        "\1\3\14\uffff";
    static final String DFA57_minS =
        "\1\44\14\uffff";
    static final String DFA57_maxS =
        "\1\175\14\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\1\2\1\3\11\uffff";
    static final String DFA57_specialS =
        "\15\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\3\14\uffff\2\3\75\uffff\1\1\1\2\2\3\1\uffff\1\3\1\uffff\2"+
            "\3\4\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "291:82: ( ASC | DESC )?";
        }
    }
    static final String DFA69_eotS =
        "\76\uffff";
    static final String DFA69_eofS =
        "\76\uffff";
    static final String DFA69_minS =
        "\3\45\73\uffff";
    static final String DFA69_maxS =
        "\3\u00b7\73\uffff";
    static final String DFA69_acceptS =
        "\3\uffff\1\3\23\uffff\1\1\23\uffff\1\2\22\uffff";
    static final String DFA69_specialS =
        "\76\uffff}>";
    static final String[] DFA69_transitionS = {
            "\3\3\1\uffff\6\3\1\uffff\1\3\5\uffff\3\3\17\uffff\3\3\3\uffff"+
            "\3\3\1\2\44\3\1\1\101\3",
            "\3\27\1\3\6\27\1\uffff\1\27\5\uffff\3\27\17\uffff\3\27\3\uffff"+
            "\152\27",
            "\3\53\1\3\6\53\1\uffff\1\53\5\uffff\3\53\17\uffff\3\53\3\uffff"+
            "\152\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "312:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA70_eotS =
        "\15\uffff";
    static final String DFA70_eofS =
        "\1\1\14\uffff";
    static final String DFA70_minS =
        "\1\44\14\uffff";
    static final String DFA70_maxS =
        "\1\174\14\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA70_specialS =
        "\15\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\14\uffff\1\14\1\1\77\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
            "\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "()* loopback of 312:42: ( COMMA result_column )*";
        }
    }
    static final String DFA71_eotS =
        "\14\uffff";
    static final String DFA71_eofS =
        "\1\2\13\uffff";
    static final String DFA71_minS =
        "\1\44\13\uffff";
    static final String DFA71_maxS =
        "\1\174\13\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA71_specialS =
        "\14\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\15\uffff\1\2\77\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\1\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "312:65: ( FROM join_source )?";
        }
    }
    static final String DFA72_eotS =
        "\13\uffff";
    static final String DFA72_eofS =
        "\1\2\12\uffff";
    static final String DFA72_minS =
        "\1\44\12\uffff";
    static final String DFA72_maxS =
        "\1\174\12\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA72_specialS =
        "\13\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\2\15\uffff\1\2\77\uffff\2\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\1\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "312:85: ( WHERE where_expr= expr )?";
        }
    }
    static final String DFA75_eotS =
        "\12\uffff";
    static final String DFA75_eofS =
        "\1\2\11\uffff";
    static final String DFA75_minS =
        "\1\44\11\uffff";
    static final String DFA75_maxS =
        "\1\174\11\uffff";
    static final String DFA75_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA75_specialS =
        "\12\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\2\15\uffff\1\2\77\uffff\2\2\1\uffff\1\2\1\uffff\2\2\3\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "313:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?";
        }
    }
    static final String DFA73_eotS =
        "\13\uffff";
    static final String DFA73_eofS =
        "\1\1\12\uffff";
    static final String DFA73_minS =
        "\1\44\12\uffff";
    static final String DFA73_maxS =
        "\1\175\12\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA73_specialS =
        "\13\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1\14\uffff\1\12\1\1\77\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "()* loopback of 313:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA74_eotS =
        "\12\uffff";
    static final String DFA74_eofS =
        "\1\2\11\uffff";
    static final String DFA74_minS =
        "\1\44\11\uffff";
    static final String DFA74_maxS =
        "\1\175\11\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA74_specialS =
        "\12\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\2\15\uffff\1\2\77\uffff\2\2\1\uffff\1\2\1\uffff\2\2\4\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "313:51: ( HAVING having_expr= expr )?";
        }
    }
    static final String DFA78_eotS =
        "\u011c\uffff";
    static final String DFA78_eofS =
        "\2\uffff\2\4\2\uffff\1\4\1\uffff\3\4\u0111\uffff";
    static final String DFA78_minS =
        "\1\45\1\uffff\2\44\2\uffff\1\44\1\uffff\3\44\1\50\4\uffff\1\45\2"+
        "\50\1\uffff\1\45\40\uffff\1\45\41\uffff\1\45\40\uffff\1\45\40\uffff"+
        "\1\45\100\uffff\1\45\1\uffff\2\45\24\uffff\2\45\50\uffff";
    static final String DFA78_maxS =
        "\1\u00b7\1\uffff\2\u00b7\2\uffff\1\u00b7\1\uffff\3\u00b7\1\60\4"+
        "\uffff\1\u00b7\1\60\1\50\1\uffff\1\u00b7\40\uffff\1\u00b7\41\uffff"+
        "\1\u00b7\40\uffff\1\u00b7\40\uffff\1\u00b7\100\uffff\1\u00b7\1\uffff"+
        "\2\u00b7\24\uffff\2\u00b7\50\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\u00ef\uffff\1\2\47\uffff";
    static final String DFA78_specialS =
        "\u011c\uffff}>";
    static final String[] DFA78_transitionS = {
            "\3\22\1\uffff\2\22\1\4\3\22\1\uffff\1\4\5\uffff\1\22\1\3\1\22"+
            "\17\uffff\2\4\1\1\3\uffff\1\4\1\22\1\6\1\22\1\13\1\22\1\20\4"+
            "\22\2\4\1\2\1\4\1\10\1\11\1\12\3\4\1\21\124\22",
            "",
            "\4\4\1\24\7\4\1\uffff\35\4\1\uffff\12\4\2\uffff\1\4\1\uffff"+
            "\3\4\3\uffff\125\4",
            "\4\4\1\65\7\4\1\uffff\35\4\1\uffff\12\4\2\uffff\1\4\1\uffff"+
            "\3\4\3\uffff\125\4",
            "",
            "",
            "\4\4\1\127\45\4\1\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff"+
            "\125\4",
            "",
            "\4\4\1\170\7\4\1\uffff\35\4\1\uffff\12\4\2\uffff\1\4\1\uffff"+
            "\3\4\3\uffff\125\4",
            "\4\4\1\u0099\7\4\1\uffff\35\4\1\uffff\12\4\2\uffff\1\4\1\uffff"+
            "\3\4\3\uffff\125\4",
            "\4\4\1\u00da\7\4\1\uffff\35\4\1\uffff\12\4\2\uffff\1\4\1\uffff"+
            "\3\4\3\uffff\125\4",
            "\1\u00dc\7\uffff\1\4",
            "",
            "",
            "",
            "",
            "\3\4\1\u00dd\6\4\1\uffff\1\4\5\uffff\3\4\17\uffff\2\4\4\uffff"+
            "\152\4",
            "\1\u00f2\7\uffff\1\4",
            "\1\u00f3",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "\3\4\1\uffff\2\4\1\uffff\3\4\7\uffff\3\4\21\uffff\1\u00f4\4"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "319:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA77_eotS =
        "\u00d7\uffff";
    static final String DFA77_eofS =
        "\1\4\2\uffff\1\1\1\uffff\7\1\u00cb\uffff";
    static final String DFA77_minS =
        "\1\44\2\uffff\1\44\1\uffff\7\44\5\uffff\2\45\6\50\10\uffff\2\45"+
        "\6\50\u00ae\uffff";
    static final String DFA77_maxS =
        "\1\u00b7\2\uffff\1\u00b7\1\uffff\1\u00b7\6\174\5\uffff\2\u00b7\1"+
        "\52\3\171\1\52\1\131\10\uffff\2\u00b7\1\52\3\171\1\52\1\131\u00ae"+
        "\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00d2\uffff";
    static final String DFA77_specialS =
        "\u00d7\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\4\3\1\1\uffff\2\1\1\uffff\3\1\2\uffff\2\4\3\uffff\3\1\26"+
            "\uffff\12\1\2\uffff\1\1\1\uffff\3\1\3\uffff\17\1\1\12\1\13\1"+
            "\1\1\7\1\1\1\10\1\11\1\1\1\3\1\5\1\6\73\1",
            "",
            "",
            "\1\1\3\4\1\uffff\2\4\1\uffff\3\4\1\uffff\1\4\2\1\3\uffff\3"+
            "\4\26\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\17\4\1\27\1"+
            "\30\1\4\1\24\1\4\1\25\1\26\1\4\1\21\1\22\1\23\73\4",
            "",
            "\1\1\3\4\1\uffff\6\4\1\uffff\1\4\2\1\3\uffff\3\4\17\uffff\2"+
            "\4\4\uffff\44\4\1\47\1\50\1\4\1\44\1\4\1\45\1\46\1\4\1\41\1"+
            "\42\1\43\73\4",
            "\1\1\5\uffff\1\4\6\uffff\2\1\77\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1",
            "\1\1\14\uffff\2\1\77\uffff\2\1\1\uffff\1\1\1\4\2\1\1\4\3\1",
            "\1\1\14\uffff\2\1\77\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\4"+
            "\3\1",
            "\1\1\14\uffff\2\1\77\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\4"+
            "\3\1",
            "\1\1\5\uffff\1\4\6\uffff\2\1\77\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1",
            "\1\1\14\uffff\2\1\46\uffff\1\4\30\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\4\2\1\1\uffff\3\1\1\uffff\1\1\5\uffff\3\1\26\uffff\12"+
            "\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "\3\1\1\4\6\1\1\uffff\1\1\5\uffff\3\1\17\uffff\2\1\4\uffff\152"+
            "\1",
            "\1\4\1\uffff\1\1",
            "\1\4\115\uffff\1\1\2\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\1\uffff\1\1",
            "\1\4\60\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\4\2\1\1\uffff\3\1\1\uffff\1\1\5\uffff\3\1\26\uffff\12"+
            "\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "\3\1\1\4\6\1\1\uffff\1\1\5\uffff\3\1\17\uffff\2\1\4\uffff\152"+
            "\1",
            "\1\4\1\uffff\1\1",
            "\1\4\115\uffff\1\1\2\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\1\uffff\1\1",
            "\1\4\60\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "322:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA76_eotS =
        "\u00d9\uffff";
    static final String DFA76_eofS =
        "\1\uffff\1\2\3\uffff\1\4\1\uffff\7\4\u00cb\uffff";
    static final String DFA76_minS =
        "\1\45\1\44\3\uffff\1\44\1\uffff\7\44\5\uffff\2\45\6\50\10\uffff"+
        "\2\45\6\50\u00ae\uffff";
    static final String DFA76_maxS =
        "\2\u00b7\3\uffff\1\u00b7\1\uffff\1\u00b7\6\174\5\uffff\2\u00b7\1"+
        "\52\3\171\1\52\1\131\10\uffff\2\u00b7\1\52\3\171\1\52\1\131\u00ae"+
        "\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00d4\uffff";
    static final String DFA76_specialS =
        "\u00d9\uffff}>";
    static final String[] DFA76_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\4\2\1\1\5"+
            "\2\2\uffff\1\2\1\uffff\3\2\3\uffff\125\2",
            "\1\2\3\4\1\uffff\2\4\1\uffff\3\4\2\uffff\2\2\3\uffff\3\4\26"+
            "\uffff\12\4\2\uffff\1\4\1\uffff\3\4\3\uffff\17\4\1\14\1\15\1"+
            "\4\1\11\1\4\1\12\1\13\1\4\1\5\1\7\1\10\73\4",
            "",
            "",
            "",
            "\1\4\3\2\1\uffff\2\2\1\uffff\3\2\1\uffff\1\2\2\4\3\uffff\3"+
            "\2\26\uffff\12\2\2\uffff\1\2\1\uffff\3\2\3\uffff\17\2\1\31\1"+
            "\32\1\2\1\26\1\2\1\27\1\30\1\2\1\23\1\24\1\25\73\2",
            "",
            "\1\4\3\2\1\uffff\6\2\1\uffff\1\2\2\4\3\uffff\3\2\17\uffff\2"+
            "\2\4\uffff\44\2\1\51\1\52\1\2\1\46\1\2\1\47\1\50\1\2\1\43\1"+
            "\44\1\45\73\2",
            "\1\4\5\uffff\1\2\6\uffff\2\4\77\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4",
            "\1\4\14\uffff\2\4\77\uffff\2\4\1\uffff\1\4\1\2\2\4\1\2\3\4",
            "\1\4\14\uffff\2\4\77\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\2"+
            "\3\4",
            "\1\4\14\uffff\2\4\77\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\2"+
            "\3\4",
            "\1\4\5\uffff\1\2\6\uffff\2\4\77\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4",
            "\1\4\14\uffff\2\4\46\uffff\1\2\30\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\2\2\4\1\uffff\3\4\1\uffff\1\4\5\uffff\3\4\26\uffff\12"+
            "\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "\3\4\1\2\6\4\1\uffff\1\4\5\uffff\3\4\17\uffff\2\4\4\uffff\152"+
            "\4",
            "\1\2\1\uffff\1\4",
            "\1\2\115\uffff\1\4\2\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\1\uffff\1\4",
            "\1\2\60\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\2\2\4\1\uffff\3\4\1\uffff\1\4\5\uffff\3\4\26\uffff\12"+
            "\4\2\uffff\1\4\1\uffff\3\4\3\uffff\125\4",
            "\3\4\1\2\6\4\1\uffff\1\4\5\uffff\3\4\17\uffff\2\4\4\uffff\152"+
            "\4",
            "\1\2\1\uffff\1\4",
            "\1\2\115\uffff\1\4\2\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\1\uffff\1\4",
            "\1\2\60\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "322:11: ( AS )?";
        }
    }
    static final String DFA80_eotS =
        "\22\uffff";
    static final String DFA80_eofS =
        "\1\1\21\uffff";
    static final String DFA80_minS =
        "\1\44\21\uffff";
    static final String DFA80_maxS =
        "\1\u0083\21\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\2\11\uffff\1\1\6\uffff";
    static final String DFA80_specialS =
        "\22\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\1\14\uffff\1\13\1\1\77\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
            "\2\uffff\2\1\1\uffff\6\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()* loopback of 324:28: ( join_op single_source ( join_constraint )? )*";
        }
    }
    static final String DFA79_eotS =
        "\24\uffff";
    static final String DFA79_eofS =
        "\1\3\23\uffff";
    static final String DFA79_minS =
        "\1\44\23\uffff";
    static final String DFA79_maxS =
        "\1\u0085\23\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\20\uffff";
    static final String DFA79_specialS =
        "\24\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\3\14\uffff\2\3\77\uffff\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff"+
            "\2\3\1\uffff\6\3\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "324:52: ( join_constraint )?";
        }
    }
    static final String DFA87_eotS =
        "\40\uffff";
    static final String DFA87_eofS =
        "\40\uffff";
    static final String DFA87_minS =
        "\1\45\3\uffff\1\45\1\uffff\1\45\31\uffff";
    static final String DFA87_maxS =
        "\1\u00b7\3\uffff\1\u00b7\1\uffff\1\u00b7\31\uffff";
    static final String DFA87_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\4\uffff\1\2\25\uffff";
    static final String DFA87_specialS =
        "\40\uffff}>";
    static final String[] DFA87_transitionS = {
            "\3\1\1\uffff\2\1\1\uffff\3\1\1\uffff\1\4\5\uffff\3\1\26\uffff"+
            "\12\1\2\uffff\1\1\1\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "\3\5\1\uffff\2\5\1\uffff\3\5\1\uffff\1\5\5\uffff\3\5\26\uffff"+
            "\12\5\2\uffff\1\5\1\uffff\3\5\3\uffff\26\5\1\6\76\5",
            "",
            "\3\12\1\5\6\12\1\uffff\1\12\5\uffff\3\12\17\uffff\3\12\3\uffff"+
            "\152\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "326:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );";
        }
    }
    static final String DFA81_eotS =
        "\34\uffff";
    static final String DFA81_eofS =
        "\1\uffff\1\5\32\uffff";
    static final String DFA81_minS =
        "\1\45\1\44\32\uffff";
    static final String DFA81_maxS =
        "\1\u00b7\1\u0085\32\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\26\uffff";
    static final String DFA81_specialS =
        "\34\uffff}>";
    static final String[] DFA81_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\2\1\uffff\3\2\3\uffff\125\2",
            "\1\5\3\uffff\1\2\1\5\1\uffff\1\5\5\uffff\2\5\35\uffff\1\5\2"+
            "\uffff\1\5\36\uffff\2\5\1\uffff\1\5\1\uffff\2\5\2\uffff\2\5"+
            "\1\uffff\10\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "327:5: (database_name= id DOT )?";
        }
    }
    static final String DFA83_eotS =
        "\30\uffff";
    static final String DFA83_eofS =
        "\1\3\27\uffff";
    static final String DFA83_minS =
        "\1\44\27\uffff";
    static final String DFA83_maxS =
        "\1\u0085\27\uffff";
    static final String DFA83_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\24\uffff";
    static final String DFA83_specialS =
        "\30\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\3\4\uffff\1\3\1\uffff\1\3\5\uffff\2\3\35\uffff\1\1\2\uffff"+
            "\1\1\36\uffff\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff"+
            "\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "327:43: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA84_eotS =
        "\26\uffff";
    static final String DFA84_eofS =
        "\1\3\25\uffff";
    static final String DFA84_minS =
        "\1\44\25\uffff";
    static final String DFA84_maxS =
        "\1\u0085\25\uffff";
    static final String DFA84_acceptS =
        "\1\uffff\1\1\1\2\1\3\22\uffff";
    static final String DFA84_specialS =
        "\26\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\3\4\uffff\1\1\1\uffff\1\2\5\uffff\2\3\77\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "327:67: ( INDEXED BY index_name= id | NOT INDEXED )?";
        }
    }
    static final String DFA86_eotS =
        "\26\uffff";
    static final String DFA86_eofS =
        "\1\3\25\uffff";
    static final String DFA86_minS =
        "\1\44\25\uffff";
    static final String DFA86_maxS =
        "\1\u0085\25\uffff";
    static final String DFA86_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\22\uffff";
    static final String DFA86_specialS =
        "\26\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\3\14\uffff\2\3\35\uffff\1\1\2\uffff\1\1\36\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "329:31: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA97_eotS =
        "\15\uffff";
    static final String DFA97_eofS =
        "\15\uffff";
    static final String DFA97_minS =
        "\1\45\2\50\12\uffff";
    static final String DFA97_maxS =
        "\1\u00b7\2\u0089\12\uffff";
    static final String DFA97_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA97_specialS =
        "\15\uffff}>";
    static final String[] DFA97_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\1\1\uffff\3\2\3\uffff\125\2",
            "\1\7\7\uffff\1\3\110\uffff\1\3\16\uffff\2\3",
            "\1\7\7\uffff\1\3\110\uffff\1\3\16\uffff\2\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
    static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
    static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
    static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
    static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
    static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
    static final short[][] DFA97_transition;

    static {
        int numStates = DFA97_transitionS.length;
        DFA97_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = DFA97_eot;
            this.eof = DFA97_eof;
            this.min = DFA97_min;
            this.max = DFA97_max;
            this.accept = DFA97_accept;
            this.special = DFA97_special;
            this.transition = DFA97_transition;
        }
        public String getDescription() {
            return "342:67: (database_name= id DOT )?";
        }
    }
    static final String DFA122_eotS =
        "\76\uffff";
    static final String DFA122_eofS =
        "\76\uffff";
    static final String DFA122_minS =
        "\1\61\1\45\2\uffff\4\53\66\uffff";
    static final String DFA122_maxS =
        "\1\62\1\u00b7\2\uffff\4\u00a4\66\uffff";
    static final String DFA122_acceptS =
        "\2\uffff\1\2\5\uffff\1\1\65\uffff";
    static final String DFA122_specialS =
        "\76\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\1\1\2",
            "\3\10\1\uffff\7\10\4\uffff\5\10\3\uffff\4\10\17\uffff\12\10"+
            "\2\uffff\1\10\1\uffff\3\10\3\uffff\72\10\1\2\1\4\2\10\1\5\1"+
            "\6\1\7\11\10\1\uffff\12\10",
            "",
            "",
            "\1\10\5\uffff\2\10\4\uffff\1\10\27\uffff\2\10\70\uffff\1\10"+
            "\23\uffff\2\10\1\2\1\uffff\2\10\1\uffff\1\10",
            "\1\10\4\uffff\1\2\2\10\4\uffff\1\10\27\uffff\2\10\70\uffff"+
            "\1\10\23\uffff\2\10\2\uffff\2\10\1\uffff\1\10",
            "\1\10\4\uffff\1\2\2\10\4\uffff\1\10\27\uffff\2\10\70\uffff"+
            "\1\10\23\uffff\2\10\2\uffff\2\10\1\uffff\1\10",
            "\1\10\5\uffff\2\10\4\uffff\1\10\27\uffff\2\10\70\uffff\1\10"+
            "\23\uffff\2\10\1\2\1\uffff\2\10\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "()* loopback of 386:23: ( COMMA column_def )*";
        }
    }
    static final String DFA125_eotS =
        "\17\uffff";
    static final String DFA125_eofS =
        "\1\2\16\uffff";
    static final String DFA125_minS =
        "\1\44\16\uffff";
    static final String DFA125_maxS =
        "\1\u00a4\16\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA125_specialS =
        "\17\uffff}>";
    static final String[] DFA125_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\1\1\70"+
            "\uffff\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }
        public String getDescription() {
            return "391:32: ( type_name )?";
        }
    }
    static final String DFA126_eotS =
        "\16\uffff";
    static final String DFA126_eofS =
        "\1\1\15\uffff";
    static final String DFA126_minS =
        "\1\44\15\uffff";
    static final String DFA126_maxS =
        "\1\u00a4\15\uffff";
    static final String DFA126_acceptS =
        "\1\uffff\1\2\3\uffff\1\1\10\uffff";
    static final String DFA126_specialS =
        "\16\uffff}>";
    static final String[] DFA126_transitionS = {
            "\1\1\6\uffff\1\5\5\uffff\2\1\4\uffff\1\5\27\uffff\1\5\71\uffff"+
            "\1\5\23\uffff\2\5\2\uffff\2\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
    static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
    static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
    static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
    static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
    static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
    static final short[][] DFA126_transition;

    static {
        int numStates = DFA126_transitionS.length;
        DFA126_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
        }
    }

    class DFA126 extends DFA {

        public DFA126(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 126;
            this.eot = DFA126_eot;
            this.eof = DFA126_eof;
            this.min = DFA126_min;
            this.max = DFA126_max;
            this.accept = DFA126_accept;
            this.special = DFA126_special;
            this.transition = DFA126_transition;
        }
        public String getDescription() {
            return "()* loopback of 391:43: ( column_constraint )*";
        }
    }
    static final String DFA127_eotS =
        "\12\uffff";
    static final String DFA127_eofS =
        "\12\uffff";
    static final String DFA127_minS =
        "\1\53\11\uffff";
    static final String DFA127_maxS =
        "\1\u00a4\11\uffff";
    static final String DFA127_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA127_specialS =
        "\12\uffff}>";
    static final String[] DFA127_transitionS = {
            "\1\2\13\uffff\1\2\27\uffff\1\2\71\uffff\1\2\23\uffff\1\1\1\2"+
            "\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA127_eot = DFA.unpackEncodedString(DFA127_eotS);
    static final short[] DFA127_eof = DFA.unpackEncodedString(DFA127_eofS);
    static final char[] DFA127_min = DFA.unpackEncodedStringToUnsignedChars(DFA127_minS);
    static final char[] DFA127_max = DFA.unpackEncodedStringToUnsignedChars(DFA127_maxS);
    static final short[] DFA127_accept = DFA.unpackEncodedString(DFA127_acceptS);
    static final short[] DFA127_special = DFA.unpackEncodedString(DFA127_specialS);
    static final short[][] DFA127_transition;

    static {
        int numStates = DFA127_transitionS.length;
        DFA127_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA127_transition[i] = DFA.unpackEncodedString(DFA127_transitionS[i]);
        }
    }

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = DFA127_eot;
            this.eof = DFA127_eof;
            this.min = DFA127_min;
            this.max = DFA127_max;
            this.accept = DFA127_accept;
            this.special = DFA127_special;
            this.transition = DFA127_transition;
        }
        public String getDescription() {
            return "394:20: ( CONSTRAINT name= id )?";
        }
    }
    static final String DFA129_eotS =
        "\21\uffff";
    static final String DFA129_eofS =
        "\1\2\20\uffff";
    static final String DFA129_minS =
        "\1\44\20\uffff";
    static final String DFA129_maxS =
        "\1\u00a4\20\uffff";
    static final String DFA129_acceptS =
        "\1\uffff\1\1\1\2\16\uffff";
    static final String DFA129_specialS =
        "\21\uffff}>";
    static final String[] DFA129_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\40\uffff"+
            "\2\1\22\uffff\1\2\4\uffff\1\2\23\uffff\2\2\1\uffff\3\2\1\uffff"+
            "\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
    static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
    static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
    static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
    static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
    static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
    static final short[][] DFA129_transition;

    static {
        int numStates = DFA129_transitionS.length;
        DFA129_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
        }
    }

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = DFA129_eot;
            this.eof = DFA129_eof;
            this.min = DFA129_min;
            this.max = DFA129_max;
            this.accept = DFA129_accept;
            this.special = DFA129_special;
            this.transition = DFA129_transition;
        }
        public String getDescription() {
            return "414:37: ( ASC | DESC )?";
        }
    }
    static final String DFA130_eotS =
        "\20\uffff";
    static final String DFA130_eofS =
        "\1\2\17\uffff";
    static final String DFA130_minS =
        "\1\44\17\uffff";
    static final String DFA130_maxS =
        "\1\u00a4\17\uffff";
    static final String DFA130_acceptS =
        "\1\uffff\1\1\1\2\15\uffff";
    static final String DFA130_specialS =
        "\20\uffff}>";
    static final String[] DFA130_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\64\uffff"+
            "\1\1\4\uffff\1\2\23\uffff\2\2\1\uffff\3\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA130_eot = DFA.unpackEncodedString(DFA130_eotS);
    static final short[] DFA130_eof = DFA.unpackEncodedString(DFA130_eofS);
    static final char[] DFA130_min = DFA.unpackEncodedStringToUnsignedChars(DFA130_minS);
    static final char[] DFA130_max = DFA.unpackEncodedStringToUnsignedChars(DFA130_maxS);
    static final short[] DFA130_accept = DFA.unpackEncodedString(DFA130_acceptS);
    static final short[] DFA130_special = DFA.unpackEncodedString(DFA130_specialS);
    static final short[][] DFA130_transition;

    static {
        int numStates = DFA130_transitionS.length;
        DFA130_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA130_transition[i] = DFA.unpackEncodedString(DFA130_transitionS[i]);
        }
    }

    class DFA130 extends DFA {

        public DFA130(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 130;
            this.eot = DFA130_eot;
            this.eof = DFA130_eof;
            this.min = DFA130_min;
            this.max = DFA130_max;
            this.accept = DFA130_accept;
            this.special = DFA130_special;
            this.transition = DFA130_transition;
        }
        public String getDescription() {
            return "414:51: ( table_conflict_clause )?";
        }
    }
    static final String DFA131_eotS =
        "\17\uffff";
    static final String DFA131_eofS =
        "\1\2\16\uffff";
    static final String DFA131_minS =
        "\1\44\16\uffff";
    static final String DFA131_maxS =
        "\1\u00a4\16\uffff";
    static final String DFA131_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA131_specialS =
        "\17\uffff}>";
    static final String[] DFA131_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\71\uffff"+
            "\1\2\23\uffff\2\2\1\uffff\1\1\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA131_eot = DFA.unpackEncodedString(DFA131_eotS);
    static final short[] DFA131_eof = DFA.unpackEncodedString(DFA131_eofS);
    static final char[] DFA131_min = DFA.unpackEncodedStringToUnsignedChars(DFA131_minS);
    static final char[] DFA131_max = DFA.unpackEncodedStringToUnsignedChars(DFA131_maxS);
    static final short[] DFA131_accept = DFA.unpackEncodedString(DFA131_acceptS);
    static final short[] DFA131_special = DFA.unpackEncodedString(DFA131_specialS);
    static final short[][] DFA131_transition;

    static {
        int numStates = DFA131_transitionS.length;
        DFA131_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA131_transition[i] = DFA.unpackEncodedString(DFA131_transitionS[i]);
        }
    }

    class DFA131 extends DFA {

        public DFA131(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 131;
            this.eot = DFA131_eot;
            this.eof = DFA131_eof;
            this.min = DFA131_min;
            this.max = DFA131_max;
            this.accept = DFA131_accept;
            this.special = DFA131_special;
            this.transition = DFA131_transition;
        }
        public String getDescription() {
            return "414:74: ( AUTOINCREMENT )?";
        }
    }
    static final String DFA132_eotS =
        "\17\uffff";
    static final String DFA132_eofS =
        "\1\2\16\uffff";
    static final String DFA132_minS =
        "\1\44\16\uffff";
    static final String DFA132_maxS =
        "\1\u00a4\16\uffff";
    static final String DFA132_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA132_specialS =
        "\17\uffff}>";
    static final String[] DFA132_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\64\uffff"+
            "\1\1\4\uffff\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA132_eot = DFA.unpackEncodedString(DFA132_eotS);
    static final short[] DFA132_eof = DFA.unpackEncodedString(DFA132_eofS);
    static final char[] DFA132_min = DFA.unpackEncodedStringToUnsignedChars(DFA132_minS);
    static final char[] DFA132_max = DFA.unpackEncodedStringToUnsignedChars(DFA132_maxS);
    static final short[] DFA132_accept = DFA.unpackEncodedString(DFA132_acceptS);
    static final short[] DFA132_special = DFA.unpackEncodedString(DFA132_specialS);
    static final short[][] DFA132_transition;

    static {
        int numStates = DFA132_transitionS.length;
        DFA132_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA132_transition[i] = DFA.unpackEncodedString(DFA132_transitionS[i]);
        }
    }

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = DFA132_eot;
            this.eof = DFA132_eof;
            this.min = DFA132_min;
            this.max = DFA132_max;
            this.accept = DFA132_accept;
            this.special = DFA132_special;
            this.transition = DFA132_transition;
        }
        public String getDescription() {
            return "416:38: ( table_conflict_clause )?";
        }
    }
    static final String DFA133_eotS =
        "\17\uffff";
    static final String DFA133_eofS =
        "\1\2\16\uffff";
    static final String DFA133_minS =
        "\1\44\16\uffff";
    static final String DFA133_maxS =
        "\1\u00a4\16\uffff";
    static final String DFA133_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA133_specialS =
        "\17\uffff}>";
    static final String[] DFA133_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\64\uffff"+
            "\1\1\4\uffff\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA133_eot = DFA.unpackEncodedString(DFA133_eotS);
    static final short[] DFA133_eof = DFA.unpackEncodedString(DFA133_eofS);
    static final char[] DFA133_min = DFA.unpackEncodedStringToUnsignedChars(DFA133_minS);
    static final char[] DFA133_max = DFA.unpackEncodedStringToUnsignedChars(DFA133_maxS);
    static final short[] DFA133_accept = DFA.unpackEncodedString(DFA133_acceptS);
    static final short[] DFA133_special = DFA.unpackEncodedString(DFA133_specialS);
    static final short[][] DFA133_transition;

    static {
        int numStates = DFA133_transitionS.length;
        DFA133_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA133_transition[i] = DFA.unpackEncodedString(DFA133_transitionS[i]);
        }
    }

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = DFA133_eot;
            this.eof = DFA133_eof;
            this.min = DFA133_min;
            this.max = DFA133_max;
            this.accept = DFA133_accept;
            this.special = DFA133_special;
            this.transition = DFA133_transition;
        }
        public String getDescription() {
            return "418:30: ( table_conflict_clause )?";
        }
    }
    static final String DFA134_eotS =
        "\17\uffff";
    static final String DFA134_eofS =
        "\1\2\16\uffff";
    static final String DFA134_minS =
        "\1\44\16\uffff";
    static final String DFA134_maxS =
        "\1\u00a4\16\uffff";
    static final String DFA134_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA134_specialS =
        "\17\uffff}>";
    static final String[] DFA134_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\64\uffff"+
            "\1\1\4\uffff\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA134_eot = DFA.unpackEncodedString(DFA134_eotS);
    static final short[] DFA134_eof = DFA.unpackEncodedString(DFA134_eofS);
    static final char[] DFA134_min = DFA.unpackEncodedStringToUnsignedChars(DFA134_minS);
    static final char[] DFA134_max = DFA.unpackEncodedStringToUnsignedChars(DFA134_maxS);
    static final short[] DFA134_accept = DFA.unpackEncodedString(DFA134_acceptS);
    static final short[] DFA134_special = DFA.unpackEncodedString(DFA134_specialS);
    static final short[][] DFA134_transition;

    static {
        int numStates = DFA134_transitionS.length;
        DFA134_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA134_transition[i] = DFA.unpackEncodedString(DFA134_transitionS[i]);
        }
    }

    class DFA134 extends DFA {

        public DFA134(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 134;
            this.eot = DFA134_eot;
            this.eof = DFA134_eof;
            this.min = DFA134_min;
            this.max = DFA134_max;
            this.accept = DFA134_accept;
            this.special = DFA134_special;
            this.transition = DFA134_transition;
        }
        public String getDescription() {
            return "420:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA136_eotS =
        "\13\uffff";
    static final String DFA136_eofS =
        "\13\uffff";
    static final String DFA136_minS =
        "\1\60\12\uffff";
    static final String DFA136_maxS =
        "\1\137\12\uffff";
    static final String DFA136_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\3";
    static final String DFA136_specialS =
        "\13\uffff}>";
    static final String[] DFA136_transitionS = {
            "\1\12\6\uffff\1\2\20\uffff\2\1\17\uffff\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA136_eot = DFA.unpackEncodedString(DFA136_eotS);
    static final short[] DFA136_eof = DFA.unpackEncodedString(DFA136_eofS);
    static final char[] DFA136_min = DFA.unpackEncodedStringToUnsignedChars(DFA136_minS);
    static final char[] DFA136_max = DFA.unpackEncodedStringToUnsignedChars(DFA136_maxS);
    static final short[] DFA136_accept = DFA.unpackEncodedString(DFA136_acceptS);
    static final short[] DFA136_special = DFA.unpackEncodedString(DFA136_specialS);
    static final short[][] DFA136_transition;

    static {
        int numStates = DFA136_transitionS.length;
        DFA136_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA136_transition[i] = DFA.unpackEncodedString(DFA136_transitionS[i]);
        }
    }

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = DFA136_eot;
            this.eof = DFA136_eof;
            this.min = DFA136_min;
            this.max = DFA136_max;
            this.accept = DFA136_accept;
            this.special = DFA136_special;
            this.transition = DFA136_transition;
        }
        public String getDescription() {
            return "432:37: ( signed_default_number | literal_value | LPAREN expr RPAREN )";
        }
    }
    static final String DFA145_eotS =
        "\22\uffff";
    static final String DFA145_eofS =
        "\1\2\21\uffff";
    static final String DFA145_minS =
        "\1\44\21\uffff";
    static final String DFA145_maxS =
        "\1\u00a7\21\uffff";
    static final String DFA145_acceptS =
        "\1\uffff\1\1\1\2\17\uffff";
    static final String DFA145_specialS =
        "\22\uffff}>";
    static final String[] DFA145_transitionS = {
            "\1\2\6\uffff\1\2\4\uffff\1\1\2\2\4\uffff\1\2\7\uffff\1\2\17"+
            "\uffff\1\2\64\uffff\1\2\4\uffff\1\2\23\uffff\2\2\2\uffff\2\2"+
            "\1\uffff\1\2\2\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA145_eot = DFA.unpackEncodedString(DFA145_eotS);
    static final short[] DFA145_eof = DFA.unpackEncodedString(DFA145_eofS);
    static final char[] DFA145_min = DFA.unpackEncodedStringToUnsignedChars(DFA145_minS);
    static final char[] DFA145_max = DFA.unpackEncodedStringToUnsignedChars(DFA145_maxS);
    static final short[] DFA145_accept = DFA.unpackEncodedString(DFA145_acceptS);
    static final short[] DFA145_special = DFA.unpackEncodedString(DFA145_specialS);
    static final short[][] DFA145_transition;

    static {
        int numStates = DFA145_transitionS.length;
        DFA145_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA145_transition[i] = DFA.unpackEncodedString(DFA145_transitionS[i]);
        }
    }

    class DFA145 extends DFA {

        public DFA145(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 145;
            this.eot = DFA145_eot;
            this.eof = DFA145_eof;
            this.min = DFA145_min;
            this.max = DFA145_max;
            this.accept = DFA145_accept;
            this.special = DFA145_special;
            this.transition = DFA145_transition;
        }
        public String getDescription() {
            return "461:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?";
        }
    }
    static final String DFA146_eotS =
        "\21\uffff";
    static final String DFA146_eofS =
        "\1\1\20\uffff";
    static final String DFA146_minS =
        "\1\44\20\uffff";
    static final String DFA146_maxS =
        "\1\u00a7\20\uffff";
    static final String DFA146_acceptS =
        "\1\uffff\1\2\15\uffff\1\1\1\uffff";
    static final String DFA146_specialS =
        "\21\uffff}>";
    static final String[] DFA146_transitionS = {
            "\1\1\6\uffff\1\1\5\uffff\2\1\4\uffff\1\1\7\uffff\1\17\17\uffff"+
            "\1\1\64\uffff\1\17\4\uffff\1\1\23\uffff\2\1\2\uffff\2\1\1\uffff"+
            "\1\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA146_eot = DFA.unpackEncodedString(DFA146_eotS);
    static final short[] DFA146_eof = DFA.unpackEncodedString(DFA146_eofS);
    static final char[] DFA146_min = DFA.unpackEncodedStringToUnsignedChars(DFA146_minS);
    static final char[] DFA146_max = DFA.unpackEncodedStringToUnsignedChars(DFA146_maxS);
    static final short[] DFA146_accept = DFA.unpackEncodedString(DFA146_acceptS);
    static final short[] DFA146_special = DFA.unpackEncodedString(DFA146_specialS);
    static final short[][] DFA146_transition;

    static {
        int numStates = DFA146_transitionS.length;
        DFA146_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA146_transition[i] = DFA.unpackEncodedString(DFA146_transitionS[i]);
        }
    }

    class DFA146 extends DFA {

        public DFA146(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 146;
            this.eot = DFA146_eot;
            this.eof = DFA146_eof;
            this.min = DFA146_min;
            this.max = DFA146_max;
            this.accept = DFA146_accept;
            this.special = DFA146_special;
            this.transition = DFA146_transition;
        }
        public String getDescription() {
            return "()* loopback of 462:3: ( fk_clause_action )*";
        }
    }
    static final String DFA147_eotS =
        "\21\uffff";
    static final String DFA147_eofS =
        "\1\3\20\uffff";
    static final String DFA147_minS =
        "\1\44\1\67\17\uffff";
    static final String DFA147_maxS =
        "\2\u00a7\17\uffff";
    static final String DFA147_acceptS =
        "\2\uffff\1\1\1\2\15\uffff";
    static final String DFA147_specialS =
        "\21\uffff}>";
    static final String[] DFA147_transitionS = {
            "\1\3\6\uffff\1\1\5\uffff\2\3\4\uffff\1\3\27\uffff\1\3\71\uffff"+
            "\1\3\23\uffff\2\3\2\uffff\2\3\1\uffff\1\3\2\uffff\1\2",
            "\1\3\157\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA147_eot = DFA.unpackEncodedString(DFA147_eotS);
    static final short[] DFA147_eof = DFA.unpackEncodedString(DFA147_eofS);
    static final char[] DFA147_min = DFA.unpackEncodedStringToUnsignedChars(DFA147_minS);
    static final char[] DFA147_max = DFA.unpackEncodedStringToUnsignedChars(DFA147_maxS);
    static final short[] DFA147_accept = DFA.unpackEncodedString(DFA147_acceptS);
    static final short[] DFA147_special = DFA.unpackEncodedString(DFA147_specialS);
    static final short[][] DFA147_transition;

    static {
        int numStates = DFA147_transitionS.length;
        DFA147_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA147_transition[i] = DFA.unpackEncodedString(DFA147_transitionS[i]);
        }
    }

    class DFA147 extends DFA {

        public DFA147(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 147;
            this.eot = DFA147_eot;
            this.eof = DFA147_eof;
            this.min = DFA147_min;
            this.max = DFA147_max;
            this.accept = DFA147_accept;
            this.special = DFA147_special;
            this.transition = DFA147_transition;
        }
        public String getDescription() {
            return "462:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA151_eotS =
        "\21\uffff";
    static final String DFA151_eofS =
        "\1\2\20\uffff";
    static final String DFA151_minS =
        "\1\44\1\u008e\17\uffff";
    static final String DFA151_maxS =
        "\1\u00a8\1\u008f\17\uffff";
    static final String DFA151_acceptS =
        "\2\uffff\1\3\14\uffff\1\1\1\2";
    static final String DFA151_specialS =
        "\21\uffff}>";
    static final String[] DFA151_transitionS = {
            "\1\2\6\uffff\1\2\5\uffff\2\2\4\uffff\1\2\27\uffff\1\2\71\uffff"+
            "\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2\3\uffff\1\1",
            "\1\17\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA151_eot = DFA.unpackEncodedString(DFA151_eotS);
    static final short[] DFA151_eof = DFA.unpackEncodedString(DFA151_eofS);
    static final char[] DFA151_min = DFA.unpackEncodedStringToUnsignedChars(DFA151_minS);
    static final char[] DFA151_max = DFA.unpackEncodedStringToUnsignedChars(DFA151_maxS);
    static final short[] DFA151_accept = DFA.unpackEncodedString(DFA151_acceptS);
    static final short[] DFA151_special = DFA.unpackEncodedString(DFA151_specialS);
    static final short[][] DFA151_transition;

    static {
        int numStates = DFA151_transitionS.length;
        DFA151_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA151_transition[i] = DFA.unpackEncodedString(DFA151_transitionS[i]);
        }
    }

    class DFA151 extends DFA {

        public DFA151(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 151;
            this.eot = DFA151_eot;
            this.eof = DFA151_eof;
            this.min = DFA151_min;
            this.max = DFA151_max;
            this.accept = DFA151_accept;
            this.special = DFA151_special;
            this.transition = DFA151_transition;
        }
        public String getDescription() {
            return "469:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
    static final String DFA171_eotS =
        "\14\uffff";
    static final String DFA171_eofS =
        "\14\uffff";
    static final String DFA171_minS =
        "\1\45\1\50\12\uffff";
    static final String DFA171_maxS =
        "\1\u00b7\1\u00b3\12\uffff";
    static final String DFA171_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA171_specialS =
        "\14\uffff}>";
    static final String[] DFA171_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\12\2\2\uffff"+
            "\1\2\1\uffff\3\2\3\uffff\70\2\1\1\34\2",
            "\1\2\2\uffff\1\4\132\uffff\1\2\3\uffff\1\2\1\uffff\1\2\44\uffff"+
            "\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA171_eot = DFA.unpackEncodedString(DFA171_eotS);
    static final short[] DFA171_eof = DFA.unpackEncodedString(DFA171_eofS);
    static final char[] DFA171_min = DFA.unpackEncodedStringToUnsignedChars(DFA171_minS);
    static final char[] DFA171_max = DFA.unpackEncodedStringToUnsignedChars(DFA171_maxS);
    static final short[] DFA171_accept = DFA.unpackEncodedString(DFA171_acceptS);
    static final short[] DFA171_special = DFA.unpackEncodedString(DFA171_specialS);
    static final short[][] DFA171_transition;

    static {
        int numStates = DFA171_transitionS.length;
        DFA171_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA171_transition[i] = DFA.unpackEncodedString(DFA171_transitionS[i]);
        }
    }

    class DFA171 extends DFA {

        public DFA171(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 171;
            this.eot = DFA171_eot;
            this.eof = DFA171_eof;
            this.min = DFA171_min;
            this.max = DFA171_max;
            this.accept = DFA171_accept;
            this.special = DFA171_special;
            this.transition = DFA171_transition;
        }
        public String getDescription() {
            return "499:48: ( IF NOT EXISTS )?";
        }
    }
    static final String DFA172_eotS =
        "\21\uffff";
    static final String DFA172_eofS =
        "\21\uffff";
    static final String DFA172_minS =
        "\1\45\2\50\16\uffff";
    static final String DFA172_maxS =
        "\1\u00b7\2\u00b3\16\uffff";
    static final String DFA172_acceptS =
        "\3\uffff\1\1\1\2\14\uffff";
    static final String DFA172_specialS =
        "\21\uffff}>";
    static final String[] DFA172_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\7\uffff\3\2\26\uffff\1\2\1\1\10"+
            "\2\2\uffff\1\1\1\uffff\3\2\3\uffff\125\2",
            "\1\3\135\uffff\1\4\3\uffff\1\4\1\uffff\1\4\44\uffff\3\4",
            "\1\3\135\uffff\1\4\3\uffff\1\4\1\uffff\1\4\44\uffff\3\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA172_eot = DFA.unpackEncodedString(DFA172_eotS);
    static final short[] DFA172_eof = DFA.unpackEncodedString(DFA172_eofS);
    static final char[] DFA172_min = DFA.unpackEncodedStringToUnsignedChars(DFA172_minS);
    static final char[] DFA172_max = DFA.unpackEncodedStringToUnsignedChars(DFA172_maxS);
    static final short[] DFA172_accept = DFA.unpackEncodedString(DFA172_acceptS);
    static final short[] DFA172_special = DFA.unpackEncodedString(DFA172_specialS);
    static final short[][] DFA172_transition;

    static {
        int numStates = DFA172_transitionS.length;
        DFA172_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA172_transition[i] = DFA.unpackEncodedString(DFA172_transitionS[i]);
        }
    }

    class DFA172 extends DFA {

        public DFA172(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 172;
            this.eot = DFA172_eot;
            this.eof = DFA172_eof;
            this.min = DFA172_min;
            this.max = DFA172_max;
            this.accept = DFA172_accept;
            this.special = DFA172_special;
            this.transition = DFA172_transition;
        }
        public String getDescription() {
            return "499:65: (database_name= id DOT )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list223 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_list226 = new BitSet(new long[]{0x0000002000000000L,0x0200FB2000400000L,0x0000060000B43440L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list230 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_list232 = new BitSet(new long[]{0x0000002000000000L,0x0200FB2000400000L,0x0000060000B43440L});
    public static final BitSet FOLLOW_EOF_in_sql_stmt_list240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_itself248 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_itself251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_sql_stmt_itself256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt265 = new BitSet(new long[]{0x0000006000000000L,0x0200FB2000400000L,0x0000060000B43440L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt268 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt270 = new BitSet(new long[]{0x0000002000000000L,0x0200FB2000400000L,0x0000060000B43440L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_schema_create_table_stmt446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_schema_create_table_stmt450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name460 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name462 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name468 = new BitSet(new long[]{0x00000A0000000002L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name471 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name473 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name481 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr492 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OR_in_expr495 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_or_subexpr_in_expr498 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr507 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_AND_in_or_subexpr510 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr513 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr522 = new BitSet(new long[]{0xFF78880000000002L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr536 = new BitSet(new long[]{0xF000080000000000L});
    public static final BitSet FOLLOW_match_op_in_cond_expr539 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr543 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr546 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr578 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr581 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr583 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_cond_expr585 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_cond_expr588 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_cond_expr590 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr616 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr619 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_cond_expr624 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_cond_expr626 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_cond_expr632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr660 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr663 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr666 = new BitSet(new long[]{0x0004000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_cond_expr669 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr679 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_EQUALS_in_cond_expr682 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr685 = new BitSet(new long[]{0x0004000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_cond_expr688 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr715 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr725 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr735 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_in_cond_expr737 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr750 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_in_cond_expr752 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr761 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr764 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr768 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_AND_in_cond_expr770 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr800 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr817 = new BitSet(new long[]{0x0E08000000000002L});
    public static final BitSet FOLLOW_set_in_match_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr850 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_eq_subexpr853 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr870 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr879 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_set_in_neq_subexpr882 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr899 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_set_in_bit_subexpr911 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr920 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr929 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_add_subexpr932 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr957 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_con_subexpr973 = new BitSet(new long[]{0x01C176E000000000L,0xFFFFFFFFFFFF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr1009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr1045 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr1047 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_atom_expr1053 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_atom_expr1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr1090 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1092 = new BitSet(new long[]{0x01C57EE000000000L,0xFFFFFFFFFFFFC700L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr1095 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1100 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr1103 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1107 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr1113 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1142 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1145 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr1154 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1157 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_AS_in_atom_expr1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1165 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1176 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1181 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_when_expr_in_atom_expr1185 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1189 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_END_in_atom_expr1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when_expr1230 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_when_expr1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_THEN_in_when_expr1236 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_when_expr1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1402 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1421 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1446 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1449 = new BitSet(new long[]{0x0000000000000000L,0x000000F000000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1453 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_raise_function1457 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1474 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1487 = new BitSet(new long[]{0x0001000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000300L});
    public static final BitSet FOLLOW_signed_number_in_type_name1495 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000300L});
    public static final BitSet FOLLOW_signed_number_in_type_name1502 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_signed_number1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1560 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1565 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1567 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1573 = new BitSet(new long[]{0x0009000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1576 = new BitSet(new long[]{0x0000000000000000L,0x000000000E010300L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1582 = new BitSet(new long[]{0x0000000000000000L,0x000000000E010300L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1584 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pragma_value1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1659 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1662 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_attach_stmt1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1670 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_attach_stmt1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1682 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1685 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_detach_stmt1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1699 = new BitSet(new long[]{0x01C076E000000002L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1710 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1712 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1726 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1731 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1733 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1758 = new BitSet(new long[]{0x0000000000000000L,0x000080F000000000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1785 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1824 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1826 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1828 = new BitSet(new long[]{0x0002000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1831 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1833 = new BitSet(new long[]{0x0002000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1845 = new BitSet(new long[]{0x0002000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1848 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1868 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1873 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BY_in_select_stmt1875 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1877 = new BitSet(new long[]{0x0002000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1880 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1882 = new BitSet(new long[]{0x0002000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1895 = new BitSet(new long[]{0x0002000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1899 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1953 = new BitSet(new long[]{0x0000000000000002L,0x01A0000000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1956 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1959 = new BitSet(new long[]{0x0000000000000002L,0x01A0000000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1968 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_ALL_in_select_op1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1991 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC700L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ALL_in_select_core1994 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC700L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1998 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC700L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core2002 = new BitSet(new long[]{0x0002000000000002L,0x1C00000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core2005 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC700L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core2007 = new BitSet(new long[]{0x0002000000000002L,0x1C00000000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core2012 = new BitSet(new long[]{0x01C176E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_select_core2014 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core2019 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core2023 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core2031 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BY_in_select_core2033 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core2035 = new BitSet(new long[]{0x0002000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core2038 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core2040 = new BitSet(new long[]{0x0002000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core2045 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column2127 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_result_column2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column2146 = new BitSet(new long[]{0x01C076E000000002L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_AS_in_result_column2150 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_result_column2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source2177 = new BitSet(new long[]{0x0002000000000002L,0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_join_op_in_join_source2180 = new BitSet(new long[]{0x01C176E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_single_source_in_join_source2183 = new BitSet(new long[]{0x0002000000000002L,0xC000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_join_constraint_in_join_source2186 = new BitSet(new long[]{0x0002000000000002L,0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_id_in_single_source2203 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_single_source2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_single_source2211 = new BitSet(new long[]{0x00000A0000000002L,0x0000000000090000L});
    public static final BitSet FOLLOW_AS_in_single_source2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_single_source2221 = new BitSet(new long[]{0x00000A0000000002L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2226 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BY_in_single_source2228 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_single_source2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source2236 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2279 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2281 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2283 = new BitSet(new long[]{0x0000000000000002L,0x0000000000090000L});
    public static final BitSet FOLLOW_AS_in_single_source2287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_single_source2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2315 = new BitSet(new long[]{0x01C176E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_single_source2318 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2338 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_LEFT_in_join_op2344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_OUTER_in_join_op2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_INNER_in_join_op2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_CROSS_in_join_op2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_in_join_op2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2373 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_join_constraint2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2382 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2384 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2388 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2391 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2395 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2418 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2430 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2435 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2437 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2443 = new BitSet(new long[]{0x0001000000000000L,0x0200000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2450 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2454 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2457 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2461 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2465 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2474 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2476 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2480 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2483 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2487 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2514 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2517 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SET_in_update_stmt2525 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2529 = new BitSet(new long[]{0x0002000000000002L,0x080C000000000000L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2532 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2536 = new BitSet(new long[]{0x0002000000000002L,0x080C000000000000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2541 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_stmt2543 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2559 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2561 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_set2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2571 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2573 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2575 = new BitSet(new long[]{0x0000000000000002L,0x080C000000000000L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2578 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2580 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2648 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2651 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2667 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2679 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2682 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_release_stmt2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2703 = new BitSet(new long[]{0x0000000000000000L,0x000080F000000000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2737 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2742 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2744 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2754 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2758 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2761 = new BitSet(new long[]{0xF1F0FEE000000000L,0xFFFFFFF8E9FF8000L,0x00FFDFFFDFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2763 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2766 = new BitSet(new long[]{0xF1F0FEE000000000L,0xFFFFFFF8E9FF8000L,0x00FFDFFFDFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2768 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2823 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2826 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2830 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2837 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2839 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2845 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2851 = new BitSet(new long[]{0xF1F0FEE000000000L,0xFFFFFFF8E9FF8000L,0x00FFDFFFDFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2853 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2856 = new BitSet(new long[]{0xF1F0FEE000000000L,0xFFFFFFF8E9FF8000L,0x00FFDFFFDFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2858 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000E60000000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2865 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2875 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2933 = new BitSet(new long[]{0x0080080000000002L,0x0000000000018000L,0x0000001660000200L});
    public static final BitSet FOLLOW_type_name_in_column_def2935 = new BitSet(new long[]{0x0080080000000002L,0x0000000000008000L,0x0000001660000200L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2938 = new BitSet(new long[]{0x0080080000000002L,0x0000000000008000L,0x0000001660000200L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2964 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint2968 = new BitSet(new long[]{0x0080080000000000L,0x0000000000008000L,0x0000001660000200L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_null_in_column_constraint2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk3081 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L,0x0000000100000010L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk3084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000010L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk3093 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null3106 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null3108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_null3127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_null3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique3146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check3157 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check3160 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check3163 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numeric_literal_value3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_numeric_literal_value3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_default_number3208 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_numeric_literal_value_in_signed_default_number3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default3225 = new BitSet(new long[]{0x0081000000000000L,0x00000000FE000300L});
    public static final BitSet FOLLOW_signed_default_number_in_column_constraint_default3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default3237 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default3240 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate3251 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint3265 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint3269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000E60000000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk3337 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk3341 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3345 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk3348 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3352 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3383 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3387 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3391 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3394 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3398 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3429 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3432 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3435 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3447 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3449 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3453 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3456 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3460 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3464 = new BitSet(new long[]{0x0080080000000000L,0x0000000000008000L,0x0000001660000200L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3489 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3493 = new BitSet(new long[]{0x8001080000000002L,0x0000000000000000L,0x0000008000000010L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3496 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3500 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3503 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3507 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3511 = new BitSet(new long[]{0x8000080000000002L,0x0000000000000000L,0x0000008000000010L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3517 = new BitSet(new long[]{0x8000080000000002L,0x0000000000000000L,0x0000008000000010L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001440L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000006000000800L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3570 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3595 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3636 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3641 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3648 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3650 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3688 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3693 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3695 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3706 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3714 = new BitSet(new long[]{0xF1F0FEE000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFDFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3717 = new BitSet(new long[]{0xF1F0FEE000000000L,0xFFFFFFF8E9FF8000L,0x00FFDFFFDFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400004000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3735 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3738 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3742 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3749 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3751 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3759 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3806 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3811 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3818 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3820 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800200000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3841 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3844 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3848 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3855 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3857 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3867 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3871 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3873 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3877 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3880 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3884 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3934 = new BitSet(new long[]{0x0000000000000002L,0x0003000000008000L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3937 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_indexed_column3941 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3983 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3988 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3995 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3997 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt4033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000004000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt4035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt4038 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt4041 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt4043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt4045 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4052 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt4054 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000E000000001440L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt4065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001440L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt4069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001440L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt4073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt4075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001440L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt4080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt4084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000010L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt4091 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4095 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt4098 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4102 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt4111 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0020000000002000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt4118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt4120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt4122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt4127 = new BitSet(new long[]{0x01C17EE000000000L,0xFFFFFFFFFFFFC300L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt4129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt4135 = new BitSet(new long[]{0x0000000000000000L,0x0200800000000000L,0x0000000000001440L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt4139 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt4143 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt4147 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt4151 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt4154 = new BitSet(new long[]{0x0000000000000000L,0x0200800000400000L,0x0000000000001440L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt4191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt4193 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt4198 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt4205 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt4207 = new BitSet(new long[]{0x01C076E000000000L,0xFFFFFFF8E9FF8000L,0x00FFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id_core4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_core_in_id4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_core_in_id_column_def4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4931 = new BitSet(new long[]{0x0000000000000002L});

}