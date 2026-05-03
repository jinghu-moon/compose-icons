package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorThinIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 36.000 C 146.571 35.980 164.708 41.613 180.000 52.150 L 180.000 74.000 C 179.991 74.962 179.636 75.889 179.000 76.610 L 156.830 102.370 C 156.192 103.109 155.307 103.589 154.340 103.720 L 122.900 108.000 C 121.883 108.145 120.849 107.886 120.020 107.280 L 119.860 107.170 L 100.130 94.220 C 97.487 92.341 94.197 91.611 91.008 92.197 C 87.819 92.783 85.002 94.634 83.200 97.330 L 62.200 128.630 C 60.898 130.585 60.202 132.881 60.200 135.230 L 60.000 171.460 C 59.996 172.802 59.320 174.052 58.200 174.790 L 51.550 179.150 C 32.674 150.930 30.874 114.608 46.868 84.660 C 62.862 54.713 94.049 36.007 128.000 36.000 ZM 56.320 185.600 L 62.610 181.470 C 65.978 179.257 68.010 175.500 68.020 171.470 L 68.230 135.240 C 68.233 134.457 68.466 133.692 68.900 133.040 L 89.850 101.740 C 90.457 100.840 91.403 100.224 92.473 100.036 C 93.542 99.847 94.642 100.101 95.520 100.740 L 95.670 100.850 L 115.410 113.760 C 117.892 115.524 120.952 116.278 123.970 115.870 L 155.440 111.610 C 158.349 111.218 161.014 109.774 162.930 107.550 L 185.100 81.810 C 186.968 79.637 187.997 76.866 188.000 74.000 L 188.000 58.310 C 217.765 83.885 228.008 125.537 213.500 162.000 L 192.930 143.180 C 189.487 140.036 184.535 139.170 180.230 140.960 L 149.780 153.620 C 145.893 155.247 143.137 158.784 142.510 162.950 L 140.130 179.140 C 139.262 185.191 143.082 190.927 149.000 192.460 L 170.450 198.090 C 171.134 198.257 171.762 198.602 172.270 199.090 L 178.210 205.090 C 138.619 230.932 85.879 222.499 56.320 185.600 ZM 184.750 200.360 L 177.890 193.480 C 176.384 191.971 174.502 190.891 172.440 190.350 L 151.000 184.720 C 149.006 184.227 147.709 182.304 148.000 180.270 L 150.390 164.070 C 150.595 162.680 151.513 161.500 152.810 160.960 L 183.260 148.310 C 184.697 147.710 186.351 147.999 187.500 149.050 L 210.000 169.620 C 203.914 181.578 195.298 192.067 184.750 200.360 Z"),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
