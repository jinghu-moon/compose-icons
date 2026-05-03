package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatSmileAiFill: ImageVector
    get() {
        if (_chatSmileAiFill != null) return _chatSmileAiFill!!
        _chatSmileAiFill = remixIcon(
            name = "ChatSmileAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.713 8.128 L 20.467 8.694 C 20.286 9.108 19.714 9.108 19.533 8.694 L 19.287 8.128 C 18.847 7.119 18.056 6.316 17.068 5.877 L 16.308 5.539 C 15.897 5.357 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.807 18.844 2.974 19.276 1.931 L 19.529 1.320 C 19.706 0.893 20.294 0.893 20.471 1.320 L 20.724 1.931 C 21.156 2.974 21.962 3.807 22.975 4.257 L 23.692 4.576 C 24.103 4.759 24.103 5.357 23.692 5.539 L 22.932 5.877 C 21.944 6.316 21.153 7.119 20.713 8.128 ZM 20.000 11.000 C 20.670 11.000 21.313 10.890 21.915 10.688 C 21.971 11.117 22.000 11.555 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 10.297 22.000 8.694 21.575 7.291 20.824 L 2.000 22.000 L 3.176 16.709 C 2.425 15.306 2.000 13.703 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 12.906 2.000 13.783 2.120 14.617 2.346 C 14.222 3.146 14.000 4.047 14.000 5.000 C 14.000 8.314 16.686 11.000 20.000 11.000 ZM 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 C 14.761 17.000 17.000 14.761 17.000 12.000 L 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 L 7.000 12.000 Z"),
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
        return _chatSmileAiFill!!
    }

private var _chatSmileAiFill: ImageVector? = null
