package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorRegularIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.000 L 200.940 128.000 L 172.940 72.000 L 192.000 72.000 C 196.418 72.000 200.000 68.418 200.000 64.000 C 200.000 59.582 196.418 56.000 192.000 56.000 L 64.000 56.000 C 59.582 56.000 56.000 59.582 56.000 64.000 C 56.000 68.418 59.582 72.000 64.000 72.000 L 83.060 72.000 L 55.060 128.000 L 8.000 128.000 C 3.582 128.000 0.000 131.582 0.000 136.000 C 0.000 140.418 3.582 144.000 8.000 144.000 L 47.060 144.000 L 24.840 188.420 C 22.867 192.372 24.469 197.175 28.420 199.150 C 29.530 199.711 30.756 200.002 32.000 200.000 C 35.035 200.006 37.812 198.294 39.170 195.580 L 64.940 144.000 L 191.060 144.000 L 216.840 195.580 C 218.197 198.291 220.969 200.002 224.000 200.000 C 225.240 200.001 226.463 199.710 227.570 199.150 C 231.521 197.175 233.123 192.372 231.150 188.420 L 208.940 144.000 L 248.000 144.000 C 252.418 144.000 256.000 140.418 256.000 136.000 C 256.000 131.582 252.418 128.000 248.000 128.000 ZM 72.940 128.000 L 100.940 72.000 L 155.060 72.000 L 183.060 128.000 Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
