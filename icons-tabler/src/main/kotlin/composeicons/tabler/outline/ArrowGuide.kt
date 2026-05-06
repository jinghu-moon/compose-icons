package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowGuide: ImageVector
    get() {
        if (_arrowGuide != null) return _arrowGuide!!
        _arrowGuide = tablerOutlineIcon(
            name = "ArrowGuide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M7 19h3c1.105 0 2-.895 2-2v-8c0-1.105 .895-2 2-2h7")
            addPathData("M18 4l3 3-3 3")
        }
        return _arrowGuide!!
    }

private var _arrowGuide: ImageVector? = null
