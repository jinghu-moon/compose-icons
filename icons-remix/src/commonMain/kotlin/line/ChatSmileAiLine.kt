package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSmileAiLine: ImageVector
    get() {
        if (_chatSmileAiLine != null) return _chatSmileAiLine!!
        _chatSmileAiLine = remixIcon(
            name = "ChatSmileAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.713 8.128 L 20.467 8.694 C 20.286 9.108 19.714 9.108 19.533 8.694 L 19.287 8.128 C 18.847 7.119 18.056 6.316 17.068 5.877 L 16.308 5.539 C 15.897 5.357 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.807 18.844 2.974 19.276 1.931 L 19.529 1.320 C 19.706 0.893 20.294 0.893 20.471 1.320 L 20.724 1.931 C 21.156 2.974 21.962 3.807 22.975 4.257 L 23.692 4.576 C 24.103 4.759 24.103 5.357 23.692 5.539 L 22.932 5.877 C 21.944 6.316 21.153 7.119 20.713 8.128 ZM 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 13.703 2.425 15.306 3.176 16.709 L 2.000 22.000 L 7.291 20.824 C 8.694 21.575 10.297 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 11.597 21.976 11.200 21.930 10.809 L 19.944 11.045 C 19.981 11.358 20.000 11.677 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 10.665 20.000 9.382 19.674 8.234 19.060 L 7.581 18.711 L 4.634 19.366 L 5.289 16.419 L 4.939 15.766 C 4.325 14.618 4.000 13.335 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 12.692 4.000 13.362 4.088 14.000 4.252 L 14.498 2.315 C 13.699 2.109 12.861 2.000 12.000 2.000 ZM 9.000 12.000 L 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 C 14.761 17.000 17.000 14.761 17.000 12.000 L 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 Z"),
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
        return _chatSmileAiLine!!
    }

private var _chatSmileAiLine: ImageVector? = null
