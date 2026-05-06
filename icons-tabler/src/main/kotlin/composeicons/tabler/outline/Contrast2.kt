package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Contrast2: ImageVector
    get() {
        if (_contrast2 != null) return _contrast2!!
        _contrast2 = tablerOutlineIcon(
            name = "Contrast2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M3 19h2.25C8.978 19 12 15.866 12 12 12 8.134 15.022 5 18.75 5h2.25")
        }
        return _contrast2!!
    }

private var _contrast2: ImageVector? = null
