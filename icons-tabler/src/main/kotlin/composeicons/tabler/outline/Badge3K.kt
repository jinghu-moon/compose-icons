package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Badge3K: ImageVector
    get() {
        if (_badge3K != null) return _badge3K!!
        _badge3K = tablerOutlineIcon(
            name = "Badge3K",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M14 9v6")
            addPathData("M17 9l-2 3 2 3")
            addPathData("M15 12h-1")
            addPathData("M7 9.5C7 9.224 7.224 9 7.5 9h1C9.328 9 10 9.672 10 10.5 10 11.328 9.328 12 8.5 12h-.5 .5c.828 0 1.5 .672 1.5 1.5C10 14.328 9.328 15 8.5 15h-1C7.224 15 7 14.776 7 14.5")
        }
        return _badge3K!!
    }

private var _badge3K: ImageVector? = null
