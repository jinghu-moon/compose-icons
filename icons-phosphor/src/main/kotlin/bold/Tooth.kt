package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorBoldIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.460 83.150 L 160.310 88.000 L 172.460 92.850 C 178.615 95.313 181.608 102.300 179.145 108.455 C 176.682 114.610 169.695 117.603 163.540 115.140 L 128.000 100.930 L 92.460 115.150 C 86.305 117.613 79.318 114.620 76.855 108.465 C 74.392 102.310 77.385 95.323 83.540 92.860 L 95.690 88.000 L 83.540 83.150 C 77.385 80.687 74.392 73.700 76.855 67.545 C 79.318 61.390 86.305 58.397 92.460 60.860 L 128.000 75.080 L 163.540 60.860 C 169.695 58.397 176.682 61.390 179.145 67.545 C 181.608 73.700 178.615 80.687 172.460 83.150 ZM 228.000 79.750 C 228.080 156.200 202.800 215.430 179.000 232.340 C 173.105 236.479 165.440 237.128 158.933 234.040 C 152.426 230.952 148.082 224.604 147.560 217.420 C 146.890 208.360 145.230 195.420 141.100 185.190 C 135.760 172.000 129.920 172.000 128.000 172.000 C 120.240 172.000 116.230 181.920 114.920 185.180 C 110.790 195.400 109.130 208.350 108.460 217.410 C 107.720 227.882 99.008 236.000 88.510 236.000 C 84.386 236.005 80.364 234.725 77.000 232.340 C 53.200 215.430 27.920 156.200 28.000 79.750 C 28.138 46.711 54.960 20.000 88.000 20.000 L 168.000 20.000 C 201.040 20.000 227.862 46.711 228.000 79.750 ZM 204.000 79.750 C 203.863 59.965 187.785 44.000 168.000 44.000 L 88.000 44.000 C 68.203 44.000 52.121 59.984 52.000 79.780 C 51.940 140.870 69.830 189.300 85.300 207.440 C 91.240 156.000 114.320 148.000 128.000 148.000 C 141.680 148.000 164.760 156.000 170.700 207.430 C 186.170 189.310 204.060 140.880 204.000 79.780 Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
