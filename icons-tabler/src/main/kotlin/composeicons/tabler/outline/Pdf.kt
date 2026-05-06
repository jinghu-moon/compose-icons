package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pdf: ImageVector
    get() {
        if (_pdf != null) return _pdf!!
        _pdf = tablerOutlineIcon(
            name = "Pdf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8v8h2c1.105 0 2-.895 2-2v-4C14 8.895 13.105 8 12 8h-2")
            addPathData("M3 12h2c1.105 0 2-.895 2-2C7 8.895 6.105 8 5 8h-2v8")
            addPathData("M17 12h3")
            addPathData("M21 8h-4v8")
        }
        return _pdf!!
    }

private var _pdf: ImageVector? = null
