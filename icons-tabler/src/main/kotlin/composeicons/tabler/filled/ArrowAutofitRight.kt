package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitRight: ImageVector
    get() {
        if (_arrowAutofitRight != null) return _arrowAutofitRight!!
        _arrowAutofitRight = tablerFilledIcon(
            name = "ArrowAutofitRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14c0 .552 .448 1 1 1h11.001v-.092c.036-1.196 .78-2.256 1.893-2.698 1.113-.441 2.381-.179 3.227 .668 .147 .147 .368 .191 .561 .112 .192-.079 .318-.267 .318-.475v-6.515C21 4.343 19.657 3 18 3h-12C4.343 3 3 4.343 3 6Z")
            addPathData("M3 18c0 .552 .448 1 1 1h14.584l-1.291 1.293c-.356 .356-.392 .922-.083 1.32l.083 .094c.391 .39 1.024 .39 1.414 0l3-3q.054-.053 .097-.112l.071-.11 .054-.114 .035-.105 .03-.149L22 18l-.003-.075-.017-.126-.03-.111-.044-.111-.052-.098-.067-.096-.08-.09-3-3c-.392-.379-1.016-.374-1.402 .012-.386 .386-.391 1.009-.012 1.402L18.586 17h-14.586c-.552 0-1 .448-1 1")
        }
        return _arrowAutofitRight!!
    }

private var _arrowAutofitRight: ImageVector? = null
