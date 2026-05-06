package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ghost2: ImageVector
    get() {
        if (_ghost2 != null) return _ghost2!!
        _ghost2 = tablerOutlineIcon(
            name = "Ghost2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9h.01")
            addPathData("M14 9h.01")
            addPathData("M12 3c3.866 0 7 3.134 7 7v1h1c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-1v3l2 3h-10C7.772 21.002 5.121 18.451 5 15.225v-.226h-1c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2h1v-1C5 6.133 8.134 2.999 12 2.999v.001")
            addPathData("M11 14h2c0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _ghost2!!
    }

private var _ghost2: ImageVector? = null
