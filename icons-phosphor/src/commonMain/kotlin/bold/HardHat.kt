package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorBoldIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 148.4f),
                    PathNode.LineTo(228.0f, 136.0f),
                    PathNode.CurveTo(227.88638f, 94.69698f, 202.49213f, 57.676926f, 164.0f, 42.7f),
                    PathNode.LineTo(164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 28.954306f, 155.0457f, 20.0f, 144.0f, 20.0f),
                    PathNode.LineTo(112.0f, 20.0f),
                    PathNode.CurveTo(100.95431f, 20.0f, 92.0f, 28.954306f, 92.0f, 40.0f),
                    PathNode.LineTo(92.0f, 42.7f),
                    PathNode.CurveTo(53.50787f, 57.676926f, 28.113619f, 94.69698f, 28.0f, 136.0f),
                    PathNode.LineTo(28.0f, 148.4f),
                    PathNode.CurveTo(18.686674f, 150.30107f, 11.99806f, 158.49463f, 12.0f, 168.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 168.0f),
                    PathNode.CurveTo(244.00194f, 158.49463f, 237.31332f, 150.30107f, 228.0f, 148.4f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 136.0f),
                    PathNode.LineTo(204.0f, 148.0f),
                    PathNode.LineTo(164.0f, 148.0f),
                    PathNode.LineTo(164.0f, 69.07f),
                    PathNode.CurveTo(188.57896f, 82.376724f, 203.92247f, 108.05025f, 204.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 44.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(116.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 69.07f),
                    PathNode.LineTo(92.0f, 148.0f),
                    PathNode.LineTo(52.0f, 148.0f),
                    PathNode.LineTo(52.0f, 136.0f),
                    PathNode.CurveTo(52.077534f, 108.05025f, 67.421036f, 82.376724f, 92.0f, 69.07f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
