package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartDots: ImageVector
    get() {
        if (_chartDots != null) return _chartDots!!
        _chartDots = tablerOutlineIcon(
            name = "ChartDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(3.0f, 21.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 10.104569f, 7.895431f, 11.0f, 9.0f, 11.0f),
                    PathNode.CurveTo(10.104569f, 11.0f, 11.0f, 10.104569f, 11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 7.895431f, 10.104569f, 7.0f, 9.0f, 7.0f),
                    PathNode.CurveTo(7.895431f, 7.0f, 7.0f, 7.895431f, 7.0f, 9.0f)
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
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 8.10457f, 17.89543f, 9.0f, 19.0f, 9.0f),
                    PathNode.CurveTo(20.10457f, 9.0f, 21.0f, 8.10457f, 21.0f, 7.0f),
                    PathNode.CurveTo(21.0f, 5.895431f, 20.10457f, 5.0f, 19.0f, 5.0f),
                    PathNode.CurveTo(17.89543f, 5.0f, 17.0f, 5.895431f, 17.0f, 7.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(12.0f, 16.10457f, 12.895431f, 17.0f, 14.0f, 17.0f),
                    PathNode.CurveTo(15.104569f, 17.0f, 16.0f, 16.10457f, 16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 13.895431f, 15.104569f, 13.0f, 14.0f, 13.0f),
                    PathNode.CurveTo(12.895431f, 13.0f, 12.0f, 13.895431f, 12.0f, 15.0f)
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
                    PathNode.MoveTo(10.16f, 10.62f),
                    PathNode.LineTo(12.5f, 13.5f)
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
                    PathNode.MoveTo(15.088f, 13.328f),
                    PathNode.LineTo(17.925f, 8.742f)
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
        return _chartDots!!
    }

private var _chartDots: ImageVector? = null
