package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorBoldIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 185.080 114.460 C 196.857 100.117 199.310 80.270 191.381 63.490 C 183.451 46.711 166.559 36.007 148.000 36.000 L 80.000 36.000 C 73.373 36.000 68.000 41.373 68.000 48.000 L 68.000 200.000 C 68.000 206.627 73.373 212.000 80.000 212.000 L 160.000 212.000 C 183.723 211.990 204.432 195.925 210.340 172.949 C 216.248 149.973 205.856 125.912 185.080 114.460 ZM 92.000 60.000 L 148.000 60.000 C 161.255 60.000 172.000 70.745 172.000 84.000 C 172.000 97.255 161.255 108.000 148.000 108.000 L 92.000 108.000 ZM 160.000 188.000 L 92.000 188.000 L 92.000 132.000 L 160.000 132.000 C 175.464 132.000 188.000 144.536 188.000 160.000 C 188.000 175.464 175.464 188.000 160.000 188.000 Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
