/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PolycarAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/unice/polytech/dsl/parser/antlr/internal/InternalPolycar.tokens");
	}
}