package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorRegularIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(67.58172f, 208.0f, 64.0f, 204.41827f, 64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 195.58173f, 67.58172f, 192.0f, 72.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(124.41828f, 192.0f, 128.0f, 195.58173f, 128.0f, 200.0f),
                    PathNode.CurveTo(128.0f, 204.41827f, 124.41828f, 208.0f, 120.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(155.58173f, 192.0f, 152.0f, 195.58173f, 152.0f, 200.0f),
                    PathNode.CurveTo(152.0f, 204.41827f, 155.58173f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(188.41827f, 208.0f, 192.0f, 204.41827f, 192.0f, 200.0f),
                    PathNode.CurveTo(192.0f, 195.58173f, 188.41827f, 192.0f, 184.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(99.58172f, 224.0f, 96.0f, 227.58173f, 96.0f, 232.0f),
                    PathNode.CurveTo(96.0f, 236.41827f, 99.58172f, 240.0f, 104.0f, 240.0f),
                    PathNode.LineTo(160.0f, 240.0f),
                    PathNode.CurveTo(164.41827f, 240.0f, 168.0f, 236.41827f, 168.0f, 232.0f),
                    PathNode.CurveTo(168.0f, 227.58173f, 164.41827f, 224.0f, 160.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 100.0f),
                    PathNode.CurveTo(231.9559f, 141.95538f, 197.95538f, 175.9559f, 156.0f, 176.0f),
                    PathNode.LineTo(76.0f, 176.0f),
                    PathNode.CurveTo(47.281193f, 176.0f, 24.0f, 152.71881f, 24.0f, 124.0f),
                    PathNode.CurveTo(24.0f, 95.2812f, 47.281193f, 72.0f, 76.0f, 72.0f),
                    PathNode.CurveTo(78.989395f, 72.00255f, 81.97327f, 72.25678f, 84.92f, 72.76f),
                    PathNode.CurveTo(98.08372f, 38.567497f, 133.7486f, 18.614113f, 169.77486f, 25.286367f),
                    PathNode.CurveTo(205.80113f, 31.958624f, 231.95464f, 63.361107f, 232.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 100.0f),
                    PathNode.CurveTo(215.86697f, 67.61541f, 190.08229f, 41.167774f, 157.7115f, 40.212837f),
                    PathNode.CurveTo(125.34072f, 39.2579f, 98.04183f, 64.139565f, 96.0f, 96.46f),
                    PathNode.CurveTo(95.74595f, 100.87828f, 91.958275f, 104.25405f, 87.54f, 104.0f),
                    PathNode.CurveTo(83.12172f, 103.74595f, 79.74595f, 99.958275f, 80.0f, 95.54f),
                    PathNode.QuadTo(80.21f, 91.88f, 80.77f, 88.31f),
                    PathNode.CurveTo(79.18806f, 88.10696f, 77.59492f, 88.00342f, 76.0f, 88.0f),
                    PathNode.CurveTo(56.11775f, 88.0f, 40.0f, 104.11775f, 40.0f, 124.0f),
                    PathNode.CurveTo(40.0f, 143.88223f, 56.11775f, 160.0f, 76.0f, 160.0f),
                    PathNode.LineTo(156.0f, 160.0f),
                    PathNode.CurveTo(189.1211f, 159.96143f, 215.96143f, 133.1211f, 216.0f, 100.0f),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
