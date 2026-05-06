package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorDuotoneIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 56h-64L128 24ZM128 232l32-32h-64Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 144h-160c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72v32h-24c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l32 32c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c2.291-2.288 2.976-5.731 1.737-8.722C166.158 193.947 163.238 191.997 160 192h-24v-32h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 220.69 115.31 208h25.38ZM48 112h160c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-72v-32h24c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722l-32-32C132.159 16.838 130.123 15.994 128 15.994c-2.123 0-4.159 .844-5.66 2.346l-32 32c-2.291 2.288-2.976 5.731-1.737 8.722C89.842 62.053 92.762 64.003 96 64h24v32h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM128 35.31 140.69 48h-25.38Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
