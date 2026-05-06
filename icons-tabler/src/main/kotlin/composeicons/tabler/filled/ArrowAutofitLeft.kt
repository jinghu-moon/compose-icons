package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitLeft: ImageVector
    get() {
        if (_arrowAutofitLeft != null) return _arrowAutofitLeft!!
        _arrowAutofitLeft = tablerFilledIcon(
            name = "ArrowAutofitLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 14c0 .552-.448 1-1 1h-11.001v-.092C8.963 13.712 8.219 12.652 7.106 12.21c-1.113-.441-2.381-.179-3.227 .668-.147 .147-.368 .191-.561 .112C3.126 12.91 3.001 12.723 3 12.515v-6.515C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3Z")
            addPathData("M21 18c0 .552-.448 1-1 1h-14.584l1.291 1.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.39 .39-1.023 .39-1.414 0l-3-3c-.035-.035-.067-.072-.097-.112l-.071-.11-.054-.114-.035-.105-.03-.149L2 18l.003-.075 .017-.126 .03-.111 .044-.111 .052-.098 .067-.096 .08-.09L5.293 14.293c.251-.26 .623-.364 .973-.273 .35 .092 .623 .365 .714 .714 .092 .35-.013 .721-.273 .973L5.414 17h14.586c.552 0 1 .448 1 1")
        }
        return _arrowAutofitLeft!!
    }

private var _arrowAutofitLeft: ImageVector? = null
