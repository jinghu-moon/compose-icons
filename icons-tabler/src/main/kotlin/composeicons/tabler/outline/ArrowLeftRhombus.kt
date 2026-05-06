package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftRhombus: ImageVector
    get() {
        if (_arrowLeftRhombus != null) return _arrowLeftRhombus!!
        _arrowLeftRhombus = tablerOutlineIcon(
            name = "ArrowLeftRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h-13")
            addPathData("M6 9 3 12l3 3")
            addPathData("M18.5 9.5 21 12l-2.5 2.5L16 12 18.5 9.5")
        }
        return _arrowLeftRhombus!!
    }

private var _arrowLeftRhombus: ImageVector? = null
