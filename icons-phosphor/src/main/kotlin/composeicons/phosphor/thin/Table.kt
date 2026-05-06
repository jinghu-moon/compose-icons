package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = phosphorThinIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192c-2.209 0-4 1.791-4 4v136c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-136c0-2.209-1.791-4-4-4ZM36 108h48v40h-48ZM92 108h128v40h-128ZM220 60v40h-184v-40ZM36 192v-36h48v40h-44c-2.209 0-4-1.791-4-4ZM216 196h-124v-40h128v36c0 2.209-1.791 4-4 4Z"),
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
        return _table!!
    }

private var _table: ImageVector? = null
