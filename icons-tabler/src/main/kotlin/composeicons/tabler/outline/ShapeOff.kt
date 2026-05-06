package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShapeOff: ImageVector
    get() {
        if (_shapeOff != null) return _shapeOff!!
        _shapeOff = tablerOutlineIcon(
            name = "ShapeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.575 3.597c-.775 .787-.766 2.053 .02 2.829 .787 .775 2.053 .766 2.828-.02")
            addPathData("M17 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 3.895 20.105 3 19 3c-1.105 0-2 .895-2 2")
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M17.574 17.598c-.759 .784-.749 2.032 .022 2.804 .771 .772 2.018 .784 2.804 .026")
            addPathData("M5 7v10")
            addPathData("M9 5h8")
            addPathData("M7 19h10")
            addPathData("M19 7v8")
            addPathData("M3 3 21 21")
        }
        return _shapeOff!!
    }

private var _shapeOff: ImageVector? = null
