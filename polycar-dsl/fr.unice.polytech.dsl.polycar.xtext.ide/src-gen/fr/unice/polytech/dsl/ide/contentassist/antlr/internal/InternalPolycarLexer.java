package fr.unice.polytech.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolycarLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalPolycarLexer() {;} 
    public InternalPolycarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPolycarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPolycar.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:11:7: ( 'FORB_FORWARD' )
            // InternalPolycar.g:11:9: 'FORB_FORWARD'
            {
            match("FORB_FORWARD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:12:7: ( 'FORB_LEFT' )
            // InternalPolycar.g:12:9: 'FORB_LEFT'
            {
            match("FORB_LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:13:7: ( 'FORB_RIGHT' )
            // InternalPolycar.g:13:9: 'FORB_RIGHT'
            {
            match("FORB_RIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:14:7: ( 'OFF_ROAD_LEFT' )
            // InternalPolycar.g:14:9: 'OFF_ROAD_LEFT'
            {
            match("OFF_ROAD_LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:15:7: ( 'OFF_ROAD_RIGHT' )
            // InternalPolycar.g:15:9: 'OFF_ROAD_RIGHT'
            {
            match("OFF_ROAD_RIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:16:7: ( 'TRAFFIC_LIGHT_OFF' )
            // InternalPolycar.g:16:9: 'TRAFFIC_LIGHT_OFF'
            {
            match("TRAFFIC_LIGHT_OFF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:17:7: ( 'TRAFFIC_LIGHT_ON' )
            // InternalPolycar.g:17:9: 'TRAFFIC_LIGHT_ON'
            {
            match("TRAFFIC_LIGHT_ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:18:7: ( 'OBJECT_LEFT' )
            // InternalPolycar.g:18:9: 'OBJECT_LEFT'
            {
            match("OBJECT_LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:19:7: ( 'OBJECT_RIGHT' )
            // InternalPolycar.g:19:9: 'OBJECT_RIGHT'
            {
            match("OBJECT_RIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:20:7: ( 'OBJECT_MIDDLE' )
            // InternalPolycar.g:20:9: 'OBJECT_MIDDLE'
            {
            match("OBJECT_MIDDLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:21:7: ( 'CAN_GO_LEFT' )
            // InternalPolycar.g:21:9: 'CAN_GO_LEFT'
            {
            match("CAN_GO_LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:22:7: ( 'CAN_GO_RIGHT' )
            // InternalPolycar.g:22:9: 'CAN_GO_RIGHT'
            {
            match("CAN_GO_RIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:23:7: ( 'MOTOR_LEFT' )
            // InternalPolycar.g:23:9: 'MOTOR_LEFT'
            {
            match("MOTOR_LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:24:7: ( 'MOTOR_RIGHT' )
            // InternalPolycar.g:24:9: 'MOTOR_RIGHT'
            {
            match("MOTOR_RIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:25:7: ( 'SPEED' )
            // InternalPolycar.g:25:9: 'SPEED'
            {
            match("SPEED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:26:7: ( 'Car' )
            // InternalPolycar.g:26:9: 'Car'
            {
            match("Car"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:27:7: ( 'actions' )
            // InternalPolycar.g:27:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:28:7: ( ':' )
            // InternalPolycar.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:29:7: ( 'environments' )
            // InternalPolycar.g:29:9: 'environments'
            {
            match("environments"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:30:7: ( 'RUN' )
            // InternalPolycar.g:30:9: 'RUN'
            {
            match("RUN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:31:7: ( '-' )
            // InternalPolycar.g:31:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:32:7: ( '->' )
            // InternalPolycar.g:32:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:33:7: ( 'is' )
            // InternalPolycar.g:33:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:34:7: ( 'during' )
            // InternalPolycar.g:34:9: 'during'
            {
            match("during"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:1526:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPolycar.g:1526:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPolycar.g:1526:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPolycar.g:1526:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPolycar.g:1526:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPolycar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:1528:10: ( ( '0' .. '9' )+ )
            // InternalPolycar.g:1528:12: ( '0' .. '9' )+
            {
            // InternalPolycar.g:1528:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPolycar.g:1528:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:1530:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPolycar.g:1530:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPolycar.g:1530:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPolycar.g:1530:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPolycar.g:1530:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPolycar.g:1530:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPolycar.g:1530:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPolycar.g:1530:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPolycar.g:1530:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPolycar.g:1530:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPolycar.g:1530:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:1532:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPolycar.g:1532:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPolycar.g:1532:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPolycar.g:1532:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:1534:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPolycar.g:1534:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPolycar.g:1534:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPolycar.g:1534:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPolycar.g:1534:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPolycar.g:1534:41: ( '\\r' )? '\\n'
                    {
                    // InternalPolycar.g:1534:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPolycar.g:1534:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:1536:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPolycar.g:1536:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPolycar.g:1536:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPolycar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPolycar.g:1538:16: ( . )
            // InternalPolycar.g:1538:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPolycar.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=31;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPolycar.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalPolycar.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalPolycar.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalPolycar.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalPolycar.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalPolycar.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalPolycar.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalPolycar.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalPolycar.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalPolycar.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalPolycar.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalPolycar.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalPolycar.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalPolycar.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalPolycar.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalPolycar.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalPolycar.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalPolycar.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalPolycar.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalPolycar.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalPolycar.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalPolycar.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalPolycar.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalPolycar.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalPolycar.g:1:154: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalPolycar.g:1:162: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalPolycar.g:1:171: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalPolycar.g:1:183: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalPolycar.g:1:199: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalPolycar.g:1:215: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalPolycar.g:1:223: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\27\1\uffff\2\27\1\44\2\27\1\25\2\uffff\3\25\2\uffff\1\27\1\uffff\10\27\1\uffff\2\27\2\uffff\1\67\1\27\5\uffff\5\27\1\76\4\27\1\103\1\uffff\6\27\1\uffff\4\27\1\uffff\7\27\1\127\13\27\1\uffff\2\27\1\146\11\27\1\163\1\27\1\uffff\14\27\1\uffff\2\27\1\u0083\14\27\1\uffff\1\u0091\10\27\1\u009a\3\27\1\uffff\2\27\1\u00a0\3\27\1\u00a4\1\27\1\uffff\1\u00a6\1\27\1\u00a8\2\27\1\uffff\1\u00ab\2\27\1\uffff\1\u00ae\1\uffff\1\u00af\1\uffff\1\u00b0\1\27\1\uffff\1\u00b2\1\27\3\uffff\1\u00b4\1\uffff\1\27\1\uffff\2\27\1\u00b9\1\u00ba\2\uffff";
    static final String DFA12_eofS =
        "\u00bb\uffff";
    static final String DFA12_minS =
        "\1\0\1\117\1\102\1\122\1\101\1\117\1\120\1\143\1\uffff\1\156\1\125\1\76\1\163\1\165\1\101\2\uffff\2\0\1\52\2\uffff\1\122\1\uffff\1\106\1\112\1\101\1\116\1\162\1\124\1\105\1\164\1\uffff\1\166\1\116\2\uffff\1\60\1\162\5\uffff\1\102\1\137\1\105\1\106\1\137\1\60\1\117\1\105\2\151\1\60\1\uffff\1\151\1\137\1\122\1\103\1\106\1\107\1\uffff\1\122\1\104\1\157\1\162\1\uffff\1\156\1\106\1\117\1\124\1\111\1\117\1\137\1\60\1\156\1\157\1\147\1\117\1\105\1\111\1\101\1\137\1\103\1\137\1\114\1\uffff\1\163\1\156\1\60\1\122\1\106\1\107\1\104\1\114\1\137\1\114\1\105\1\111\1\60\1\155\1\uffff\1\127\1\124\1\110\1\137\1\105\2\111\1\114\1\105\1\111\1\106\1\107\1\uffff\1\145\1\101\1\60\1\124\1\114\1\106\1\107\1\104\1\111\1\106\1\107\1\124\1\110\1\156\1\122\1\uffff\1\60\1\105\1\111\1\124\1\110\1\104\1\107\1\124\1\110\1\60\1\124\1\164\1\104\1\uffff\1\106\1\107\1\60\1\124\1\114\1\110\1\60\1\124\1\uffff\1\60\1\163\1\60\1\124\1\110\1\uffff\1\60\1\105\1\124\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\124\1\uffff\1\60\1\137\3\uffff\1\60\1\uffff\1\117\1\uffff\2\106\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\117\1\106\1\122\1\141\1\117\1\120\1\143\1\uffff\1\156\1\125\1\76\1\163\1\165\1\172\2\uffff\2\uffff\1\57\2\uffff\1\122\1\uffff\1\106\1\112\1\101\1\116\1\162\1\124\1\105\1\164\1\uffff\1\166\1\116\2\uffff\1\172\1\162\5\uffff\1\102\1\137\1\105\1\106\1\137\1\172\1\117\1\105\2\151\1\172\1\uffff\1\151\1\137\1\122\1\103\1\106\1\107\1\uffff\1\122\1\104\1\157\1\162\1\uffff\1\156\1\122\1\117\1\124\1\111\1\117\1\137\1\172\1\156\1\157\1\147\1\117\1\105\1\111\1\101\1\137\1\103\1\137\1\122\1\uffff\1\163\1\156\1\172\1\122\1\106\1\107\1\104\1\122\1\137\1\122\1\105\1\111\1\172\1\155\1\uffff\1\127\1\124\1\110\1\137\1\105\2\111\1\114\1\105\1\111\1\106\1\107\1\uffff\1\145\1\101\1\172\1\124\1\122\1\106\1\107\1\104\1\111\1\106\1\107\1\124\1\110\1\156\1\122\1\uffff\1\172\1\105\1\111\1\124\1\110\1\104\1\107\1\124\1\110\1\172\1\124\1\164\1\104\1\uffff\1\106\1\107\1\172\1\124\1\114\1\110\1\172\1\124\1\uffff\1\172\1\163\1\172\1\124\1\110\1\uffff\1\172\1\105\1\124\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\124\1\uffff\1\172\1\137\3\uffff\1\172\1\uffff\1\117\1\uffff\1\116\1\106\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\22\6\uffff\1\31\1\32\3\uffff\1\36\1\37\1\uffff\1\31\10\uffff\1\22\2\uffff\1\26\1\25\2\uffff\1\32\1\33\1\34\1\35\1\36\13\uffff\1\27\6\uffff\1\20\4\uffff\1\24\23\uffff\1\17\16\uffff\1\30\14\uffff\1\21\17\uffff\1\2\15\uffff\1\3\10\uffff\1\15\5\uffff\1\10\3\uffff\1\13\1\uffff\1\16\1\uffff\1\1\2\uffff\1\11\2\uffff\1\14\1\23\1\4\1\uffff\1\12\1\uffff\1\5\4\uffff\1\7\1\6";
    static final String DFA12_specialS =
        "\1\0\20\uffff\1\2\1\1\u00a8\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\5\25\1\13\1\25\1\23\12\20\1\10\6\25\2\17\1\4\2\17\1\1\6\17\1\5\1\17\1\2\2\17\1\12\1\6\1\3\6\17\3\25\1\16\1\17\1\25\1\7\2\17\1\15\1\11\3\17\1\14\21\17\uff85\25",
            "\1\26",
            "\1\31\3\uffff\1\30",
            "\1\32",
            "\1\33\37\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\45",
            "\1\46",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\50",
            "\0\50",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "\1\54",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\1\65",
            "\1\66",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117\5\uffff\1\120\5\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142\5\uffff\1\143",
            "",
            "\1\144",
            "\1\145",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\1\155\4\uffff\1\154",
            "\1\156",
            "\1\157\5\uffff\1\160",
            "\1\161",
            "\1\162",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0084",
            "\1\u0085\5\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a5",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a7",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00b1",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00b3",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u00b5",
            "",
            "\1\u00b6\7\uffff\1\u00b7",
            "\1\u00b8",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='F') ) {s = 1;}

                        else if ( (LA12_0=='O') ) {s = 2;}

                        else if ( (LA12_0=='T') ) {s = 3;}

                        else if ( (LA12_0=='C') ) {s = 4;}

                        else if ( (LA12_0=='M') ) {s = 5;}

                        else if ( (LA12_0=='S') ) {s = 6;}

                        else if ( (LA12_0=='a') ) {s = 7;}

                        else if ( (LA12_0==':') ) {s = 8;}

                        else if ( (LA12_0=='e') ) {s = 9;}

                        else if ( (LA12_0=='R') ) {s = 10;}

                        else if ( (LA12_0=='-') ) {s = 11;}

                        else if ( (LA12_0=='i') ) {s = 12;}

                        else if ( (LA12_0=='d') ) {s = 13;}

                        else if ( (LA12_0=='^') ) {s = 14;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='L')||LA12_0=='N'||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='z')) ) {s = 15;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( (LA12_0=='/') ) {s = 19;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 20;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}