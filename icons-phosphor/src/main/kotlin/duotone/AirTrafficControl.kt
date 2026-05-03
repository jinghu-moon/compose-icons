package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorDuotoneIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 223.510 82.730 L 197.330 154.730 C 196.181 157.894 193.176 160.000 189.810 160.000 L 66.190 160.000 C 62.824 160.000 59.819 157.894 58.670 154.730 L 32.490 82.730 C 31.600 80.279 31.961 77.549 33.456 75.413 C 34.951 73.277 37.393 72.003 40.000 72.000 L 216.000 72.000 C 218.607 72.003 221.049 73.277 222.544 75.413 C 224.039 77.549 224.400 80.279 223.510 82.730 Z"),
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
                pathData = parseSvgPathData("M 229.110 70.820 C 226.114 66.544 221.221 63.998 216.000 64.000 L 136.000 64.000 L 136.000 32.000 L 152.000 32.000 C 156.418 32.000 160.000 28.418 160.000 24.000 C 160.000 19.582 156.418 16.000 152.000 16.000 L 104.000 16.000 C 99.582 16.000 96.000 19.582 96.000 24.000 C 96.000 28.418 99.582 32.000 104.000 32.000 L 120.000 32.000 L 120.000 64.000 L 40.000 64.000 C 34.787 64.012 29.906 66.563 26.920 70.836 C 23.934 75.110 23.218 80.571 25.000 85.470 L 51.190 157.470 C 53.485 163.780 59.476 167.985 66.190 168.000 L 96.000 168.000 L 96.000 232.000 C 96.000 236.418 99.582 240.000 104.000 240.000 C 108.418 240.000 112.000 236.418 112.000 232.000 L 112.000 168.000 L 144.000 168.000 L 144.000 232.000 C 144.000 236.418 147.582 240.000 152.000 240.000 C 156.418 240.000 160.000 236.418 160.000 232.000 L 160.000 168.000 L 189.820 168.000 C 196.534 167.985 202.525 163.780 204.820 157.470 L 231.010 85.470 C 232.804 80.569 232.095 75.101 229.110 70.820 ZM 110.680 152.000 L 97.580 80.000 L 158.420 80.000 L 145.320 152.000 ZM 40.000 80.000 L 81.320 80.000 L 94.410 152.000 L 66.180 152.000 ZM 189.820 152.000 L 161.590 152.000 L 174.680 80.000 L 216.000 80.000 Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
