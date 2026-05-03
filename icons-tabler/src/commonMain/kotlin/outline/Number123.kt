package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number123: ImageVector
    get() {
        if (_number123 != null) return _number123!!
        _number123 = tablerOutlineIcon(
            name = "Number123",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.CurveTo(12.552285f, 8.0f, 13.0f, 8.447715f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 11.552285f, 12.552285f, 12.0f, 12.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(9.447715f, 12.0f, 9.0f, 12.447715f, 9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 15.552285f, 9.447715f, 16.0f, 10.0f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f)
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
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.LineTo(19.5f, 8.0f),
                    PathNode.CurveTo(20.328426f, 8.0f, 21.0f, 8.671573f, 21.0f, 9.5f),
                    PathNode.LineTo(21.0f, 10.5f),
                    PathNode.CurveTo(21.0f, 11.328427f, 20.328426f, 12.0f, 19.5f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(19.5f, 12.0f),
                    PathNode.CurveTo(20.328426f, 12.0f, 21.0f, 12.671573f, 21.0f, 13.5f),
                    PathNode.LineTo(21.0f, 14.5f),
                    PathNode.CurveTo(21.0f, 15.328427f, 20.328426f, 16.0f, 19.5f, 16.0f),
                    PathNode.LineTo(17.0f, 16.0f)
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
        return _number123!!
    }

private var _number123: ImageVector? = null
