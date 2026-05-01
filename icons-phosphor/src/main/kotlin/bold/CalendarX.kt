package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarX: ImageVector
    get() {
        if (_calendarX != null) return _calendarX!!
        _calendarX = phosphorBoldIcon(
            name = "CalendarX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.49f, 136.49f),
                    PathNode.LineTo(145.0f, 152.0f),
                    PathNode.LineTo(160.52f, 167.51f),
                    PathNode.CurveTo(165.21442f, 172.20442f, 165.21442f, 179.81558f, 160.52f, 184.51f),
                    PathNode.CurveTo(155.82558f, 189.20442f, 148.21442f, 189.20442f, 143.52f, 184.51f),
                    PathNode.LineTo(128.0f, 169.0f),
                    PathNode.LineTo(112.49f, 184.52f),
                    PathNode.CurveTo(107.79558f, 189.21442f, 100.18442f, 189.21442f, 95.49f, 184.52f),
                    PathNode.CurveTo(90.79558f, 179.82558f, 90.79558f, 172.21442f, 95.49f, 167.52f),
                    PathNode.LineTo(111.0f, 152.0f),
                    PathNode.LineTo(95.51f, 136.49f),
                    PathNode.CurveTo(90.81558f, 131.79558f, 90.81558f, 124.18442f, 95.51f, 119.49f),
                    PathNode.CurveTo(100.20442f, 114.79558f, 107.81558f, 114.79558f, 112.51f, 119.49f),
                    PathNode.LineTo(128.0f, 135.0f),
                    PathNode.LineTo(143.51f, 119.48f),
                    PathNode.CurveTo(148.20442f, 114.785576f, 155.81558f, 114.785576f, 160.51f, 119.48f),
                    PathNode.CurveTo(165.20442f, 124.17442f, 165.20442f, 131.78558f, 160.51f, 136.48f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 219.0457f, 219.0457f, 228.0f, 208.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(36.954304f, 228.0f, 28.0f, 219.0457f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 36.954304f, 36.954304f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(68.0f, 28.0f),
                    PathNode.LineTo(68.0f, 24.0f),
                    PathNode.CurveTo(68.0f, 17.372583f, 73.37258f, 12.0f, 80.0f, 12.0f),
                    PathNode.CurveTo(86.62742f, 12.0f, 92.0f, 17.372583f, 92.0f, 24.0f),
                    PathNode.LineTo(92.0f, 28.0f),
                    PathNode.LineTo(164.0f, 28.0f),
                    PathNode.LineTo(164.0f, 24.0f),
                    PathNode.CurveTo(164.0f, 17.372583f, 169.37259f, 12.0f, 176.0f, 12.0f),
                    PathNode.CurveTo(182.62741f, 12.0f, 188.0f, 17.372583f, 188.0f, 24.0f),
                    PathNode.LineTo(188.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.CurveTo(188.0f, 58.62742f, 182.62741f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(169.37259f, 64.0f, 164.0f, 58.62742f, 164.0f, 52.0f),
                    PathNode.LineTo(92.0f, 52.0f),
                    PathNode.CurveTo(92.0f, 58.62742f, 86.62742f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(73.37258f, 64.0f, 68.0f, 58.62742f, 68.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(52.0f, 204.0f),
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
        return _calendarX!!
    }

private var _calendarX: ImageVector? = null
