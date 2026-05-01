package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JoinBevel: ImageVector
    get() {
        if (_joinBevel != null) return _joinBevel!!
        _joinBevel = tablerOutlineIcon(
            name = "JoinBevel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(10.104569f, 4.0f, 11.0f, 4.895431f, 11.0f, 6.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 12.552285f, 11.447715f, 13.0f, 12.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(19.10457f, 13.0f, 20.0f, 13.895431f, 20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.10457f, 19.10457f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(11.414f, 20.0f),
                    PathNode.CurveTo(11.148806f, 19.999943f, 10.894493f, 19.89455f, 10.707f, 19.707f),
                    PathNode.LineTo(4.293f, 13.293f),
                    PathNode.CurveTo(4.105451f, 13.105507f, 4.000057f, 12.851194f, 4.0f, 12.586f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 4.895431f, 4.895431f, 4.0f, 6.0f, 4.0f)
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
        return _joinBevel!!
    }

private var _joinBevel: ImageVector? = null
