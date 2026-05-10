package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorFillIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 136v32c0 4.418-3.582 8-8 8-.527 .001-1.054-.052-1.57-.16L156 161v23.73l17.66 17.65c1.49 1.492 2.331 3.511 2.34 5.62v24c.005 2.663-1.316 5.153-3.522 6.643-2.206 1.49-5.01 1.785-7.478 .787L128 224.62 91 239.43c-2.468 .998-5.271 .704-7.478-.787C81.316 237.153 79.995 234.663 80 232v-24c-.002-2.122 .84-4.158 2.34-5.66L100 184.69v-23.69L25.57 175.84c-.516 .108-1.043 .161-1.57 .16-4.418 0-8-3.582-8-8v-32c-.002-3.031 1.709-5.803 4.42-7.16L100 89.06v-45.06c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v45.06l79.58 39.78c2.711 1.357 4.422 4.129 4.42 7.16Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
