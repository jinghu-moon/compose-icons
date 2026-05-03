package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorThinIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.480 99.710 L 134.420 129.710 L 187.160 197.510 C 187.813 198.349 188.104 199.413 187.971 200.467 C 187.838 201.522 187.291 202.480 186.450 203.130 C 185.756 203.690 184.892 203.996 184.000 204.000 C 182.765 204.002 181.599 203.433 180.840 202.460 L 128.000 134.520 L 75.160 202.460 C 74.401 203.433 73.235 204.002 72.000 204.000 C 71.113 203.999 70.251 203.704 69.550 203.160 C 68.709 202.510 68.162 201.552 68.029 200.497 C 67.896 199.443 68.187 198.379 68.840 197.540 L 121.580 129.740 L 46.520 99.740 C 44.471 98.912 43.482 96.579 44.310 94.530 C 45.138 92.481 47.471 91.492 49.520 92.320 L 124.000 122.090 L 124.000 40.000 C 124.000 37.791 125.791 36.000 128.000 36.000 C 130.209 36.000 132.000 37.791 132.000 40.000 L 132.000 122.090 L 206.510 92.290 C 208.559 91.462 210.892 92.451 211.720 94.500 C 212.548 96.549 211.559 98.882 209.510 99.710 Z"),
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
