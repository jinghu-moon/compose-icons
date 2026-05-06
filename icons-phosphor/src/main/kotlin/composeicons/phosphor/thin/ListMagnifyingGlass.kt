package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorThinIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 64c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM40 132h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM128 188h-88c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h88c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM234.83 194.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L206.45 172.11c-14.95 11.946-36.628 10.134-49.387-4.129-12.759-14.263-12.154-36.008 1.378-49.54 13.532-13.532 35.277-14.136 49.54-1.378 14.263 12.759 16.075 34.437 4.129 49.387l22.72 22.72c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83ZM184 172c15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28Z"),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
