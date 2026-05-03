package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) return _textAlignCenter!!
        _textAlignCenter = phosphorBoldIcon(
            name = "TextAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 ZM 64.000 92.000 C 57.373 92.000 52.000 97.373 52.000 104.000 C 52.000 110.627 57.373 116.000 64.000 116.000 L 192.000 116.000 C 198.627 116.000 204.000 110.627 204.000 104.000 C 204.000 97.373 198.627 92.000 192.000 92.000 ZM 216.000 132.000 L 40.000 132.000 C 33.373 132.000 28.000 137.373 28.000 144.000 C 28.000 150.627 33.373 156.000 40.000 156.000 L 216.000 156.000 C 222.627 156.000 228.000 150.627 228.000 144.000 C 228.000 137.373 222.627 132.000 216.000 132.000 ZM 192.000 172.000 L 64.000 172.000 C 57.373 172.000 52.000 177.373 52.000 184.000 C 52.000 190.627 57.373 196.000 64.000 196.000 L 192.000 196.000 C 198.627 196.000 204.000 190.627 204.000 184.000 C 204.000 177.373 198.627 172.000 192.000 172.000 Z"),
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
        return _textAlignCenter!!
    }

private var _textAlignCenter: ImageVector? = null
