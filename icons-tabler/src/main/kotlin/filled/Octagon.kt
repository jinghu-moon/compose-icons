package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = tablerFilledIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.300 2.000 L 8.700 2.000 C 8.138 2.000 7.684 2.201 7.293 2.593 L 2.593 7.293 C 2.207 7.658 1.991 8.169 2.000 8.700 L 2.000 15.300 C 2.000 15.862 2.201 16.316 2.593 16.707 L 7.293 21.407 C 7.684 21.799 8.138 22.000 8.700 22.000 L 15.300 22.000 C 15.862 22.000 16.316 21.799 16.707 21.407 L 21.407 16.707 C 21.799 16.316 22.000 15.862 22.000 15.300 L 22.000 8.700 C 22.000 8.138 21.799 7.684 21.407 7.293 L 16.707 2.593 C 16.342 2.207 15.831 1.991 15.300 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _octagon!!
    }

private var _octagon: ImageVector? = null
