package org.owntracks.android.ui.welcome.permission

import androidx.databinding.Bindable
import org.owntracks.android.injection.scopes.PerActivity
import org.owntracks.android.ui.base.viewmodel.BaseViewModel
import javax.inject.Inject

@PerActivity
class PlayFragmentViewModel @Inject constructor() : BaseViewModel<PlayFragmentMvvm.View?>() {
    @get:Bindable
    @set:Bindable
    var fixAvailable = false

    @get:Bindable
    @set:Bindable
    var message: String? = null

    fun onFixClicked() {
        view!!.requestFix()
    }
}