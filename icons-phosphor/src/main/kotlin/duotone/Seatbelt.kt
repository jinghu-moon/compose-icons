package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorDuotoneIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 92.000 68.000 C 92.000 48.118 108.118 32.000 128.000 32.000 C 147.882 32.000 164.000 48.118 164.000 68.000 C 164.000 87.882 147.882 104.000 128.000 104.000 C 108.118 104.000 92.000 87.882 92.000 68.000 ZM 128.000 120.000 C 88.235 120.000 56.000 152.236 56.000 192.000 L 56.000 224.000 L 200.000 224.000 L 200.000 192.000 C 200.000 152.236 167.764 120.000 128.000 120.000 Z"),
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
                pathData = parseSvgPathData("M 172.000 68.000 C 172.000 43.699 152.301 24.000 128.000 24.000 C 103.699 24.000 84.000 43.699 84.000 68.000 C 84.000 92.301 103.699 112.000 128.000 112.000 C 152.289 111.972 171.972 92.289 172.000 68.000 ZM 128.000 96.000 C 112.536 96.000 100.000 83.464 100.000 68.000 C 100.000 52.536 112.536 40.000 128.000 40.000 C 143.464 40.000 156.000 52.536 156.000 68.000 C 156.000 83.464 143.464 96.000 128.000 96.000 ZM 208.000 224.000 C 208.000 228.418 204.418 232.000 200.000 232.000 L 56.000 232.000 C 52.673 231.999 49.694 229.940 48.518 226.828 C 47.342 223.716 48.215 220.201 50.710 218.000 L 148.780 131.460 C 130.924 125.318 111.267 127.375 95.069 137.080 C 78.872 146.785 67.786 163.148 64.780 181.790 C 63.907 185.975 59.898 188.735 55.677 188.056 C 51.456 187.376 48.515 183.498 49.000 179.250 C 53.005 154.422 68.452 132.923 90.704 121.205 C 112.956 109.487 139.422 108.915 162.160 119.660 L 186.710 98.000 C 190.032 95.163 195.017 95.515 197.906 98.793 C 200.796 102.070 200.521 107.059 197.290 110.000 L 77.160 216.000 L 200.000 216.000 C 204.418 216.000 208.000 219.582 208.000 224.000 ZM 193.730 146.380 C 203.048 159.766 208.029 175.691 208.000 192.000 C 208.000 196.418 204.418 200.000 200.000 200.000 C 195.582 200.000 192.000 196.418 192.000 192.000 C 192.025 178.955 188.042 166.217 180.590 155.510 C 178.069 151.881 178.966 146.896 182.595 144.375 C 186.224 141.854 191.209 142.751 193.730 146.380 Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
