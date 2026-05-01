package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.News: ImageVector
    get() {
        if (_news != null) return _news!!
        _news = tablerOutlineIcon(
            name = "News",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(19.552284f, 6.0f, 20.0f, 6.447716f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.10457f, 19.10457f, 20.0f, 18.0f, 20.0f),
                    PathNode.CurveTo(16.89543f, 20.0f, 16.0f, 19.10457f, 16.0f, 18.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 4.447716f, 15.552285f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.447716f, 4.0f, 4.0f, 4.447716f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 18.656855f, 5.343146f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f)
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
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
        return _news!!
    }

private var _news: ImageVector? = null
