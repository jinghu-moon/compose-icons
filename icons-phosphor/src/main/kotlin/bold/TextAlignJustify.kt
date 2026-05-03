package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAlignJustify: ImageVector
    get() {
        if (_textAlignJustify != null) return _textAlignJustify!!
        _textAlignJustify = phosphorBoldIcon(
            name = "TextAlignJustify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 ZM 216.000 92.000 L 40.000 92.000 C 33.373 92.000 28.000 97.373 28.000 104.000 C 28.000 110.627 33.373 116.000 40.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 110.627 228.000 104.000 C 228.000 97.373 222.627 92.000 216.000 92.000 ZM 216.000 132.000 L 40.000 132.000 C 33.373 132.000 28.000 137.373 28.000 144.000 C 28.000 150.627 33.373 156.000 40.000 156.000 L 216.000 156.000 C 222.627 156.000 228.000 150.627 228.000 144.000 C 228.000 137.373 222.627 132.000 216.000 132.000 ZM 216.000 172.000 L 40.000 172.000 C 33.373 172.000 28.000 177.373 28.000 184.000 C 28.000 190.627 33.373 196.000 40.000 196.000 L 216.000 196.000 C 222.627 196.000 228.000 190.627 228.000 184.000 C 228.000 177.373 222.627 172.000 216.000 172.000 Z"),
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
        return _textAlignJustify!!
    }

private var _textAlignJustify: ImageVector? = null
