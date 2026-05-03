package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorBoldIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.05f, 201.94f),
                    PathNode.LineTo(191.65f, 115.82f),
                    PathNode.LineTo(216.88f, 88.07f),
                    PathNode.CurveTo(221.24089f, 83.15425f, 220.83693f, 75.645355f, 215.9738f, 71.22584f),
                    PathNode.CurveTo(211.1107f, 66.80632f, 203.5975f, 67.120224f, 199.12f, 71.93f),
                    PathNode.LineTo(183.24f, 89.39f),
                    PathNode.LineTo(168.14f, 41.94f),
                    PathNode.CurveTo(165.51965f, 33.62455f, 157.79851f, 27.9775f, 149.08f, 28.0f),
                    PathNode.LineTo(106.91f, 28.0f),
                    PathNode.CurveTo(98.19149f, 27.9775f, 90.470345f, 33.62455f, 87.85f, 41.94f),
                    PathNode.LineTo(36.94f, 201.94f),
                    PathNode.CurveTo(35.006905f, 208.01994f, 36.090454f, 214.65733f, 39.85676f, 219.80685f),
                    PathNode.CurveTo(43.62306f, 224.95638f, 49.620144f, 228.00006f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.37985f, 228.00006f, 212.37694f, 224.95638f, 216.14325f, 219.80685f),
                    PathNode.CurveTo(219.90955f, 214.65733f, 220.9931f, 208.01994f, 219.06f, 201.94f),
                    PathNode.Close,
                    PathNode.MoveTo(179.25f, 156.0f),
                    PathNode.LineTo(155.12f, 156.0f),
                    PathNode.LineTo(173.0f, 136.34f),
                    PathNode.Close,
                    PathNode.MoveTo(109.83f, 52.0f),
                    PathNode.LineTo(146.16f, 52.0f),
                    PathNode.LineTo(164.58f, 109.91f),
                    PathNode.LineTo(122.69f, 156.0f),
                    PathNode.LineTo(76.74f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(61.47f, 204.0f),
                    PathNode.LineTo(69.1f, 180.0f),
                    PathNode.LineTo(186.89f, 180.0f),
                    PathNode.LineTo(194.52f, 204.0f),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
