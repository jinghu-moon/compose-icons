package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorBoldIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.605934f, 29.427355f, 51.381508f, 28.000328f, 48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(212.74908f, 227.99954f, 217.05112f, 225.19836f, 218.97267f, 220.8554f),
                    PathNode.CurveTo(220.89423f, 216.5124f, 220.07376f, 211.4448f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 62.24f),
                    PathNode.LineTo(180.87f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 165.34f),
                    PathNode.CurveTo(228.0f, 171.96742f, 222.62741f, 177.34f, 216.0f, 177.34f),
                    PathNode.CurveTo(209.37259f, 177.34f, 204.0f, 171.96742f, 204.0f, 165.34f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(145.69f, 100.0f),
                    PathNode.CurveTo(139.06258f, 100.0f, 133.69f, 94.62742f, 133.69f, 88.0f),
                    PathNode.CurveTo(133.69f, 81.37258f, 139.06258f, 76.0f, 145.69f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.CurveTo(188.0f, 58.62742f, 182.62741f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(169.37259f, 64.0f, 164.0f, 58.62742f, 164.0f, 52.0f),
                    PathNode.LineTo(102.06f, 52.0f),
                    PathNode.CurveTo(95.43259f, 52.0f, 90.06f, 46.62742f, 90.06f, 40.0f),
                    PathNode.CurveTo(90.06f, 33.37258f, 95.43259f, 28.0f, 102.06f, 28.0f),
                    PathNode.LineTo(164.0f, 28.0f),
                    PathNode.LineTo(164.0f, 24.0f),
                    PathNode.CurveTo(164.0f, 17.372583f, 169.37259f, 12.0f, 176.0f, 12.0f),
                    PathNode.CurveTo(182.62741f, 12.0f, 188.0f, 17.372583f, 188.0f, 24.0f),
                    PathNode.LineTo(188.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
