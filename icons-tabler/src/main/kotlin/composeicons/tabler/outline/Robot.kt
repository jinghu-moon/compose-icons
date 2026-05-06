package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = tablerOutlineIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 6C6 4.895 6.895 4 8 4h8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-8C6.895 12 6 11.105 6 10v-4")
            addPathData("M12 2v2")
            addPathData("M9 12v9")
            addPathData("M15 12v9")
            addPathData("M5 16 9 14")
            addPathData("M15 14l4 2")
            addPathData("M9 18h6")
            addPathData("M10 8v.01")
            addPathData("M14 8v.01")
        }
        return _robot!!
    }

private var _robot: ImageVector? = null
