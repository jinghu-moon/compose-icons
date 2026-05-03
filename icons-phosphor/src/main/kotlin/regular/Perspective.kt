package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorRegularIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 120.000 L 224.000 120.000 L 224.000 48.000 C 223.999 43.256 221.894 38.758 218.252 35.718 C 214.610 32.679 209.807 31.412 205.140 32.260 L 45.140 61.350 C 37.532 62.732 32.001 69.357 32.000 77.090 L 32.000 120.000 L 16.000 120.000 C 11.582 120.000 8.000 123.582 8.000 128.000 C 8.000 132.418 11.582 136.000 16.000 136.000 L 32.000 136.000 L 32.000 178.910 C 32.001 186.643 37.532 193.268 45.140 194.650 L 205.140 223.740 C 206.084 223.910 207.041 223.997 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 136.000 L 240.000 136.000 C 244.418 136.000 248.000 132.418 248.000 128.000 C 248.000 123.582 244.418 120.000 240.000 120.000 ZM 48.000 77.090 L 208.000 48.000 L 208.000 120.000 L 48.000 120.000 ZM 208.000 208.000 L 48.000 178.910 L 48.000 136.000 L 208.000 136.000 Z"),
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
