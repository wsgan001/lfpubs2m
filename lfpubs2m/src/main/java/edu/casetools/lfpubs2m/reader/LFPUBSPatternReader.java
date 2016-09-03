package edu.casetools.lfpubs2m.reader;




import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.casetools.lfpubs2m.lfpubsdata.LFPUBSPattern;
import edu.casetools.lfpubs2m.lfpubsdata.Condition.IfContext;
import edu.casetools.lfpubs2m.lfpubsdata.action.ThenDo;
import edu.casetools.lfpubs2m.lfpubsdata.events.Occurs;
import edu.casetools.lfpubs2m.translation.ContextTranslator;
import edu.casetools.lfpubs2m.translation.DoTranslator;
import edu.casetools.lfpubs2m.translation.OccursTranslator;


public class LFPUBSPatternReader {
	
	private Pattern p;
	private Matcher m;
	private OccursTranslator occursTranslator;
	private DoTranslator doTranslator;
	private ContextTranslator ifContextTranslator;
	
	public LFPUBSPatternReader(boolean debug){
		 occursTranslator 	 = new OccursTranslator();
		 ifContextTranslator = new ContextTranslator(debug);
		 doTranslator     	 = new DoTranslator();
	}
	
	public LFPUBSPattern interpretCommand(LFPUBSPattern pattern,String line, Syntax.CommandType commandType){
		line = line.replaceAll("\\s","");
		switch(commandType){
			case ACTION_PATTERN_ID:
				p = Pattern.compile( Syntax.ACTION_PATTERN_ID_PATTERN );
				m = p.matcher(line); 
				if( m.find()) pattern.setId(m.group(1));		
				break;
			case IF_CONTEXT:
				   pattern.setContext( interpretIfContext(line));
				break;
			case ON_OCCURS:
					pattern.setEvent( interpretOnOccurs(line) );
				break;
			case THEN_DO:
					pattern.setAction( interpretThenDo(line) );
				break;
		default:
			break;
		}
		return pattern;
	}

	private ThenDo interpretThenDo(String line) {
		ThenDo thenDo = new ThenDo();
		
		thenDo = doTranslator.readFirstElementOfDo  ( line, thenDo );
		thenDo = doTranslator.readThirdElementOfDo  ( line, thenDo );
		thenDo = doTranslator.readSecondElementOfDo ( line, thenDo );
		thenDo = doTranslator.readForthElementOfDo  ( line, thenDo );
		thenDo = doTranslator.readFifthElementOfDo  ( line, thenDo );

		
		return thenDo;
	}
	
	private Occurs interpretOnOccurs(String line) {
		Occurs occurs = new Occurs();
		
		occurs = occursTranslator.readFirstElementOfOccurs  ( line, occurs );
		occurs = occursTranslator.readThirdElementOfOccurs  ( line, occurs );
		occurs = occursTranslator.readSecondElementOfOccurs ( line, occurs );
		occurs = occursTranslator.readForthElementOfOccurs  ( line, occurs );
		
		return occurs;
	}
	
	private IfContext interpretIfContext(String line) {
		IfContext ifContext = new IfContext();
		
		ifContext = ifContextTranslator.readContext ( line, ifContext );
		
		return ifContext;
	}

	
	

}