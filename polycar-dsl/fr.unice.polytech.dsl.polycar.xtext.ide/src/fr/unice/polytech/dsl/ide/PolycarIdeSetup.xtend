/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.ide

import com.google.inject.Guice
import fr.unice.polytech.dsl.PolycarRuntimeModule
import fr.unice.polytech.dsl.PolycarStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PolycarIdeSetup extends PolycarStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PolycarRuntimeModule, new PolycarIdeModule))
	}
	
}