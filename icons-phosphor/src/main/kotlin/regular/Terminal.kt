package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorRegularIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 117.310 134.000 L 45.310 198.000 C 41.996 200.935 36.930 200.629 33.995 197.315 C 31.060 194.001 31.366 188.935 34.680 186.000 L 100.000 128.000 L 34.690 70.000 C 31.376 67.065 31.070 61.999 34.005 58.685 C 36.940 55.371 42.006 55.065 45.320 58.000 L 117.320 122.000 C 119.042 123.519 120.028 125.704 120.028 128.000 C 120.028 130.296 119.042 132.481 117.320 134.000 ZM 216.000 184.000 L 120.000 184.000 C 115.582 184.000 112.000 187.582 112.000 192.000 C 112.000 196.418 115.582 200.000 120.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 C 224.000 187.582 220.418 184.000 216.000 184.000 Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
