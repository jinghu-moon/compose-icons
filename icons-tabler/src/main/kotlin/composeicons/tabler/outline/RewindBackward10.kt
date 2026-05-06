package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindBackward10: ImageVector
    get() {
        if (_rewindBackward10 != null) return _rewindBackward10!!
        _rewindBackward10 = tablerOutlineIcon(
            name = "RewindBackward10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 9 4 6 7 3")
            addPathData("M15.997 17.918c3.07-.525 5.229-3.312 4.969-6.416C20.706 8.398 18.115 6.008 15 6h-11")
            addPathData("M6 14v6")
            addPathData("M9 15.5v3C9 19.328 9.672 20 10.5 20 11.328 20 12 19.328 12 18.5v-3C12 14.672 11.328 14 10.5 14 9.672 14 9 14.672 9 15.5")
        }
        return _rewindBackward10!!
    }

private var _rewindBackward10: ImageVector? = null
