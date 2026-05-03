package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number66Small: ImageVector
    get() {
        if (_number66Small != null) return _number66Small!!
        _number66Small = tablerOutlineIcon(
            name = "Number66Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 8.447715f, 17.552284f, 8.0f, 17.0f, 8.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.CurveTo(14.447715f, 8.0f, 14.0f, 8.447715f, 14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.0f, 15.552285f, 14.447715f, 16.0f, 15.0f, 16.0f),
                    PathNode.LineTo(17.0f, 16.0f),
                    PathNode.CurveTo(17.552284f, 16.0f, 18.0f, 15.552285f, 18.0f, 15.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(18.0f, 12.447715f, 17.552284f, 12.0f, 17.0f, 12.0f),
                    PathNode.LineTo(14.0f, 12.0f)
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
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 8.447715f, 9.552285f, 8.0f, 9.0f, 8.0f),
                    PathNode.LineTo(7.0f, 8.0f),
                    PathNode.CurveTo(6.447716f, 8.0f, 6.0f, 8.447715f, 6.0f, 9.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 15.552285f, 6.447716f, 16.0f, 7.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.552285f, 16.0f, 10.0f, 15.552285f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 12.447715f, 9.552285f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f)
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
        return _number66Small!!
    }

private var _number66Small: ImageVector? = null
