package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorBoldIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 76.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.LineTo(188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 36.954304f, 179.0457f, 28.0f, 168.0f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(28.954306f, 28.0f, 20.0f, 36.954304f, 20.0f, 48.0f),
                    PathNode.LineTo(20.0f, 176.0f),
                    PathNode.CurveTo(20.002052f, 180.62201f, 22.658457f, 184.83202f, 26.829397f, 186.82356f),
                    PathNode.CurveTo(31.000338f, 188.81511f, 35.944332f, 188.23416f, 39.54f, 185.33f),
                    PathNode.LineTo(68.0f, 162.33f),
                    PathNode.LineTo(68.0f, 184.0f),
                    PathNode.CurveTo(68.0f, 195.0457f, 76.95431f, 204.0f, 88.0f, 204.0f),
                    PathNode.LineTo(180.17f, 204.0f),
                    PathNode.LineTo(216.46f, 233.33f),
                    PathNode.CurveTo(220.05566f, 236.23416f, 224.99966f, 236.81511f, 229.17061f, 234.82356f),
                    PathNode.CurveTo(233.34154f, 232.83202f, 235.99794f, 228.62201f, 236.0f, 224.0f),
                    PathNode.LineTo(236.0f, 96.0f),
                    PathNode.CurveTo(236.0f, 84.95431f, 227.0457f, 76.0f, 216.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 150.87f),
                    PathNode.LineTo(44.0f, 52.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.LineTo(164.0f, 132.0f),
                    PathNode.LineTo(71.58f, 132.0f),
                    PathNode.CurveTo(68.82156f, 131.99234f, 66.14469f, 132.93524f, 64.0f, 134.67f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 198.87f),
                    PathNode.LineTo(192.0f, 182.67f),
                    PathNode.CurveTo(189.86598f, 180.9439f, 187.20473f, 180.00151f, 184.46f, 180.0f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.LineTo(92.0f, 156.0f),
                    PathNode.LineTo(168.0f, 156.0f),
                    PathNode.CurveTo(179.0457f, 156.0f, 188.0f, 147.0457f, 188.0f, 136.0f),
                    PathNode.LineTo(188.0f, 100.0f),
                    PathNode.LineTo(212.0f, 100.0f),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
