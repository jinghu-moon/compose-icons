package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorRegularIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.160 153.260 C 224.983 156.645 224.536 161.676 221.160 164.510 C 203.800 178.890 188.300 184.000 174.160 184.000 C 155.580 184.000 139.340 175.190 124.230 167.000 C 98.880 153.250 76.990 141.370 45.160 167.740 C 42.976 169.676 39.910 170.269 37.161 169.287 C 34.412 168.304 32.417 165.903 31.954 163.020 C 31.492 160.138 32.636 157.233 34.940 155.440 C 75.110 122.170 105.260 138.520 131.870 152.960 C 157.220 166.710 179.110 178.580 210.940 152.210 C 214.334 149.420 219.343 149.888 222.160 153.260 ZM 45.160 103.800 C 76.990 77.430 98.880 89.300 124.230 103.050 C 139.340 111.250 155.580 120.050 174.160 120.050 C 188.300 120.050 203.800 114.940 221.160 100.560 C 223.464 98.767 224.608 95.862 224.146 92.980 C 223.683 90.097 221.688 87.696 218.939 86.713 C 216.190 85.731 213.124 86.324 210.940 88.260 C 179.110 114.630 157.220 102.750 131.870 89.000 C 105.260 74.570 75.110 58.210 34.940 91.480 C 31.821 94.360 31.495 99.176 34.198 102.450 C 36.901 105.724 41.691 106.317 45.110 103.800 Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
