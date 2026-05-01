package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorBoldIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.58f, 116.84f),
                    PathNode.LineTo(205.18f, 34.74f),
                    PathNode.CurveTo(202.80833f, 26.039734f, 194.90773f, 20.002668f, 185.89f, 20.0f),
                    PathNode.LineTo(70.11f, 20.0f),
                    PathNode.CurveTo(61.092274f, 20.002668f, 53.19166f, 26.039734f, 50.82f, 34.74f),
                    PathNode.LineTo(28.42f, 116.84f),
                    PathNode.CurveTo(27.860115f, 118.90947f, 27.860115f, 121.09053f, 28.42f, 123.16f),
                    PathNode.LineTo(50.82f, 205.26f),
                    PathNode.CurveTo(53.19166f, 213.96027f, 61.092274f, 219.99733f, 70.11f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.LineTo(62.4f, 232.8f),
                    PathNode.CurveTo(58.42355f, 238.10193f, 59.498062f, 245.62355f, 64.8f, 249.6f),
                    PathNode.CurveTo(70.10194f, 253.57645f, 77.62355f, 252.50194f, 81.6f, 247.2f),
                    PathNode.LineTo(102.0f, 220.0f),
                    PathNode.LineTo(154.0f, 220.0f),
                    PathNode.LineTo(174.4f, 247.2f),
                    PathNode.CurveTo(178.37645f, 252.50194f, 185.89807f, 253.57645f, 191.2f, 249.6f),
                    PathNode.CurveTo(196.50194f, 245.62355f, 197.57645f, 238.10193f, 193.6f, 232.8f),
                    PathNode.LineTo(184.0f, 220.0f),
                    PathNode.LineTo(185.89f, 220.0f),
                    PathNode.CurveTo(194.90773f, 219.99733f, 202.80833f, 213.96027f, 205.18f, 205.26f),
                    PathNode.LineTo(227.58f, 123.16f),
                    PathNode.CurveTo(228.1399f, 121.09053f, 228.1399f, 118.90947f, 227.58f, 116.84f),
                    PathNode.Close,
                    PathNode.MoveTo(73.17f, 44.0f),
                    PathNode.LineTo(182.83f, 44.0f),
                    PathNode.LineTo(201.0f, 110.53f),
                    PathNode.LineTo(128.0f, 123.8f),
                    PathNode.LineTo(55.0f, 110.53f),
                    PathNode.Close,
                    PathNode.MoveTo(56.59f, 135.21f),
                    PathNode.LineTo(116.0f, 146.0f),
                    PathNode.LineTo(116.0f, 196.0f),
                    PathNode.LineTo(73.17f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.83f, 196.0f),
                    PathNode.LineTo(140.0f, 196.0f),
                    PathNode.LineTo(140.0f, 146.0f),
                    PathNode.LineTo(199.41f, 135.2f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 81.37258f, 89.37258f, 76.0f, 96.0f, 76.0f),
                    PathNode.LineTo(160.0f, 76.0f),
                    PathNode.CurveTo(166.62741f, 76.0f, 172.0f, 81.37258f, 172.0f, 88.0f),
                    PathNode.CurveTo(172.0f, 94.62742f, 166.62741f, 100.0f, 160.0f, 100.0f),
                    PathNode.LineTo(96.0f, 100.0f),
                    PathNode.CurveTo(89.37258f, 100.0f, 84.0f, 94.62742f, 84.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
