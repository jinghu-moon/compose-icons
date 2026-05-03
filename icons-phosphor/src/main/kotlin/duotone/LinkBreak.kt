package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorDuotoneIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 204.280 108.280 L 108.280 204.280 C 92.585 219.439 67.637 219.222 52.207 203.793 C 36.778 188.363 36.561 163.415 51.720 147.720 L 147.720 51.720 C 163.415 36.561 188.363 36.778 203.793 52.207 C 219.222 67.637 219.439 92.585 204.280 108.280 Z"),
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
                pathData = parseSvgPathData("M 198.630 57.370 C 186.157 44.900 165.946 44.873 153.440 57.310 L 141.790 69.520 C 138.697 72.411 133.887 72.391 130.818 69.476 C 127.748 66.560 127.482 61.757 130.210 58.520 L 141.930 46.230 C 141.971 46.184 142.014 46.141 142.060 46.100 C 160.848 27.615 191.027 27.738 209.665 46.375 C 228.302 65.013 228.425 95.192 209.940 113.980 C 209.899 114.026 209.856 114.069 209.810 114.110 L 197.520 125.830 C 194.283 128.558 189.480 128.292 186.564 125.222 C 183.649 122.153 183.629 117.343 186.520 114.250 L 198.730 102.600 C 211.183 90.078 211.138 69.836 198.630 57.370 ZM 114.210 186.480 L 102.560 198.690 C 90.013 210.876 70.006 210.730 57.638 198.362 C 45.270 185.994 45.124 165.987 57.310 153.440 L 69.520 141.790 C 72.411 138.697 72.391 133.887 69.476 130.818 C 66.560 127.748 61.757 127.482 58.520 130.210 L 46.190 141.930 C 46.144 141.971 46.101 142.014 46.060 142.060 C 27.575 160.848 27.698 191.027 46.335 209.665 C 64.973 228.302 95.152 228.425 113.940 209.940 C 113.986 209.899 114.029 209.856 114.070 209.810 L 125.790 197.520 C 127.961 195.491 128.828 192.425 128.042 189.560 C 127.257 186.694 124.947 184.500 122.044 183.862 C 119.142 183.224 116.125 184.248 114.210 186.520 ZM 216.000 152.000 L 192.000 152.000 C 187.582 152.000 184.000 155.582 184.000 160.000 C 184.000 164.418 187.582 168.000 192.000 168.000 L 216.000 168.000 C 220.418 168.000 224.000 164.418 224.000 160.000 C 224.000 155.582 220.418 152.000 216.000 152.000 ZM 40.000 104.000 L 64.000 104.000 C 68.418 104.000 72.000 100.418 72.000 96.000 C 72.000 91.582 68.418 88.000 64.000 88.000 L 40.000 88.000 C 35.582 88.000 32.000 91.582 32.000 96.000 C 32.000 100.418 35.582 104.000 40.000 104.000 ZM 160.000 184.000 C 155.582 184.000 152.000 187.582 152.000 192.000 L 152.000 216.000 C 152.000 220.418 155.582 224.000 160.000 224.000 C 164.418 224.000 168.000 220.418 168.000 216.000 L 168.000 192.000 C 168.000 187.582 164.418 184.000 160.000 184.000 ZM 96.000 72.000 C 100.418 72.000 104.000 68.418 104.000 64.000 L 104.000 40.000 C 104.000 35.582 100.418 32.000 96.000 32.000 C 91.582 32.000 88.000 35.582 88.000 40.000 L 88.000 64.000 C 88.000 68.418 91.582 72.000 96.000 72.000 Z"),
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
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
