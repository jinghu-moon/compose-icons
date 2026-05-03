package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorBoldIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 100.0f),
                    PathNode.LineTo(225.0f, 100.0f),
                    PathNode.LineTo(190.83f, 65.86f),
                    PathNode.CurveTo(187.08894f, 62.09588f, 181.99698f, 59.985634f, 176.69f, 60.0f),
                    PathNode.LineTo(144.0f, 60.0f),
                    PathNode.LineTo(144.0f, 44.0f),
                    PathNode.LineTo(164.0f, 44.0f),
                    PathNode.CurveTo(170.62741f, 44.0f, 176.0f, 38.62742f, 176.0f, 32.0f),
                    PathNode.CurveTo(176.0f, 25.372583f, 170.62741f, 20.0f, 164.0f, 20.0f),
                    PathNode.LineTo(100.0f, 20.0f),
                    PathNode.CurveTo(93.37258f, 20.0f, 88.0f, 25.372583f, 88.0f, 32.0f),
                    PathNode.CurveTo(88.0f, 38.62742f, 93.37258f, 44.0f, 100.0f, 44.0f),
                    PathNode.LineTo(120.0f, 44.0f),
                    PathNode.LineTo(120.0f, 60.0f),
                    PathNode.LineTo(64.0f, 60.0f),
                    PathNode.CurveTo(52.954304f, 60.0f, 44.0f, 68.95431f, 44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 128.0f),
                    PathNode.LineTo(28.0f, 128.0f),
                    PathNode.LineTo(28.0f, 108.0f),
                    PathNode.CurveTo(28.0f, 101.37258f, 22.627417f, 96.0f, 16.0f, 96.0f),
                    PathNode.CurveTo(9.372583f, 96.0f, 4.0f, 101.37258f, 4.0f, 108.0f),
                    PathNode.LineTo(4.0f, 172.0f),
                    PathNode.CurveTo(4.0f, 178.62741f, 9.372583f, 184.0f, 16.0f, 184.0f),
                    PathNode.CurveTo(22.627417f, 184.0f, 28.0f, 178.62741f, 28.0f, 172.0f),
                    PathNode.LineTo(28.0f, 152.0f),
                    PathNode.LineTo(44.0f, 152.0f),
                    PathNode.LineTo(44.0f, 168.69f),
                    PathNode.CurveTo(43.985634f, 173.99698f, 46.09588f, 179.08894f, 49.86f, 182.83f),
                    PathNode.LineTo(89.17f, 222.14f),
                    PathNode.CurveTo(92.911064f, 225.90411f, 98.00303f, 228.01437f, 103.31f, 228.0f),
                    PathNode.LineTo(176.69f, 228.0f),
                    PathNode.CurveTo(181.99698f, 228.01437f, 187.08894f, 225.90411f, 190.83f, 222.14f),
                    PathNode.LineTo(225.0f, 188.0f),
                    PathNode.LineTo(236.0f, 188.0f),
                    PathNode.CurveTo(247.0457f, 188.0f, 256.0f, 179.0457f, 256.0f, 168.0f),
                    PathNode.LineTo(256.0f, 120.0f),
                    PathNode.CurveTo(256.0f, 108.95431f, 247.0457f, 100.0f, 236.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 164.0f),
                    PathNode.LineTo(220.0f, 164.0f),
                    PathNode.CurveTo(216.81645f, 163.9975f, 213.76236f, 165.26013f, 211.51f, 167.51f),
                    PathNode.LineTo(175.0f, 204.0f),
                    PathNode.LineTo(105.0f, 204.0f),
                    PathNode.LineTo(68.0f, 167.0f),
                    PathNode.LineTo(68.0f, 84.0f),
                    PathNode.LineTo(175.0f, 84.0f),
                    PathNode.LineTo(211.48f, 120.49f),
                    PathNode.CurveTo(213.73972f, 122.74723f, 216.80606f, 124.01048f, 220.0f, 124.0f),
                    PathNode.LineTo(232.0f, 124.0f),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
