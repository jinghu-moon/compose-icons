package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseOutControlPoint: ImageVector
    get() {
        if (_easeOutControlPoint != null) return _easeOutControlPoint!!
        _easeOutControlPoint = tablerFilledIcon(
            name = "EaseOutControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 4.000 C 21.552 4.000 22.000 4.448 22.000 5.000 C 22.000 5.552 21.552 6.000 21.000 6.000 C 19.903 6.000 18.683 6.361 17.360 7.068 C 14.987 8.333 12.402 10.630 9.753 13.658 C 8.246 15.392 6.827 17.201 5.503 19.078 C 5.162 19.559 4.828 20.044 4.500 20.534 L 4.045 21.224 Q 3.913 21.428 3.849 21.530 C 3.556 21.998 2.939 22.141 2.471 21.848 C 2.003 21.555 1.860 20.938 2.153 20.470 L 2.439 20.025 L 2.612 19.761 C 3.023 19.142 3.443 18.529 3.872 17.922 C 5.235 15.989 6.696 14.127 8.248 12.342 C 11.043 9.147 13.792 6.704 16.419 5.302 C 18.011 4.454 19.541 4.000 21.000 4.000M 5.000 2.000 C 6.306 2.000 7.418 2.835 7.830 4.000 L 9.000 4.000 C 9.552 4.000 10.000 4.448 10.000 5.000 C 10.000 5.552 9.552 6.000 9.000 6.000 L 7.829 6.000 C 7.321 7.439 5.813 8.268 4.326 7.925 C 2.838 7.583 1.845 6.178 2.017 4.662 C 2.190 3.145 3.474 2.000 5.000 2.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 4.000 C 14.552 4.000 15.000 4.448 15.000 5.000 C 15.000 5.552 14.552 6.000 14.000 6.000 L 12.000 6.000 C 11.448 6.000 11.000 5.552 11.000 5.000 C 11.000 4.448 11.448 4.000 12.000 4.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _easeOutControlPoint!!
    }

private var _easeOutControlPoint: ImageVector? = null
