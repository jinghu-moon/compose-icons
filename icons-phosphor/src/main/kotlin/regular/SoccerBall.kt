package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorRegularIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 204.520 171.420 L 170.900 171.420 L 161.640 158.660 L 174.270 121.880 L 189.270 116.990 L 215.510 137.120 C 214.268 149.192 210.526 160.874 204.520 171.420 ZM 40.520 137.120 L 66.710 117.000 L 81.710 121.890 L 94.340 158.670 L 85.100 171.420 L 51.480 171.420 C 45.467 160.875 41.718 149.194 40.470 137.120 ZM 50.520 86.480 L 56.030 105.080 L 40.710 116.770 C 42.068 106.163 45.363 95.896 50.430 86.480 ZM 109.000 152.000 L 97.540 118.650 L 128.000 97.710 L 158.460 118.650 L 147.000 152.000 ZM 200.070 105.080 L 205.580 86.480 C 210.647 95.896 213.942 106.163 215.300 116.770 ZM 193.870 69.700 L 184.360 101.780 L 169.290 106.670 L 136.000 83.790 L 136.000 68.210 L 165.090 48.210 C 176.047 53.334 185.838 60.648 193.860 69.700 ZM 146.070 41.870 L 128.000 54.290 L 109.930 41.870 C 121.848 39.377 134.152 39.377 146.070 41.870 ZM 90.910 48.210 L 120.000 68.210 L 120.000 83.790 L 86.720 106.670 L 71.650 101.780 L 62.140 69.700 C 70.162 60.648 79.953 53.334 90.910 48.210 ZM 63.150 187.420 L 83.520 187.420 L 90.690 207.690 C 80.278 202.790 70.923 195.905 63.150 187.420 ZM 110.000 214.130 L 98.120 180.710 L 107.350 168.000 L 148.650 168.000 L 157.880 180.710 L 146.050 214.130 C 134.146 216.625 121.854 216.625 109.950 214.130 ZM 165.360 207.690 L 172.530 187.420 L 192.900 187.420 C 185.112 195.910 175.740 202.796 165.310 207.690 Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
