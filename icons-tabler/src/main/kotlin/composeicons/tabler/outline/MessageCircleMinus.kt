package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleMinus: ImageVector
    get() {
        if (_messageCircleMinus != null) return _messageCircleMinus!!
        _messageCircleMinus = tablerOutlineIcon(
            name = "MessageCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.023f, 19.98f),
                    PathNode.CurveTo(10.526336f, 19.985325f, 9.048059f, 19.65021f, 7.7f, 19.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(4.3f, 16.1f),
                    PathNode.CurveTo(1.976f, 12.663f, 2.874f, 8.228f, 6.4f, 5.726f),
                    PathNode.CurveTo(9.926f, 3.225f, 14.99f, 3.43f, 18.245f, 6.206f),
                    PathNode.CurveTo(20.963f, 8.525f, 21.718f, 12.038f, 20.341f, 15.017f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
        return _messageCircleMinus!!
    }

private var _messageCircleMinus: ImageVector? = null
