package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorFillIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 104.000 L 229.200 104.000 L 201.420 41.500 C 198.852 35.723 193.122 32.000 186.800 32.000 L 69.200 32.000 C 62.878 32.000 57.148 35.723 54.580 41.500 L 26.800 104.000 L 16.000 104.000 C 11.582 104.000 8.000 107.582 8.000 112.000 C 8.000 116.418 11.582 120.000 16.000 120.000 L 24.000 120.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 64.000 216.000 C 72.837 216.000 80.000 208.837 80.000 200.000 L 80.000 192.000 L 176.000 192.000 L 176.000 200.000 C 176.000 208.837 183.163 216.000 192.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 120.000 L 240.000 120.000 C 244.418 120.000 248.000 116.418 248.000 112.000 C 248.000 107.582 244.418 104.000 240.000 104.000 ZM 80.000 152.000 L 56.000 152.000 C 51.582 152.000 48.000 148.418 48.000 144.000 C 48.000 139.582 51.582 136.000 56.000 136.000 L 80.000 136.000 C 84.418 136.000 88.000 139.582 88.000 144.000 C 88.000 148.418 84.418 152.000 80.000 152.000 ZM 200.000 152.000 L 176.000 152.000 C 171.582 152.000 168.000 148.418 168.000 144.000 C 168.000 139.582 171.582 136.000 176.000 136.000 L 200.000 136.000 C 204.418 136.000 208.000 139.582 208.000 144.000 C 208.000 148.418 204.418 152.000 200.000 152.000 ZM 44.310 104.000 L 69.200 48.000 L 186.800 48.000 L 211.690 104.000 Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null
