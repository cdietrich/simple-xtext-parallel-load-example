package org.xtext.example.mydsl.ui;

import org.eclipse.xtext.builder.clustering.ClusteringBuilderState;
import org.eclipse.xtext.builder.resourceloader.IResourceLoader;
import org.eclipse.xtext.builder.resourceloader.ResourceLoaderProviders;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

public class Module1 implements Module {

	public Module1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void configure(Binder binder) {
		binder.bind(IResourceLoader.class).toProvider(ResourceLoaderProviders.getParallelLoader());
		binder.bind(IResourceLoader.class).annotatedWith(Names.named(ClusteringBuilderState.RESOURCELOADER_CROSS_LINKING)).toProvider(ResourceLoaderProviders.getParallelLoader());
		binder.bind(IResourceLoader.class).annotatedWith(Names.named(ClusteringBuilderState.RESOURCELOADER_GLOBAL_INDEX)).toProvider(ResourceLoaderProviders.getParallelLoader());

	}

}
