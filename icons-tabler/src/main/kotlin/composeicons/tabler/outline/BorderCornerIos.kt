package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderCornerIos: ImageVector
    get() {
        if (_borderCornerIos != null) return _borderCornerIos!!
        _borderCornerIos = tablerOutlineIcon(
            name = "BorderCornerIos",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.CurveTo(4.0f, 13.441f, 4.0f, 10.162f, 5.628f, 7.838f),
                    PathNode.CurveTo(6.23014f, 6.978082f, 6.978082f, 6.23014f, 7.838f, 5.628f),
                    PathNode.CurveTo(10.162f, 4.0f, 13.44f, 4.0f, 20.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _borderCornerIos!!
    }

private var _borderCornerIos: ImageVector? = null
