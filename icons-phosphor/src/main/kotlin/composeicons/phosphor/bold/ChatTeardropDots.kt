package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) return _chatTeardropDots!!
        _chatTeardropDots = phosphorBoldIcon(
            name = "ChatTeardropDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 20C74.588 20.061 28.061 66.588 28 124v84c0 11.046 8.954 20 20 20h84c57.438 0 104-46.562 104-104C236 66.562 189.438 20 132 20ZM132 204h-80v-80C52 79.817 87.817 44 132 44c44.183 0 80 35.817 80 80 0 44.183-35.817 80-80 80ZM124 128c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM172 128c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
