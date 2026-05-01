package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorThinIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(92.577835f, 27.993416f, 59.795315f, 46.726475f, 41.81769f, 77.247536f),
                    PathNode.CurveTo(23.840067f, 107.76859f, 23.350248f, 145.52281f, 40.53f, 176.5f),
                    PathNode.LineTo(28.63f, 212.19f),
                    PathNode.CurveTo(27.191862f, 216.5024f, 28.313967f, 221.2572f, 31.528385f, 224.47162f),
                    PathNode.CurveTo(34.7428f, 227.68604f, 39.49761f, 228.80812f, 43.81f, 227.37f),
                    PathNode.LineTo(79.5f, 215.47f),
                    PathNode.CurveTo(116.0805f, 235.73895f, 161.41055f, 231.1041f, 193.1321f, 203.85144f),
                    PathNode.CurveTo(224.85362f, 176.59877f, 236.26628f, 132.48474f, 221.74101f, 93.267654f),
                    PathNode.CurveTo(207.21573f, 54.050564f, 169.82062f, 28.014025f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(111.82468f, 220.0049f, 95.93396f, 215.74507f, 81.93f, 207.65f),
                    PathNode.CurveTo(81.32142f, 207.29965f, 80.63221f, 207.11357f, 79.93f, 207.11f),
                    PathNode.CurveTo(79.498f, 207.10973f, 79.06892f, 207.18068f, 78.66f, 207.32f),
                    PathNode.LineTo(41.28f, 219.78f),
                    PathNode.CurveTo(39.842537f, 220.2594f, 38.2576f, 219.88535f, 37.186127f, 218.81387f),
                    PathNode.CurveTo(36.114655f, 217.7424f, 35.74062f, 216.15747f, 36.22f, 214.72f),
                    PathNode.LineTo(48.68f, 177.34f),
                    PathNode.CurveTo(49.04356f, 176.25307f, 48.9234f, 175.06238f, 48.35f, 174.07f),
                    PathNode.CurveTo(27.495445f, 138.02205f, 33.45707f, 92.460594f, 62.88435f, 62.99192f),
                    PathNode.CurveTo(92.31163f, 33.523243f, 137.86465f, 27.497574f, 173.9419f, 48.301434f),
                    PathNode.CurveTo(210.01912f, 69.10529f, 227.622f, 111.549675f, 216.8574f, 151.78015f),
                    PathNode.CurveTo(206.09282f, 192.01064f, 169.64574f, 219.9927f, 128.0f, 220.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
