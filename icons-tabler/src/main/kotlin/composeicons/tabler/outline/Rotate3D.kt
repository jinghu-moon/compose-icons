package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rotate3D: ImageVector
    get() {
        if (_rotate3D != null) return _rotate3D!!
        _rotate3D = tablerOutlineIcon(
            name = "Rotate3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c3.866 0 7 3.134 7 7v4L16 11")
            addPathData("M22 11l-3 3")
            addPathData("M8 15.5l-5-3 5-3 5 3v5.5L8 21v-5.5")
            addPathData("M3 12.5v5.5l5 3")
            addPathData("M8 15.545l5-3.03")
        }
        return _rotate3D!!
    }

private var _rotate3D: ImageVector? = null
