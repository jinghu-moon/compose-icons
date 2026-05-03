package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorLightIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.630 48.000 C 245.448 44.969 243.031 42.552 240.000 42.370 C 189.000 39.370 148.120 54.790 130.650 83.630 C 119.020 102.840 119.270 126.310 131.180 148.630 C 123.544 157.372 118.221 167.889 115.700 179.220 L 95.900 159.410 C 104.050 143.310 104.000 126.460 95.580 112.560 C 82.770 91.410 53.000 80.070 15.900 82.270 C 12.866 82.452 10.447 84.875 10.270 87.910 C 8.090 125.000 19.410 154.770 40.560 167.580 C 47.448 171.790 55.367 174.012 63.440 174.000 C 71.800 173.915 80.023 171.859 87.440 168.000 L 114.000 194.480 L 114.000 224.000 C 114.000 227.314 116.686 230.000 120.000 230.000 C 123.314 230.000 126.000 227.314 126.000 224.000 L 126.000 194.510 C 125.960 180.765 130.841 167.459 139.760 157.000 C 150.970 162.930 162.480 165.910 173.580 165.910 C 184.437 165.946 195.093 162.980 204.370 157.340 C 233.210 139.890 248.630 99.000 245.630 48.000 ZM 46.780 157.310 C 30.470 147.440 21.390 124.000 22.000 94.000 C 52.000 93.350 75.410 102.440 85.280 118.750 C 90.960 128.120 91.440 139.130 86.820 150.340 L 60.240 123.750 C 57.896 121.406 54.094 121.406 51.750 123.750 C 49.406 126.094 49.406 129.896 51.750 132.240 L 78.370 158.850 C 67.160 163.470 56.150 163.000 46.780 157.310 ZM 198.160 147.090 C 183.420 156.010 166.020 156.270 148.490 147.990 L 204.250 92.240 C 206.594 89.896 206.594 86.094 204.250 83.750 C 201.906 81.406 198.104 81.406 195.760 83.750 L 140.000 139.510 C 131.720 121.980 132.000 104.580 140.900 89.850 C 155.420 65.850 189.960 52.670 233.900 54.100 C 235.330 98.000 222.140 132.560 198.160 147.090 Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
