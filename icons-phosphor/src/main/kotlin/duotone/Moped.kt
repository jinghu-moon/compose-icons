package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorDuotoneIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 131.000 168.000 L 8.000 168.000 C 7.994 147.653 20.817 129.512 40.000 122.730 L 40.000 96.000 L 104.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 128.000 C 213.900 127.999 211.803 128.166 209.730 128.500 L 175.490 37.190 C 174.319 34.068 171.334 32.000 168.000 32.000 L 136.000 32.000 C 131.582 32.000 128.000 35.582 128.000 40.000 C 128.000 44.418 131.582 48.000 136.000 48.000 L 162.460 48.000 L 194.760 134.130 C 185.483 139.938 178.981 149.283 176.760 160.000 L 136.540 160.000 L 111.540 93.190 C 110.362 90.051 107.353 87.979 104.000 88.000 L 24.000 88.000 C 19.582 88.000 16.000 91.582 16.000 96.000 C 16.000 100.418 19.582 104.000 24.000 104.000 L 32.000 104.000 L 32.000 117.390 C 12.473 126.685 0.024 146.373 -0.000 168.000 C -0.000 172.418 3.582 176.000 8.000 176.000 L 16.800 176.000 C 20.586 194.643 36.977 208.040 56.000 208.040 C 75.023 208.040 91.414 194.643 95.200 176.000 L 176.800 176.000 C 181.010 196.624 200.483 210.456 221.343 207.641 C 242.202 204.825 257.311 186.324 255.902 165.323 C 254.493 144.321 237.049 128.004 216.000 128.000 ZM 56.000 192.000 C 45.832 191.997 36.769 185.587 33.380 176.000 L 78.620 176.000 C 75.231 185.587 66.168 191.997 56.000 192.000 ZM 16.810 160.000 C 19.625 146.243 29.436 134.964 42.670 130.270 C 45.864 129.139 47.999 126.118 48.000 122.730 L 48.000 104.000 L 98.460 104.000 L 119.460 160.000 ZM 216.000 192.000 C 205.922 191.989 196.925 185.683 193.476 176.214 C 190.027 166.745 192.861 156.130 200.570 149.640 L 208.510 170.810 C 210.062 174.952 214.678 177.052 218.820 175.500 C 222.962 173.948 225.062 169.332 223.510 165.190 L 215.550 144.000 L 216.000 144.000 C 229.255 144.000 240.000 154.745 240.000 168.000 C 240.000 181.255 229.255 192.000 216.000 192.000 Z"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
