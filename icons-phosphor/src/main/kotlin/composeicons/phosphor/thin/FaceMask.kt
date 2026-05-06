package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorThinIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 104c0 2.209-1.791 4-4 4h-80c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4ZM168 132h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM252 104v24c0 15.464-12.536 28-28 28h-7.84c-6.41 16-20.74 29.76-42.37 40.58-14.308 7.018-29.454 12.18-45.07 15.36-.477 .08-.963 .08-1.44 0C111.664 208.76 96.518 203.598 82.21 196.58 60.58 185.76 46.25 172 39.84 156h-7.84C16.536 156 4 143.464 4 128v-24C4 88.536 16.536 76 32 76h4.06c.42-4.628 3.474-8.598 7.84-10.19l80-29.09c2.649-.963 5.551-.963 8.2 0l80 29.09c4.366 1.592 7.42 5.562 7.84 10.19h4.06c15.464 0 28 12.536 28 28ZM37.35 148C36.45 144.063 35.997 140.038 36 136v-52h-4C20.954 84 12 92.954 12 104v24c0 11.046 8.954 20 20 20ZM212 136v-58.91c.001-1.682-1.05-3.184-2.63-3.76l-80-29.09c-.885-.323-1.855-.323-2.74 0L46.63 73.33c-1.58 .576-2.631 2.078-2.63 3.76v58.91c0 49.42 75.76 66.24 84 67.92 8.24-1.68 84-18.5 84-67.92ZM244 104C244 92.954 235.046 84 224 84h-4v52c.003 4.038-.45 8.063-1.35 12h5.35c11.046 0 20-8.954 20-20Z"),
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
