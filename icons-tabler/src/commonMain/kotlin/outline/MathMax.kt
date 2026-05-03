package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathMax: ImageVector
    get() {
        if (_mathMax != null) return _mathMax!!
        _mathMax = tablerOutlineIcon(
            name = "MathMax",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 7.10457f, 5.895431f, 8.0f, 7.0f, 8.0f),
                    PathNode.CurveTo(8.10457f, 8.0f, 9.0f, 7.10457f, 9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 4.895431f, 8.10457f, 4.0f, 7.0f, 4.0f),
                    PathNode.CurveTo(5.895431f, 4.0f, 5.0f, 4.895431f, 5.0f, 6.0f)
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
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 15.0f, 3.616f, 9.456f, 5.332f, 7.07f)
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
                    PathNode.MoveTo(8.637f, 7.112f),
                    PathNode.CurveTo(11.354f, 10.425f, 14.519f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(19.0f, 20.0f, 20.333f, 17.0f, 21.0f, 11.0f)
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
        return _mathMax!!
    }

private var _mathMax: ImageVector? = null
