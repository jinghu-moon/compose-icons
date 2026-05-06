package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) return _squareHalfBottom!!
        _squareHalfBottom = phosphorThinIcon(
            name = "SquareHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 44h-144C49.373 44 44 49.373 44 56v144c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM56 52h144c2.209 0 4 1.791 4 4v68h-152v-68c0-2.209 1.791-4 4-4ZM108 132v72h-24v-72ZM116 132h24v72h-24ZM148 132h24v72h-24ZM52 200v-68h24v72h-20c-2.209 0-4-1.791-4-4ZM200 204h-20v-72h24v68c0 2.209-1.791 4-4 4Z"),
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
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null
