package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorFillIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 93.430 136.110 C 87.606 135.381 81.815 137.683 78.080 142.210 C 87.390 148.770 100.590 153.540 115.510 155.280 C 110.410 143.330 101.720 137.000 93.430 136.110 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 127.650 224.000 C 126.151 223.995 124.781 223.152 124.100 221.816 C 123.419 220.480 123.543 218.876 124.420 217.660 C 131.920 207.430 136.000 194.420 136.000 179.820 C 136.000 177.030 135.870 174.360 135.650 171.770 C 176.790 169.330 208.000 147.470 208.000 120.000 C 208.000 90.850 172.860 68.000 128.000 68.000 C 83.140 68.000 48.000 90.840 48.000 120.000 C 48.000 147.310 78.820 169.070 119.580 171.730 C 119.862 174.417 120.002 177.118 120.000 179.820 C 120.000 197.440 112.350 211.770 99.000 219.140 C 92.972 222.485 86.162 224.163 79.270 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 192.000 120.000 C 192.000 100.490 162.690 84.000 128.000 84.000 C 93.310 84.000 64.000 100.480 64.000 120.000 C 64.047 123.746 65.082 127.412 67.000 130.630 C 74.229 122.926 84.656 119.063 95.160 120.200 C 110.160 121.830 126.000 133.600 132.700 155.880 C 165.300 154.470 192.000 138.620 192.000 120.000 Z"),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
