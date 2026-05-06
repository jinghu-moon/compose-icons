package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsCross: ImageVector
    get() {
        if (_arrowsCross != null) return _arrowsCross!!
        _arrowsCross = tablerOutlineIcon(
            name = "ArrowsCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4h4v4")
            addPathData("M15 9 20 4")
            addPathData("M4 20 9 15")
            addPathData("M16 20h4v-4")
            addPathData("M4 4 20 20")
        }
        return _arrowsCross!!
    }

private var _arrowsCross: ImageVector? = null
