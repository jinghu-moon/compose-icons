package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume3: ImageVector
    get() {
        if (_volume3 != null) return _volume3!!
        _volume3 = tablerOutlineIcon(
            name = "Volume3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 15h-2C3.448 15 3 14.552 3 14v-4C3 9.448 3.448 9 4 9h2L9.5 4.5c.181-.351 .59-.518 .964-.393 .374 .125 .602 .504 .536 .893v14c.066 .389-.161 .768-.536 .893-.374 .125-.784-.042-.964-.393L6 15")
            addPathData("M16 10l4 4M20 10l-4 4")
        }
        return _volume3!!
    }

private var _volume3: ImageVector? = null
