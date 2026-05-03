package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorLightIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 170.000 56.000 C 170.000 52.686 172.686 50.000 176.000 50.000 L 224.000 50.000 C 227.314 50.000 230.000 52.686 230.000 56.000 C 230.000 59.314 227.314 62.000 224.000 62.000 L 176.000 62.000 C 172.686 62.000 170.000 59.314 170.000 56.000 ZM 224.190 94.000 C 239.476 137.335 223.867 185.540 186.081 211.689 C 148.295 237.839 97.682 235.463 62.511 205.889 C 27.341 176.315 16.316 126.860 35.595 85.147 C 54.873 43.435 99.685 19.786 145.000 27.410 C 147.147 27.731 148.952 29.187 149.722 31.217 C 150.491 33.246 150.105 35.533 148.711 37.197 C 147.317 38.861 145.133 39.642 143.000 39.240 C 138.042 38.416 133.026 38.001 128.000 38.000 C 92.095 37.981 59.618 59.317 45.379 92.277 C 31.139 125.238 37.865 163.510 62.490 189.640 C 71.917 174.981 86.009 163.927 102.490 158.260 C 85.616 147.021 78.090 126.060 83.961 106.654 C 89.832 87.249 107.716 73.975 127.990 73.975 C 148.264 73.975 166.148 87.249 172.019 106.654 C 177.890 126.060 170.364 147.021 153.490 158.260 C 169.971 163.927 184.063 174.981 193.490 189.640 C 216.592 165.128 224.074 129.768 212.880 98.000 C 212.104 95.965 212.493 93.669 213.895 92.002 C 215.296 90.335 217.492 89.558 219.630 89.973 C 221.768 90.388 223.514 91.930 224.190 94.000 ZM 128.000 154.000 C 146.778 154.000 162.000 138.778 162.000 120.000 C 162.000 101.222 146.778 86.000 128.000 86.000 C 109.222 86.000 94.000 101.222 94.000 120.000 C 94.000 138.778 109.222 154.000 128.000 154.000 ZM 128.000 218.000 C 148.592 218.032 168.566 210.969 184.560 198.000 C 172.624 178.153 151.159 166.014 128.000 166.014 C 104.841 166.014 83.376 178.153 71.440 198.000 C 87.434 210.969 107.408 218.032 128.000 218.000 Z"),
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
