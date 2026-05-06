package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = tablerOutlineIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h-3C5.895 6 5 6.895 5 8v9c0 1.105 .895 2 2 2h9c1.105 0 2-.895 2-2v-3")
            addPathData("M14 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C20 5.343 18.657 4 17 4 15.343 4 14 5.343 14 7")
        }
        return _notification!!
    }

private var _notification: ImageVector? = null
