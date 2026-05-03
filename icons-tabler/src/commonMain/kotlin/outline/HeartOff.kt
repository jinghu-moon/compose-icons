package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartOff: ImageVector
    get() {
        if (_heartOff != null) return _heartOff!!
        _heartOff = tablerOutlineIcon(
            name = "HeartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
                    PathNode.MoveTo(19.5f, 12.572f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(4.5f, 12.572f),
                    PathNode.CurveTo(3.151115f, 11.259679f, 2.653356f, 9.301107f, 3.212f, 7.504f),
                    PathNode.CurveTo(3.528501f, 6.501402f, 4.154434f, 5.624816f, 5.0f, 5.0f),
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.CurveTo(9.56f, 4.0f, 11.05f, 4.727f, 12.0f, 6.0f),
                    PathNode.CurveTo(13.127275f, 4.500787f, 14.998826f, 3.758613f, 16.847204f, 4.077817f),
                    PathNode.CurveTo(18.695583f, 4.39702f, 20.209822f, 5.723897f, 20.768993f, 7.514349f),
                    PathNode.CurveTo(21.328163f, 9.304801f, 20.838194f, 11.257607f, 19.5f, 12.572f)
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
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
