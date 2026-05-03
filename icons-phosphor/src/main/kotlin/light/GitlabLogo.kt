package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorLightIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.210 117.610 L 208.320 41.490 C 207.255 37.244 203.537 34.195 199.165 33.981 C 194.792 33.767 190.795 36.438 189.320 40.560 L 171.170 90.000 L 84.830 90.000 L 66.660 40.560 C 65.185 36.438 61.188 33.767 56.815 33.981 C 52.443 34.195 48.725 37.244 47.660 41.490 L 27.790 117.610 C 22.002 139.714 30.436 163.099 49.000 176.420 L 122.270 228.190 C 125.701 230.604 130.279 230.604 133.710 228.190 L 207.000 176.420 C 225.564 163.099 233.998 139.714 228.210 117.610 ZM 57.650 50.820 L 75.000 98.070 C 75.869 100.434 78.122 102.004 80.640 102.000 L 175.360 102.000 C 177.878 102.004 180.131 100.434 181.000 98.070 L 198.360 50.820 L 213.360 108.340 L 128.000 168.660 L 42.620 108.340 ZM 39.380 120.740 L 117.600 176.000 L 93.410 193.100 L 55.940 166.620 C 41.465 156.222 34.883 137.986 39.380 120.740 ZM 128.000 217.530 L 103.810 200.440 L 128.000 183.350 L 152.190 200.440 ZM 200.060 166.620 L 162.590 193.100 L 138.400 176.000 L 216.620 120.740 C 221.117 137.986 214.535 156.222 200.060 166.620 Z"),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
