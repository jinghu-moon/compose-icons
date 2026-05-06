package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashTumbleOff: ImageVector
    get() {
        if (_washTumbleOff != null) return _washTumbleOff!!
        _washTumbleOff = tablerOutlineIcon(
            name = "WashTumbleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.116 20.127c-.562 .56-1.323 .874-2.116 .873h-12C4.343 21 3 19.657 3 18v-12C3 5.173 3.335 4.424 3.877 3.88M7 3h11c1.657 0 3 1.343 3 3v11")
            addPathData("M17.744 13.74c.643-2.119 .066-4.42-1.5-5.985C14.678 6.19 12.377 5.614 10.258 6.258M7.759 7.755C6.222 9.266 5.613 11.485 6.164 13.568c.551 2.084 2.177 3.712 4.26 4.265 2.083 .553 4.303-.053 5.815-1.588")
            addPathData("M3 3 21 21")
        }
        return _washTumbleOff!!
    }

private var _washTumbleOff: ImageVector? = null
