package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldLongitude: ImageVector
    get() {
        if (_worldLongitude != null) return _worldLongitude!!
        _worldLongitude = tablerOutlineIcon(
            name = "WorldLongitude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M11.5 3C8.648 5.112 6.966 8.451 6.966 12c0 3.549 1.682 6.888 4.534 9")
            addPathData("M12.5 3c2.852 2.112 4.534 5.451 4.534 9 0 3.549-1.682 6.888-4.534 9")
            addPathData("M12 3v18")
        }
        return _worldLongitude!!
    }

private var _worldLongitude: ImageVector? = null
