package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = tablerFilledIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.864f, 3.549f),
                    PathNode.LineTo(15.41f, 21.417f),
                    PathNode.CurveTo(15.156989f, 21.9678f, 14.606132f, 22.320583f, 14.0f, 22.32f),
                    PathNode.CurveTo(13.405601f, 22.322105f, 12.863056f, 21.981947f, 12.606f, 21.446f),
                    PathNode.LineTo(9.726f, 15.687f),
                    PathNode.Close,
                    PathNode.MoveTo(20.45f, 2.135f),
                    PathNode.LineTo(8.311f, 14.273f),
                    PathNode.LineTo(2.583f, 11.409f),
                    PathNode.CurveTo(2.032529f, 11.15614f, 1.679807f, 10.605769f, 1.68f, 10.0f),
                    PathNode.CurveTo(1.68f, 9.394f, 2.033f, 8.843f, 2.661f, 8.56f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _send!!
    }

private var _send: ImageVector? = null
