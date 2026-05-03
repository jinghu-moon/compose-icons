package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) return _calendarCheck!!
        _calendarCheck = phosphorBoldIcon(
            name = "CalendarCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(188.0f, 28.0f),
                    PathNode.LineTo(188.0f, 24.0f),
                    PathNode.CurveTo(188.0f, 17.372583f, 182.62741f, 12.0f, 176.0f, 12.0f),
                    PathNode.CurveTo(169.37259f, 12.0f, 164.0f, 17.372583f, 164.0f, 24.0f),
                    PathNode.LineTo(164.0f, 28.0f),
                    PathNode.LineTo(92.0f, 28.0f),
                    PathNode.LineTo(92.0f, 24.0f),
                    PathNode.CurveTo(92.0f, 17.372583f, 86.62742f, 12.0f, 80.0f, 12.0f),
                    PathNode.CurveTo(73.37258f, 12.0f, 68.0f, 17.372583f, 68.0f, 24.0f),
                    PathNode.LineTo(68.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 52.0f),
                    PathNode.CurveTo(68.0f, 58.62742f, 73.37258f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(86.62742f, 64.0f, 92.0f, 58.62742f, 92.0f, 52.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.CurveTo(164.0f, 58.62742f, 169.37259f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(182.62741f, 64.0f, 188.0f, 58.62742f, 188.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.49f, 119.51f),
                    PathNode.CurveTo(174.74945f, 121.76162f, 176.01947f, 124.82018f, 176.01947f, 128.01f),
                    PathNode.CurveTo(176.01947f, 131.19981f, 174.74945f, 134.25838f, 172.49f, 136.51f),
                    PathNode.LineTo(124.49f, 184.51f),
                    PathNode.CurveTo(122.23838f, 186.76945f, 119.17982f, 188.03946f, 115.99f, 188.03946f),
                    PathNode.CurveTo(112.80018f, 188.03946f, 109.74162f, 186.76945f, 107.49f, 184.51f),
                    PathNode.LineTo(83.49f, 160.51f),
                    PathNode.CurveTo(78.79558f, 155.81558f, 78.79558f, 148.20442f, 83.49f, 143.51f),
                    PathNode.CurveTo(88.18442f, 138.81558f, 95.79558f, 138.81558f, 100.49f, 143.51f),
                    PathNode.LineTo(116.0f, 159.0f),
                    PathNode.LineTo(155.51f, 119.48f),
                    PathNode.CurveTo(157.7648f, 117.230644f, 160.82132f, 115.969925f, 164.00623f, 115.975555f),
                    PathNode.CurveTo(167.19113f, 115.98118f, 170.24316f, 117.25269f, 172.49f, 119.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
