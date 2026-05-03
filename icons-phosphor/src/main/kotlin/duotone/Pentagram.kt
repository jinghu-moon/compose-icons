package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorDuotoneIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 228.690 102.470 L 174.480 141.470 L 195.250 205.470 C 196.324 208.767 195.153 212.380 192.348 214.420 C 189.544 216.459 185.745 216.459 182.940 214.420 L 128.000 174.910 L 73.060 214.440 C 70.255 216.479 66.456 216.479 63.652 214.440 C 60.847 212.400 59.676 208.787 60.750 205.490 L 81.520 141.490 L 27.310 102.490 C 24.492 100.459 23.307 96.841 24.376 93.536 C 25.446 90.232 28.526 87.995 32.000 88.000 L 98.870 88.000 L 120.390 21.680 C 121.392 18.313 124.487 16.005 128.000 16.005 C 131.513 16.005 134.608 18.313 135.610 21.680 L 157.130 88.000 L 224.000 88.000 C 227.462 88.007 230.527 90.240 231.595 93.533 C 232.663 96.827 231.490 100.434 228.690 102.470 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 239.200 91.060 C 237.127 84.424 230.951 79.931 224.000 80.000 L 163.000 80.000 L 143.300 19.260 C 141.248 12.577 135.080 8.011 128.088 7.999 C 121.097 7.988 114.914 12.533 112.840 19.210 L 93.060 80.000 L 32.000 80.000 C 25.041 79.977 18.865 84.455 16.724 91.076 C 14.582 97.697 16.966 104.943 22.620 109.000 L 72.090 144.590 L 53.140 203.000 C 50.919 209.609 53.302 216.892 59.000 220.910 C 64.578 225.044 72.202 225.044 77.780 220.910 L 128.000 184.770 L 178.240 220.910 C 183.851 224.991 191.453 224.991 197.064 220.910 C 202.675 216.828 205.016 209.595 202.860 203.000 L 183.860 144.540 L 233.360 108.920 C 239.031 104.905 241.403 97.650 239.200 91.060 ZM 128.000 24.150 L 146.120 80.000 L 109.880 80.000 ZM 32.000 96.000 L 87.870 96.000 L 77.300 128.580 ZM 68.360 208.000 L 68.360 208.000 L 85.750 154.410 L 114.300 174.950 ZM 90.930 138.430 L 104.690 96.000 L 151.310 96.000 L 165.070 138.390 L 128.000 165.060 ZM 187.640 208.000 L 187.640 208.000 L 141.730 175.000 L 170.280 154.460 ZM 178.700 128.620 L 168.130 96.000 L 224.000 96.000 Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
