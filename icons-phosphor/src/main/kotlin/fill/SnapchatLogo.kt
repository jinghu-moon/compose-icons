package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) return _snapchatLogo!!
        _snapchatLogo = phosphorFillIcon(
            name = "SnapchatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.470 189.740 C 238.370 196.410 227.800 197.450 217.590 198.460 C 211.280 199.080 204.760 199.730 201.200 201.690 C 197.830 203.550 194.350 208.310 190.990 212.910 C 185.590 220.320 179.460 228.710 169.760 231.190 L 169.760 231.190 C 167.590 231.741 165.359 232.013 163.120 232.000 C 156.240 232.000 149.420 229.680 143.220 227.570 C 137.670 225.680 132.420 223.890 128.010 223.890 C 123.600 223.890 118.350 225.680 112.800 227.570 C 104.610 230.360 95.330 233.570 86.260 231.190 C 76.550 228.710 70.420 220.320 65.020 212.910 C 61.660 208.310 58.180 203.550 54.810 201.690 C 51.250 199.690 44.730 199.080 38.430 198.460 C 28.210 197.460 17.640 196.410 10.540 189.740 C 8.511 187.834 7.618 185.010 8.183 182.284 C 8.748 179.558 10.690 177.322 13.310 176.380 C 13.400 176.380 26.150 171.520 38.670 157.380 C 46.423 148.514 52.441 138.269 56.410 127.180 L 37.000 119.430 C 32.897 117.773 30.913 113.103 32.570 109.000 C 34.227 104.897 38.897 102.913 43.000 104.570 L 60.850 111.720 C 63.014 101.287 64.070 90.655 64.000 80.000 C 64.000 44.654 92.654 16.000 128.000 16.000 C 163.346 16.000 192.000 44.654 192.000 80.000 C 191.932 90.661 193.008 101.299 195.210 111.730 L 213.000 104.570 C 217.103 102.913 221.773 104.897 223.430 109.000 C 225.087 113.103 223.103 117.773 219.000 119.430 L 199.700 127.150 C 213.780 165.500 242.340 176.240 242.700 176.380 C 245.320 177.322 247.262 179.558 247.827 182.284 C 248.392 185.010 247.499 187.834 245.470 189.740 Z"),
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
        return _snapchatLogo!!
    }

private var _snapchatLogo: ImageVector? = null
