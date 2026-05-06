package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitUp: ImageVector
    get() {
        if (_arrowAutofitUp != null) return _arrowAutofitUp!!
        _arrowAutofitUp = tablerFilledIcon(
            name = "ArrowAutofitUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 21c.552 0 1-.448 1-1v-11.001h-.092C13.712 8.963 12.652 8.219 12.21 7.106c-.441-1.113-.179-2.381 .668-3.227 .147-.147 .191-.368 .112-.561C12.91 3.126 12.723 3.001 12.515 3h-6.515C4.343 3 3 4.343 3 6v12c0 1.657 1.343 3 3 3Z")
            addPathData("M18 21c.552 0 1-.448 1-1v-14.584l1.293 1.291c.356 .356 .922 .392 1.32 .083l.094-.083c.39-.39 .39-1.023 0-1.414l-3-3c-.035-.035-.072-.067-.112-.097l-.11-.071-.114-.054-.105-.035-.149-.03L18 2l-.075 .003-.126 .017-.111 .03-.111 .044-.098 .052-.096 .067-.09 .08L14.293 5.293c-.26 .251-.364 .623-.273 .973 .092 .35 .365 .623 .714 .714 .35 .092 .721-.013 .973-.273L17 5.414v14.586c0 .552 .448 1 1 1")
        }
        return _arrowAutofitUp!!
    }

private var _arrowAutofitUp: ImageVector? = null
