package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaHorizontalOff: ImageVector
    get() {
        if (_panoramaHorizontalOff != null) return _panoramaHorizontalOff!!
        _panoramaHorizontalOff = tablerOutlineIcon(
            name = "PanoramaHorizontalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.95 6.952c2.901 .15 5.803-.323 8.705-1.42 .306-.112 .648-.069 .915 .117 .268 .186 .428 .491 .43 .817v10.534M17.788 17.806C13.305 16.525 8.822 16.732 4.339 18.428c-.306 .114-.647 .07-.915-.117C3.157 18.125 2.999 17.819 3 17.493v-11.027c.002-.324 .161-.628 .427-.814 .266-.186 .605-.231 .911-.121 .588 .221 1.176 .418 1.764 .59")
            addPathData("M3 3 21 21")
        }
        return _panoramaHorizontalOff!!
    }

private var _panoramaHorizontalOff: ImageVector? = null
