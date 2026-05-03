package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatVoiceAiFill: ImageVector
    get() {
        if (_chatVoiceAiFill != null) return _chatVoiceAiFill!!
        _chatVoiceAiFill = remixIcon(
            name = "ChatVoiceAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 8.128 L 20.467 8.694 C 20.286 9.108 19.714 9.108 19.533 8.694 L 19.287 8.128 C 18.847 7.119 18.056 6.316 17.068 5.877 L 16.308 5.539 C 15.897 5.357 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.807 18.844 2.974 19.276 1.931 L 19.529 1.320 C 19.706 0.893 20.294 0.893 20.471 1.320 L 20.724 1.931 C 21.156 2.974 21.962 3.807 22.975 4.257 L 23.692 4.576 C 24.103 4.759 24.103 5.357 23.692 5.539 L 22.932 5.877 C 21.944 6.316 21.153 7.119 20.713 8.128 ZM 22.000 12.000 C 22.000 11.555 21.971 11.117 21.915 10.688 C 21.313 10.890 20.670 11.000 20.000 11.000 C 18.907 11.000 17.882 10.708 17.000 10.197 L 17.000 15.000 L 15.000 15.000 L 15.000 9.000 L 15.528 9.000 C 14.578 7.938 14.000 6.537 14.000 5.000 C 14.000 4.047 14.222 3.146 14.617 2.346 C 13.783 2.120 12.906 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 14.761 3.119 17.261 4.929 19.071 L 2.000 22.000 L 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 ZM 11.000 6.000 L 13.000 6.000 L 13.000 18.000 L 11.000 18.000 L 11.000 6.000 ZM 7.000 15.000 L 7.000 9.000 L 9.000 9.000 L 9.000 15.000 L 7.000 15.000 Z"),
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
        return _chatVoiceAiFill!!
    }

private var _chatVoiceAiFill: ImageVector? = null
