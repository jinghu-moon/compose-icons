package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number23Small: ImageVector
    get() {
        if (_number23Small != null) return _number23Small!!
        _number23Small = tablerOutlineIcon(
            name = "Number23Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.LineTo(16.5f, 8.0f),
                    PathNode.CurveTo(17.328426f, 8.0f, 18.0f, 8.671573f, 18.0f, 9.5f),
                    PathNode.LineTo(18.0f, 10.5f),
                    PathNode.CurveTo(18.0f, 11.328427f, 17.328426f, 12.0f, 16.5f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(16.5f, 12.0f),
                    PathNode.CurveTo(17.328426f, 12.0f, 18.0f, 12.671573f, 18.0f, 13.5f),
                    PathNode.LineTo(18.0f, 14.5f),
                    PathNode.CurveTo(18.0f, 15.328427f, 17.328426f, 16.0f, 16.5f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(9.552285f, 8.0f, 10.0f, 8.447715f, 10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 11.552285f, 9.552285f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(6.447716f, 12.0f, 6.0f, 12.447715f, 6.0f, 13.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 15.552285f, 6.447716f, 16.0f, 7.0f, 16.0f),
                    PathNode.LineTo(10.0f, 16.0f)
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
        return _number23Small!!
    }

private var _number23Small: ImageVector? = null
