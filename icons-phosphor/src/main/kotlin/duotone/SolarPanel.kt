package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = phosphorDuotoneIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 216.000 L 24.000 216.000 L 64.700 144.000 L 191.300 144.000 Z"),
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
        pathData = parseSvgPathData("M 32.000 104.000 C 32.000 99.582 35.582 96.000 40.000 96.000 L 56.000 96.000 C 60.418 96.000 64.000 99.582 64.000 104.000 C 64.000 108.418 60.418 112.000 56.000 112.000 L 40.000 112.000 C 35.582 112.000 32.000 108.418 32.000 104.000 ZM 71.430 58.750 C 74.556 61.876 79.624 61.876 82.750 58.750 C 85.876 55.624 85.876 50.556 82.750 47.430 L 71.430 36.120 C 68.285 33.132 63.331 33.195 60.263 36.263 C 57.195 39.331 57.132 44.285 60.120 47.430 ZM 128.000 40.000 C 132.418 40.000 136.000 36.418 136.000 32.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 32.000 C 120.000 36.418 123.582 40.000 128.000 40.000 ZM 178.910 61.090 C 181.032 61.092 183.068 60.250 184.570 58.750 L 195.880 47.430 C 198.868 44.285 198.805 39.331 195.737 36.263 C 192.669 33.195 187.715 33.132 184.570 36.120 L 173.250 47.430 C 170.959 49.718 170.274 53.161 171.513 56.152 C 172.752 59.143 175.672 61.093 178.910 61.090 ZM 192.000 104.000 C 192.000 108.418 195.582 112.000 200.000 112.000 L 216.000 112.000 C 220.418 112.000 224.000 108.418 224.000 104.000 C 224.000 99.582 220.418 96.000 216.000 96.000 L 200.000 96.000 C 195.582 96.000 192.000 99.582 192.000 104.000 ZM 88.000 112.000 C 92.418 112.000 96.000 108.418 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 C 160.000 108.418 163.582 112.000 168.000 112.000 C 172.418 112.000 176.000 108.418 176.000 104.000 C 176.000 77.490 154.510 56.000 128.000 56.000 C 101.490 56.000 80.000 77.490 80.000 104.000 C 80.000 108.418 83.582 112.000 88.000 112.000 ZM 238.910 220.000 C 237.484 222.470 234.852 223.993 232.000 224.000 L 24.000 224.000 C 21.148 224.013 18.504 222.507 17.061 220.046 C 15.618 217.585 15.595 214.543 17.000 212.060 L 57.690 140.060 C 59.116 137.539 61.794 135.986 64.690 136.000 L 191.300 136.000 C 194.196 135.986 196.874 137.539 198.300 140.060 L 238.990 212.060 C 240.371 214.534 240.341 217.554 238.910 220.000 ZM 186.640 152.000 L 162.270 152.000 L 165.750 168.000 L 195.680 168.000 ZM 149.380 168.000 L 145.900 152.000 L 110.100 152.000 L 106.620 168.000 ZM 103.140 184.000 L 97.930 208.000 L 158.070 208.000 L 152.860 184.000 ZM 60.320 168.000 L 90.250 168.000 L 93.730 152.000 L 69.360 152.000 ZM 37.710 208.000 L 81.550 208.000 L 86.770 184.000 L 51.280 184.000 ZM 218.290 208.000 L 204.720 184.000 L 169.230 184.000 L 174.450 208.000 Z"),
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
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
