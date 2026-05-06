package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorBoldIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.29 68.9C155.781 33.073 116.566 13.561 78.032 21.999 39.497 30.437 12.026 64.552 12 104v64c0 11.046 8.954 20 20 20h52.1c13.94 29.286 43.466 47.958 75.9 48h64c11.046 0 20-8.954 20-20v-64c.002-41.647-30.512-77.007-71.71-83.1ZM36 104C36 70.863 62.863 44 96 44c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60h-60ZM220 212h-60c-19.478-.023-37.739-9.477-49-25.37 43.248-7.812 73.146-47.663 68.55-91.37 24.21 8.344 40.456 31.133 40.45 56.74Z"),
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
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
