package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorLightIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 254.000 136.000 C 253.956 97.358 222.642 66.044 184.000 66.000 L 72.000 66.000 C 33.358 66.044 2.044 97.358 2.000 136.000 C 1.999 146.102 8.878 154.907 18.680 157.350 C 20.740 165.590 27.530 173.410 38.320 179.790 C 49.110 186.170 61.870 190.000 72.000 190.000 C 90.662 189.977 106.553 176.424 109.520 158.000 L 146.520 158.000 C 149.485 176.409 165.353 189.958 184.000 190.000 C 194.130 190.000 207.000 186.090 217.680 179.790 C 228.360 173.490 235.260 165.590 237.320 157.350 C 247.122 154.907 254.001 146.102 254.000 136.000 ZM 44.430 169.460 C 35.260 164.000 30.000 157.670 30.000 152.000 C 30.000 145.360 36.770 138.810 45.450 133.940 L 85.640 174.120 C 81.545 176.662 76.820 178.006 72.000 178.000 C 64.140 178.000 53.060 174.570 44.430 169.460 ZM 94.120 165.640 L 57.240 128.750 C 61.989 127.078 66.968 126.150 72.000 126.000 C 81.420 126.005 90.099 131.105 94.689 139.331 C 99.279 147.556 99.062 157.621 94.120 165.640 ZM 158.000 152.000 C 157.995 145.222 160.649 138.713 165.390 133.870 L 204.550 173.000 C 197.480 176.070 189.920 178.000 184.000 178.000 C 169.641 178.000 158.000 166.359 158.000 152.000 ZM 215.460 167.000 L 175.810 127.360 C 178.449 126.468 181.215 126.009 184.000 126.000 C 191.860 126.000 202.940 129.430 211.570 134.540 C 220.740 140.000 226.000 146.330 226.000 152.000 C 226.000 157.320 221.650 162.580 215.460 167.000 ZM 236.770 144.820 C 234.200 137.260 227.650 130.140 217.680 124.240 C 207.000 117.910 194.130 114.000 184.000 114.000 C 165.338 114.023 149.447 127.576 146.480 146.000 L 109.480 146.000 C 106.515 127.591 90.647 114.042 72.000 114.000 C 61.870 114.000 49.000 117.910 38.320 124.210 C 28.320 130.110 21.800 137.210 19.230 144.790 C 16.007 143.041 14.000 139.667 14.000 136.000 C 14.039 103.983 39.983 78.039 72.000 78.000 L 184.000 78.000 C 216.017 78.039 241.961 103.983 242.000 136.000 C 242.000 139.667 239.993 143.041 236.770 144.790 Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
