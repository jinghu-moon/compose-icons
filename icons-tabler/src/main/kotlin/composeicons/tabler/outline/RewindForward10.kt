package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindForward10: ImageVector
    get() {
        if (_rewindForward10 != null) return _rewindForward10!!
        _rewindForward10 = tablerOutlineIcon(
            name = "RewindForward10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 9 20 6 17 3")
            addPathData("M8 17.918C5.112 17.431 2.998 14.929 3 12 3 8.686 5.686 6 9 6h11")
            addPathData("M12 14v6")
            addPathData("M15 15.5v3c0 .828 .672 1.5 1.5 1.5C17.328 20 18 19.328 18 18.5v-3C18 14.672 17.328 14 16.5 14 15.672 14 15 14.672 15 15.5")
        }
        return _rewindForward10!!
    }

private var _rewindForward10: ImageVector? = null
