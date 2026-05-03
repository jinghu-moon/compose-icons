package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorRegularIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 80.000 L 136.000 123.470 L 172.120 145.140 C 175.909 147.415 177.135 152.331 174.860 156.120 C 172.585 159.909 167.669 161.135 163.880 158.860 L 123.880 134.860 C 121.472 133.413 119.999 130.809 120.000 128.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 ZM 128.000 32.000 C 102.509 31.937 78.052 42.073 60.080 60.150 C 52.810 67.510 46.350 74.590 40.000 82.000 L 40.000 64.000 C 40.000 59.582 36.418 56.000 32.000 56.000 C 27.582 56.000 24.000 59.582 24.000 64.000 L 24.000 104.000 C 24.000 108.418 27.582 112.000 32.000 112.000 L 72.000 112.000 C 76.418 112.000 80.000 108.418 80.000 104.000 C 80.000 99.582 76.418 96.000 72.000 96.000 L 49.000 96.000 C 56.150 87.580 63.270 79.650 71.390 71.430 C 102.419 40.401 152.652 40.159 183.979 70.887 C 215.306 101.616 216.032 151.844 185.607 183.466 C 155.183 215.087 104.964 216.298 73.050 186.180 C 69.836 183.142 64.768 183.286 61.730 186.500 C 58.692 189.714 58.836 194.782 62.050 197.820 C 93.395 227.399 140.611 232.465 177.516 210.207 C 214.422 187.949 231.971 143.824 220.433 102.299 C 208.895 60.774 171.098 32.028 128.000 32.000 Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
