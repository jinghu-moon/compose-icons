package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorThinIcon(
            name = "UniteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 92h-52v-52c0-2.209-1.791-4-4-4h-120c-2.209 0-4 1.791-4 4v120c0 2.209 1.791 4 4 4h52v52c0 2.209 1.791 4 4 4h120c2.209 0 4-1.791 4-4v-120c0-2.209-1.791-4-4-4ZM153.66 212 44 102.34v-52.68L206.34 212ZM49.66 44h52.68L212 153.66v52.68ZM212 142.34 169.66 100h42.34ZM156 86.34 113.66 44h42.34ZM44 113.66 86.34 156h-42.34ZM100 169.66 142.34 212h-42.34Z"),
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
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null
