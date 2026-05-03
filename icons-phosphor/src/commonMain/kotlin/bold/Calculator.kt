package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = phosphorBoldIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 28.954306f, 211.0457f, 20.0f, 200.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(196.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 76.0f),
                    PathNode.CurveTo(80.0f, 69.37258f, 85.37258f, 64.0f, 92.0f, 64.0f),
                    PathNode.LineTo(164.0f, 64.0f),
                    PathNode.CurveTo(170.62741f, 64.0f, 176.0f, 69.37258f, 176.0f, 76.0f),
                    PathNode.CurveTo(176.0f, 82.62742f, 170.62741f, 88.0f, 164.0f, 88.0f),
                    PathNode.LineTo(92.0f, 88.0f),
                    PathNode.CurveTo(85.37258f, 88.0f, 80.0f, 82.62742f, 80.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 136.83656f, 112.836555f, 144.0f, 104.0f, 144.0f),
                    PathNode.CurveTo(95.163445f, 144.0f, 88.0f, 136.83656f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 119.163445f, 95.163445f, 112.0f, 104.0f, 112.0f),
                    PathNode.CurveTo(112.836555f, 112.0f, 120.0f, 119.163445f, 120.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 136.83656f, 160.83656f, 144.0f, 152.0f, 144.0f),
                    PathNode.CurveTo(143.16344f, 144.0f, 136.0f, 136.83656f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 119.163445f, 143.16344f, 112.0f, 152.0f, 112.0f),
                    PathNode.CurveTo(160.83656f, 112.0f, 168.0f, 119.163445f, 168.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 184.83656f, 112.836555f, 192.0f, 104.0f, 192.0f),
                    PathNode.CurveTo(95.163445f, 192.0f, 88.0f, 184.83656f, 88.0f, 176.0f),
                    PathNode.CurveTo(88.0f, 167.16344f, 95.163445f, 160.0f, 104.0f, 160.0f),
                    PathNode.CurveTo(112.836555f, 160.0f, 120.0f, 167.16344f, 120.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 176.0f),
                    PathNode.CurveTo(168.0f, 184.83656f, 160.83656f, 192.0f, 152.0f, 192.0f),
                    PathNode.CurveTo(143.16344f, 192.0f, 136.0f, 184.83656f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 167.16344f, 143.16344f, 160.0f, 152.0f, 160.0f),
                    PathNode.CurveTo(160.83656f, 160.0f, 168.0f, 167.16344f, 168.0f, 176.0f),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
