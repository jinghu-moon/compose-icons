package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Json: ImageVector
    get() {
        if (_json != null) return _json!!
        _json = tablerOutlineIcon(
            name = "Json",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.LineTo(23.0f, 16.0f),
                    PathNode.LineTo(23.0f, 8.0f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(16.10457f, 8.0f, 17.0f, 8.895431f, 17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(17.0f, 15.104569f, 16.10457f, 16.0f, 15.0f, 16.0f),
                    PathNode.CurveTo(13.895431f, 16.0f, 13.0f, 15.104569f, 13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 8.895431f, 13.895431f, 8.0f, 15.0f, 8.0f)
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
                    PathNode.MoveTo(1.0f, 8.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.LineTo(4.0f, 14.5f),
                    PathNode.CurveTo(4.0f, 15.328427f, 3.328427f, 16.0f, 2.5f, 16.0f),
                    PathNode.CurveTo(1.671573f, 16.0f, 1.0f, 15.328427f, 1.0f, 14.5f),
                    PathNode.LineTo(1.0f, 14.0f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 15.552285f, 7.447716f, 16.0f, 8.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.552285f, 16.0f, 10.0f, 15.552285f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 12.447715f, 9.552285f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(7.447716f, 12.0f, 7.0f, 11.552285f, 7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 8.447715f, 7.447716f, 8.0f, 8.0f, 8.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(9.552285f, 8.0f, 10.0f, 8.447715f, 10.0f, 9.0f)
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
        return _json!!
    }

private var _json: ImageVector? = null
