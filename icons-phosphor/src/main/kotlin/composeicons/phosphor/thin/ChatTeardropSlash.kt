package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorThinIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L60.62 59.83C44.726 77.419 35.95 100.294 36 124v84c0 6.627 5.373 12 12 12h84c20.558-.022 40.57-6.621 57.11-18.83L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM132 212h-84c-2.209 0-4-1.791-4-4v-84C43.947 102.549 51.776 81.827 66 65.77L183.7 195.21C168.705 206.19 150.585 212.075 132 212ZM228 124c.015 17.474-4.75 34.62-13.78 49.58-.714 1.276-2.066 2.06-3.528 2.047-1.462-.014-2.799-.823-3.489-2.112-.69-1.289-.622-2.851 .177-4.075C227.498 136.124 223.343 93.551 197.163 64.754 170.982 35.957 128.996 27.777 93.92 44.64c-1.294 .663-2.846 .572-4.054-.238-1.208-.81-1.88-2.212-1.757-3.661 .123-1.449 1.023-2.717 2.35-3.311C103.414 31.183 117.618 27.958 132 28c52.994 .061 95.939 43.006 96 96Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
