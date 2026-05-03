package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorLightIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 170.000 56.000 C 170.000 52.686 172.686 50.000 176.000 50.000 L 194.000 50.000 L 194.000 32.000 C 194.000 28.686 196.686 26.000 200.000 26.000 C 203.314 26.000 206.000 28.686 206.000 32.000 L 206.000 50.000 L 224.000 50.000 C 227.314 50.000 230.000 52.686 230.000 56.000 C 230.000 59.314 227.314 62.000 224.000 62.000 L 206.000 62.000 L 206.000 80.000 C 206.000 83.314 203.314 86.000 200.000 86.000 C 196.686 86.000 194.000 83.314 194.000 80.000 L 194.000 62.000 L 176.000 62.000 C 172.686 62.000 170.000 59.314 170.000 56.000 ZM 228.590 111.000 C 235.941 154.711 214.192 198.160 174.795 218.471 C 135.397 238.782 87.389 231.295 56.047 199.953 C 24.705 168.611 17.218 120.603 37.529 81.205 C 57.840 41.808 101.289 20.059 145.000 27.410 C 147.147 27.731 148.952 29.187 149.722 31.217 C 150.491 33.246 150.105 35.533 148.711 37.197 C 147.317 38.861 145.133 39.642 143.000 39.240 C 138.042 38.416 133.026 38.001 128.000 38.000 C 92.095 37.981 59.618 59.317 45.379 92.277 C 31.139 125.238 37.865 163.510 62.490 189.640 C 71.917 174.981 86.009 163.927 102.490 158.260 C 85.616 147.021 78.090 126.060 83.961 106.654 C 89.832 87.249 107.716 73.975 127.990 73.975 C 148.264 73.975 166.148 87.249 172.019 106.654 C 177.890 126.060 170.364 147.021 153.490 158.260 C 169.971 163.927 184.063 174.981 193.490 189.640 C 209.241 172.983 218.012 150.925 218.000 128.000 C 217.998 122.974 217.583 117.958 216.760 113.000 C 216.358 110.867 217.139 108.683 218.803 107.289 C 220.467 105.895 222.754 105.509 224.783 106.278 C 226.813 107.048 228.269 108.853 228.590 111.000 ZM 128.000 154.000 C 146.778 154.000 162.000 138.778 162.000 120.000 C 162.000 101.222 146.778 86.000 128.000 86.000 C 109.222 86.000 94.000 101.222 94.000 120.000 C 94.000 138.778 109.222 154.000 128.000 154.000 ZM 128.000 218.000 C 148.592 218.032 168.566 210.969 184.560 198.000 C 172.624 178.153 151.159 166.014 128.000 166.014 C 104.841 166.014 83.376 178.153 71.440 198.000 C 87.434 210.969 107.408 218.032 128.000 218.000 Z"),
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
