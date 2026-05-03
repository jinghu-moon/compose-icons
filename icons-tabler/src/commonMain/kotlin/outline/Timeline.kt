package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Timeline: ImageVector
    get() {
        if (_timeline != null) return _timeline!!
        _timeline = tablerOutlineIcon(
            name = "Timeline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 16.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 14.552285f, 14.447715f, 15.0f, 15.0f, 15.0f),
                    PathNode.CurveTo(15.552285f, 15.0f, 16.0f, 14.552285f, 16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 13.447715f, 15.552285f, 13.0f, 15.0f, 13.0f),
                    PathNode.CurveTo(14.447715f, 13.0f, 14.0f, 13.447715f, 14.0f, 14.0f)
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
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(9.0f, 9.552285f, 9.447715f, 10.0f, 10.0f, 10.0f),
                    PathNode.CurveTo(10.552285f, 10.0f, 11.0f, 9.552285f, 11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 8.447715f, 10.552285f, 8.0f, 10.0f, 8.0f),
                    PathNode.CurveTo(9.447715f, 8.0f, 9.0f, 8.447715f, 9.0f, 9.0f)
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
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 16.552284f, 3.447715f, 17.0f, 4.0f, 17.0f),
                    PathNode.CurveTo(4.552285f, 17.0f, 5.0f, 16.552284f, 5.0f, 16.0f),
                    PathNode.CurveTo(5.0f, 15.447715f, 4.552285f, 15.0f, 4.0f, 15.0f),
                    PathNode.CurveTo(3.447715f, 15.0f, 3.0f, 15.447715f, 3.0f, 16.0f)
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
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 8.552285f, 19.447716f, 9.0f, 20.0f, 9.0f),
                    PathNode.CurveTo(20.552284f, 9.0f, 21.0f, 8.552285f, 21.0f, 8.0f),
                    PathNode.CurveTo(21.0f, 7.447716f, 20.552284f, 7.0f, 20.0f, 7.0f),
                    PathNode.CurveTo(19.447716f, 7.0f, 19.0f, 7.447716f, 19.0f, 8.0f)
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
        return _timeline!!
    }

private var _timeline: ImageVector? = null
