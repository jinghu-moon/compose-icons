package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MicrophoneOff: ImageVector
    get() {
        if (_microphoneOff != null) return _microphoneOff!!
        _microphoneOff = tablerOutlineIcon(
            name = "MicrophoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M9 5C9 3.343 10.343 2 12 2c1.657 0 3 1.343 3 3v5c0 .296-.044 .591-.13 .874M12.87 12.874c-.909 .275-1.895 .104-2.658-.462C9.449 11.846 9 10.952 9 10.002v-1")
            addPathData("M5 10c-0 2.574 1.412 4.94 3.677 6.162 2.265 1.222 5.018 1.102 7.169-.312M17.846 13.85c.754-1.142 1.154-2.481 1.152-3.85")
            addPathData("M8 21h8")
            addPathData("M12 17v4")
        }
        return _microphoneOff!!
    }

private var _microphoneOff: ImageVector? = null
