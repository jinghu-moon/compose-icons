package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorThinIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 40c0 2.209-1.791 4-4 4h-29.29c-13.535-0-25.133 9.682-27.55 23l-10.37 57h51.21c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-52.66l-10.63 58.44C117.598 207.558 102.689 220 85.29 220h-29.29c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h29.29c13.535 0 25.133-9.682 27.55-23l10.37-57h-51.21c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h52.66L135.29 65.56C138.402 48.442 153.311 36 170.71 36h29.29c2.209 0 4 1.791 4 4Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
