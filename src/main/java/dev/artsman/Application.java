package dev.artsman;

/**
 * Simple Application class
 */
class Application {
	private final String name;

	Application(String name) {
		this.name = name;
	}

	String name() {
		return this.name;
	}
}
