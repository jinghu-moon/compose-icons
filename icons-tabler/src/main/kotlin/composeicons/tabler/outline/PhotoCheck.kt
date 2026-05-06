package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoCheck: ImageVector
    get() {
        if (_photoCheck != null) return _photoCheck!!
        _photoCheck = tablerOutlineIcon(
            name = "PhotoCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M11.5 21h-5.5C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v7")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l4 4")
            addPathData("M14 14l1-1c.928-.893 2.072-.893 3 0l.5 .5")
            addPathData("M15 19l2 2 4-4")
        }
        return _photoCheck!!
    }

private var _photoCheck: ImageVector? = null
