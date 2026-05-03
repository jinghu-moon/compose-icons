package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorBoldIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(28.954306f, 44.0f, 20.0f, 52.954304f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 224.0f),
                    PathNode.CurveTo(19.967373f, 231.77913f, 24.488514f, 238.85808f, 31.56f, 242.1f),
                    PathNode.CurveTo(34.217773f, 243.34431f, 37.11537f, 243.99278f, 40.05f, 244.0f),
                    PathNode.CurveTo(44.74626f, 243.98787f, 49.28707f, 242.31606f, 52.87f, 239.28f),
                    PathNode.LineTo(52.99f, 239.17f),
                    PathNode.LineTo(84.47f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(227.0457f, 212.0f, 236.0f, 203.0457f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 52.954304f, 227.0457f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 188.0f),
                    PathNode.LineTo(80.0f, 188.0f),
                    PathNode.CurveTo(77.11987f, 187.99506f, 74.33518f, 189.03221f, 72.16f, 190.92f),
                    PathNode.LineTo(44.0f, 215.23f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(212.0f, 68.0f),
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
        return _chat!!
    }

private var _chat: ImageVector? = null
