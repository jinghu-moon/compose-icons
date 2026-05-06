package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Certificate2: ImageVector
    get() {
        if (_certificate2 != null) return _certificate2!!
        _certificate2 = tablerOutlineIcon(
            name = "Certificate2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M10 7h4")
            addPathData("M10 18v4l2-1 2 1v-4")
            addPathData("M10 19h-2C6.895 19 6 18.105 6 17v-12C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-2")
        }
        return _certificate2!!
    }

private var _certificate2: ImageVector? = null
