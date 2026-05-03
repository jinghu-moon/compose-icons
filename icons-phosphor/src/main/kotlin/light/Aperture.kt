package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorLightIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.120 55.880 C 160.196 16.598 96.066 16.857 56.460 56.460 C 16.854 96.063 16.591 160.193 55.870 200.120 C 81.565 226.239 119.294 236.570 154.711 227.184 C 190.127 217.798 217.789 190.139 227.177 154.723 C 236.565 119.307 226.237 81.577 200.120 55.880 ZM 98.120 122.550 L 117.770 99.410 L 147.630 104.870 L 157.840 133.450 L 138.190 156.590 L 108.330 151.130 ZM 209.930 90.690 C 221.322 115.827 220.585 144.795 207.930 169.320 L 151.790 159.080 ZM 203.770 79.410 L 166.830 122.890 L 136.660 38.420 C 157.463 40.367 176.925 49.546 191.660 64.360 C 196.217 68.934 200.277 73.979 203.770 79.410 ZM 64.360 64.410 C 80.171 48.488 101.393 39.096 123.810 38.100 L 143.000 91.820 L 54.750 75.710 C 57.639 71.671 60.853 67.875 64.360 64.360 ZM 48.000 86.680 L 104.140 96.920 L 46.070 165.310 C 34.678 140.173 35.415 111.205 48.070 86.680 ZM 52.210 176.590 L 89.150 133.110 L 119.320 217.580 C 98.517 215.633 79.055 206.454 64.320 191.640 C 59.770 187.065 55.717 182.020 52.230 176.590 ZM 191.620 191.590 C 175.804 207.498 154.581 216.873 132.170 217.850 L 113.000 164.180 L 201.240 180.290 C 198.354 184.328 195.144 188.124 191.640 191.640 Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
