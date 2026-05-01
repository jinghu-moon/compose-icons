package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) return _bookmark!!
        _bookmark = tablerFilledIcon(
            name = "Bookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(16.761423f, 2.0f, 19.0f, 4.238577f, 19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(19.000055f, 21.368887f, 18.797022f, 21.707846f, 18.471766f, 21.881874f),
                    PathNode.CurveTo(18.14651f, 22.055902f, 17.751858f, 22.036732f, 17.445f, 21.832f),
                    PathNode.LineTo(12.0f, 18.202f),
                    PathNode.LineTo(6.556f, 21.832f),
                    PathNode.CurveTo(6.265777f, 22.026232f, 5.895251f, 22.054993f, 5.578531f, 21.907871f),
                    PathNode.CurveTo(5.261812f, 21.76075f, 5.044784f, 21.45906f, 5.006f, 21.112f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 4.238577f, 7.238577f, 2.0f, 10.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
