package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VideoAiLine: ImageVector
    get() {
        if (_videoAiLine != null) return _videoAiLine!!
        _videoAiLine = remixIcon(
            name = "VideoAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.713 8.128 L 19.467 8.694 C 19.286 9.108 18.714 9.108 18.533 8.694 L 18.287 8.128 C 17.847 7.119 17.056 6.316 16.068 5.877 L 15.308 5.539 C 14.897 5.357 14.897 4.759 15.308 4.576 L 16.025 4.257 C 17.038 3.807 17.844 2.974 18.276 1.931 L 18.529 1.320 C 18.706 0.893 19.294 0.893 19.471 1.320 L 19.724 1.931 C 20.156 2.974 20.962 3.807 21.975 4.257 L 22.692 4.576 C 23.103 4.759 23.103 5.357 22.692 5.539 L 21.932 5.877 C 20.944 6.316 20.153 7.119 19.713 8.128 ZM 3.993 3.000 L 13.000 3.000 L 13.000 5.000 L 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 11.000 L 21.000 11.000 L 21.000 20.007 C 21.000 20.555 20.555 21.000 20.007 21.000 L 3.993 21.000 C 3.445 21.000 3.000 20.555 3.000 20.007 L 3.000 3.993 C 3.000 3.445 3.445 3.000 3.993 3.000 ZM 10.622 8.415 L 15.501 11.667 C 15.685 11.790 15.734 12.038 15.612 12.222 C 15.582 12.266 15.545 12.304 15.501 12.333 L 10.622 15.585 C 10.438 15.708 10.190 15.658 10.067 15.474 C 10.023 15.409 10.000 15.332 10.000 15.253 L 10.000 8.747 C 10.000 8.526 10.179 8.347 10.400 8.347 C 10.479 8.347 10.556 8.371 10.622 8.415 Z"),
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
        return _videoAiLine!!
    }

private var _videoAiLine: ImageVector? = null
