package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorFillIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 152.000 C 192.000 160.837 184.837 168.000 176.000 168.000 C 167.163 168.000 160.000 160.837 160.000 152.000 C 160.000 143.163 167.163 136.000 176.000 136.000 C 184.837 136.000 192.000 143.163 192.000 152.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 128.000 80.000 C 128.000 75.582 124.418 72.000 120.000 72.000 C 115.582 72.000 112.000 75.582 112.000 80.000 L 112.000 112.000 L 72.000 112.000 L 72.000 80.000 C 72.000 75.582 68.418 72.000 64.000 72.000 C 59.582 72.000 56.000 75.582 56.000 80.000 L 56.000 160.000 C 56.000 164.418 59.582 168.000 64.000 168.000 C 68.418 168.000 72.000 164.418 72.000 160.000 L 72.000 128.000 L 112.000 128.000 L 112.000 160.000 C 112.000 164.418 115.582 168.000 120.000 168.000 C 124.418 168.000 128.000 164.418 128.000 160.000 ZM 208.000 152.000 C 208.000 134.327 193.673 120.000 176.000 120.000 L 187.550 100.000 C 189.759 96.173 188.447 91.279 184.620 89.070 C 180.793 86.861 175.899 88.173 173.690 92.000 L 148.290 136.000 L 148.150 136.270 C 141.539 147.952 142.922 162.518 151.612 172.748 C 160.302 182.977 174.453 186.697 187.050 182.062 C 199.647 177.427 208.013 165.423 208.000 152.000 Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
