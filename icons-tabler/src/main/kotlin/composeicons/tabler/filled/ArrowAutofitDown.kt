package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) return _arrowAutofitDown!!
        _arrowAutofitDown = tablerFilledIcon(
            name = "ArrowAutofitDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3c.552 0 1 .448 1 1v11.001h-.092c-1.196 .036-2.256 .78-2.698 1.893-.441 1.113-.179 2.381 .668 3.227 .147 .147 .191 .368 .112 .561-.079 .192-.267 .318-.475 .318h-6.515C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3Z")
            addPathData("M18 3c.552 0 1 .448 1 1v14.584l1.293-1.291c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.024 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L18 22l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08-3-3c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L17 18.586v-14.586c0-.552 .448-1 1-1")
        }
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null
