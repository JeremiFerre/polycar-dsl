/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.polycar.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AutoLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/unice/polytech/polycar/parser/antlr/internal/InternalAutoLang.tokens");
	}
}
