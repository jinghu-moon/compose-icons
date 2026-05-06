package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume: ImageVector
    get() {
        if (_volume != null) return _volume!!
        _volume = tablerOutlineIcon(
            name = "Volume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8c1.259 .944 2 2.426 2 4 0 1.574-.741 3.056-2 4")
            addPathData("M17.7 5c2.114 1.709 3.343 4.282 3.343 7 0 2.718-1.229 5.291-3.343 7")
            addPathData("M6 15h-2C3.448 15 3 14.552 3 14v-4C3 9.448 3.448 9 4 9h2L9.5 4.5c.181-.351 .59-.518 .964-.393 .374 .125 .602 .504 .536 .893v14c.066 .389-.161 .768-.536 .893-.374 .125-.784-.042-.964-.393L6 15")
        }
        return _volume!!
    }

private var _volume: ImageVector? = null
