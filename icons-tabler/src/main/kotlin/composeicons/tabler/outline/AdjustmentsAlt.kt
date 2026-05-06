package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsAlt: ImageVector
    get() {
        if (_adjustmentsAlt != null) return _adjustmentsAlt!!
        _adjustmentsAlt = tablerOutlineIcon(
            name = "AdjustmentsAlt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h4v4h-4v-4")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M10 14h4v4h-4v-4")
            addPathData("M12 4v10")
            addPathData("M12 18v2")
            addPathData("M16 5h4v4h-4v-4")
            addPathData("M18 4v1")
            addPathData("M18 9v11")
        }
        return _adjustmentsAlt!!
    }

private var _adjustmentsAlt: ImageVector? = null
