package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QueuePopOut: ImageVector
    get() {
        if (_queuePopOut != null) return _queuePopOut!!
        _queuePopOut = tablerOutlineIcon(
            name = "QueuePopOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5h-6C3.895 5 3 5.895 3 7v12c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-6")
            addPathData("M3 13h6c1.105 0 2 .895 2 2v6")
            addPathData("M16 3h5v5")
            addPathData("M21 3 15 9")
        }
        return _queuePopOut!!
    }

private var _queuePopOut: ImageVector? = null
