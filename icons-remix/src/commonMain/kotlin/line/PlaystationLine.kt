package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlaystationLine: ImageVector
    get() {
        if (_playstationLine != null) return _playstationLine!!
        _playstationLine = remixIcon(
            name = "PlaystationLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.585 17.011 C 22.155 17.554 21.102 17.941 21.102 17.941 L 13.270 20.758 L 13.270 18.681 L 19.034 16.624 C 19.688 16.390 19.788 16.058 19.257 15.884 C 18.726 15.709 17.765 15.759 17.110 15.995 L 13.270 17.349 L 13.270 15.194 L 13.491 15.118 C 13.491 15.118 14.601 14.725 16.161 14.552 C 17.722 14.380 19.633 14.576 21.133 15.145 C 22.823 15.680 23.014 16.468 22.585 17.011 ZM 14.015 13.474 L 14.015 8.162 C 14.015 7.538 13.900 6.964 13.316 6.801 C 12.868 6.658 12.590 7.074 12.590 7.697 L 12.590 21.000 L 9.007 19.861 L 9.007 4.000 C 10.530 4.283 12.750 4.953 13.943 5.355 C 16.978 6.398 18.007 7.697 18.007 10.622 C 18.007 13.473 16.249 14.554 14.015 13.474 ZM 2.432 18.463 C 0.696 17.974 0.407 16.955 1.198 16.367 C 1.929 15.825 3.173 15.417 3.173 15.417 L 8.311 13.588 L 8.311 15.673 L 4.613 16.998 C 3.960 17.232 3.860 17.565 4.390 17.739 C 4.922 17.913 5.883 17.863 6.537 17.628 L 8.311 16.984 L 8.311 18.849 C 8.198 18.869 8.073 18.889 7.957 18.909 C 6.183 19.199 4.293 19.078 2.432 18.463 Z"),
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
        return _playstationLine!!
    }

private var _playstationLine: ImageVector? = null
