package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindBackward15: ImageVector
    get() {
        if (_rewindBackward15 != null) return _rewindBackward15!!
        _rewindBackward15 = tablerOutlineIcon(
            name = "RewindBackward15",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 20h2c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-2v-3h3")
            addPathData("M15 18c3.314 0 6-2.686 6-6C21 8.686 18.314 6 15 6h-11")
            addPathData("M5 14v6")
            addPathData("M7 9 4 6 7 3")
        }
        return _rewindBackward15!!
    }

private var _rewindBackward15: ImageVector? = null
