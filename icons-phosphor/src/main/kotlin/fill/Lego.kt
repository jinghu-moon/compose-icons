package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorFillIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.940 79.210 C 247.675 76.480 246.029 74.075 243.580 72.840 L 197.290 49.700 C 191.540 39.240 177.210 32.000 160.000 32.000 C 137.570 32.000 120.000 44.300 120.000 60.000 C 120.002 62.219 120.360 64.424 121.060 66.530 L 101.540 76.290 C 94.732 73.391 87.399 71.930 80.000 72.000 C 57.570 72.000 40.000 84.300 40.000 100.000 C 40.002 102.219 40.360 104.424 41.060 106.530 L 12.420 120.840 C 9.709 122.197 7.998 124.969 8.000 128.000 L 8.000 192.000 C 7.998 195.031 9.709 197.803 12.420 199.160 L 76.420 231.160 C 78.673 232.288 81.327 232.288 83.580 231.160 L 243.580 151.160 C 246.291 149.803 248.002 147.031 248.000 144.000 L 248.000 80.000 C 248.003 79.735 247.983 79.471 247.940 79.210 ZM 80.000 151.060 L 33.890 128.000 L 51.000 119.450 C 58.240 124.740 68.480 128.000 80.000 128.000 C 102.430 128.000 120.000 115.700 120.000 100.000 C 119.962 95.352 118.438 90.839 115.650 87.120 L 131.000 79.450 C 138.240 84.740 148.480 88.000 160.000 88.000 C 178.380 88.000 193.490 79.740 198.350 68.120 L 222.110 80.000 ZM 160.000 48.000 C 172.230 48.000 181.690 53.000 183.630 58.120 C 183.630 58.210 183.700 58.300 183.740 58.400 C 183.909 58.917 183.997 59.456 184.000 60.000 C 184.000 65.660 173.740 72.000 160.000 72.000 C 150.340 72.000 142.400 68.860 138.540 65.000 C 138.282 64.664 137.994 64.353 137.680 64.070 C 136.675 62.943 136.082 61.508 136.000 60.000 C 136.000 54.340 146.260 48.000 160.000 48.000 ZM 80.000 88.000 C 85.938 87.897 91.813 89.224 97.130 91.870 C 97.449 92.082 97.783 92.269 98.130 92.430 C 101.820 94.640 104.000 97.430 104.000 100.000 C 104.000 105.660 93.740 112.000 80.000 112.000 C 70.330 112.000 62.390 108.860 58.530 105.000 C 58.276 104.667 57.995 104.356 57.690 104.070 C 56.678 102.946 56.082 101.510 56.000 100.000 C 56.000 94.340 66.260 88.000 80.000 88.000 ZM 24.000 140.940 L 72.000 164.940 L 72.000 211.060 L 24.000 187.060 Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
