package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hdr: ImageVector
    get() {
        if (_hdr != null) return _hdr!!
        _hdr = tablerOutlineIcon(
            name = "Hdr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16v-8")
            addPathData("M7 8v8")
            addPathData("M3 12h4")
            addPathData("M10 8v8h2c1.105 0 2-.895 2-2v-4C14 8.895 13.105 8 12 8h-2")
            addPathData("M17 12h2c1.105 0 2-.895 2-2C21 8.895 20.105 8 19 8h-2v8M21 16 18 12")
        }
        return _hdr!!
    }

private var _hdr: ImageVector? = null
