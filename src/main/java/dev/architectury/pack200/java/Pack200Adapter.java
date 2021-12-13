package dev.architectury.pack200.java;

import net.fabricmc.loom.configuration.providers.forge.fg2.Pack200Provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.jar.JarOutputStream;

public class Pack200Adapter implements Pack200Provider {
	@Override
	public void unpack(InputStream inputStream, JarOutputStream outputStream) {
		try {
			Pack200.newUnpacker().unpack(inputStream, outputStream);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}
