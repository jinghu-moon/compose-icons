package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorBoldIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 47.49c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-52 52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l52-52c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM252 58.41c.039 14.444-5.701 28.303-15.94 38.49l-53.23 53.23c-3.739 3.768-8.832 5.882-14.14 5.87h-12.69v12.83c-.009 4.36-1.434 8.599-4.06 12.08-.33 .435-.691 .846-1.08 1.23l-8 8c-7.81 7.808-20.47 7.808-28.28 0L98.7 174.26 24.49 248.48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L81.71 157.26 65.86 141.41h0c-3.752-3.751-5.861-8.839-5.861-14.145 0-5.306 2.108-10.394 5.861-14.145l8-8c.386-.403 .8-.777 1.24-1.12 3.484-2.606 7.72-4.009 12.07-4h12.83v-12.7c-.014-5.31 2.096-10.405 5.86-14.15L159.09 19.92C174.658 4.358 198.066-.295 218.402 8.13c20.336 8.425 33.596 28.268 33.598 50.28ZM228 58.41C227.998 46.105 220.586 35.012 209.218 30.302c-11.368-4.71-24.454-2.11-33.158 6.588L124 89v15c0 11.046-8.954 20-20 20h-15.06l-3.28 3.28 21.52 21.53h0l21.53 21.52 3.28-3.28v-15.05c0-11.046 8.954-20 20-20h15L219.05 79.93c5.739-5.689 8.962-13.439 8.95-21.52Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
