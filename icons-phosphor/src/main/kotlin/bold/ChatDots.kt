package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorBoldIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 119.163445f, 95.163445f, 112.0f, 104.0f, 112.0f),
                    PathNode.CurveTo(112.836555f, 112.0f, 120.0f, 119.163445f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 136.83656f, 112.836555f, 144.0f, 104.0f, 144.0f),
                    PathNode.CurveTo(95.163445f, 144.0f, 88.0f, 136.83656f, 88.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 144.0f),
                    PathNode.CurveTo(160.83656f, 144.0f, 168.0f, 136.83656f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 119.163445f, 160.83656f, 112.0f, 152.0f, 112.0f),
                    PathNode.CurveTo(143.16344f, 112.0f, 136.0f, 119.163445f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 136.83656f, 143.16344f, 144.0f, 152.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 64.0f),
                    PathNode.LineTo(236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 203.0457f, 227.0457f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(84.47f, 212.0f),
                    PathNode.LineTo(53.0f, 239.17f),
                    PathNode.LineTo(52.88f, 239.28f),
                    PathNode.CurveTo(49.294445f, 242.31827f, 44.749702f, 243.99022f, 40.05f, 244.0f),
                    PathNode.CurveTo(37.11537f, 243.99278f, 34.217773f, 243.34431f, 31.56f, 242.1f),
                    PathNode.CurveTo(24.488514f, 238.85808f, 19.967373f, 231.77913f, 20.0f, 224.0f),
                    PathNode.LineTo(20.0f, 64.0f),
                    PathNode.CurveTo(20.0f, 52.954304f, 28.954306f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(227.0457f, 44.0f, 236.0f, 52.954304f, 236.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 68.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(44.0f, 215.23f),
                    PathNode.LineTo(72.16f, 190.91f),
                    PathNode.CurveTo(74.336624f, 189.02583f, 77.121155f, 187.99228f, 80.0f, 188.0f),
                    PathNode.LineTo(212.0f, 188.0f),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
