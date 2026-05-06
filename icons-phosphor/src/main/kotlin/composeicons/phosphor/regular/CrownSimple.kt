package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorRegularIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.9 73.6C224.467 70.447 216.72 72.001 212 77.39l-33.67 36.29L142.53 33.39c-.002-.033-.002-.067 0-.1C139.916 27.62 134.243 23.989 128 23.989c-6.243 0-11.916 3.631-14.53 9.301 .002 .033 .002 .067 0 .1L77.67 113.68 44 77.39C39.252 72.002 31.495 70.437 25.03 73.564 18.564 76.691 14.974 83.742 16.25 90.81c0 .11 0 .21 .07 .32L39 195c1.44 7.545 8.039 13.002 15.72 13h146.57c7.677-.003 14.27-5.459 15.71-13L239.68 91.13c0-.11 0-.21 .07-.32 1.301-7.081-2.334-14.149-8.85-17.21ZM201.35 191.68l-.06 .32h-146.58l-.06-.32L32 88l.14 .16 42 45.24c1.827 1.974 4.523 2.898 7.177 2.459 2.654-.439 4.909-2.182 6.003-4.639L128 40l40.69 91.25c1.094 2.457 3.349 4.2 6.003 4.639 2.654 .439 5.35-.485 7.177-2.459l42-45.24L224 88Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
