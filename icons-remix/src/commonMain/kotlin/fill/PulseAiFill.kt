package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PulseAiFill: ImageVector
    get() {
        if (_pulseAiFill != null) return _pulseAiFill!!
        _pulseAiFill = remixIcon(
            name = "PulseAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.713 8.128 L 19.467 8.694 C 19.286 9.108 18.714 9.108 18.533 8.694 L 18.287 8.128 C 17.847 7.119 17.056 6.316 16.068 5.877 L 15.308 5.539 C 14.897 5.357 14.897 4.759 15.308 4.576 L 16.025 4.257 C 17.038 3.807 17.844 2.974 18.276 1.931 L 18.529 1.320 C 18.706 0.893 19.294 0.893 19.471 1.320 L 19.724 1.931 C 20.156 2.974 20.962 3.807 21.975 4.257 L 22.692 4.576 C 23.103 4.759 23.103 5.357 22.692 5.539 L 21.932 5.877 C 20.944 6.316 20.153 7.119 19.713 8.128 ZM 15.000 21.539 L 9.000 7.539 L 6.659 13.000 L 1.000 13.000 L 1.000 11.000 L 5.341 11.000 L 9.000 2.461 L 15.000 16.461 L 17.341 11.000 L 23.000 11.000 L 23.000 13.000 L 18.659 13.000 L 15.000 21.539 Z"),
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
        return _pulseAiFill!!
    }

private var _pulseAiFill: ImageVector? = null
