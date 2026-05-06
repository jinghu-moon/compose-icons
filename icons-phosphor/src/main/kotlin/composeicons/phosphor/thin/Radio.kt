package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorThinIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 168c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM96 132h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM228 80v112c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-120c.009-1.758 1.166-3.304 2.85-3.81L190.85 20.19c2.095-.576 4.267 .625 4.892 2.706 .625 2.081-.526 4.281-2.592 4.954L59.25 68h156.75c6.627 0 12 5.373 12 12ZM220 80c0-2.209-1.791-4-4-4h-180v116c0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4ZM196 136c0 19.882-16.118 36-36 36-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36ZM188 136c0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM96 100h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
