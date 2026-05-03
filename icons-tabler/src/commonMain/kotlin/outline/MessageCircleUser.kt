package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleUser: ImageVector
    get() {
        if (_messageCircleUser != null) return _messageCircleUser!!
        _messageCircleUser = tablerOutlineIcon(
            name = "MessageCircleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.CurveTo(17.0f, 18.10457f, 17.89543f, 19.0f, 19.0f, 19.0f),
                    PathNode.CurveTo(20.10457f, 19.0f, 21.0f, 18.10457f, 21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 15.895431f, 20.10457f, 15.0f, 19.0f, 15.0f),
                    PathNode.CurveTo(17.89543f, 15.0f, 17.0f, 15.895431f, 17.0f, 17.0f)
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
                    PathNode.MoveTo(22.0f, 22.0f),
                    PathNode.CurveTo(22.0f, 20.89543f, 21.10457f, 20.0f, 20.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(16.89543f, 20.0f, 16.0f, 20.89543f, 16.0f, 22.0f)
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
                    PathNode.MoveTo(12.454f, 19.97f),
                    PathNode.CurveTo(10.813406f, 20.046003f, 9.179676f, 19.712658f, 7.7f, 19.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(4.3f, 16.1f),
                    PathNode.CurveTo(1.976f, 12.663f, 2.874f, 8.228f, 6.4f, 5.726f),
                    PathNode.CurveTo(9.926f, 3.225f, 14.99f, 3.43f, 18.245f, 6.206f),
                    PathNode.CurveTo(19.912f, 7.629f, 20.841f, 9.5f, 20.992f, 11.422f)
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
        return _messageCircleUser!!
    }

private var _messageCircleUser: ImageVector? = null
