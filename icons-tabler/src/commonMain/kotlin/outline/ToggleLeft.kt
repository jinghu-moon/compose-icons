package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = tablerOutlineIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 13.104569f, 6.895431f, 14.0f, 8.0f, 14.0f),
                    PathNode.CurveTo(9.104569f, 14.0f, 10.0f, 13.104569f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 10.895431f, 9.104569f, 10.0f, 8.0f, 10.0f),
                    PathNode.CurveTo(6.895431f, 10.0f, 6.0f, 10.895431f, 6.0f, 12.0f)
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
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 8.686292f, 4.686292f, 6.0f, 8.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.CurveTo(19.31371f, 6.0f, 22.0f, 8.686292f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 15.313708f, 19.31371f, 18.0f, 16.0f, 18.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.CurveTo(4.686292f, 18.0f, 2.0f, 15.313708f, 2.0f, 12.0f)
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
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
