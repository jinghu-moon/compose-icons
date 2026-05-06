package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorDuotoneIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 180.94v19.06c0 4.418-3.582 8-8 8h-75.94L34.34 94.28C32.743 92.672 31.902 90.461 32.028 88.198c.126-2.263 1.206-4.367 2.972-5.788L112 24c0 30.928 25.072 56 56 56v29.39c.008 21.222 12.01 40.616 31 50.09l28.62 14.31c2.692 1.366 4.386 4.131 4.38 7.15Z"),
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
                pathData = parseSvgPathData("M231.16 166.63 202.53 152.32C186.228 144.236 175.939 127.587 176 109.39v-29.39c0-4.418-3.582-8-8-8C141.502 71.972 120.028 50.498 120 24c-.003-3.036-1.723-5.808-4.442-7.158-2.719-1.35-5.968-1.045-8.388 .788L30.13 76l-.2 .16c-3.524 2.854-5.671 7.07-5.908 11.599-.236 4.529 1.46 8.945 4.668 12.151L142.4 213.66c1.502 1.5 3.538 2.342 5.66 2.34h75.94c8.837 0 16-7.163 16-16v-19.06c.019-6.064-3.408-11.613-8.84-14.31ZM224 200h-72.63L40 88.63 52.87 78.87l38.79 38.79c3.126 3.131 8.199 3.136 11.33 .01 3.131-3.126 3.136-8.199 .01-11.33L65.74 69.11l40-30.31c6.207 25.933 27.81 45.322 54.26 48.7v21.89c-.081 24.264 13.64 46.463 35.38 57.24L224 180.94ZM70.8 184h-38.8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h38.8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM110.8 208c0 4.418-3.582 8-8 8h-54.8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h54.8c4.418 0 8 3.582 8 8Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
