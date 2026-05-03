package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorFillIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 132.190 25.190 C 129.620 23.610 126.380 23.610 123.810 25.190 C 113.776 31.711 104.525 39.364 96.240 48.000 C 77.770 67.130 68.000 87.900 68.000 108.000 C 68.000 141.137 94.863 168.000 128.000 168.000 C 161.137 168.000 188.000 141.137 188.000 108.000 C 188.000 60.080 134.470 26.590 132.190 25.190 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 104.000 128.000 88.000 128.000 88.000 C 128.000 88.000 152.000 104.000 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 ZM 223.620 226.420 C 222.977 228.442 221.557 230.127 219.672 231.102 C 217.787 232.077 215.592 232.264 213.570 231.620 L 128.000 204.390 L 42.430 231.620 C 38.219 232.959 33.719 230.631 32.380 226.420 C 31.041 222.209 33.369 217.709 37.580 216.370 L 101.580 196.000 L 37.580 175.620 C 34.778 174.818 32.635 172.556 31.984 169.716 C 31.333 166.875 32.278 163.906 34.451 161.964 C 36.623 160.022 39.680 159.415 42.430 160.380 L 128.000 187.600 L 213.570 160.380 C 216.320 159.415 219.377 160.022 221.549 161.964 C 223.722 163.906 224.667 166.875 224.016 169.716 C 223.365 172.556 221.222 174.818 218.420 175.620 L 154.420 196.000 L 218.420 216.370 C 220.442 217.013 222.127 218.433 223.102 220.318 C 224.077 222.203 224.264 224.398 223.620 226.420 Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
