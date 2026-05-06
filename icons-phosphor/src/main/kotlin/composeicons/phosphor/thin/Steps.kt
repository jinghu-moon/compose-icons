package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorThinIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 56c0 2.209-1.791 4-4 4h-52v44c0 2.209-1.791 4-4 4h-52v44c0 2.209-1.791 4-4 4h-52v44c0 2.209-1.791 4-4 4h-56c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h52v-44c0-2.209 1.791-4 4-4h52v-44c0-2.209 1.791-4 4-4h52v-44c0-2.209 1.791-4 4-4h56c2.209 0 4 1.791 4 4Z"),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
