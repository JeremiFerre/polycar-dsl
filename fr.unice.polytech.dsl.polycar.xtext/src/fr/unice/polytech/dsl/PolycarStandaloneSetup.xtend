/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PolycarStandaloneSetup extends PolycarStandaloneSetupGenerated {

	def static void doSetup() {
		new PolycarStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
