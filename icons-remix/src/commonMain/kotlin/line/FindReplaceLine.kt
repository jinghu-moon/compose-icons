package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FindReplaceLine: ImageVector
    get() {
        if (_findReplaceLine != null) return _findReplaceLine!!
        _findReplaceLine = remixIcon(
            name = "FindReplaceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.033 16.618 L 22.314 20.899 L 20.899 22.314 L 16.618 18.033 C 15.079 19.264 13.126 20.000 11.000 20.000 C 7.465 20.000 4.407 17.964 2.935 15.000 L 6.000 15.000 L 9.000 15.000 L 7.696 17.173 C 8.680 17.701 9.805 18.000 11.000 18.000 C 12.896 18.000 14.615 17.247 15.875 16.025 L 16.025 15.875 C 17.247 14.615 18.000 12.896 18.000 11.000 C 18.000 10.305 17.899 9.634 17.710 9.000 L 19.777 9.000 C 19.923 9.643 20.000 10.313 20.000 11.000 C 20.000 13.126 19.264 15.079 18.033 16.618 ZM 19.065 7.000 L 13.000 7.000 L 14.304 4.827 C 13.320 4.299 12.195 4.000 11.000 4.000 C 7.133 4.000 4.000 7.133 4.000 11.000 C 4.000 11.695 4.101 12.366 4.290 13.000 L 2.223 13.000 C 2.077 12.357 2.000 11.687 2.000 11.000 C 2.000 6.028 6.028 2.000 11.000 2.000 C 14.535 2.000 17.593 4.036 19.065 7.000 Z"),
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
        return _findReplaceLine!!
    }

private var _findReplaceLine: ImageVector? = null
