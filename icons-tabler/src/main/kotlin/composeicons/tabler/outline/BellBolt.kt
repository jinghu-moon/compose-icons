package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellBolt: ImageVector
    get() {
        if (_bellBolt != null) return _bellBolt!!
        _bellBolt = tablerOutlineIcon(
            name = "BellBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 17h-9.5c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v1")
            addPathData("M9 17v1c-0 1.045 .544 2.015 1.435 2.56 .892 .545 2.003 .587 2.933 .11")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _bellBolt!!
    }

private var _bellBolt: ImageVector? = null
