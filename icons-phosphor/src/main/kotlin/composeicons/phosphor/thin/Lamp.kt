package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorThinIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.68 150.42l-48-112C195.048 36.95 193.6 35.998 192 36h-128c-1.6-.002-3.048 .95-3.68 2.42l-48 112c-.532 1.237-.406 2.658 .336 3.782 .741 1.124 1.998 1.8 3.344 1.798h108v56h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-56h64v36c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h36c1.346 .002 2.603-.674 3.344-1.798 .741-1.124 .867-2.545 .336-3.782ZM22.07 148 66.64 44h122.72l44.57 104Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
