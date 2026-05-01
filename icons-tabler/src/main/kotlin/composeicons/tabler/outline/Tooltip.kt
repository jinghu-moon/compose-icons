package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tooltip: ImageVector
    get() {
        if (_tooltip != null) return _tooltip!!
        _tooltip = tablerOutlineIcon(
            name = "Tooltip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 18.0f),
                    PathNode.CurveTo(10.0f, 19.10457f, 10.895431f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(13.104569f, 20.0f, 14.0f, 19.10457f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 16.89543f, 13.104569f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(10.895431f, 16.0f, 10.0f, 16.89543f, 10.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(10.293f, 11.293f),
                    PathNode.CurveTo(10.105507f, 11.105451f, 9.851194f, 11.000056f, 9.586f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(5.895431f, 11.0f, 5.0f, 10.104569f, 5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 4.895431f, 5.895431f, 4.0f, 7.0f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(18.10457f, 4.0f, 19.0f, 4.895431f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 10.104569f, 18.10457f, 11.0f, 17.0f, 11.0f),
                    PathNode.LineTo(14.414f, 11.0f),
                    PathNode.CurveTo(14.148806f, 11.000056f, 13.894493f, 11.105451f, 13.707f, 11.293f),
                    PathNode.LineTo(12.0f, 13.0f)
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
        return _tooltip!!
    }

private var _tooltip: ImageVector? = null
