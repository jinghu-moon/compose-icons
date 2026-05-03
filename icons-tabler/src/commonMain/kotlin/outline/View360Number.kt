package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Number: ImageVector
    get() {
        if (_view360Number != null) return _view360Number!!
        _view360Number = tablerOutlineIcon(
            name = "View360Number",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 5.447716f, 13.552285f, 5.0f, 13.0f, 5.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.CurveTo(10.447715f, 5.0f, 10.0f, 5.447716f, 10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 12.552285f, 10.447715f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.552285f, 13.0f, 14.0f, 12.552285f, 14.0f, 12.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 9.447715f, 13.552285f, 9.0f, 13.0f, 9.0f),
                    PathNode.LineTo(10.0f, 9.0f)
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.LineTo(5.5f, 5.0f),
                    PathNode.CurveTo(6.328428f, 5.0f, 7.0f, 5.671573f, 7.0f, 6.5f),
                    PathNode.LineTo(7.0f, 7.5f),
                    PathNode.CurveTo(7.0f, 8.328428f, 6.328428f, 9.0f, 5.5f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.LineTo(5.5f, 9.0f),
                    PathNode.CurveTo(6.328428f, 9.0f, 7.0f, 9.671573f, 7.0f, 10.5f),
                    PathNode.LineTo(7.0f, 11.5f),
                    PathNode.CurveTo(7.0f, 12.328427f, 6.328428f, 13.0f, 5.5f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f)
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
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.0f, 12.104569f, 17.89543f, 13.0f, 19.0f, 13.0f),
                    PathNode.CurveTo(20.10457f, 13.0f, 21.0f, 12.104569f, 21.0f, 11.0f),
                    PathNode.LineTo(21.0f, 7.0f),
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
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.657f, 7.03f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(16.97f, 19.0f, 21.0f, 17.657f, 21.0f, 16.0f)
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
        return _view360Number!!
    }

private var _view360Number: ImageVector? = null
