package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartDown: ImageVector
    get() {
        if (_heartDown != null) return _heartDown!!
        _heartDown = tablerOutlineIcon(
            name = "HeartDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20 4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.082 4.561 14.859 3.812 16.649 4.046c1.79 .234 3.315 1.414 3.99 3.088 .675 1.674 .395 3.582-.732 4.992")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _heartDown!!
    }

private var _heartDown: ImageVector? = null
