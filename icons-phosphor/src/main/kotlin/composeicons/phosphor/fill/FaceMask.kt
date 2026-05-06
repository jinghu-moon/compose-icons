package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorFillIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 72h-.85c-1.532-4.636-5.097-8.318-9.68-10l-80-29c-3.534-1.28-7.406-1.28-10.94 0l-80 29.09c-4.583 1.682-8.148 5.364-9.68 10h-.85C14.362 72.09 .05 86.362 0 104v24c0 17.673 14.327 32 32 32h5.19c7.19 15.8 21.79 29.43 43.23 40.16 14.65 7.185 30.159 12.464 46.15 15.71 .945 .173 1.915 .173 2.86 0 15.991-3.246 31.5-8.525 46.15-15.71 21.44-10.73 36-24.36 43.23-40.16h5.19c17.673 0 32-14.327 32-32v-24C256 86.327 241.673 72 224 72ZM32 144c-8.837 0-16-7.163-16-16v-24C16 95.163 23.163 88 32 88v48c.001 2.676 .185 5.349 .55 8ZM168 144h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM168 112h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM240 128c0 8.837-7.163 16-16 16h-.55c.365-2.651 .549-5.324 .55-8v-48c8.837 0 16 7.163 16 16Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
