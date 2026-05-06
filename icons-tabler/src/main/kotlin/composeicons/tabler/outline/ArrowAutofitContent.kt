package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowAutofitContent: ImageVector
    get() {
        if (_arrowAutofitContent != null) return _arrowAutofitContent!!
        _arrowAutofitContent = tablerOutlineIcon(
            name = "ArrowAutofitContent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4 3 7l3 3")
            addPathData("M18 4l3 3-3 3")
            addPathData("M4 16c0-1.105 .895-2 2-2h12c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-2")
            addPathData("M10 7h-7")
            addPathData("M21 7h-7")
        }
        return _arrowAutofitContent!!
    }

private var _arrowAutofitContent: ImageVector? = null
