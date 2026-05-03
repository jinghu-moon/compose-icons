package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorBoldIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 116.000 L 228.000 116.000 L 228.000 48.000 C 227.998 42.070 225.365 36.447 220.811 32.649 C 216.258 28.851 210.254 27.269 204.420 28.330 L 44.420 57.420 C 34.914 59.150 28.003 67.428 28.000 77.090 L 28.000 116.000 L 16.000 116.000 C 9.373 116.000 4.000 121.373 4.000 128.000 C 4.000 134.627 9.373 140.000 16.000 140.000 L 28.000 140.000 L 28.000 178.910 C 28.003 188.572 34.914 196.850 44.420 198.580 L 204.420 227.670 C 210.254 228.731 216.258 227.149 220.811 223.351 C 225.365 219.553 227.998 213.930 228.000 208.000 L 228.000 140.000 L 240.000 140.000 C 246.627 140.000 252.000 134.627 252.000 128.000 C 252.000 121.373 246.627 116.000 240.000 116.000 ZM 52.000 80.430 L 204.000 52.800 L 204.000 116.000 L 52.000 116.000 ZM 204.000 203.200 L 52.000 175.570 L 52.000 140.000 L 204.000 140.000 Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
