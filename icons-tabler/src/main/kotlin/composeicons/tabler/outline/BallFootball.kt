package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallFootball: ImageVector
    get() {
        if (_ballFootball != null) return _ballFootball!!
        _ballFootball = tablerOutlineIcon(
            name = "BallFootball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 7l4.76 3.45L15 16h-6L7.24 10.45 12 7")
            addPathData("M12 7v-4M15 16l2.5 3M16.76 10.45 20.5 9 9.06 16.05 6.5 19 7.24 10.45 3.5 9")
        }
        return _ballFootball!!
    }

private var _ballFootball: ImageVector? = null
