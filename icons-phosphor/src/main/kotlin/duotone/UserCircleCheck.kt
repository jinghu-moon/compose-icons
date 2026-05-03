package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorDuotoneIcon(
            name = "UserCircleCheck",
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
        pathData = parseSvgPathData("M 221.350 104.110 C 216.993 104.839 214.051 108.963 214.780 113.320 C 215.592 118.171 216.000 123.081 216.000 128.000 C 216.019 149.542 208.102 170.336 193.760 186.410 C 184.838 173.481 172.292 163.478 157.700 157.660 C 173.767 145.005 180.051 123.560 173.354 104.235 C 166.658 84.911 148.452 71.952 128.000 71.952 C 107.548 71.952 89.342 84.911 82.646 104.235 C 75.949 123.560 82.233 145.005 98.300 157.660 C 83.708 163.478 71.162 173.481 62.240 186.410 C 39.254 160.509 33.597 123.534 47.785 91.945 C 61.974 60.355 93.370 40.024 128.000 40.000 C 132.919 39.999 137.829 40.407 142.680 41.220 C 147.016 41.904 151.093 38.967 151.817 34.638 C 152.541 30.309 149.642 26.204 145.320 25.440 C 100.742 17.941 56.429 40.119 35.714 80.298 C 14.999 120.477 22.633 169.438 54.597 201.403 C 86.562 233.367 135.523 241.001 175.702 220.286 C 215.881 199.571 238.059 155.258 230.560 110.680 C 229.831 106.323 225.707 103.381 221.350 104.110 ZM 96.000 120.000 C 96.000 102.327 110.327 88.000 128.000 88.000 C 145.673 88.000 160.000 102.327 160.000 120.000 C 160.000 137.673 145.673 152.000 128.000 152.000 C 110.327 152.000 96.000 137.673 96.000 120.000 ZM 74.080 197.500 C 85.841 179.106 106.167 167.977 128.000 167.977 C 149.833 167.977 170.159 179.106 181.920 197.500 C 150.205 222.166 105.795 222.166 74.080 197.500 ZM 237.660 45.660 L 205.660 77.660 C 204.159 79.162 202.123 80.006 200.000 80.006 C 197.877 80.006 195.841 79.162 194.340 77.660 L 178.340 61.660 C 175.214 58.534 175.214 53.466 178.340 50.340 C 181.466 47.214 186.534 47.214 189.660 50.340 L 200.000 60.690 L 226.340 34.340 C 229.466 31.214 234.534 31.214 237.660 34.340 C 240.786 37.466 240.786 42.534 237.660 45.660 Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
