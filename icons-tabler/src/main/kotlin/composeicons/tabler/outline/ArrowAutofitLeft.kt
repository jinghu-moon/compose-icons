package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowAutofitLeft: ImageVector
    get() {
        if (_arrowAutofitLeft != null) return _arrowAutofitLeft!!
        _arrowAutofitLeft = tablerOutlineIcon(
            name = "ArrowAutofitLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12v-6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v8")
            addPathData("M20 18h-17")
            addPathData("M6 15 3 18l3 3")
        }
        return _arrowAutofitLeft!!
    }

private var _arrowAutofitLeft: ImageVector? = null
