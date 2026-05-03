package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarOffRoad: ImageVector
    get() {
        if (_carOffRoad != null) return _carOffRoad!!
        _carOffRoad = tablerOutlineIcon(
            name = "CarOffRoad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f)
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.10457f, 8.10457f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(5.895431f, 19.0f, 5.0f, 18.10457f, 5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 15.895431f, 5.895431f, 15.0f, 7.0f, 15.0f),
                    PathNode.CurveTo(8.10457f, 15.0f, 9.0f, 15.895431f, 9.0f, 17.0f)
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
                    PathNode.MoveTo(19.0f, 17.0f),
                    PathNode.CurveTo(19.0f, 18.10457f, 18.10457f, 19.0f, 17.0f, 19.0f),
                    PathNode.CurveTo(15.895431f, 19.0f, 15.0f, 18.10457f, 15.0f, 17.0f),
                    PathNode.CurveTo(15.0f, 15.895431f, 15.895431f, 15.0f, 17.0f, 15.0f),
                    PathNode.CurveTo(18.10457f, 15.0f, 19.0f, 15.895431f, 19.0f, 17.0f)
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
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(15.0f, 7.0f)
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
                    PathNode.MoveTo(19.0f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 10.895431f, 20.10457f, 10.0f, 19.0f, 10.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.LineTo(11.414f, 12.0f),
                    PathNode.CurveTo(11.148806f, 11.999944f, 10.894493f, 11.894549f, 10.707f, 11.707f),
                    PathNode.LineTo(9.586f, 10.586f),
                    PathNode.CurveTo(9.211015f, 10.210901f, 8.70239f, 10.000113f, 8.172f, 10.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(3.447715f, 10.0f, 3.0f, 10.447715f, 3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(5.0f, 17.0f)
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
        return _carOffRoad!!
    }

private var _carOffRoad: ImageVector? = null
