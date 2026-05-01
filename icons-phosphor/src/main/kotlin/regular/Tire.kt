package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorRegularIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.26f, 159.26f),
                    PathNode.CurveTo(155.09f, 173.82f, 163.5f, 176.0f, 168.0f, 176.0f),
                    PathNode.CurveTo(172.5f, 176.0f, 180.91f, 173.82f, 186.74f, 159.26f),
                    PathNode.CurveTo(190.13f, 150.78f, 192.0f, 139.68f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 116.32f, 190.13f, 105.22f, 186.74f, 96.74f),
                    PathNode.CurveTo(180.91f, 82.18f, 172.5f, 80.0f, 168.0f, 80.0f),
                    PathNode.CurveTo(163.5f, 80.0f, 155.09f, 82.18f, 149.26f, 96.74f),
                    PathNode.CurveTo(145.87f, 105.22f, 144.0f, 116.32f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 139.68f, 145.87f, 150.78f, 149.26f, 159.26f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 96.2f),
                    PathNode.CurveTo(170.62f, 98.26f, 176.0f, 109.2f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 146.8f, 170.62f, 157.74f, 168.0f, 159.8f),
                    PathNode.CurveTo(165.38f, 157.74f, 160.0f, 146.8f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 109.2f, 165.38f, 98.26f, 168.0f, 96.2f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 216.0f),
                    PathNode.LineTo(196.41f, 216.0f),
                    PathNode.CurveTo(213.12f, 197.73f, 224.0f, 165.47f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 69.68f, 197.65f, 24.0f, 164.0f, 24.0f),
                    PathNode.LineTo(92.0f, 24.0f),
                    PathNode.CurveTo(58.35f, 24.0f, 32.0f, 69.68f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 186.32f, 58.35f, 232.0f, 92.0f, 232.0f),
                    PathNode.LineTo(232.0f, 232.0f),
                    PathNode.CurveTo(236.41827f, 232.0f, 240.0f, 228.41827f, 240.0f, 224.0f),
                    PathNode.CurveTo(240.0f, 219.58173f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.74f, 63.93f),
                    PathNode.CurveTo(202.93f, 80.91f, 208.0f, 103.67f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 152.33f, 202.93f, 175.09f, 193.74f, 192.07f),
                    PathNode.CurveTo(185.38f, 207.5f, 174.82f, 216.0f, 164.0f, 216.0f),
                    PathNode.CurveTo(153.18f, 216.0f, 142.62f, 207.5f, 134.26f, 192.07f),
                    PathNode.CurveTo(125.07f, 175.09f, 120.0f, 152.33f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 103.67f, 125.07f, 80.91f, 134.26f, 63.93f),
                    PathNode.CurveTo(142.62f, 48.5f, 153.18f, 40.0f, 164.0f, 40.0f),
                    PathNode.CurveTo(174.82f, 40.0f, 185.38f, 48.5f, 193.74f, 63.93f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 125.5f, 48.07f, 123.0f, 48.17f, 120.56f),
                    PathNode.LineTo(80.0f, 97.83f),
                    PathNode.LineTo(104.43f, 115.28f),
                    PathNode.CurveTo(104.15f, 119.44f, 104.0f, 123.69f, 104.0f, 128.0f),
                    PathNode.CurveTo(103.974686f, 139.23805f, 105.00251f, 150.45374f, 107.07f, 161.5f),
                    PathNode.LineTo(84.65f, 145.5f),
                    PathNode.CurveTo(81.86838f, 143.51306f, 78.13162f, 143.51306f, 75.35f, 145.5f),
                    PathNode.LineTo(51.61f, 162.5f),
                    PathNode.CurveTo(49.167698f, 151.16357f, 47.957336f, 139.59645f, 48.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.26f, 63.93f),
                    PathNode.CurveTo(70.62f, 48.5f, 81.18f, 40.0f, 92.0f, 40.0f),
                    PathNode.LineTo(131.59f, 40.0f),
                    PathNode.CurveTo(119.69f, 53.0f, 110.75f, 73.12f, 106.59f, 97.16f),
                    PathNode.LineTo(84.65f, 81.49f),
                    PathNode.CurveTo(81.86838f, 79.50307f, 78.13162f, 79.50307f, 75.35f, 81.49f),
                    PathNode.LineTo(50.49f, 99.25f),
                    PathNode.CurveTo(52.85f, 86.0f, 56.83f, 74.0f, 62.26f, 63.93f),
                    PathNode.Close,
                    PathNode.MoveTo(62.26f, 192.07f),
                    PathNode.CurveTo(59.958687f, 187.78036f, 57.97342f, 183.32857f, 56.32f, 178.75f),
                    PathNode.LineTo(80.0f, 161.83f),
                    PathNode.LineTo(113.94f, 186.07f),
                    PathNode.CurveTo(118.54f, 198.07f, 124.54f, 208.29f, 131.59f, 216.0f),
                    PathNode.LineTo(92.0f, 216.0f),
                    PathNode.CurveTo(81.18f, 216.0f, 70.62f, 207.5f, 62.26f, 192.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tire!!
    }

private var _tire: ImageVector? = null
