package com.example.borutoapp.utils.extensions

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

/**
 * addTextChangedListener için bir kısaltma
 * @param textChanged text değişince tetiklenir
 */
fun EditText.onChange(textChanged: ((String) -> Unit)) {
	this.addTextChangedListener(object: TextWatcher {
		override fun afterTextChanged(s: Editable?) {}
		override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

		override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
			textChanged.invoke(s.toString())
		}
	})
}

/**
 * addTextChangedListener için bir kısaltma
 * @param textChanged text değiştikten sonra tetiklenir
 */
fun EditText.onAfterTextChange(textChanged: ((String) -> Unit)) {
	this.addTextChangedListener(object: TextWatcher {
		override fun afterTextChanged(s: Editable?) {
			textChanged.invoke(s.toString())
		}

		override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
		override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
	})
}