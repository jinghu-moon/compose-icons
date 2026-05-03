package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorThinIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.090 160.090 L 178.000 148.350 L 66.830 37.170 C 66.057 36.398 65.002 35.975 63.910 36.000 C 62.819 36.025 61.786 36.495 61.050 37.300 C 39.740 60.600 28.000 90.000 28.000 120.000 L 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 72.000 204.000 C 78.627 204.000 84.000 198.627 84.000 192.000 L 84.000 136.360 C 109.201 149.057 128.949 170.454 139.590 196.590 C 141.437 201.102 145.844 204.036 150.720 204.000 L 240.000 204.000 C 246.627 204.000 252.000 198.627 252.000 192.000 L 252.000 187.270 C 252.028 174.174 242.894 162.842 230.090 160.090 ZM 76.000 192.000 C 76.000 194.209 74.209 196.000 72.000 196.000 L 40.000 196.000 C 37.791 196.000 36.000 194.209 36.000 192.000 L 36.000 124.080 C 49.742 124.537 63.290 127.457 76.000 132.700 ZM 244.000 192.000 C 244.000 194.209 242.209 196.000 240.000 196.000 L 150.720 196.000 C 149.109 196.014 147.646 195.060 147.010 193.580 C 137.841 170.998 122.238 151.608 102.140 137.820 C 82.666 124.369 59.726 116.818 36.070 116.070 C 37.000 90.740 46.870 66.070 64.180 45.840 L 173.180 154.840 C 173.729 155.382 174.424 155.754 175.180 155.910 L 228.400 167.910 C 237.525 169.887 244.028 177.973 244.000 187.310 Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
