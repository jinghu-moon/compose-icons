package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeDotted: ImageVector
    get() {
        if (_eyeDotted != null) return _eyeDotted!!
        _eyeDotted = tablerOutlineIcon(
            name = "EyeDotted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M21 12h.01")
            addPathData("M3 12h.01")
            addPathData("M5 15h.01")
            addPathData("M5 9h.01")
            addPathData("M19 15h.01")
            addPathData("M12 18h.01")
            addPathData("M12 6h.01")
            addPathData("M8 17h.01")
            addPathData("M8 7h.01")
            addPathData("M16 17h.01")
            addPathData("M16 7h.01")
            addPathData("M19 9h.01")
        }
        return _eyeDotted!!
    }

private var _eyeDotted: ImageVector? = null
