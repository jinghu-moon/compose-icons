package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = tablerOutlineIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.CurveTo(20.552284f, 11.0f, 21.0f, 11.447715f, 21.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.5f),
                    PathNode.CurveTo(21.0f, 14.0f, 18.483f, 18.073f, 17.0f, 19.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.0f, 20.552284f, 16.552284f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(7.447716f, 21.0f, 7.0f, 20.552284f, 7.0f, 20.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(5.313f, 17.946f, 3.0f, 14.0f, 3.0f, 12.5f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 11.447715f, 3.447715f, 11.0f, 4.0f, 11.0f)
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
                    PathNode.MoveTo(18.5f, 11.0f),
                    PathNode.CurveTo(18.851f, 9.983f, 18.926f, 8.764f, 19.0f, 7.286f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.LineTo(16.744f, 6.0f),
                    PathNode.CurveTo(13.914f, 6.0f, 12.128f, 6.804f, 11.104f, 8.076f)
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
                    PathNode.MoveTo(5.255f, 11.008f),
                    PathNode.CurveTo(5.114544f, 10.346883f, 5.029251f, 9.67524f, 5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(6.755f, 8.0f),
                    PathNode.CurveTo(7.735f, 8.0f, 8.556f, 8.124f, 9.234f, 8.350001f)
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
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(13.0f, 6.5f)
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
                    PathNode.MoveTo(13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 10.5f),
                    PathNode.CurveTo(13.0f, 9.119288f, 11.880712f, 8.0f, 10.5f, 8.0f),
                    PathNode.CurveTo(9.119288f, 8.0f, 8.0f, 9.119288f, 8.0f, 10.5f),
                    PathNode.LineTo(8.0f, 11.0f)
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
        return _salad!!
    }

private var _salad: ImageVector? = null
