package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorBoldIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 71.163445f, 75.163445f, 64.0f, 84.0f, 64.0f),
                    PathNode.CurveTo(92.836555f, 64.0f, 100.0f, 71.163445f, 100.0f, 80.0f),
                    PathNode.CurveTo(100.0f, 88.836555f, 92.836555f, 96.0f, 84.0f, 96.0f),
                    PathNode.CurveTo(75.163445f, 96.0f, 68.0f, 88.836555f, 68.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 71.163445f, 163.16344f, 64.0f, 172.0f, 64.0f),
                    PathNode.CurveTo(180.83656f, 64.0f, 188.0f, 71.163445f, 188.0f, 80.0f),
                    PathNode.CurveTo(188.0f, 88.836555f, 180.83656f, 96.0f, 172.0f, 96.0f),
                    PathNode.CurveTo(163.16344f, 96.0f, 156.0f, 88.836555f, 156.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 192.0f),
                    PathNode.LineTo(180.0f, 192.0f),
                    PathNode.CurveTo(186.62741f, 192.0f, 192.0f, 186.62741f, 192.0f, 180.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(192.0f, 113.37258f, 186.62741f, 108.0f, 180.0f, 108.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.CurveTo(69.37258f, 108.0f, 64.0f, 113.37258f, 64.0f, 120.0f),
                    PathNode.LineTo(64.0f, 180.0f),
                    PathNode.CurveTo(64.0f, 186.62741f, 69.37258f, 192.0f, 76.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 132.0f),
                    PathNode.LineTo(168.0f, 132.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
