package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorBoldIcon(
            name = "Circuitry",
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
                    PathNode.MoveTo(52.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(76.0f, 147.22f),
                    PathNode.CurveTo(66.592766f, 152.65128f, 62.006348f, 163.72386f, 64.81778f, 174.21626f),
                    PathNode.CurveTo(67.62921f, 184.70865f, 77.13747f, 192.00461f, 88.0f, 192.00461f),
                    PathNode.CurveTo(98.86253f, 192.00461f, 108.37079f, 184.70865f, 111.18222f, 174.21626f),
                    PathNode.CurveTo(113.99365f, 163.72386f, 109.407234f, 152.65128f, 100.0f, 147.22f),
                    PathNode.LineTo(100.0f, 125.0f),
                    PathNode.LineTo(140.0f, 165.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(164.0f, 160.0f),
                    PathNode.CurveTo(164.0025f, 156.81645f, 162.73987f, 153.76236f, 160.49f, 151.51f),
                    PathNode.LineTo(100.0f, 91.0f),
                    PathNode.LineTo(100.0f, 52.0f),
                    PathNode.LineTo(124.0f, 52.0f),
                    PathNode.LineTo(124.0f, 72.0f),
                    PathNode.CurveTo(123.9975f, 75.183556f, 125.26014f, 78.23763f, 127.51f, 80.49f),
                    PathNode.LineTo(144.82f, 97.79f),
                    PathNode.CurveTo(142.02023f, 108.2809f, 146.61276f, 119.34473f, 156.01884f, 124.76905f),
                    PathNode.CurveTo(165.42493f, 130.19337f, 177.30118f, 128.6268f, 184.97899f, 120.94899f),
                    PathNode.CurveTo(192.6568f, 113.27118f, 194.22337f, 101.39492f, 188.79904f, 91.988846f),
                    PathNode.CurveTo(183.37473f, 82.58276f, 172.3109f, 77.990234f, 161.82f, 80.79f),
                    PathNode.LineTo(148.0f, 67.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
