package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorThinIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M202.83 58.83l-144 144c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l144-144c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM68 112c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36ZM224 180h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
