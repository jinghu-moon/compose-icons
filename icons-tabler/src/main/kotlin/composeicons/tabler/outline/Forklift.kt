package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Forklift: ImageVector
    get() {
        if (_forklift != null) return _forklift!!
        _forklift = tablerOutlineIcon(
            name = "Forklift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 15.895 6.105 15 5 15c-1.105 0-2 .895-2 2")
            addPathData("M12 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M7 17h5")
            addPathData("M3 17v-6h13v6")
            addPathData("M5 11v-4h4")
            addPathData("M9 11v-6h4l3 6")
            addPathData("M22 15h-3v-10")
            addPathData("M16 13h3")
        }
        return _forklift!!
    }

private var _forklift: ImageVector? = null
