package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorDuotoneIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 231.870 89.420 L 209.170 193.420 C 208.495 197.244 205.173 200.031 201.290 200.030 L 54.710 200.030 C 50.827 200.031 47.505 197.244 46.830 193.420 L 24.130 89.420 C 23.526 85.898 25.331 82.403 28.552 80.857 C 31.773 79.310 35.629 80.087 38.000 82.760 L 80.000 128.000 L 120.740 36.650 C 122.049 33.821 124.883 32.010 128.000 32.010 C 131.117 32.010 133.951 33.821 135.260 36.650 L 176.000 128.000 L 218.000 82.760 C 220.371 80.087 224.227 79.310 227.448 80.857 C 230.669 82.403 232.474 85.898 231.870 89.420 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 230.900 73.600 C 224.467 70.447 216.720 72.001 212.000 77.390 L 178.330 113.680 L 142.530 33.390 C 142.528 33.357 142.528 33.323 142.530 33.290 C 139.916 27.620 134.243 23.989 128.000 23.989 C 121.757 23.989 116.084 27.620 113.470 33.290 C 113.472 33.323 113.472 33.357 113.470 33.390 L 77.670 113.680 L 44.000 77.390 C 39.252 72.002 31.495 70.437 25.030 73.564 C 18.564 76.691 14.974 83.742 16.250 90.810 C 16.250 90.920 16.250 91.020 16.320 91.130 L 39.000 195.000 C 40.440 202.545 47.039 208.002 54.720 208.000 L 201.290 208.000 C 208.967 207.997 215.560 202.541 217.000 195.000 L 239.680 91.130 C 239.680 91.020 239.680 90.920 239.750 90.810 C 241.051 83.729 237.416 76.661 230.900 73.600 ZM 201.350 191.680 L 201.290 192.000 L 54.710 192.000 L 54.650 191.680 L 32.000 88.000 L 32.140 88.160 L 74.140 133.400 C 75.967 135.374 78.663 136.298 81.317 135.859 C 83.971 135.420 86.226 133.677 87.320 131.220 L 128.000 40.000 L 168.690 131.250 C 169.784 133.707 172.039 135.450 174.693 135.889 C 177.347 136.328 180.043 135.404 181.870 133.430 L 223.870 88.190 L 224.000 88.000 Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
