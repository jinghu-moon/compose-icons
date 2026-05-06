package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowAutofitUp: ImageVector
    get() {
        if (_arrowAutofitUp != null) return _arrowAutofitUp!!
        _arrowAutofitUp = tablerOutlineIcon(
            name = "ArrowAutofitUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4h-6C4.895 4 4 4.895 4 6v12c0 1.105 .895 2 2 2h8")
            addPathData("M18 20v-17")
            addPathData("M15 6 18 3l3 3")
        }
        return _arrowAutofitUp!!
    }

private var _arrowAutofitUp: ImageVector? = null
