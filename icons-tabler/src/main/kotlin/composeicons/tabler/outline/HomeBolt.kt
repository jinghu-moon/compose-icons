package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeBolt: ImageVector
    get() {
        if (_homeBolt != null) return _homeBolt!!
        _homeBolt = tablerOutlineIcon(
            name = "HomeBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 10 12 3 3 12h2v7c0 1.105 .895 2 2 2h7.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.661 0 1.248 .32 1.612 .815")
            addPathData("M19 14l-2 4h4l-2 4")
        }
        return _homeBolt!!
    }

private var _homeBolt: ImageVector? = null
