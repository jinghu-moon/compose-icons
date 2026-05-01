package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleOff: ImageVector
    get() {
        if (_messageCircleOff != null) return _messageCircleOff!!
        _messageCircleOff = tablerOutlineIcon(
            name = "MessageCircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.595f, 4.577f),
                    PathNode.CurveTo(11.818f, 3.401f, 15.62f, 3.967f, 18.245f, 6.207f),
                    PathNode.CurveTo(21.227f, 8.75f, 21.846f, 12.73f, 19.881f, 15.867f),
                    PathNode.MoveTo(17.973f, 17.976f),
                    PathNode.CurveTo(15.186f, 20.166f, 11.083f, 20.642f, 7.7f, 19.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(4.3f, 16.1f),
                    PathNode.CurveTo(2.071f, 12.804f, 2.806f, 8.589f, 5.98f, 6.043f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _messageCircleOff!!
    }

private var _messageCircleOff: ImageVector? = null
