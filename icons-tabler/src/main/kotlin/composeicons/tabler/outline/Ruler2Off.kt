package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ruler2Off: ImageVector
    get() {
        if (_ruler2Off != null) return _ruler2Off!!
        _ruler2Off = tablerOutlineIcon(
            name = "Ruler2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.03 7.97 17 3l4 4-5 5M14 14 7 21 3 17l7-7")
            addPathData("M16 7 14.5 5.5")
            addPathData("M10 13 8.5 11.5")
            addPathData("M7 16 5.5 14.5")
            addPathData("M3 3 21 21")
        }
        return _ruler2Off!!
    }

private var _ruler2Off: ImageVector? = null
