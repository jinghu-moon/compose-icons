package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorDuotoneIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.029 155.229 212.465 181.183 192.200 199.370 C 179.916 175.209 155.105 159.993 128.000 160.000 C 150.091 160.000 168.000 142.091 168.000 120.000 C 168.000 97.909 150.091 80.000 128.000 80.000 C 105.909 80.000 88.000 97.909 88.000 120.000 C 88.000 142.091 105.909 160.000 128.000 160.000 C 100.895 159.993 76.084 175.209 63.800 199.370 L 63.800 199.370 C 31.027 169.891 22.540 121.881 43.222 82.953 C 63.904 44.026 108.439 24.185 151.212 34.844 C 193.984 45.502 224.002 83.919 224.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 74.080 197.500 C 85.841 179.106 106.167 167.977 128.000 167.977 C 149.833 167.977 170.159 179.106 181.920 197.500 C 150.205 222.166 105.795 222.166 74.080 197.500 ZM 96.000 120.000 C 96.000 102.327 110.327 88.000 128.000 88.000 C 145.673 88.000 160.000 102.327 160.000 120.000 C 160.000 137.673 145.673 152.000 128.000 152.000 C 110.327 152.000 96.000 137.673 96.000 120.000 ZM 193.760 186.410 C 184.838 173.481 172.292 163.478 157.700 157.660 C 173.767 145.005 180.051 123.560 173.354 104.235 C 166.658 84.911 148.452 71.952 128.000 71.952 C 107.548 71.952 89.342 84.911 82.646 104.235 C 75.949 123.560 82.233 145.005 98.300 157.660 C 83.708 163.478 71.162 173.481 62.240 186.410 C 30.832 151.090 32.934 97.267 67.001 64.505 C 101.068 31.742 154.932 31.742 188.999 64.505 C 223.066 97.267 225.168 151.090 193.760 186.410 Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
