package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorThinIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 162.220 124.670 L 114.220 92.670 C 112.992 91.851 111.413 91.774 110.112 92.471 C 108.811 93.168 107.999 94.524 108.000 96.000 L 108.000 160.000 C 107.998 161.476 108.809 162.833 110.110 163.530 C 111.412 164.227 112.992 164.150 114.220 163.330 L 162.220 131.330 C 163.334 130.588 164.004 129.339 164.004 128.000 C 164.004 126.661 163.334 125.412 162.220 124.670 ZM 116.000 152.530 L 116.000 103.470 L 152.790 128.000 ZM 230.460 70.530 C 228.874 64.296 224.386 59.205 218.400 56.850 C 184.600 43.790 130.270 44.000 128.000 44.000 C 125.730 44.000 71.400 43.790 37.600 56.850 C 31.616 59.203 27.129 64.290 25.540 70.520 C 23.000 80.270 20.000 98.160 20.000 128.000 C 20.000 157.840 23.000 175.730 25.540 185.480 C 27.129 191.710 31.616 196.797 37.600 199.150 C 71.400 212.210 125.730 212.000 128.000 212.000 L 128.710 212.000 C 135.600 212.000 186.290 211.570 218.430 199.150 C 224.414 196.797 228.901 191.710 230.490 185.480 C 233.000 175.720 236.000 157.840 236.000 128.000 C 236.000 98.160 233.000 80.270 230.460 70.520 ZM 222.720 183.530 C 221.777 187.269 219.095 190.328 215.510 191.750 C 183.140 204.190 128.570 204.000 128.000 204.000 C 127.430 204.000 72.890 204.190 40.520 191.690 C 36.935 190.268 34.253 187.209 33.310 183.470 C 30.870 174.170 28.000 157.000 28.000 128.000 C 28.000 99.000 30.870 81.830 33.280 72.530 C 34.223 68.791 36.905 65.732 40.490 64.310 C 72.860 51.810 127.430 52.000 128.000 52.000 C 128.570 52.000 183.110 51.800 215.480 64.310 C 219.065 65.732 221.747 68.791 222.690 72.530 C 225.130 81.830 228.000 99.000 228.000 128.000 C 228.000 157.000 225.130 174.170 222.720 183.470 Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
