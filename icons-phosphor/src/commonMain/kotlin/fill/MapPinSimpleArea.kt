package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorFillIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.CurveTo(87.99903f, 42.949703f, 104.31316f, 25.500776f, 125.316025f, 24.088312f),
                    PathNode.CurveTo(146.31888f, 22.67585f, 164.82245f, 37.78325f, 167.64006f, 58.644127f),
                    PathNode.CurveTo(170.45766f, 79.505f, 156.62498f, 98.97994f, 136.0f, 103.19f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 180.41827f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 103.19f),
                    PathNode.CurveTo(101.387665f, 99.37102f, 88.02023f, 83.00008f, 88.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 146.59f),
                    PathNode.CurveTo(205.74f, 139.65f, 188.88f, 134.32f, 169.23f, 131.17f),
                    PathNode.CurveTo(164.85867f, 130.47964f, 160.75536f, 133.46367f, 160.065f, 137.835f),
                    PathNode.CurveTo(159.37465f, 142.20633f, 162.35867f, 146.30965f, 166.73f, 147.0f),
                    PathNode.CurveTo(184.27f, 149.82f, 199.73f, 154.63f, 210.15f, 160.55f),
                    PathNode.CurveTo(219.0f, 165.5f, 224.0f, 171.14f, 224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 189.36f, 187.48f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(68.52f, 208.0f, 32.0f, 189.36f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 171.14f, 37.0f, 165.5f, 45.85f, 160.51f),
                    PathNode.CurveTo(56.31f, 154.59f, 71.73f, 149.78f, 89.27f, 146.96f),
                    PathNode.CurveTo(92.16006f, 146.58249f, 94.61611f, 144.66309f, 95.68086f, 141.94992f),
                    PathNode.CurveTo(96.74562f, 139.23676f, 96.250565f, 136.15921f, 94.38866f, 133.91684f),
                    PathNode.CurveTo(92.52675f, 131.67447f, 89.59265f, 130.62213f, 86.73f, 131.17f),
                    PathNode.CurveTo(67.08f, 134.32f, 50.22f, 139.65f, 37.96f, 146.59f),
                    PathNode.CurveTo(19.81f, 156.87f, 16.0f, 168.26f, 16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 207.18f, 73.71f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(182.29f, 224.0f, 240.0f, 207.18f, 240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 168.26f, 236.19f, 156.87f, 218.0f, 146.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
