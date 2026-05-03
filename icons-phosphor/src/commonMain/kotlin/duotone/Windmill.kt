package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorDuotoneIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 232.0f),
                    PathNode.LineTo(80.0f, 232.0f),
                    PathNode.LineTo(90.27f, 160.11f),
                    PathNode.LineTo(107.9f, 130.11f),
                    PathNode.LineTo(166.36f, 164.52f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 224.0f),
                    PathNode.LineTo(182.94f, 224.0f),
                    PathNode.LineTo(176.64f, 179.88f),
                    PathNode.LineTo(179.88f, 181.79f),
                    PathNode.CurveTo(183.53714f, 183.94438f, 187.90045f, 184.55734f, 192.00961f, 183.49394f),
                    PathNode.CurveTo(196.11877f, 182.43056f, 199.63702f, 179.77797f, 201.79f, 176.12f),
                    PathNode.LineTo(213.79f, 155.78f),
                    PathNode.CurveTo(215.94438f, 152.12286f, 216.55734f, 147.75955f, 215.49394f, 143.65039f),
                    PathNode.CurveTo(214.43056f, 139.54121f, 211.77797f, 136.02298f, 208.12f, 133.87f),
                    PathNode.LineTo(173.12f, 113.26f),
                    PathNode.LineTo(213.81f, 44.13f),
                    PathNode.CurveTo(215.96439f, 40.472862f, 216.57733f, 36.10955f, 215.51395f, 32.000385f),
                    PathNode.CurveTo(214.45055f, 27.89122f, 211.79796f, 24.372982f, 208.14f, 22.22f),
                    PathNode.LineTo(187.8f, 10.22f),
                    PathNode.CurveTo(184.14287f, 8.065612f, 179.77956f, 7.452662f, 175.67038f, 8.516056f),
                    PathNode.CurveTo(171.56122f, 9.57945f, 168.043f, 12.232035f, 165.89f, 15.89f),
                    PathNode.LineTo(145.28f, 50.89f),
                    PathNode.LineTo(76.12f, 10.22f),
                    PathNode.CurveTo(72.46287f, 8.065612f, 68.09955f, 7.452662f, 63.990383f, 8.516056f),
                    PathNode.CurveTo(59.88122f, 9.57945f, 56.36298f, 12.232035f, 54.21f, 15.89f),
                    PathNode.LineTo(42.21f, 36.22f),
                    PathNode.CurveTo(40.052437f, 39.87802f, 39.437702f, 44.243748f, 40.501236f, 48.355328f),
                    PathNode.CurveTo(41.56477f, 52.466904f, 44.219307f, 55.986977f, 47.88f, 58.14f),
                    PathNode.LineTo(82.88f, 78.75f),
                    PathNode.LineTo(42.21f, 147.88f),
                    PathNode.CurveTo(40.05561f, 151.53714f, 39.44266f, 155.90045f, 40.50605f, 160.00961f),
                    PathNode.CurveTo(41.56945f, 164.11877f, 44.222034f, 167.63702f, 47.88f, 169.79f),
                    PathNode.LineTo(68.22f, 181.79f),
                    PathNode.CurveTo(71.39659f, 183.69368f, 75.14771f, 184.40279f, 78.8f, 183.79f),
                    PathNode.LineTo(73.06f, 224.0f),
                    PathNode.LineTo(32.0f, 224.0f),
                    PathNode.CurveTo(27.581722f, 224.0f, 24.0f, 227.58173f, 24.0f, 232.0f),
                    PathNode.CurveTo(24.0f, 236.41827f, 27.581722f, 240.0f, 32.0f, 240.0f),
                    PathNode.LineTo(224.0f, 240.0f),
                    PathNode.CurveTo(228.41827f, 240.0f, 232.0f, 236.41827f, 232.0f, 232.0f),
                    PathNode.CurveTo(232.0f, 227.58173f, 228.41827f, 224.0f, 224.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 147.66f),
                    PathNode.LineTo(188.0f, 168.0f),
                    PathNode.LineTo(118.87f, 127.31f),
                    PathNode.LineTo(130.87f, 106.96f),
                    PathNode.Close,
                    PathNode.MoveTo(179.66f, 24.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.LineTo(159.31f, 105.14f),
                    PathNode.LineTo(139.0f, 93.17f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 44.35f),
                    PathNode.LineTo(68.0f, 24.0f),
                    PathNode.LineTo(137.14f, 64.7f),
                    PathNode.LineTo(125.14f, 85.05f),
                    PathNode.Close,
                    PathNode.MoveTo(76.34f, 168.0f),
                    PathNode.LineTo(56.0f, 156.0f),
                    PathNode.LineTo(96.69f, 86.86f),
                    PathNode.LineTo(117.05f, 98.86f),
                    PathNode.Close,
                    PathNode.MoveTo(89.22f, 224.0f),
                    PathNode.LineTo(98.0f, 162.8f),
                    PathNode.LineTo(110.77f, 141.1f),
                    PathNode.LineTo(159.0f, 169.5f),
                    PathNode.LineTo(166.79f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _windmill!!
    }

private var _windmill: ImageVector? = null
