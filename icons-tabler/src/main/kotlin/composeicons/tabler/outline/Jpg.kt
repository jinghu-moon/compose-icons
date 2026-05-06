package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jpg: ImageVector
    get() {
        if (_jpg != null) return _jpg!!
        _jpg = tablerOutlineIcon(
            name = "Jpg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h2v-4h-1")
            addPathData("M10 16v-8h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M3 8h4v6c0 1.105-.895 2-2 2h-1.5C3.224 16 3 15.776 3 15.5v-.5")
        }
        return _jpg!!
    }

private var _jpg: ImageVector? = null
