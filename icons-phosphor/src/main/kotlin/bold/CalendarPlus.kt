package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarPlus: ImageVector
    get() {
        if (_calendarPlus != null) return _calendarPlus!!
        _calendarPlus = phosphorBoldIcon(
            name = "CalendarPlus",
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
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 158.62741f, 158.62741f, 164.0f, 152.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 182.62741f, 134.62741f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(121.37258f, 188.0f, 116.0f, 182.62741f, 116.0f, 176.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(104.0f, 164.0f),
                    PathNode.CurveTo(97.37258f, 164.0f, 92.0f, 158.62741f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 145.37259f, 97.37258f, 140.0f, 104.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(152.0f, 140.0f),
                    PathNode.CurveTo(158.62741f, 140.0f, 164.0f, 145.37259f, 164.0f, 152.0f),
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
        return _calendarPlus!!
    }

private var _calendarPlus: ImageVector? = null
