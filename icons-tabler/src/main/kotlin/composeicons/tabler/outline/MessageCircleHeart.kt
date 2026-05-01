package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleHeart: ImageVector
    get() {
        if (_messageCircleHeart != null) return _messageCircleHeart!!
        _messageCircleHeart = tablerOutlineIcon(
            name = "MessageCircleHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.59f, 19.88f),
                    PathNode.CurveTo(9.586843f, 19.73839f, 8.611839f, 19.441504f, 7.7f, 19.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(4.3f, 16.1f),
                    PathNode.CurveTo(1.976f, 12.663f, 2.874f, 8.228f, 6.4f, 5.726f),
                    PathNode.CurveTo(9.926f, 3.225f, 14.99f, 3.43f, 18.245f, 6.206f),
                    PathNode.CurveTo(19.81f, 7.541f, 20.724f, 9.271f, 20.955f, 11.067f)
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
                    PathNode.MoveTo(18.0f, 22.0f),
                    PathNode.LineTo(21.35f, 18.716f),
                    PathNode.CurveTo(21.765032f, 18.31326f, 21.999672f, 17.759872f, 22.000614f, 17.181555f),
                    PathNode.CurveTo(22.001554f, 16.603237f, 21.768719f, 16.04909f, 21.355f, 15.645f),
                    PathNode.CurveTo(20.486048f, 14.795191f, 19.098206f, 14.792529f, 18.226f, 15.639f),
                    PathNode.LineTo(18.002f, 15.859f),
                    PathNode.LineTo(17.779f, 15.639f),
                    PathNode.CurveTo(16.910172f, 14.78984f, 15.52308f, 14.787179f, 14.651f, 15.633f),
                    PathNode.CurveTo(14.235836f, 16.035604f, 14.001016f, 16.588917f, 13.999886f, 17.167234f),
                    PathNode.CurveTo(13.998755f, 17.745552f, 14.231412f, 18.299776f, 14.645f, 18.704f),
                    PathNode.LineTo(18.0f, 22.0f)
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
        return _messageCircleHeart!!
    }

private var _messageCircleHeart: ImageVector? = null
