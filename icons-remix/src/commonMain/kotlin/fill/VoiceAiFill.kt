package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VoiceAiFill: ImageVector
    get() {
        if (_voiceAiFill != null) return _voiceAiFill!!
        _voiceAiFill = remixIcon(
            name = "VoiceAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 7.128 L 20.467 7.694 C 20.286 8.108 19.714 8.108 19.533 7.694 L 19.287 7.128 C 18.847 6.119 18.056 5.316 17.068 4.877 L 16.308 4.539 C 15.897 4.357 15.897 3.759 16.308 3.576 L 17.025 3.257 C 18.038 2.807 18.844 1.974 19.276 0.931 L 19.529 0.320 C 19.706 -0.107 20.294 -0.107 20.471 0.320 L 20.724 0.931 C 21.156 1.974 21.962 2.807 22.975 3.257 L 23.692 3.576 C 24.103 3.759 24.103 4.357 23.692 4.539 L 22.932 4.877 C 21.944 5.316 21.153 6.119 20.713 7.128 ZM 8.500 6.000 L 6.500 6.000 L 6.500 18.000 L 8.500 18.000 L 8.500 6.000 ZM 4.000 10.000 L 2.000 10.000 L 2.000 14.000 L 4.000 14.000 L 4.000 10.000 ZM 13.000 2.000 L 11.000 2.000 L 11.000 22.000 L 13.000 22.000 L 13.000 2.000 ZM 17.500 8.000 L 15.500 8.000 L 15.500 18.000 L 17.500 18.000 L 17.500 8.000 ZM 22.000 10.000 L 20.000 10.000 L 20.000 14.000 L 22.000 14.000 L 22.000 10.000 Z"),
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
        return _voiceAiFill!!
    }

private var _voiceAiFill: ImageVector? = null
