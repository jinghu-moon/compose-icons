package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) return _planeArrival!!
        _planeArrival = tablerOutlineIcon(
            name = "PlaneArrival",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.157 11.81l4.83 1.295c.7 .176 1.251 .716 1.442 1.412 .19 .696-.009 1.441-.523 1.949-.513 .508-1.26 .699-1.955 .501L4.462 13.086 3.117 6.514l2.898 .776L7.429 9.74l2.898 .776L10.207 3.237l2.898 .777 2.052 7.797")
            addPathData("M3 21h18")
        }
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
