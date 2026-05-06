package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorDuotoneIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 152v64c0 4.418-3.582 8-8 8h-64c-30.519 .008-57.727-19.227-67.9-48h3.9c39.764 0 72-32.236 72-72h0c.005-8.133-1.371-16.208-4.07-23.88h0C202.106 82.207 231.993 113.767 232 152Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M169.57 72.59C154.644 37.646 117.197 18.022 79.969 25.636 42.742 33.251 16.007 66.002 16 104v64c0 8.837 7.163 16 16 16h54.67c12.756 29.131 41.529 47.965 73.33 48h64c8.837 0 16-7.163 16-16v-64C239.992 111.525 209.755 77.432 169.57 72.59ZM32 104C32 68.654 60.654 40 96 40c35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64h-64ZM224 216h-64c-23.037-.026-44.291-12.405-55.68-32.43 22.151-2.299 42.339-13.734 55.699-31.552 13.36-17.817 18.681-40.401 14.681-62.308C203.59 96.528 224.001 122.316 224 152Z"),
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
