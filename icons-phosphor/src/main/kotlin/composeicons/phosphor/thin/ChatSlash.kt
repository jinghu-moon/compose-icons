package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorThinIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L53.5 52h-13.5C33.373 52 28 57.373 28 64v160c-.029 4.673 2.682 8.93 6.93 10.88 1.589 .736 3.319 1.118 5.07 1.12 2.838-.011 5.581-1.028 7.74-2.87L81.49 204h110.19L205 218.69c.767 .845 1.859 1.321 3 1.31 1.59 .016 3.039-.912 3.69-2.363 .651-1.451 .38-3.15-.69-4.327ZM80 196c-.962 .009-1.889 .364-2.61 1L42.57 227c-1.182 .991-2.829 1.215-4.232 .574C36.935 226.933 36.025 225.542 36 224v-160c0-2.209 1.791-4 4-4h20.78L184.41 196ZM228 64v122c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-122c0-2.209-1.791-4-4-4h-110.21c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h110.21c6.627 0 12 5.373 12 12Z"),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
