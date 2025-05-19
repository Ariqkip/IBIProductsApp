package dev.eric.athentication.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import dev.eric.athentication.viewmodels.SignInViewModel


val AuthFeatModule = module {
    viewModelOf(::SignInViewModel)
}