package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorRegularIcon(
            name = "UniteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 152v-56c0-4.418-3.582-8-8-8h-48v-48c0-4.418-3.582-8-8-8h-120c-4.418 0-8 3.582-8 8v64h0v56c0 4.418 3.582 8 8 8h48v48c0 4.418 3.582 8 8 8h120c4.418 0 8-3.582 8-8v-64ZM155.31 208 48 100.69v-41.38L196.69 208ZM59.31 48h41.38L208 155.31v41.38ZM208 132.69 179.31 104h28.69ZM152 76.69 123.31 48h28.69ZM48 123.31 76.69 152h-28.69ZM104 179.31 132.69 208h-28.69Z"),
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
