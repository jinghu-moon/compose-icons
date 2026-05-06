package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorThinIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 84h-36v-36c0-6.627-5.373-12-12-12h-128C33.373 36 28 41.373 28 48v128c0 2.209 1.791 4 4 4 .914-.001 1.8-.315 2.51-.89L73 148h3v36c0 6.627 5.373 12 12 12h95l38.49 31.11c.71 .575 1.596 .889 2.51 .89 2.209 0 4-1.791 4-4v-128c0-6.627-5.373-12-12-12ZM71.58 140c-.914 .001-1.8 .315-2.51 .89L36 167.62v-119.62c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4v88c0 2.209-1.791 4-4 4ZM220 215.62 186.93 188.89c-.71-.575-1.596-.889-2.51-.89h-96.42c-2.209 0-4-1.791-4-4v-36h84c6.627 0 12-5.373 12-12v-44h36c2.209 0 4 1.791 4 4Z"),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
