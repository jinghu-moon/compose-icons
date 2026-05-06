package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorBoldIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 108c0 6.627-5.373 12-12 12h-68c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h68c6.627 0 12 5.373 12 12ZM164 136h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM236 124c-.061 57.412-46.588 103.939-104 104h-84C36.954 228 28 219.046 28 208v-84C28 66.562 74.562 20 132 20c57.438 0 104 46.562 104 104ZM212 124C212 79.817 176.183 44 132 44 87.817 44 52 79.817 52 124v80h80c44.162-.05 79.95-35.838 80-80Z"),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
