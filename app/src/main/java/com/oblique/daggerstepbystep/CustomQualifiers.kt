package com.oblique.daggerstepbystep

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier
import javax.inject.Scope

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class ApplicationScope()

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MessageQualifier()

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class EmailQualifier()