package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorThinIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 96v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v44h44c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4ZM96 156h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h44v44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM208 156h-48c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-44h44c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM96 44c-2.209 0-4 1.791-4 4v44h-44c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
