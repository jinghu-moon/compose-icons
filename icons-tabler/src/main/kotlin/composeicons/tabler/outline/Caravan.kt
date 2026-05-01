package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = tablerOutlineIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 18.0f),
                    PathNode.CurveTo(7.0f, 19.10457f, 7.895431f, 20.0f, 9.0f, 20.0f),
                    PathNode.CurveTo(10.104569f, 20.0f, 11.0f, 19.10457f, 11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 16.89543f, 10.104569f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(7.895431f, 16.0f, 7.0f, 16.89543f, 7.0f, 18.0f)
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
                    PathNode.MoveTo(11.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(19.10457f, 18.0f, 20.0f, 17.10457f, 20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 7.895431f, 19.10457f, 7.0f, 18.0f, 7.0f),
                    PathNode.LineTo(8.5f, 7.0f),
                    PathNode.CurveTo(5.462434f, 7.0f, 3.0f, 9.462434f, 3.0f, 12.5f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.10457f, 3.895431f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(7.0f, 18.0f)
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
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.LineTo(16.0f, 7.0f)
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
                    PathNode.MoveTo(13.0f, 11.5f),
                    PathNode.CurveTo(13.0f, 11.223858f, 13.223858f, 11.0f, 13.5f, 11.0f),
                    PathNode.LineTo(15.5f, 11.0f),
                    PathNode.CurveTo(15.776142f, 11.0f, 16.0f, 11.223858f, 16.0f, 11.5f),
                    PathNode.LineTo(16.0f, 13.5f),
                    PathNode.CurveTo(16.0f, 13.776142f, 15.776142f, 14.0f, 15.5f, 14.0f),
                    PathNode.LineTo(13.5f, 14.0f),
                    PathNode.CurveTo(13.223858f, 14.0f, 13.0f, 13.776142f, 13.0f, 13.5f),
                    PathNode.LineTo(13.0f, 11.5f)
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
                    PathNode.MoveTo(20.0f, 16.0f),
                    PathNode.LineTo(22.0f, 16.0f)
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
        return _caravan!!
    }

private var _caravan: ImageVector? = null
