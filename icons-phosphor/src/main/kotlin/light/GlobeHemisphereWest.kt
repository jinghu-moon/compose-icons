package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorLightIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 218.000 128.000 C 218.011 140.340 215.471 152.548 210.540 163.860 L 163.850 135.150 C 162.191 134.107 160.330 133.425 158.390 133.150 L 135.570 130.080 C 129.528 129.298 123.670 132.495 121.060 138.000 L 111.140 138.000 C 110.373 138.000 109.674 137.561 109.340 136.870 L 105.540 129.010 C 103.669 125.121 100.101 122.318 95.880 121.420 L 85.170 119.120 L 94.400 103.000 C 94.759 102.379 95.423 101.997 96.140 102.000 L 112.850 102.000 C 115.216 102.001 117.542 101.399 119.610 100.250 L 131.860 93.500 C 132.799 92.971 133.678 92.341 134.480 91.620 L 161.390 67.290 C 166.252 62.927 167.429 55.771 164.220 50.080 L 161.000 44.250 C 195.371 57.844 217.963 91.039 218.000 128.000 ZM 144.600 39.540 L 153.750 55.930 C 154.204 56.745 154.034 57.766 153.340 58.390 L 126.430 82.720 C 126.318 82.825 126.194 82.916 126.060 82.990 L 113.810 89.750 C 113.504 89.919 113.159 90.005 112.810 90.000 L 96.140 90.000 C 91.133 89.994 86.504 92.664 84.000 97.000 L 73.180 115.910 C 73.105 115.800 73.042 115.683 72.990 115.560 L 61.500 84.890 C 61.311 84.415 61.311 83.885 61.500 83.410 L 72.680 57.060 C 93.025 41.163 119.223 34.781 144.600 39.540 ZM 38.000 128.000 C 37.985 112.676 41.903 97.606 49.380 84.230 C 49.382 85.894 49.683 87.543 50.270 89.100 L 61.760 119.770 C 63.421 124.242 67.254 127.555 71.920 128.550 L 93.360 133.150 C 93.964 133.281 94.473 133.683 94.740 134.240 L 98.540 142.100 C 100.891 146.919 105.778 149.983 111.140 150.000 L 115.700 150.000 L 107.210 169.000 C 104.933 174.113 105.920 180.091 109.720 184.200 L 109.820 184.310 L 129.500 204.570 C 129.908 205.035 130.078 205.663 129.960 206.270 L 127.700 218.000 C 78.134 217.780 38.055 177.566 38.000 128.000 ZM 140.080 217.190 L 141.750 208.590 C 142.583 204.216 141.296 199.706 138.280 196.430 L 138.180 196.320 L 118.500 176.060 C 117.980 175.473 117.851 174.636 118.170 173.920 L 131.870 143.190 C 132.228 142.356 133.102 141.867 134.000 142.000 L 156.820 145.080 C 157.096 145.115 157.362 145.207 157.600 145.350 L 205.000 174.550 C 190.903 197.832 167.046 213.502 140.080 217.190 Z"),
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
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
