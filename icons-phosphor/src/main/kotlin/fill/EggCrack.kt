package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorFillIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 152.000 C 215.940 200.498 176.698 239.829 128.200 240.000 C 77.540 240.120 37.990 197.000 40.080 146.380 C 41.290 117.170 51.790 85.840 69.310 59.560 C 87.500 32.290 109.430 16.000 128.000 16.000 C 141.250 16.000 156.230 24.320 170.340 39.000 C 171.789 40.511 171.828 42.882 170.430 44.440 L 122.000 98.670 C 120.134 100.756 119.493 103.665 120.311 106.342 C 121.129 109.019 123.287 111.074 126.000 111.760 L 150.610 117.910 L 144.100 150.430 C 143.236 154.763 146.047 158.975 150.380 159.840 C 150.913 159.950 151.456 160.004 152.000 160.000 C 155.808 159.993 159.083 157.304 159.830 153.570 L 167.830 113.570 C 168.668 109.384 166.071 105.278 161.930 104.240 L 142.770 99.450 L 179.660 58.120 C 180.480 57.201 181.676 56.711 182.905 56.791 C 184.133 56.871 185.257 57.513 185.950 58.530 C 186.190 58.870 186.420 59.210 186.650 59.530 C 205.300 87.540 216.000 121.230 216.000 152.000 Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
