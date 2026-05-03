package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorBoldIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.450 107.140 L 147.260 133.220 L 193.470 192.630 C 196.123 196.012 196.765 200.554 195.152 204.539 C 193.540 208.523 189.919 211.341 185.661 211.926 C 181.403 212.510 177.157 210.772 174.530 207.370 L 128.000 147.550 L 81.470 207.370 C 77.391 212.570 69.874 213.492 64.659 209.433 C 59.443 205.374 58.491 197.862 62.530 192.630 L 108.740 133.220 L 43.550 107.140 C 39.488 105.606 36.572 101.996 35.924 97.703 C 35.277 93.409 37.000 89.100 40.430 86.437 C 43.859 83.773 48.460 83.170 52.460 84.860 L 116.000 110.280 L 116.000 40.000 C 116.000 33.373 121.373 28.000 128.000 28.000 C 134.627 28.000 140.000 33.373 140.000 40.000 L 140.000 110.280 L 203.540 84.860 C 207.540 83.170 212.141 83.773 215.570 86.437 C 219.000 89.100 220.723 93.409 220.076 97.703 C 219.428 101.996 216.512 105.606 212.450 107.140 Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
