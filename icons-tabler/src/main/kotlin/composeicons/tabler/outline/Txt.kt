package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Txt: ImageVector
    get() {
        if (_txt != null) return _txt!!
        _txt = tablerOutlineIcon(
            name = "Txt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8h4")
            addPathData("M5 8v8")
            addPathData("M17 8h4")
            addPathData("M19 8v8")
            addPathData("M10 8l4 8")
            addPathData("M10 16 14 8")
        }
        return _txt!!
    }

private var _txt: ImageVector? = null
