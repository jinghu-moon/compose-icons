package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorFillIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 64.000 L 86.510 64.000 L 194.300 31.670 C 198.533 30.400 200.935 25.938 199.665 21.705 C 198.395 17.472 193.933 15.070 189.700 16.340 L 29.700 64.340 L 29.700 64.340 C 26.318 65.355 24.001 68.468 24.000 72.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 80.000 C 232.000 71.163 224.837 64.000 216.000 64.000 ZM 104.000 176.000 L 64.000 176.000 C 59.582 176.000 56.000 172.418 56.000 168.000 C 56.000 163.582 59.582 160.000 64.000 160.000 L 104.000 160.000 C 108.418 160.000 112.000 163.582 112.000 168.000 C 112.000 172.418 108.418 176.000 104.000 176.000 ZM 104.000 144.000 L 64.000 144.000 C 59.582 144.000 56.000 140.418 56.000 136.000 C 56.000 131.582 59.582 128.000 64.000 128.000 L 104.000 128.000 C 108.418 128.000 112.000 131.582 112.000 136.000 C 112.000 140.418 108.418 144.000 104.000 144.000 ZM 104.000 112.000 L 64.000 112.000 C 59.582 112.000 56.000 108.418 56.000 104.000 C 56.000 99.582 59.582 96.000 64.000 96.000 L 104.000 96.000 C 108.418 96.000 112.000 99.582 112.000 104.000 C 112.000 108.418 108.418 112.000 104.000 112.000 ZM 168.000 168.000 C 150.327 168.000 136.000 153.673 136.000 136.000 C 136.000 118.327 150.327 104.000 168.000 104.000 C 185.673 104.000 200.000 118.327 200.000 136.000 C 200.000 153.673 185.673 168.000 168.000 168.000 Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
