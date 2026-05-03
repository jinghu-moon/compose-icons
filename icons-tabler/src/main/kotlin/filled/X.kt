package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = tablerFilledIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.707 5.293 L 12.000 10.585 L 17.293 5.293 C 17.685 4.914 18.309 4.919 18.695 5.305 C 19.081 5.691 19.086 6.315 18.707 6.707 L 13.415 12.000 L 18.707 17.293 C 19.086 17.685 19.081 18.309 18.695 18.695 C 18.309 19.081 17.685 19.086 17.293 18.707 L 12.000 13.415 L 6.707 18.707 C 6.456 18.967 6.084 19.071 5.734 18.980 C 5.385 18.888 5.112 18.615 5.020 18.266 C 4.929 17.916 5.033 17.544 5.293 17.293 L 10.585 12.000 L 5.293 6.707 C 4.914 6.315 4.919 5.691 5.305 5.305 C 5.691 4.919 6.315 4.914 6.707 5.293"),
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
        return _x!!
    }

private var _x: ImageVector? = null
