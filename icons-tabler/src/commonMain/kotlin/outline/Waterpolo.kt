package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Waterpolo: ImageVector
    get() {
        if (_waterpolo != null) return _waterpolo!!
        _waterpolo = tablerOutlineIcon(
            name = "Waterpolo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.0f, 9.552285f, 12.447715f, 10.0f, 13.0f, 10.0f),
                    PathNode.CurveTo(13.552285f, 10.0f, 14.0f, 9.552285f, 14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 8.447715f, 13.552285f, 8.0f, 13.0f, 8.0f),
                    PathNode.CurveTo(12.447715f, 8.0f, 12.0f, 8.447715f, 12.0f, 9.0f)
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
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(12.5f, 13.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 18.75f),
                    PathNode.CurveTo(3.311293f, 18.904776f, 3.652494f, 18.990076f, 4.0f, 19.0f),
                    PathNode.CurveTo(4.790712f, 19.016563f, 5.538824f, 18.642508f, 6.0f, 18.0f),
                    PathNode.CurveTo(6.461177f, 17.357492f, 7.209288f, 16.983437f, 8.0f, 17.0f),
                    PathNode.CurveTo(8.790711f, 16.983437f, 9.538824f, 17.357492f, 10.0f, 18.0f),
                    PathNode.CurveTo(10.461176f, 18.642508f, 11.209289f, 19.016563f, 12.0f, 19.0f),
                    PathNode.CurveTo(12.790711f, 19.016563f, 13.538824f, 18.642508f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.461176f, 17.357492f, 15.209289f, 16.983437f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.790712f, 16.983437f, 17.538824f, 17.357492f, 18.0f, 18.0f),
                    PathNode.CurveTo(18.461176f, 18.642508f, 19.209288f, 19.016563f, 20.0f, 19.0f),
                    PathNode.CurveTo(20.347506f, 18.990076f, 20.688707f, 18.904776f, 21.0f, 18.75f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.5f, 13.0f)
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
                    PathNode.MoveTo(6.5f, 5.0f),
                    PathNode.CurveTo(6.776143f, 5.0f, 7.0f, 4.776143f, 7.0f, 4.5f),
                    PathNode.CurveTo(7.0f, 4.223858f, 6.776143f, 4.0f, 6.5f, 4.0f),
                    PathNode.CurveTo(6.223858f, 4.0f, 6.0f, 4.223858f, 6.0f, 4.5f),
                    PathNode.CurveTo(6.0f, 4.776143f, 6.223858f, 5.0f, 6.5f, 5.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waterpolo!!
    }

private var _waterpolo: ImageVector? = null
