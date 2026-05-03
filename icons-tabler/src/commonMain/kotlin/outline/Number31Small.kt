package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number31Small: ImageVector
    get() {
        if (_number31Small != null) return _number31Small!!
        _number31Small = tablerOutlineIcon(
            name = "Number31Small",
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
                    PathNode.MoveTo(7.0f, 8.0f),
                    PathNode.LineTo(9.5f, 8.0f),
                    PathNode.CurveTo(10.328427f, 8.0f, 11.0f, 8.671573f, 11.0f, 9.5f),
                    PathNode.LineTo(11.0f, 10.5f),
                    PathNode.CurveTo(11.0f, 11.328427f, 10.328427f, 12.0f, 9.5f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(9.5f, 12.0f),
                    PathNode.CurveTo(10.328427f, 12.0f, 11.0f, 12.671573f, 11.0f, 13.5f),
                    PathNode.LineTo(11.0f, 14.5f),
                    PathNode.CurveTo(11.0f, 15.328427f, 10.328427f, 16.0f, 9.5f, 16.0f),
                    PathNode.LineTo(7.0f, 16.0f)
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
        return _number31Small!!
    }

private var _number31Small: ImageVector? = null
