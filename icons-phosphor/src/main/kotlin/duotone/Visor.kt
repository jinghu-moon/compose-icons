package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorDuotoneIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 248.000 127.150 C 248.227 144.271 241.585 160.769 229.558 172.955 C 217.531 185.142 201.122 192.002 184.000 192.000 C 168.520 192.000 154.320 182.650 143.250 173.500 C 134.424 166.187 121.650 166.166 112.800 173.450 C 100.990 183.240 85.610 192.710 68.910 191.930 C 34.165 190.305 7.080 161.227 7.920 126.455 C 8.759 91.682 37.217 63.946 72.000 64.000 L 183.050 64.000 C 218.220 64.000 247.540 92.000 248.000 127.150 Z"),
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
        pathData = parseSvgPathData("M 183.050 56.000 L 72.000 56.000 C 52.314 56.000 33.487 64.060 19.900 78.305 C 6.313 92.550 -0.850 111.736 0.080 131.400 C 1.770 168.090 31.840 198.190 68.530 199.920 C 84.380 200.660 100.530 194.020 117.910 179.620 C 123.783 174.764 132.277 174.764 138.150 179.620 C 148.720 188.390 165.000 200.000 184.000 200.000 C 203.261 200.002 221.720 192.286 235.251 178.577 C 248.781 164.868 256.254 146.310 256.000 127.050 C 255.490 87.870 222.760 56.000 183.050 56.000 ZM 223.860 167.340 C 213.360 178.036 198.988 184.043 184.000 184.000 C 170.120 184.000 157.000 174.490 148.350 167.330 C 136.553 157.583 119.497 157.583 107.700 167.330 C 93.520 179.000 81.000 184.490 69.280 183.940 C 40.537 182.377 17.591 159.405 16.060 130.660 C 15.333 115.363 20.902 100.435 31.470 89.353 C 42.039 78.270 56.686 71.999 72.000 72.000 L 183.050 72.000 C 214.050 72.000 239.600 96.790 240.000 127.250 C 240.239 142.242 234.420 156.696 223.860 167.340 ZM 184.000 96.000 C 184.000 100.418 180.418 104.000 176.000 104.000 L 80.000 104.000 C 75.582 104.000 72.000 100.418 72.000 96.000 C 72.000 91.582 75.582 88.000 80.000 88.000 L 176.000 88.000 C 180.418 88.000 184.000 91.582 184.000 96.000 Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
