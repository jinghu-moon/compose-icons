package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorThinIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166.76 76.32C153.434 42.316 117.804 22.599 81.914 29.368 46.025 36.137 20.025 67.478 20 104v64c0 6.627 5.373 12 12 12h57.33c11.514 28.955 39.51 47.97 70.67 48h64c6.627 0 12-5.373 12-12v-64C235.99 112.653 205.951 79.82 166.76 76.32ZM28 168v-64C28 66.445 58.445 36 96 36c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68h-64c-2.209 0-4-1.791-4-4ZM228 216c0 2.209-1.791 4-4 4h-64c-26.721-.028-50.961-15.666-62-40 23.212-.609 44.873-11.797 58.805-30.373 13.933-18.576 18.609-42.502 12.695-64.957C203.051 89.404 227.998 118.116 228 152Z"),
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
