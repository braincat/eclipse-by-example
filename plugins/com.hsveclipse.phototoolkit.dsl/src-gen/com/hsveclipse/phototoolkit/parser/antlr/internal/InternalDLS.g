/*
 * generated by Xtext
 */
grammar InternalDLS;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.hsveclipse.phototoolkit.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.hsveclipse.phototoolkit.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.hsveclipse.phototoolkit.services.DLSGrammarAccess;

}

@parser::members {

 	private DLSGrammarAccess grammarAccess;
 	
    public InternalDLSParser(TokenStream input, DLSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Site";	
   	}
   	
   	@Override
   	protected DLSGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSite
entryRuleSite returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSiteRule()); }
	 iv_ruleSite=ruleSite 
	 { $current=$iv_ruleSite.current; } 
	 EOF 
;

// Rule Site
ruleSite returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSiteAccess().getSiteAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getSiteAccess().getPhotosPhotoParserRuleCall_1_0_0()); 
	    }
		lv_photos_1_0=rulePhoto		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSiteRule());
	        }
       		add(
       			$current, 
       			"photos",
        		lv_photos_1_0, 
        		"Photo");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSiteAccess().getGalleriesGalleryParserRuleCall_1_1_0()); 
	    }
		lv_galleries_2_0=ruleGallery		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSiteRule());
	        }
       		add(
       			$current, 
       			"galleries",
        		lv_galleries_2_0, 
        		"Gallery");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleGallery
entryRuleGallery returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGalleryRule()); }
	 iv_ruleGallery=ruleGallery 
	 { $current=$iv_ruleGallery.current; } 
	 EOF 
;

// Rule Gallery
ruleGallery returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getGalleryAccess().getGalleryAction_0(),
            $current);
    }
)	otherlv_1='gallery' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGalleryAccess().getGalleryKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getGalleryAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGalleryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getGalleryAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGalleryAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getGalleryAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGalleryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='photo' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGalleryAccess().getPhotoKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getGalleryRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getGalleryAccess().getPhotosPhotoCrossReference_5_1_0()); 
	}

)
))*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getGalleryAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRulePhoto
entryRulePhoto returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPhotoRule()); }
	 iv_rulePhoto=rulePhoto 
	 { $current=$iv_rulePhoto.current; } 
	 EOF 
;

// Rule Photo
rulePhoto returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPhotoAccess().getPhotoAction_0(),
            $current);
    }
)	otherlv_1='photo' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPhotoAccess().getPhotoKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhotoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='url' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPhotoAccess().getUrlKeyword_4_0());
    }
(
(
		lv_uri_5_0=RULE_STRING
		{
			newLeafNode(lv_uri_5_0, grammarAccess.getPhotoAccess().getUriSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhotoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"uri",
        		lv_uri_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='description' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPhotoAccess().getDescriptionKeyword_5_0());
    }
(
(
		lv_description_7_0=RULE_STRING
		{
			newLeafNode(lv_description_7_0, grammarAccess.getPhotoAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhotoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_7_0, 
        		"STRING");
	    }

)
))?(	otherlv_8='tag' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getPhotoAccess().getTagKeyword_6_0());
    }
(
(
		lv_tags_9_0=RULE_STRING
		{
			newLeafNode(lv_tags_9_0, grammarAccess.getPhotoAccess().getTagsSTRINGTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhotoRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_9_0, 
        		"STRING");
	    }

)
))*	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_7());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


