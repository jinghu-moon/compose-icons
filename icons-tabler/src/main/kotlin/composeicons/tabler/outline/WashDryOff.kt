package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDryOff: ImageVector
    get() {
        if (_washDryOff != null) return _washDryOff!!
        _washDryOff = tablerOutlineIcon(
            name = "WashDryOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.116 20.127c-.562 .56-1.323 .874-2.116 .873h-12C4.343 21 3 19.657 3 18v-12C3 5.173 3.335 4.424 3.877 3.88M7 3h11c1.657 0 3 1.343 3 3v11")
            addPathData("M3 3 21 21")
        }
        return _washDryOff!!
    }

private var _washDryOff: ImageVector? = null
