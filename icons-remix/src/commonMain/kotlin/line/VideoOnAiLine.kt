package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VideoOnAiLine: ImageVector
    get() {
        if (_videoOnAiLine != null) return _videoOnAiLine!!
        _videoOnAiLine = remixIcon(
            name = "VideoOnAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.713 9.128 L 4.467 9.694 C 4.286 10.108 3.714 10.108 3.533 9.694 L 3.287 9.128 C 2.847 8.119 2.055 7.316 1.068 6.877 L 0.308 6.539 C -0.103 6.357 -0.103 5.759 0.308 5.576 L 1.025 5.257 C 2.038 4.807 2.844 3.974 3.276 2.931 L 3.529 2.320 C 3.706 1.893 4.294 1.893 4.471 2.320 L 4.724 2.931 C 5.156 3.974 5.962 4.807 6.975 5.257 L 7.692 5.576 C 8.103 5.759 8.103 6.357 7.692 6.539 L 6.932 6.877 C 5.945 7.316 5.153 8.119 4.713 9.128 ZM 1.000 19.000 L 1.000 12.000 L 3.000 12.000 L 3.000 18.000 L 15.000 18.000 L 15.000 6.000 L 10.000 6.000 L 10.000 4.000 L 16.000 4.000 C 16.552 4.000 17.000 4.448 17.000 5.000 L 17.000 9.200 L 22.213 5.551 C 22.440 5.392 22.751 5.447 22.910 5.674 C 22.968 5.758 23.000 5.858 23.000 5.960 L 23.000 18.040 C 23.000 18.316 22.776 18.540 22.500 18.540 C 22.397 18.540 22.297 18.508 22.213 18.449 L 17.000 14.800 L 17.000 19.000 C 17.000 19.552 16.552 20.000 16.000 20.000 L 2.000 20.000 C 1.448 20.000 1.000 19.552 1.000 19.000 ZM 17.000 12.359 L 21.000 15.159 L 21.000 8.841 L 17.000 11.641 L 17.000 12.359 Z"),
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
        return _videoOnAiLine!!
    }

private var _videoOnAiLine: ImageVector? = null
