package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsShuffle2: ImageVector
    get() {
        if (_arrowsShuffle2 != null) return _arrowsShuffle2!!
        _arrowsShuffle2 = tablerOutlineIcon(
            name = "ArrowsShuffle2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4l3 3-3 3")
            addPathData("M18 20l3-3L18 14")
            addPathData("M3 7h3c2.761 0 5 2.239 5 5 0 2.761 2.239 5 5 5h5")
            addPathData("M3 17h3c2.761 0 5-2.239 5-5C11 9.239 13.239 7 16 7h5")
        }
        return _arrowsShuffle2!!
    }

private var _arrowsShuffle2: ImageVector? = null
