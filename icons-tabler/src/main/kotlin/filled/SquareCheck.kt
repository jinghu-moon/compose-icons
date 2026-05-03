package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareCheck: ImageVector
    get() {
        if (_squareCheck != null) return _squareCheck!!
        _squareCheck = tablerFilledIcon(
            name = "SquareCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 15.707 9.293 C 15.316 8.903 14.684 8.903 14.293 9.293 L 11.000 12.585 L 9.707 11.293 L 9.613 11.210 C 9.196 10.887 8.600 10.944 8.251 11.340 C 7.903 11.735 7.921 12.334 8.293 12.707 L 10.293 14.707 L 10.387 14.790 C 10.785 15.099 11.351 15.063 11.707 14.707 L 15.707 10.707 L 15.790 10.613 C 16.099 10.215 16.063 9.649 15.707 9.293 Z"),
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
        return _squareCheck!!
    }

private var _squareCheck: ImageVector? = null
