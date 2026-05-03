package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorBoldIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.LineTo(129.0f, 144.0f),
                    PathNode.LineTo(150.24f, 122.75f),
                    PathNode.CurveTo(157.79546f, 126.12328f, 165.96599f, 127.900375f, 174.24f, 127.97f),
                    PathNode.CurveTo(183.76273f, 127.99173f, 193.10635f, 125.38243f, 201.24f, 120.43f),
                    PathNode.CurveTo(225.24f, 105.86f, 238.24f, 72.64f, 235.78f, 31.56f),
                    PathNode.CurveTo(235.42076f, 25.490774f, 230.57921f, 20.649235f, 224.51f, 20.29f),
                    PathNode.CurveTo(183.42f, 17.88f, 150.2f, 30.78f, 135.64f, 54.83f),
                    PathNode.CurveTo(126.4f, 70.07f, 125.64f, 88.23f, 133.31f, 105.83f),
                    PathNode.LineTo(120.0f, 119.0f),
                    PathNode.LineTo(108.86f, 107.87f),
                    PathNode.CurveTo(113.8f, 94.98f, 112.86f, 81.75f, 106.1f, 70.51f),
                    PathNode.CurveTo(95.0f, 52.25f, 70.12f, 42.4f, 39.49f, 44.21f),
                    PathNode.CurveTo(33.41687f, 44.56436f, 28.569748f, 49.40719f, 28.21f, 55.48f),
                    PathNode.CurveTo(26.41f, 86.12f, 36.21f, 111.02f, 54.53f, 122.09f),
                    PathNode.CurveTo(60.853912f, 125.951164f, 68.120514f, 127.99274f, 75.53f, 127.99f),
                    PathNode.CurveTo(81.11247f, 127.954285f, 86.640884f, 126.89334f, 91.84f, 124.86f),
                    PathNode.LineTo(103.0f, 136.0f),
                    PathNode.LineTo(95.0f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(49.37258f, 144.0f, 44.0f, 149.37259f, 44.0f, 156.0f),
                    PathNode.CurveTo(44.0f, 162.62741f, 49.37258f, 168.0f, 56.0f, 168.0f),
                    PathNode.LineTo(63.27f, 168.0f),
                    PathNode.LineTo(74.9f, 220.34f),
                    PathNode.CurveTo(76.89621f, 229.51215f, 85.03323f, 236.0401f, 94.42f, 236.0f),
                    PathNode.LineTo(161.59f, 236.0f),
                    PathNode.CurveTo(170.97809f, 236.04393f, 179.11723f, 229.51427f, 181.11f, 220.34f),
                    PathNode.LineTo(192.74f, 168.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(206.62741f, 168.0f, 212.0f, 162.62741f, 212.0f, 156.0f),
                    PathNode.CurveTo(212.0f, 149.37259f, 206.62741f, 144.0f, 200.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.1f, 67.26f),
                    PathNode.CurveTo(164.8f, 52.89f, 185.29f, 44.5f, 212.0f, 44.0f),
                    PathNode.CurveTo(211.52f, 70.69f, 203.13f, 91.18f, 188.75f, 99.89f),
                    PathNode.CurveTo(179.32f, 105.6f, 168.3f, 105.37f, 156.75f, 99.27f),
                    PathNode.CurveTo(150.61f, 87.71f, 150.39f, 76.69f, 156.1f, 67.26f),
                    PathNode.Close,
                    PathNode.MoveTo(85.51f, 101.5f),
                    PathNode.CurveTo(80.28f, 104.03f, 73.51f, 105.5f, 66.97f, 101.57f),
                    PathNode.CurveTo(58.5f, 96.44f, 53.16f, 84.09f, 52.17f, 68.17f),
                    PathNode.CurveTo(68.1f, 69.17f, 80.44f, 74.49f, 85.57f, 82.96f),
                    PathNode.CurveTo(89.51f, 89.48f, 88.0f, 96.27f, 85.51f, 101.5f),
                    PathNode.Close,
                    PathNode.MoveTo(158.38f, 212.0f),
                    PathNode.LineTo(97.62f, 212.0f),
                    PathNode.LineTo(87.85f, 168.0f),
                    PathNode.LineTo(168.16f, 168.0f),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
