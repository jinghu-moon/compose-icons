package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarDots: ImageVector
    get() {
        if (_calendarDots != null) return _calendarDots!!
        _calendarDots = phosphorBoldIcon(
            name = "CalendarDots",
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
                    PathNode.MoveTo(144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 136.83656f, 184.83656f, 144.0f, 176.0f, 144.0f),
                    PathNode.CurveTo(167.16344f, 144.0f, 160.0f, 136.83656f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 119.163445f, 167.16344f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(184.83656f, 112.0f, 192.0f, 119.163445f, 192.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 176.0f),
                    PathNode.CurveTo(96.0f, 184.83656f, 88.836555f, 192.0f, 80.0f, 192.0f),
                    PathNode.CurveTo(71.163445f, 192.0f, 64.0f, 184.83656f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 167.16344f, 71.163445f, 160.0f, 80.0f, 160.0f),
                    PathNode.CurveTo(88.836555f, 160.0f, 96.0f, 167.16344f, 96.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 184.83656f, 136.83656f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(119.163445f, 192.0f, 112.0f, 184.83656f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 167.16344f, 119.163445f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(136.83656f, 160.0f, 144.0f, 167.16344f, 144.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 184.83656f, 184.83656f, 192.0f, 176.0f, 192.0f),
                    PathNode.CurveTo(167.16344f, 192.0f, 160.0f, 184.83656f, 160.0f, 176.0f),
                    PathNode.CurveTo(160.0f, 167.16344f, 167.16344f, 160.0f, 176.0f, 160.0f),
                    PathNode.CurveTo(184.83656f, 160.0f, 192.0f, 167.16344f, 192.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _calendarDots!!
    }

private var _calendarDots: ImageVector? = null
