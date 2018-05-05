package io.alekseimartoyas.tradetracker.Foundation

import android.app.Fragment

/**
 * Created by optim on 04.02.2018.
 */
abstract class BaseFragment<Presenter>: Fragment() {
    abstract var presenter: Presenter?

    abstract fun destructor()
}