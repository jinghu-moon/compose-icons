package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = tablerOutlineIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21h14")
            addPathData("M6 18h2")
            addPathData("M7 18v3")
            addPathData("M9 11l3 3L18 8 15 5 9 11")
            addPathData("M10.5 12.5 9 14")
            addPathData("M17 3l3 3")
            addPathData("M12 21c2.556 0 4.832-1.619 5.669-4.034 .838-2.415 .053-5.096-1.954-6.678")
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
