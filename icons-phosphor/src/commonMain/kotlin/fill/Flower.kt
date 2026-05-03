package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = phosphorFillIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.35f, 129.36f),
                    PathNode.CurveTo(209.54f, 128.89f, 208.65f, 128.44f, 207.73f, 128.0f),
                    PathNode.CurveTo(208.65f, 127.56f, 209.54f, 127.11f, 210.35f, 126.64f),
                    PathNode.CurveTo(222.82803f, 119.54553f, 230.54813f, 106.309074f, 230.57968f, 91.95527f),
                    PathNode.CurveTo(230.61124f, 77.60146f, 222.94942f, 64.331184f, 210.5027f, 57.181927f),
                    PathNode.CurveTo(198.05598f, 50.03267f, 182.73282f, 50.100624f, 170.35f, 57.36f),
                    PathNode.CurveTo(169.54f, 57.83f, 168.7f, 58.36f, 167.87f, 58.95f),
                    PathNode.CurveTo(167.95f, 57.95f, 168.0f, 56.95f, 168.0f, 55.95f),
                    PathNode.CurveTo(168.0f, 33.85861f, 150.09138f, 15.95f, 128.0f, 15.95f),
                    PathNode.CurveTo(105.90861f, 15.95f, 88.0f, 33.85861f, 88.0f, 55.95f),
                    PathNode.CurveTo(88.0f, 56.89f, 88.0f, 57.89f, 88.13f, 58.95f),
                    PathNode.CurveTo(87.3f, 58.38f, 86.46f, 57.83f, 85.65f, 57.36f),
                    PathNode.CurveTo(73.26718f, 50.100624f, 57.944023f, 50.03267f, 45.497303f, 57.181927f),
                    PathNode.CurveTo(33.050587f, 64.331184f, 25.38876f, 77.60146f, 25.420317f, 91.95527f),
                    PathNode.CurveTo(25.451872f, 106.309074f, 33.17197f, 119.54553f, 45.65f, 126.64f),
                    PathNode.CurveTo(46.46f, 127.11f, 47.35f, 127.56f, 48.27f, 128.0f),
                    PathNode.CurveTo(47.35f, 128.44f, 46.46f, 128.89f, 45.65f, 129.36f),
                    PathNode.CurveTo(33.17197f, 136.45447f, 25.451872f, 149.69093f, 25.420317f, 164.04474f),
                    PathNode.CurveTo(25.38876f, 178.39853f, 33.050587f, 191.66882f, 45.497303f, 198.81807f),
                    PathNode.CurveTo(57.944023f, 205.96733f, 73.26718f, 205.89938f, 85.65f, 198.64f),
                    PathNode.CurveTo(86.46f, 198.17f, 87.3f, 197.64f, 88.13f, 197.05f),
                    PathNode.CurveTo(88.05f, 198.05f, 88.0f, 199.05f, 88.0f, 200.0f),
                    PathNode.CurveTo(88.0f, 222.09138f, 105.90861f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(150.09138f, 240.0f, 168.0f, 222.09138f, 168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 199.06f, 167.95f, 198.06f, 167.87f, 197.05f),
                    PathNode.CurveTo(168.7f, 197.62f, 169.54f, 198.17f, 170.35f, 198.64f),
                    PathNode.CurveTo(176.40923f, 202.15013f, 183.28748f, 203.99905f, 190.29f, 204.0f),
                    PathNode.CurveTo(193.80858f, 203.99538f, 197.31151f, 203.53146f, 200.71f, 202.62f),
                    PathNode.CurveTo(216.33739f, 198.43152f, 227.90276f, 185.2415f, 230.01292f, 169.20073f),
                    PathNode.CurveTo(232.1231f, 153.15997f, 224.36247f, 137.42761f, 210.35f, 129.34f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
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
        return _flower!!
    }

private var _flower: ImageVector? = null
