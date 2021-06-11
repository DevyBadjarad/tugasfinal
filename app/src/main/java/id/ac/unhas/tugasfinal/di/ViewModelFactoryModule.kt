package id.ac.unhas.tugasfinal.di

import androidx.lifecycle.ViewModelProvider
import id.ac.unhas.tugasfinal.vmfactory.StudentViewModelFactory

abstract class ViewModelFactoryModule {
    internal abstract fun bindViewModelFactory(vMFactory : StudentViewModelFactory) : ViewModelProvider.Factory

}
