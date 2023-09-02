package di

import org.koin.core.module.Module

expect fun platformModule(): Module


expect fun browseUrl(url: String)