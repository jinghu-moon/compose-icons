package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = tablerOutlineIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 10.343 7.657 9 6 9 4.343 9 3 10.343 3 12")
            addPathData("M15 6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 4.343 19.657 3 18 3 16.343 3 15 4.343 15 6")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M8.7 10.7 15.3 7.3")
            addPathData("M8.7 13.3l6.6 3.4")
        }
        return _share!!
    }

private var _share: ImageVector? = null
