package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorFillIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 136h-32v24c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737l-32-32C16.838 132.159 15.994 130.123 15.994 128c0-2.123 .844-4.159 2.346-5.66l32-32c2.288-2.291 5.731-2.976 8.722-1.737C62.053 89.842 64.003 92.762 64 96v24h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM96 64h24v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h24c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722l-32-32C132.159 16.838 130.123 15.994 128 15.994c-2.123 0-4.159 .844-5.66 2.346l-32 32c-2.291 2.288-2.976 5.731-1.737 8.722C89.842 62.053 92.762 64.003 96 64ZM237.66 122.34l-32-32c-2.288-2.291-5.731-2.976-8.722-1.737C193.947 89.842 191.997 92.762 192 96v24h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v24c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM160 192h-24v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-24c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l32 32c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c2.291-2.288 2.976-5.731 1.737-8.722C166.158 193.947 163.238 191.997 160 192Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
