package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorRegularIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 136.000 C 210.820 136.000 209.650 136.060 208.490 136.170 L 175.590 37.470 C 174.501 34.203 171.444 32.000 168.000 32.000 L 136.000 32.000 C 131.582 32.000 128.000 35.582 128.000 40.000 C 128.000 44.418 131.582 48.000 136.000 48.000 L 162.230 48.000 L 179.670 100.310 L 124.210 168.000 L 79.770 168.000 C 77.729 149.800 62.348 136.033 44.034 136.013 C 25.719 135.993 10.309 149.726 8.228 167.922 C 6.146 186.118 18.058 202.976 35.904 207.092 C 53.750 211.208 71.842 201.269 77.940 184.000 L 128.000 184.000 C 130.398 184.001 132.670 182.925 134.190 181.070 L 185.650 118.260 L 193.310 141.260 C 177.949 150.622 171.858 169.887 179.042 186.378 C 186.227 202.870 204.483 211.527 221.799 206.654 C 239.115 201.780 250.176 184.873 247.705 167.054 C 245.234 149.236 229.989 135.977 212.000 136.000 ZM 44.000 192.000 C 32.954 192.000 24.000 183.046 24.000 172.000 C 24.000 160.954 32.954 152.000 44.000 152.000 C 55.046 152.000 64.000 160.954 64.000 172.000 C 64.000 183.046 55.046 192.000 44.000 192.000 ZM 212.000 192.000 C 200.954 192.000 192.000 183.046 192.000 172.000 C 192.000 160.954 200.954 152.000 212.000 152.000 C 223.046 152.000 232.000 160.954 232.000 172.000 C 232.000 183.046 223.046 192.000 212.000 192.000 Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
