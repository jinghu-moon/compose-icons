package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorBoldIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 84.000 C 171.882 84.000 188.000 67.882 188.000 48.000 C 188.000 28.118 171.882 12.000 152.000 12.000 C 132.118 12.000 116.000 28.118 116.000 48.000 C 116.000 67.882 132.118 84.000 152.000 84.000 ZM 152.000 36.000 C 158.627 36.000 164.000 41.373 164.000 48.000 C 164.000 54.627 158.627 60.000 152.000 60.000 C 145.373 60.000 140.000 54.627 140.000 48.000 C 140.000 41.373 145.373 36.000 152.000 36.000 ZM 220.000 148.000 C 220.000 154.627 214.627 160.000 208.000 160.000 C 171.000 160.000 152.730 141.530 138.000 126.700 C 136.290 124.980 134.640 123.300 133.000 121.700 L 124.370 141.550 L 159.000 166.230 C 162.146 168.489 164.007 172.127 164.000 176.000 L 164.000 232.000 C 164.000 238.627 158.627 244.000 152.000 244.000 C 145.373 244.000 140.000 238.627 140.000 232.000 L 140.000 182.170 L 114.630 164.050 L 83.000 236.780 C 81.367 240.827 77.666 243.669 73.335 244.201 C 69.003 244.733 64.724 242.872 62.161 239.340 C 59.597 235.809 59.152 231.164 61.000 227.210 L 111.060 112.080 Q 100.420 112.830 86.060 120.480 C 75.336 126.390 65.327 133.514 56.230 141.710 C 51.398 146.247 43.802 146.007 39.265 141.175 C 34.728 136.343 34.968 128.747 39.800 124.210 C 42.410 121.760 104.160 64.540 143.890 99.030 C 147.830 102.450 151.530 106.190 155.110 109.810 C 168.430 123.280 181.000 136.000 208.000 136.000 C 214.627 136.000 220.000 141.373 220.000 148.000 Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
