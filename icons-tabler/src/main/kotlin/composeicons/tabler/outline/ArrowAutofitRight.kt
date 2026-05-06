package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowAutofitRight: ImageVector
    get() {
        if (_arrowAutofitRight != null) return _arrowAutofitRight!!
        _arrowAutofitRight = tablerOutlineIcon(
            name = "ArrowAutofitRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 12v-6C20 4.895 19.105 4 18 4h-12C4.895 4 4 4.895 4 6v8")
            addPathData("M4 18h17")
            addPathData("M18 15l3 3-3 3")
        }
        return _arrowAutofitRight!!
    }

private var _arrowAutofitRight: ImageVector? = null
