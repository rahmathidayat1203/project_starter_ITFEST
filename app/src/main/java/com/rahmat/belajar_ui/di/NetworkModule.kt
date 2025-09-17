package com.rahmat.belajar_ui.di

import com.rahmat.belajar_ui.data.remote.ApiService
import com.rahmat.belajar_ui.data.remote.AuthInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideAuthInterceptor(authInterceptor: AuthInterceptor): OkHttpClient {
        TODO("Add implementation")
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        TODO("Add implementation")
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService {
        TODO("Add implementation")
    }
}
