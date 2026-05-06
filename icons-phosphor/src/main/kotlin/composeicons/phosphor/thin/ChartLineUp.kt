package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorThinIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 208c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v118.34L93.17 109.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L128 138.34 190.34 76h-30.34c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-30.34l-65.17 65.17c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L96 117.66l-60 60v26.34h188c2.209 0 4 1.791 4 4Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
