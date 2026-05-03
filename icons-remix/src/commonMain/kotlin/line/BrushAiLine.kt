package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrushAiLine: ImageVector
    get() {
        if (_brushAiLine != null) return _brushAiLine!!
        _brushAiLine = remixIcon(
            name = "BrushAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.713 7.128 L 4.467 7.694 C 4.286 8.108 3.714 8.108 3.533 7.694 L 3.287 7.128 C 2.847 6.119 2.055 5.316 1.068 4.877 L 0.308 4.539 C -0.103 4.357 -0.103 3.759 0.308 3.576 L 1.025 3.257 C 2.038 2.807 2.844 1.974 3.276 0.931 L 3.529 0.320 C 3.706 -0.107 4.294 -0.107 4.471 0.320 L 4.724 0.931 C 5.156 1.974 5.962 2.807 6.975 3.257 L 7.692 3.576 C 8.103 3.759 8.103 4.357 7.692 4.539 L 6.932 4.877 C 5.945 5.316 5.153 6.119 4.713 7.128 ZM 15.314 9.533 L 15.457 9.675 C 16.751 11.018 17.331 12.987 16.813 14.920 C 16.164 17.339 13.970 18.998 11.502 18.998 C 9.466 18.998 6.788 18.373 4.529 17.484 C 5.734 16.070 6.174 14.675 6.328 12.805 C 6.366 12.354 6.389 12.174 6.432 12.014 C 7.225 9.053 10.017 7.405 12.924 8.184 C 13.855 8.434 14.666 8.908 15.314 9.533 ZM 18.228 2.371 L 13.289 6.213 C 9.342 5.239 5.558 7.546 4.500 11.497 C 4.398 11.876 4.366 12.262 4.333 12.666 C 4.218 14.060 4.086 15.671 1.000 17.997 C 3.500 19.497 8.000 20.998 11.502 20.998 C 14.814 20.998 17.846 18.790 18.744 15.438 C 19.084 14.172 19.078 12.895 18.785 11.707 L 22.625 6.769 C 22.935 6.371 22.900 5.804 22.543 5.448 L 19.549 2.454 C 19.192 2.097 18.626 2.062 18.228 2.371 ZM 16.895 8.285 C 16.832 8.220 16.767 8.155 16.701 8.091 L 15.577 6.967 L 18.759 4.492 L 20.505 6.238 L 18.030 9.420 L 16.895 8.285 Z"),
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
        return _brushAiLine!!
    }

private var _brushAiLine: ImageVector? = null
