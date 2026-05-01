package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorBoldIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(52.99602f, 27.677362f, 46.6385f, 26.783813f, 41.732742f, 29.801052f),
                    PathNode.CurveTo(36.82698f, 32.81829f, 34.756638f, 38.89531f, 36.8f, 44.28f),
                    PathNode.CurveTo(27.124216f, 45.848324f, 20.01095f, 54.197945f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 224.0f),
                    PathNode.CurveTo(19.967373f, 231.77913f, 24.488514f, 238.85808f, 31.56f, 242.1f),
                    PathNode.CurveTo(34.217773f, 243.34431f, 37.11537f, 243.99278f, 40.05f, 244.0f),
                    PathNode.CurveTo(44.74626f, 243.98787f, 49.28707f, 242.31606f, 52.87f, 239.28f),
                    PathNode.LineTo(52.99f, 239.17f),
                    PathNode.LineTo(84.47f, 212.0f),
                    PathNode.LineTo(188.15f, 212.0f),
                    PathNode.LineTo(199.15f, 224.07f),
                    PathNode.CurveTo(203.6097f, 228.97429f, 211.20071f, 229.3347f, 216.105f, 224.87502f),
                    PathNode.CurveTo(221.0093f, 220.4153f, 221.3697f, 212.8243f, 216.91f, 207.92f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 188.0f),
                    PathNode.CurveTo(77.11987f, 187.99506f, 74.33518f, 189.03221f, 72.16f, 190.92f),
                    PathNode.LineTo(44.0f, 215.23f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(57.24f, 68.0f),
                    PathNode.LineTo(166.33f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 64.0f),
                    PathNode.LineTo(236.0f, 174.12f),
                    PathNode.CurveTo(236.0f, 180.74742f, 230.62741f, 186.12f, 224.0f, 186.12f),
                    PathNode.CurveTo(217.37259f, 186.12f, 212.0f, 180.74742f, 212.0f, 174.12f),
                    PathNode.LineTo(212.0f, 68.0f),
                    PathNode.LineTo(116.6f, 68.0f),
                    PathNode.CurveTo(109.97257f, 68.0f, 104.6f, 62.62742f, 104.6f, 56.0f),
                    PathNode.CurveTo(104.6f, 49.37258f, 109.97257f, 44.0f, 116.6f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(227.0457f, 44.0f, 236.0f, 52.954304f, 236.0f, 64.0f),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
