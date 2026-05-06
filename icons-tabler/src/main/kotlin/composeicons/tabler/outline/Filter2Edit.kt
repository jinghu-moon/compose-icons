package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Edit: ImageVector
    get() {
        if (_filter2Edit != null) return _filter2Edit!!
        _filter2Edit = tablerOutlineIcon(
            name = "Filter2Edit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h11")
            addPathData("M9 18h2")
            addPathData("M18.42 15.61c.195-.195 .426-.35 .681-.455 .255-.106 .528-.16 .804-.16 .276 0 .549 .054 .804 .16 .255 .106 .486 .26 .681 .455 .195 .195 .35 .427 .455 .681 .106 .255 .16 .528 .16 .804 0 .276-.054 .549-.16 .804-.105 .255-.26 .486-.455 .681L18 22h-3v-3l3.42-3.39")
        }
        return _filter2Edit!!
    }

private var _filter2Edit: ImageVector? = null
