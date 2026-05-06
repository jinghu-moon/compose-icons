package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindForward15: ImageVector
    get() {
        if (_rewindForward15 != null) return _rewindForward15!!
        _rewindForward15 = tablerOutlineIcon(
            name = "RewindForward15",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 9 20 6 17 3")
            addPathData("M9 18C5.686 18 3 15.314 3 12 3 8.686 5.686 6 9 6h11")
            addPathData("M16 20h2c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-2v-3h3")
            addPathData("M13 14v6")
        }
        return _rewindForward15!!
    }

private var _rewindForward15: ImageVector? = null
