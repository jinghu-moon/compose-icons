package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorThinIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M67.79 62.74C67.241 61.114 65.716 60.019 64 60.019c-1.716 0-3.241 1.095-3.79 2.721l-40 120c-.404 1.218-.199 2.557 .551 3.598 .75 1.042 1.955 1.66 3.239 1.662h80c1.284-.002 2.488-.62 3.239-1.662 .75-1.042 .955-2.38 .551-3.598ZM29.55 180 64 76.65 98.45 180ZM204 76C204 49.49 182.51 28 156 28c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.498-.028 47.972-21.502 48-48ZM116 76c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40C133.909 116 116 98.091 116 76ZM224 148h-88c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4h88c2.209 0 4-1.791 4-4v-56c0-2.209-1.791-4-4-4ZM220 204h-80v-48h80Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
