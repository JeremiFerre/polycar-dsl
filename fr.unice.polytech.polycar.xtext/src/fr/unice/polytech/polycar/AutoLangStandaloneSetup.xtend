/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.polycar


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AutoLangStandaloneSetup extends AutoLangStandaloneSetupGenerated {

	def static void doSetup() {
		new AutoLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
