package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatAi3Line: ImageVector
    get() {
        if (_chatAi3Line != null) return _chatAi3Line!!
        _chatAi3Line = remixIcon(
            name = "ChatAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.863 2.000 13.701 2.110 14.500 2.315 L 14.000 4.252 C 13.361 4.087 12.691 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 13.334 4.326 14.617 4.939 15.766 L 5.289 16.419 L 4.634 19.366 L 7.581 18.711 L 8.234 19.060 C 9.383 19.674 10.666 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 11.677 19.980 11.359 19.943 11.046 L 21.930 10.809 C 21.976 11.200 22.000 11.597 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 10.297 22.000 8.694 21.575 7.291 20.824 L 2.000 22.000 L 3.176 16.709 C 2.425 15.306 2.000 13.703 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 19.529 1.319 C 19.706 0.894 20.294 0.893 20.471 1.319 L 20.724 1.931 C 21.156 2.973 21.962 3.806 22.975 4.257 L 23.691 4.576 C 24.102 4.759 24.102 5.356 23.691 5.539 L 22.933 5.877 C 21.945 6.316 21.153 7.119 20.714 8.128 L 20.467 8.693 C 20.286 9.107 19.714 9.107 19.533 8.693 L 19.286 8.128 C 18.847 7.119 18.055 6.316 17.067 5.877 L 16.308 5.539 C 15.897 5.356 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.806 18.844 2.973 19.276 1.931 L 19.529 1.319 Z"),
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
        return _chatAi3Line!!
    }

private var _chatAi3Line: ImageVector? = null
