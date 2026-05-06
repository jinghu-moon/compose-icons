package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorThinIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 204h-12v-164c0-2.209-1.791-4-4-4h-56c-2.209 0-4 1.791-4 4v44h-52c-2.209 0-4 1.791-4 4v44h-44c-2.209 0-4 1.791-4 4v68h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM156 44h48v160h-48ZM100 92h48v112h-48ZM52 140h40v64h-40Z"),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
