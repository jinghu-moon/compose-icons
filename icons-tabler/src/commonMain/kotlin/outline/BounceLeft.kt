package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BounceLeft: ImageVector
    get() {
        if (_bounceLeft != null) return _bounceLeft!!
        _bounceLeft = tablerOutlineIcon(
            name = "BounceLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 15.5f),
                    PathNode.CurveTo(17.0f, 14.5f, 14.5f, 15.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(11.5f, 17.0f, 10.5f, 14.5f, 9.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.CurveTo(4.895431f, 9.0f, 4.0f, 8.10457f, 4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 5.895431f, 4.895431f, 5.0f, 6.0f, 5.0f),
                    PathNode.CurveTo(7.10457f, 5.0f, 8.0f, 5.895431f, 8.0f, 7.0f),
                    PathNode.CurveTo(8.0f, 8.10457f, 7.10457f, 9.0f, 6.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bounceLeft!!
    }

private var _bounceLeft: ImageVector? = null
