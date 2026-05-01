package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarOff: ImageVector
    get() {
        if (_carOff != null) return _carOff!!
        _carOff = tablerOutlineIcon(
            name = "CarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.10457f, 5.895431f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(8.10457f, 19.0f, 9.0f, 18.10457f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 15.895431f, 8.10457f, 15.0f, 7.0f, 15.0f),
                    PathNode.CurveTo(5.895431f, 15.0f, 5.0f, 15.895431f, 5.0f, 17.0f)
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
                    PathNode.MoveTo(15.584f, 15.588f),
                    PathNode.CurveTo(14.802517f, 16.36893f, 14.80207f, 17.635517f, 15.583f, 18.417f),
                    PathNode.CurveTo(16.36393f, 19.198483f, 17.630518f, 19.19893f, 18.412f, 18.418f)
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
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(20.10457f, 11.0f, 21.0f, 11.895431f, 21.0f, 13.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.MoveTo(15.0f, 17.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 6.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _carOff!!
    }

private var _carOff: ImageVector? = null
