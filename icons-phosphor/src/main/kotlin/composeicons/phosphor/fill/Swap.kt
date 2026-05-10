package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorFillIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v104c0 8.837-7.163 16-16 16h-96v16c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737l-24-24C72.838 164.159 71.994 162.123 71.994 160c0-2.123 .844-4.159 2.346-5.66l24-24c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397v16h96v-104h-112v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8C80 39.163 87.163 32 96 32h112c8.837 0 16 7.163 16 16ZM168 192c-4.418 0-8 3.582-8 8v8h-112v-104h96v16c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l24-24c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-24-24c-2.288-2.291-5.731-2.976-8.722-1.737C145.947 65.842 143.997 68.762 144 72v16h-96c-8.837 0-16 7.163-16 16v104c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-8c0-4.418-3.582-8-8-8Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
