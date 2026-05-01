package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number91Small: ImageVector
    get() {
        if (_number91Small != null) return _number91Small!!
        _number91Small = tablerOutlineIcon(
            name = "Number91Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(16.0f, 8.0f),
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 15.552285f, 7.447716f, 16.0f, 8.0f, 16.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.552285f, 16.0f, 11.0f, 15.552285f, 11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 8.447715f, 10.552285f, 8.0f, 10.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.CurveTo(7.447716f, 8.0f, 7.0f, 8.447715f, 7.0f, 9.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(7.0f, 11.552285f, 7.447716f, 12.0f, 8.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f)
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
        return _number91Small!!
    }

private var _number91Small: ImageVector? = null
