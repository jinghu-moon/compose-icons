package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MessageChatbot: ImageVector
    get() {
        if (_messageChatbot != null) return _messageChatbot!!
        _messageChatbot = tablerFilledIcon(
            name = "MessageChatbot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(20.209139f, 3.0f, 22.0f, 4.790861f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 17.209139f, 20.209139f, 19.0f, 18.0f, 19.0f),
                    PathNode.LineTo(13.276f, 19.0f),
                    PathNode.LineTo(8.514f, 21.857f),
                    PathNode.CurveTo(8.222594f, 22.031878f, 7.862316f, 22.046787f, 7.557458f, 21.896582f),
                    PathNode.CurveTo(7.2526f, 21.746376f, 7.044896f, 21.45162f, 7.006f, 21.114f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(3.868599f, 19.000002f, 2.11157f, 17.328735f, 2.005f, 15.2f),
                    PathNode.LineTo(2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 4.790861f, 3.790861f, 3.0f, 6.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.2f, 12.286f),
                    PathNode.CurveTo(14.805646f, 11.899457f, 14.172624f, 11.905725f, 13.786f, 12.3f),
                    PathNode.CurveTo(13.315757f, 12.780097f, 12.672028f, 13.050656f, 12.0f, 13.050656f),
                    PathNode.CurveTo(11.327972f, 13.050656f, 10.684243f, 12.780097f, 10.214f, 12.3f),
                    PathNode.CurveTo(9.825724f, 11.915112f, 9.200322f, 11.913386f, 8.809928f, 12.296126f),
                    PathNode.CurveTo(8.419534f, 12.678865f, 8.408875f, 13.304179f, 8.786f, 13.7f),
                    PathNode.CurveTo(9.63238f, 14.563676f, 10.790747f, 15.050364f, 12.0f, 15.050364f),
                    PathNode.CurveTo(13.209253f, 15.050364f, 14.36762f, 14.563676f, 15.214f, 13.7f),
                    PathNode.CurveTo(15.600543f, 13.305646f, 15.594275f, 12.672624f, 15.2f, 12.286f),
                    PathNode.MoveTo(9.51f, 8.0f),
                    PathNode.LineTo(9.5f, 8.0f),
                    PathNode.CurveTo(8.947715f, 8.0f, 8.5f, 8.447715f, 8.5f, 9.0f),
                    PathNode.CurveTo(8.5f, 9.552285f, 8.947715f, 10.0f, 9.5f, 10.0f),
                    PathNode.LineTo(9.51f, 10.0f),
                    PathNode.CurveTo(10.062284f, 10.0f, 10.51f, 9.552285f, 10.51f, 9.0f),
                    PathNode.CurveTo(10.51f, 8.447715f, 10.062284f, 8.0f, 9.51f, 8.0f),
                    PathNode.MoveTo(14.51f, 8.0f),
                    PathNode.LineTo(14.5f, 8.0f),
                    PathNode.CurveTo(13.947715f, 8.0f, 13.5f, 8.447715f, 13.5f, 9.0f),
                    PathNode.CurveTo(13.5f, 9.552285f, 13.947715f, 10.0f, 14.5f, 10.0f),
                    PathNode.LineTo(14.51f, 10.0f),
                    PathNode.CurveTo(15.062284f, 10.0f, 15.51f, 9.552285f, 15.51f, 9.0f),
                    PathNode.CurveTo(15.51f, 8.447715f, 15.062284f, 8.0f, 14.51f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _messageChatbot!!
    }

private var _messageChatbot: ImageVector? = null
