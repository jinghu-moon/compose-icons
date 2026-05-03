package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorDuotoneIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.029 155.229 212.465 181.183 192.200 199.370 C 179.916 175.209 155.105 159.993 128.000 160.000 C 150.091 160.000 168.000 142.091 168.000 120.000 C 168.000 97.909 150.091 80.000 128.000 80.000 C 105.909 80.000 88.000 97.909 88.000 120.000 C 88.000 142.091 105.909 160.000 128.000 160.000 C 100.895 159.993 76.084 175.209 63.800 199.370 L 63.800 199.370 C 31.027 169.891 22.540 121.881 43.222 82.953 C 63.904 44.026 108.439 24.185 151.212 34.844 C 193.984 45.502 224.002 83.919 224.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 168.000 56.000 C 168.000 51.582 171.582 48.000 176.000 48.000 L 224.000 48.000 C 228.418 48.000 232.000 51.582 232.000 56.000 C 232.000 60.418 228.418 64.000 224.000 64.000 L 176.000 64.000 C 171.582 64.000 168.000 60.418 168.000 56.000 ZM 226.080 93.330 C 241.684 137.526 225.775 186.698 187.239 213.378 C 148.704 240.058 97.079 237.644 61.202 207.485 C 25.324 177.325 14.073 126.883 33.734 84.335 C 53.394 41.788 99.100 17.664 145.320 25.440 C 149.642 26.204 152.541 30.309 151.817 34.638 C 151.093 38.967 147.016 41.904 142.680 41.220 C 117.139 36.924 91.002 44.087 71.221 60.805 C 51.440 77.523 40.021 102.101 40.000 128.000 C 39.981 149.542 47.898 170.336 62.240 186.410 C 71.162 173.481 83.708 163.478 98.300 157.660 C 82.233 145.005 75.949 123.560 82.646 104.235 C 89.342 84.911 107.548 71.952 128.000 71.952 C 148.452 71.952 166.658 84.911 173.354 104.235 C 180.051 123.560 173.767 145.005 157.700 157.660 C 172.292 163.478 184.838 173.481 193.760 186.410 C 215.044 162.479 221.647 128.875 211.000 98.670 C 209.525 94.503 211.708 89.930 215.875 88.455 C 220.042 86.980 224.615 89.163 226.090 93.330 ZM 128.000 152.000 C 145.673 152.000 160.000 137.673 160.000 120.000 C 160.000 102.327 145.673 88.000 128.000 88.000 C 110.327 88.000 96.000 102.327 96.000 120.000 C 96.000 137.673 110.327 152.000 128.000 152.000 ZM 128.000 216.000 C 147.534 216.020 166.513 209.508 181.920 197.500 C 170.159 179.106 149.833 167.977 128.000 167.977 C 106.167 167.977 85.841 179.106 74.080 197.500 C 89.487 209.508 108.466 216.020 128.000 216.000 Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
