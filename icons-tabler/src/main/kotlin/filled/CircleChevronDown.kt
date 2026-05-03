package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronDown: ImageVector
    get() {
        if (_circleChevronDown != null) return _circleChevronDown!!
        _circleChevronDown = tablerFilledIcon(
            name = "CircleChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 9.707 10.293 C 9.315 9.914 8.691 9.919 8.305 10.305 C 7.919 10.691 7.914 11.315 8.293 11.707 L 11.293 14.707 C 11.684 15.097 12.316 15.097 12.707 14.707 L 15.707 11.707 C 16.097 11.316 16.097 10.684 15.707 10.293 L 15.613 10.210 C 15.215 9.901 14.649 9.937 14.293 10.293 L 11.999 12.585 Z"),
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
        return _circleChevronDown!!
    }

private var _circleChevronDown: ImageVector? = null
