package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowAutofitWidth: ImageVector
    get() {
        if (_arrowAutofitWidth != null) return _arrowAutofitWidth!!
        _arrowAutofitWidth = tablerOutlineIcon(
            name = "ArrowAutofitWidth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12v-6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v6")
            addPathData("M10 18h-7")
            addPathData("M21 18h-7")
            addPathData("M6 15 3 18l3 3")
            addPathData("M18 15l3 3-3 3")
        }
        return _arrowAutofitWidth!!
    }

private var _arrowAutofitWidth: ImageVector? = null
