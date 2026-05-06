package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = tablerOutlineIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 20h6")
            addPathData("M12 20v-8")
            addPathData("M5 12h14L15 4h-6L5 12")
        }
        return _lamp!!
    }

private var _lamp: ImageVector? = null
