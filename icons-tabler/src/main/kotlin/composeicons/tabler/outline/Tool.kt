package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tool: ImageVector
    get() {
        if (_tool != null) return _tool!!
        _tool = tablerOutlineIcon(
            name = "Tool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(6.5f, 3.5f),
                    PathNode.CurveTo(8.794452f, 2.404188f, 11.530468f, 2.873614f, 13.328427f, 4.671573f),
                    PathNode.CurveTo(15.126386f, 6.469532f, 15.595812f, 9.205548f, 14.5f, 11.5f),
                    PathNode.LineTo(20.5f, 17.5f),
                    PathNode.CurveTo(21.328426f, 18.328426f, 21.328426f, 19.671574f, 20.5f, 20.5f),
                    PathNode.CurveTo(19.671574f, 21.328426f, 18.328426f, 21.328426f, 17.5f, 20.5f),
                    PathNode.LineTo(11.5f, 14.5f),
                    PathNode.CurveTo(9.205548f, 15.595812f, 6.469532f, 15.126386f, 4.671573f, 13.328427f),
                    PathNode.CurveTo(2.873614f, 11.530468f, 2.404188f, 8.794452f, 3.5f, 6.5f),
                    PathNode.LineTo(7.0f, 10.0f)
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
        return _tool!!
    }

private var _tool: ImageVector? = null
