package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Exchange: ImageVector
    get() {
        if (_exchange != null) return _exchange!!
        _exchange = tablerOutlineIcon(
            name = "Exchange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 19.10457f, 3.895431f, 20.0f, 5.0f, 20.0f),
                    PathNode.CurveTo(6.10457f, 20.0f, 7.0f, 19.10457f, 7.0f, 18.0f),
                    PathNode.CurveTo(7.0f, 16.89543f, 6.10457f, 16.0f, 5.0f, 16.0f),
                    PathNode.CurveTo(3.895431f, 16.0f, 3.0f, 16.89543f, 3.0f, 18.0f)
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
                    PathNode.MoveTo(17.0f, 6.0f),
                    PathNode.CurveTo(17.0f, 7.10457f, 17.89543f, 8.0f, 19.0f, 8.0f),
                    PathNode.CurveTo(20.10457f, 8.0f, 21.0f, 7.10457f, 21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 4.895431f, 20.10457f, 4.0f, 19.0f, 4.0f),
                    PathNode.CurveTo(17.89543f, 4.0f, 17.0f, 4.895431f, 17.0f, 6.0f)
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
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.0f, 15.761424f, 16.761423f, 18.0f, 14.0f, 18.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.MoveTo(14.0f, 21.0f),
                    PathNode.LineTo(11.0f, 18.0f)
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
                    PathNode.MoveTo(5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.CurveTo(5.0f, 8.238576f, 7.238577f, 6.0f, 10.0f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(10.0f, 3.0f),
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.LineTo(13.0f, 6.0f)
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
        return _exchange!!
    }

private var _exchange: ImageVector? = null
