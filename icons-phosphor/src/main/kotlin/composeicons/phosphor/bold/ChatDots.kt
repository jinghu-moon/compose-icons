package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorBoldIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM152 144c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM236 64v128c0 11.046-8.954 20-20 20h-131.53L53 239.17l-.12 .11c-3.586 3.038-8.13 4.71-12.83 4.72-2.935-.007-5.832-.656-8.49-1.9C24.489 238.858 19.967 231.779 20 224v-160C20 52.954 28.954 44 40 44h176c11.046 0 20 8.954 20 20ZM212 68h-168v147.23L72.16 190.91C74.337 189.026 77.121 187.992 80 188h132Z"),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
