package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = tablerOutlineIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.816f, 13.58f),
                    PathNode.CurveTo(21.108f, 15.718f, 22.362f, 17.58f, 21.908f, 18.48f),
                    PathNode.CurveTo(21.163f, 19.94f, 16.125f, 18.221f, 10.653f, 14.642f),
                    PathNode.CurveTo(5.183f, 11.063f, 1.349f, 6.978f, 2.093f, 5.519f),
                    PathNode.CurveTo(2.557f, 4.609f, 5.019f, 5.075f, 7.896f, 6.324f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 15.865993f, 8.134007f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(15.865993f, 19.0f, 19.0f, 15.865993f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 8.134007f, 15.865993f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(8.134007f, 5.0f, 5.0f, 8.134007f, 5.0f, 12.0f)
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
        return _planet!!
    }

private var _planet: ImageVector? = null
