package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleCode: ImageVector
    get() {
        if (_messageCircleCode != null) return _messageCircleCode!!
        _messageCircleCode = tablerOutlineIcon(
            name = "MessageCircleCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.036f, 19.933f),
                    PathNode.CurveTo(9.877413f, 19.822598f, 8.747763f, 19.506662f, 7.7f, 19.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(4.3f, 16.1f),
                    PathNode.CurveTo(1.976f, 12.663f, 2.874f, 8.228f, 6.4f, 5.726f),
                    PathNode.CurveTo(9.926f, 3.225f, 14.99f, 3.43f, 18.245f, 6.206f),
                    PathNode.CurveTo(20.373f, 8.021f, 21.298f, 10.567f, 20.939f, 13.016f)
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
                    PathNode.MoveTo(20.0f, 21.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.LineTo(20.0f, 17.0f)
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
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
        return _messageCircleCode!!
    }

private var _messageCircleCode: ImageVector? = null
