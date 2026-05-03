package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorThinIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 92.680 C 244.008 89.498 242.744 86.446 240.490 84.200 L 171.800 15.510 C 169.548 13.251 166.490 11.981 163.300 11.981 C 160.110 11.981 157.052 13.251 154.800 15.510 L 125.780 44.560 L 66.920 66.630 C 62.913 68.143 60.008 71.667 59.290 75.890 L 36.050 215.340 C 35.856 216.501 36.183 217.689 36.944 218.586 C 37.705 219.484 38.823 220.001 40.000 220.000 C 40.221 219.998 40.441 219.982 40.660 219.950 L 180.100 196.700 C 184.329 195.998 187.863 193.094 189.370 189.080 L 211.440 130.220 L 240.440 101.220 C 242.728 98.969 244.012 95.890 244.000 92.680 ZM 181.880 186.270 C 181.378 187.608 180.200 188.576 178.790 188.810 L 51.660 210.000 L 110.110 151.550 C 120.280 158.777 134.291 157.007 142.344 147.478 C 150.397 137.949 149.806 123.839 140.983 115.017 C 132.161 106.194 118.051 105.603 108.522 113.656 C 98.993 121.709 97.223 135.720 104.450 145.890 L 46.000 204.350 L 67.190 77.210 C 67.424 75.800 68.392 74.622 69.730 74.120 L 127.000 52.640 L 203.350 129.000 ZM 108.000 132.000 C 108.000 123.163 115.163 116.000 124.000 116.000 C 132.837 116.000 140.000 123.163 140.000 132.000 C 140.000 140.837 132.837 148.000 124.000 148.000 C 115.163 148.000 108.000 140.837 108.000 132.000 ZM 234.830 95.510 L 208.000 122.340 L 133.660 48.000 L 160.480 21.180 C 161.230 20.429 162.248 20.007 163.310 20.007 C 164.372 20.007 165.390 20.429 166.140 21.180 L 234.830 89.870 C 236.388 91.431 236.388 93.959 234.830 95.520 Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
