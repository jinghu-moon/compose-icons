package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorRegularIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(158.66f, 196.44f),
                    PathNode.LineTo(126.66f, 244.44f),
                    PathNode.CurveTo(124.207855f, 248.11821f, 119.23822f, 249.11214f, 115.56f, 246.66f),
                    PathNode.CurveTo(111.88178f, 244.20786f, 110.887856f, 239.23822f, 113.34f, 235.56f),
                    PathNode.LineTo(145.34f, 187.56f),
                    PathNode.CurveTo(147.79214f, 183.88179f, 152.76178f, 182.88786f, 156.44f, 185.34f),
                    PathNode.CurveTo(160.11821f, 187.79214f, 161.11214f, 192.76178f, 158.66f, 196.44f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 92.0f),
                    PathNode.CurveTo(231.9559f, 133.95537f, 197.95538f, 167.9559f, 156.0f, 168.0f),
                    PathNode.LineTo(132.28f, 168.0f),
                    PathNode.LineTo(102.66f, 212.44f),
                    PathNode.CurveTo(100.207855f, 216.11821f, 95.23822f, 217.11214f, 91.56f, 214.66f),
                    PathNode.CurveTo(87.88178f, 212.20786f, 86.887856f, 207.23822f, 89.34f, 203.56f),
                    PathNode.LineTo(113.05f, 168.0f),
                    PathNode.LineTo(76.0f, 168.0f),
                    PathNode.CurveTo(47.281193f, 168.0f, 24.0f, 144.71881f, 24.0f, 116.0f),
                    PathNode.CurveTo(24.0f, 87.2812f, 47.281193f, 64.0f, 76.0f, 64.0f),
                    PathNode.CurveTo(78.989395f, 64.002556f, 81.97327f, 64.25678f, 84.92f, 64.76f),
                    PathNode.CurveTo(98.08372f, 30.567497f, 133.7486f, 10.614112f, 169.77486f, 17.286367f),
                    PathNode.CurveTo(205.80113f, 23.958624f, 231.95464f, 55.361107f, 232.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 92.0f),
                    PathNode.CurveTo(215.86697f, 59.61541f, 190.08229f, 33.167774f, 157.7115f, 32.212837f),
                    PathNode.CurveTo(125.34072f, 31.257898f, 98.04183f, 56.139565f, 96.0f, 88.46f),
                    PathNode.CurveTo(95.74595f, 92.87828f, 91.958275f, 96.25405f, 87.54f, 96.0f),
                    PathNode.CurveTo(83.12172f, 95.74595f, 79.74595f, 91.958275f, 80.0f, 87.54f),
                    PathNode.QuadTo(80.21f, 83.88f, 80.77f, 80.31f),
                    PathNode.CurveTo(79.18806f, 80.10696f, 77.59492f, 80.00342f, 76.0f, 80.0f),
                    PathNode.CurveTo(56.11775f, 80.0f, 40.0f, 96.11775f, 40.0f, 116.0f),
                    PathNode.CurveTo(40.0f, 135.88223f, 56.11775f, 152.0f, 76.0f, 152.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.CurveTo(189.1211f, 151.96143f, 215.96143f, 125.12109f, 216.0f, 92.0f),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
