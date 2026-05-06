package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorThinIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 80v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-105.23L83.77 209.4c-.586 1.561-2.078 2.595-3.745 2.595-1.667 0-3.159-1.034-3.745-2.595L28.28 81.4c-.515-1.341-.271-2.855 .638-3.967 .91-1.112 2.345-1.65 3.762-1.411 1.416 .239 2.596 1.219 3.09 2.568L80 196.61l44.26-118c.58-1.565 2.071-2.606 3.74-2.61h112c2.209 0 4 1.791 4 4Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
