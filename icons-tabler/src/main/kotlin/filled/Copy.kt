package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = tablerFilledIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.926 7.074 C 21.613 7.762 22.000 8.695 22.000 9.667 L 22.000 18.333 C 22.000 20.358 20.358 22.000 18.333 22.000 L 9.667 22.000 C 7.642 22.000 6.000 20.358 6.000 18.333 L 6.000 9.667 Q 6.000 9.614 6.005 9.565 C 6.057 7.580 7.681 5.998 9.667 6.000 L 18.333 6.000 C 19.306 6.000 20.238 6.386 20.926 7.074"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 17.374 3.514 C 17.642 3.997 17.469 4.606 16.986 4.874 C 16.503 5.142 15.894 4.969 15.626 4.486 C 15.405 4.088 15.284 4.000 15.000 4.000 L 5.000 4.000 C 4.452 4.000 4.000 4.452 4.000 5.000 L 4.000 14.998 C 4.000 15.358 4.194 15.690 4.507 15.868 C 4.987 16.141 5.154 16.752 4.881 17.232 C 4.608 17.712 3.997 17.879 3.517 17.606 C 2.580 17.073 2.001 16.078 2.000 15.000 L 2.000 5.000 C 2.000 3.348 3.348 2.000 5.000 2.000 L 15.000 2.000 C 16.094 2.000 16.828 2.533 17.374 3.514"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
