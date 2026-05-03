package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorDuotoneIcon(
            name = "UserCirclePlus",
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
                pathData = parseSvgPathData("M 168.000 56.000 C 168.000 51.582 171.582 48.000 176.000 48.000 L 192.000 48.000 L 192.000 32.000 C 192.000 27.582 195.582 24.000 200.000 24.000 C 204.418 24.000 208.000 27.582 208.000 32.000 L 208.000 48.000 L 224.000 48.000 C 228.418 48.000 232.000 51.582 232.000 56.000 C 232.000 60.418 228.418 64.000 224.000 64.000 L 208.000 64.000 L 208.000 80.000 C 208.000 84.418 204.418 88.000 200.000 88.000 C 195.582 88.000 192.000 84.418 192.000 80.000 L 192.000 64.000 L 176.000 64.000 C 171.582 64.000 168.000 60.418 168.000 56.000 ZM 230.560 110.680 C 238.059 155.258 215.881 199.571 175.702 220.286 C 135.523 241.001 86.562 233.367 54.597 201.403 C 22.633 169.438 14.999 120.477 35.714 80.298 C 56.429 40.119 100.742 17.941 145.320 25.440 C 149.642 26.204 152.541 30.309 151.817 34.638 C 151.093 38.967 147.016 41.904 142.680 41.220 C 117.139 36.924 91.002 44.087 71.221 60.805 C 51.440 77.523 40.021 102.101 40.000 128.000 C 39.981 149.542 47.898 170.336 62.240 186.410 C 71.162 173.481 83.708 163.478 98.300 157.660 C 82.233 145.005 75.949 123.560 82.646 104.235 C 89.342 84.911 107.548 71.952 128.000 71.952 C 148.452 71.952 166.658 84.911 173.354 104.235 C 180.051 123.560 173.767 145.005 157.700 157.660 C 172.292 163.478 184.838 173.481 193.760 186.410 C 208.102 170.336 216.019 149.542 216.000 128.000 C 216.000 123.081 215.592 118.171 214.780 113.320 C 214.279 110.488 215.337 107.605 217.550 105.769 C 219.764 103.933 222.792 103.427 225.483 104.442 C 228.173 105.458 230.112 107.839 230.560 110.680 ZM 128.000 152.000 C 145.673 152.000 160.000 137.673 160.000 120.000 C 160.000 102.327 145.673 88.000 128.000 88.000 C 110.327 88.000 96.000 102.327 96.000 120.000 C 96.000 137.673 110.327 152.000 128.000 152.000 ZM 128.000 216.000 C 147.534 216.020 166.513 209.508 181.920 197.500 C 170.159 179.106 149.833 167.977 128.000 167.977 C 106.167 167.977 85.841 179.106 74.080 197.500 C 89.487 209.508 108.466 216.020 128.000 216.000 Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
