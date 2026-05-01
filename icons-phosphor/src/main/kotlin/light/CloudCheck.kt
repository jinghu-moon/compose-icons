package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorLightIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 42.0f),
                    PathNode.CurveTo(126.89743f, 42.029118f, 96.74202f, 61.031265f, 82.43f, 90.88f),
                    PathNode.CurveTo(59.3639f, 86.95178f, 36.05095f, 96.3437f, 22.149662f, 115.1647f),
                    PathNode.CurveTo(8.248373f, 133.9857f, 6.126796f, 159.02968f, 16.663895f, 179.92096f),
                    PathNode.CurveTo(27.200993f, 200.81224f, 48.6018f, 213.99203f, 72.0f, 214.0f),
                    PathNode.LineTo(160.0f, 214.0f),
                    PathNode.CurveTo(207.49649f, 214.0f, 246.0f, 175.49649f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 80.50351f, 207.49649f, 42.0f, 160.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 202.0f),
                    PathNode.LineTo(72.0f, 202.0f),
                    PathNode.CurveTo(44.38576f, 202.0f, 22.0f, 179.61424f, 22.0f, 152.0f),
                    PathNode.CurveTo(22.0f, 124.385765f, 44.38576f, 102.0f, 72.0f, 102.0f),
                    PathNode.CurveTo(73.975136f, 102.00138f, 75.9485f, 102.11825f, 77.91f, 102.35f),
                    PathNode.CurveTo(75.311066f, 110.651695f, 73.99259f, 119.301f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 131.3137f, 76.686295f, 134.0f, 80.0f, 134.0f),
                    PathNode.CurveTo(83.313705f, 134.0f, 86.0f, 131.3137f, 86.0f, 128.0f),
                    PathNode.CurveTo(86.0f, 87.13093f, 119.13093f, 54.0f, 160.0f, 54.0f),
                    PathNode.CurveTo(200.86908f, 54.0f, 234.0f, 87.13093f, 234.0f, 128.0f),
                    PathNode.CurveTo(234.0f, 168.86908f, 200.86908f, 202.0f, 160.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.24f, 107.76f),
                    PathNode.CurveTo(198.57962f, 110.10254f, 198.57962f, 113.89746f, 196.24f, 116.24f),
                    PathNode.LineTo(148.24f, 164.24f),
                    PathNode.CurveTo(145.89746f, 166.57962f, 142.10254f, 166.57962f, 139.76f, 164.24f),
                    PathNode.LineTo(115.76f, 140.24f),
                    PathNode.CurveTo(113.55713f, 137.87592f, 113.62213f, 134.19193f, 115.90703f, 131.90703f),
                    PathNode.CurveTo(118.191925f, 129.62213f, 121.87592f, 129.55713f, 124.24f, 131.76f),
                    PathNode.LineTo(144.0f, 151.51f),
                    PathNode.LineTo(187.76f, 107.76f),
                    PathNode.CurveTo(190.10254f, 105.42038f, 193.89746f, 105.42038f, 196.24f, 107.76f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
