package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemplateOff: ImageVector
    get() {
        if (_templateOff != null) return _templateOff!!
        _templateOff = tablerOutlineIcon(
            name = "TemplateOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.552284f, 4.0f, 20.0f, 4.447716f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(20.0f, 7.552285f, 19.552284f, 8.0f, 19.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.CurveTo(4.447716f, 8.0f, 4.0f, 7.552285f, 4.0f, 7.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 4.729f, 4.108f, 4.483f, 4.283f, 4.303f)
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
                    PathNode.MoveTo(4.0f, 13.0f),
                    PathNode.CurveTo(4.0f, 12.447715f, 4.447716f, 12.0f, 5.0f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.552285f, 12.0f, 10.0f, 12.447715f, 10.0f, 13.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 19.552284f, 9.552285f, 20.0f, 9.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(4.447716f, 20.0f, 4.0f, 19.552284f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 13.0f)
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(14.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f)
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
        return _templateOff!!
    }

private var _templateOff: ImageVector? = null
