package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MilitaryRank: ImageVector
    get() {
        if (_militaryRank != null) return _militaryRank!!
        _militaryRank = tablerOutlineIcon(
            name = "MilitaryRank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 7v12c0 1.105-.895 2-2 2h-8C6.895 21 6 20.105 6 19v-12L12 3l6 4")
            addPathData("M10 13l2-1 2 1")
            addPathData("M10 17l2-1 2 1")
            addPathData("M10 9 12 8l2 1")
        }
        return _militaryRank!!
    }

private var _militaryRank: ImageVector? = null
