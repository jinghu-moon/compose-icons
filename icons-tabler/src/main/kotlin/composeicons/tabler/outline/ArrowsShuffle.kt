package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsShuffle: ImageVector
    get() {
        if (_arrowsShuffle != null) return _arrowsShuffle!!
        _arrowsShuffle = tablerOutlineIcon(
            name = "ArrowsShuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4l3 3-3 3")
            addPathData("M18 20l3-3L18 14")
            addPathData("M3 7h3c2.761 0 5 2.239 5 5 0 2.761 2.239 5 5 5h5")
            addPathData("M21 7h-5c-1.082-.002-2.135 .349-3 1M9 16c-.865 .65-1.918 1.001-3 1h-3")
        }
        return _arrowsShuffle!!
    }

private var _arrowsShuffle: ImageVector? = null
