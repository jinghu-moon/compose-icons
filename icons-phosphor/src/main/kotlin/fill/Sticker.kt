package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorFillIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 32.000 L 88.000 32.000 C 57.086 32.033 32.033 57.086 32.000 88.000 L 32.000 168.000 C 32.033 198.914 57.086 223.967 88.000 224.000 L 136.000 224.000 C 136.860 223.999 137.714 223.861 138.530 223.590 C 164.760 214.840 214.840 164.760 223.590 138.530 C 223.861 137.714 223.999 136.860 224.000 136.000 L 224.000 88.000 C 223.967 57.086 198.914 32.033 168.000 32.000 ZM 136.000 207.420 L 136.000 176.000 C 136.000 153.909 153.909 136.000 176.000 136.000 L 207.420 136.000 C 198.160 157.550 157.550 198.160 136.000 207.420 Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
