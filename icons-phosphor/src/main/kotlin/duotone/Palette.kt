package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorDuotoneIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 127.170 C 224.064 134.631 223.262 142.074 221.610 149.350 C 219.114 160.263 209.405 168.002 198.210 168.000 L 152.000 168.000 C 138.745 168.000 128.000 178.745 128.000 192.000 C 127.994 199.788 124.210 207.089 117.849 211.584 C 111.489 216.078 103.343 217.206 96.000 214.610 C 58.730 201.440 32.000 169.810 32.000 128.000 C 31.997 75.369 74.372 32.548 127.000 32.000 C 179.840 31.470 223.550 74.350 224.000 127.170 Z"),
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
        pathData = parseSvgPathData("M 200.770 53.890 C 181.407 34.716 155.250 23.972 128.000 24.000 L 126.930 24.000 C 69.911 24.587 23.997 70.978 24.000 128.000 C 24.000 171.000 50.580 207.060 93.360 222.170 C 103.151 225.622 114.008 224.109 122.483 218.113 C 130.958 212.117 135.997 202.382 136.000 192.000 C 136.000 183.163 143.163 176.000 152.000 176.000 L 198.210 176.000 C 213.166 176.072 226.152 165.717 229.410 151.120 C 231.198 143.247 232.067 135.193 232.000 127.120 C 231.794 99.517 220.548 73.146 200.770 53.890 ZM 213.770 147.600 C 212.133 154.871 205.663 160.027 198.210 160.000 L 152.000 160.000 C 134.327 160.000 120.000 174.327 120.000 192.000 C 119.992 197.186 117.472 202.046 113.238 205.040 C 109.004 208.035 103.582 208.791 98.690 207.070 C 62.490 194.300 40.000 164.000 40.000 128.000 C 39.997 79.752 78.845 40.499 127.090 40.000 L 127.990 40.000 C 176.222 40.187 215.390 79.022 215.990 127.250 C 216.050 134.095 215.318 140.923 213.810 147.600 ZM 140.000 76.000 C 140.000 82.627 134.627 88.000 128.000 88.000 C 121.373 88.000 116.000 82.627 116.000 76.000 C 116.000 69.373 121.373 64.000 128.000 64.000 C 134.627 64.000 140.000 69.373 140.000 76.000 ZM 96.000 100.000 C 96.000 106.627 90.627 112.000 84.000 112.000 C 77.373 112.000 72.000 106.627 72.000 100.000 C 72.000 93.373 77.373 88.000 84.000 88.000 C 90.627 88.000 96.000 93.373 96.000 100.000 ZM 96.000 156.000 C 96.000 162.627 90.627 168.000 84.000 168.000 C 77.373 168.000 72.000 162.627 72.000 156.000 C 72.000 149.373 77.373 144.000 84.000 144.000 C 90.627 144.000 96.000 149.373 96.000 156.000 ZM 184.000 100.000 C 184.000 106.627 178.627 112.000 172.000 112.000 C 165.373 112.000 160.000 106.627 160.000 100.000 C 160.000 93.373 165.373 88.000 172.000 88.000 C 178.627 88.000 184.000 93.373 184.000 100.000 Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
