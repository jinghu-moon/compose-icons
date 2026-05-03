package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorDuotoneIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.490 114.600 L 109.780 147.350 C 93.880 175.860 77.520 200.000 58.560 200.000 C -3.160 200.000 27.700 56.000 74.000 56.000 C 94.250 56.000 111.560 83.580 128.490 114.600 ZM 182.000 56.000 C 169.380 56.000 157.900 66.700 147.000 82.270 L 128.490 114.600 C 150.250 154.460 171.400 200.000 197.440 200.000 C 259.160 200.000 228.300 56.000 182.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 240.000 149.310 C 240.000 165.420 236.830 179.200 230.830 189.150 C 223.400 201.480 211.830 208.000 197.440 208.000 C 169.500 208.000 149.660 171.000 128.660 131.780 C 111.640 100.000 92.350 64.000 74.000 64.000 C 64.620 64.000 54.060 74.000 45.750 90.670 C 36.911 108.968 32.216 128.990 32.000 149.310 C 32.000 162.510 34.380 173.430 38.880 180.890 C 43.380 188.350 49.820 192.000 58.560 192.000 C 73.680 192.000 89.410 167.460 102.790 143.450 C 104.944 139.584 109.824 138.196 113.690 140.350 C 117.556 142.504 118.944 147.384 116.790 151.250 C 101.460 178.710 83.070 208.000 58.560 208.000 C 44.150 208.000 32.560 201.480 25.170 189.150 C 19.170 179.150 16.000 165.420 16.000 149.310 C 16.236 126.519 21.501 104.061 31.420 83.540 C 42.820 60.620 57.940 48.000 74.000 48.000 C 101.940 48.000 121.770 85.000 142.780 124.220 C 159.790 156.000 179.080 192.000 197.440 192.000 C 206.180 192.000 212.620 188.370 217.120 180.890 C 221.620 173.410 224.000 162.510 224.000 149.310 C 223.787 128.991 219.096 108.969 210.260 90.670 C 202.000 74.000 191.390 64.000 182.000 64.000 C 173.640 64.000 164.320 71.480 153.490 86.880 C 151.868 89.277 149.079 90.611 146.195 90.369 C 143.312 90.128 140.783 88.347 139.584 85.714 C 138.384 83.080 138.700 80.005 140.410 77.670 C 149.410 64.930 163.410 48.000 182.000 48.000 C 198.050 48.000 213.170 60.620 224.570 83.540 C 234.492 104.060 239.761 126.518 240.000 149.310 Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
