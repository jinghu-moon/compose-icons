package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Movie2AiLine: ImageVector
    get() {
        if (_movie2AiLine != null) return _movie2AiLine!!
        _movie2AiLine = remixIcon(
            name = "Movie2AiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 8.128 L 20.467 8.694 C 20.286 9.108 19.714 9.108 19.533 8.694 L 19.287 8.128 C 18.847 7.119 18.056 6.316 17.068 5.877 L 16.308 5.539 C 15.897 5.357 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.807 18.844 2.974 19.276 1.931 L 19.529 1.320 C 19.706 0.893 20.294 0.893 20.471 1.320 L 20.724 1.931 C 21.156 2.974 21.962 3.807 22.975 4.257 L 23.692 4.576 C 24.103 4.759 24.103 5.357 23.692 5.539 L 22.932 5.877 C 21.944 6.316 21.153 7.119 20.713 8.128 ZM 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 L 20.000 22.000 L 20.000 20.000 L 18.001 20.000 C 18.758 19.431 19.432 18.757 20.001 18.000 C 21.256 16.329 22.000 14.251 22.000 12.000 C 22.000 11.597 21.976 11.200 21.930 10.809 L 19.944 11.045 C 19.981 11.358 20.000 11.677 20.000 12.000 C 20.000 14.389 18.952 16.534 17.292 18.000 C 15.881 19.245 14.029 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 12.692 4.000 13.362 4.088 14.000 4.252 L 14.498 2.315 C 13.699 2.109 12.861 2.000 12.000 2.000 ZM 10.000 8.000 C 10.000 9.105 10.895 10.000 12.000 10.000 C 13.105 10.000 14.000 9.105 14.000 8.000 C 14.000 6.895 13.105 6.000 12.000 6.000 C 10.895 6.000 10.000 6.895 10.000 8.000 ZM 6.000 12.000 C 6.000 13.105 6.895 14.000 8.000 14.000 C 9.105 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 9.105 10.000 8.000 10.000 C 6.895 10.000 6.000 10.895 6.000 12.000 ZM 14.000 12.000 C 14.000 13.105 14.895 14.000 16.000 14.000 C 17.105 14.000 18.000 13.105 18.000 12.000 C 18.000 10.895 17.105 10.000 16.000 10.000 C 14.895 10.000 14.000 10.895 14.000 12.000 ZM 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 14.895 10.000 16.000 Z"),
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
        return _movie2AiLine!!
    }

private var _movie2AiLine: ImageVector? = null
