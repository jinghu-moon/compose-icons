package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorFillIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 136.000 C 248.000 140.418 244.418 144.000 240.000 144.000 L 224.000 144.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 C 207.038 223.997 206.077 223.910 205.130 223.740 L 45.130 194.650 C 37.526 193.264 32.000 186.639 32.000 178.910 L 32.000 144.000 L 16.000 144.000 C 11.582 144.000 8.000 140.418 8.000 136.000 C 8.000 131.582 11.582 128.000 16.000 128.000 L 240.000 128.000 C 244.418 128.000 248.000 131.582 248.000 136.000 ZM 36.000 112.000 L 220.000 112.000 C 222.209 112.000 224.000 110.209 224.000 108.000 L 224.000 48.420 C 224.058 44.351 222.608 40.404 219.930 37.340 C 216.220 33.189 210.618 31.265 205.140 32.260 L 45.140 61.350 C 37.532 62.732 32.001 69.357 32.000 77.090 L 32.000 108.000 C 32.000 110.209 33.791 112.000 36.000 112.000 Z"),
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
