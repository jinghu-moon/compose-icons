package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatAiLine: ImageVector
    get() {
        if (_chatAiLine != null) return _chatAiLine!!
        _chatAiLine = remixIcon(
            name = "ChatAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 8.128 L 20.467 8.694 C 20.286 9.108 19.714 9.108 19.533 8.694 L 19.287 8.128 C 18.847 7.119 18.056 6.316 17.068 5.877 L 16.308 5.539 C 15.897 5.357 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.807 18.844 2.974 19.276 1.931 L 19.529 1.320 C 19.706 0.893 20.294 0.893 20.471 1.320 L 20.724 1.931 C 21.156 2.974 21.962 3.807 22.975 4.257 L 23.692 4.576 C 24.103 4.759 24.103 5.357 23.692 5.539 L 22.932 5.877 C 21.944 6.316 21.153 7.119 20.713 8.128 ZM 10.000 3.000 L 14.000 3.000 L 14.000 5.000 L 10.000 5.000 C 6.686 5.000 4.000 7.686 4.000 11.000 C 4.000 14.610 6.462 16.966 12.000 19.480 L 12.000 17.000 L 14.000 17.000 C 17.314 17.000 20.000 14.314 20.000 11.000 L 22.000 11.000 C 22.000 15.418 18.418 19.000 14.000 19.000 L 14.000 22.500 C 9.000 20.500 2.000 17.500 2.000 11.000 C 2.000 6.582 5.582 3.000 10.000 3.000 Z"),
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
        return _chatAiLine!!
    }

private var _chatAiLine: ImageVector? = null
