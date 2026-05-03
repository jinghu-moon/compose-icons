package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorFillIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.460 144.000 L 184.000 119.130 L 184.000 144.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 128.000 80.000 C 128.000 75.582 124.418 72.000 120.000 72.000 C 115.582 72.000 112.000 75.582 112.000 80.000 L 112.000 112.000 L 72.000 112.000 L 72.000 80.000 C 72.000 75.582 68.418 72.000 64.000 72.000 C 59.582 72.000 56.000 75.582 56.000 80.000 L 56.000 160.000 C 56.000 164.418 59.582 168.000 64.000 168.000 C 68.418 168.000 72.000 164.418 72.000 160.000 L 72.000 128.000 L 112.000 128.000 L 112.000 160.000 C 112.000 164.418 115.582 168.000 120.000 168.000 C 124.418 168.000 128.000 164.418 128.000 160.000 ZM 212.000 152.000 C 212.000 147.582 208.418 144.000 204.000 144.000 L 200.000 144.000 L 200.000 96.000 C 199.999 92.590 197.836 89.556 194.614 88.442 C 191.391 87.328 187.817 88.379 185.710 91.060 L 141.710 147.060 C 139.820 149.468 139.469 152.744 140.808 155.497 C 142.146 158.251 144.938 159.999 148.000 160.000 L 184.000 160.000 L 184.000 176.000 C 184.000 180.418 187.582 184.000 192.000 184.000 C 196.418 184.000 200.000 180.418 200.000 176.000 L 200.000 160.000 L 204.000 160.000 C 208.418 160.000 212.000 156.418 212.000 152.000 Z"),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
