package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorBoldIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.84f, 47.44f),
                    PathNode.CurveTo(192.66444f, 29.909895f, 169.16188f, 20.021662f, 144.62f, 20.0f),
                    PathNode.LineTo(144.27f, 20.0f),
                    PathNode.CurveTo(119.827095f, 19.934584f, 96.37549f, 29.658072f, 79.15f, 47.0f),
                    PathNode.LineTo(17.76f, 109.17f),
                    PathNode.CurveTo(10.02098f, 116.993904f, 10.056729f, 129.60011f, 17.84f, 137.38f),
                    PathNode.LineTo(46.5f, 166.0f),
                    PathNode.CurveTo(50.2454f, 169.76376f, 55.340225f, 171.8737f, 60.65f, 171.86f),
                    PathNode.LineTo(60.76f, 171.86f),
                    PathNode.CurveTo(66.10813f, 171.85356f, 71.22762f, 169.69038f, 74.96f, 165.86f),
                    PathNode.LineTo(135.83f, 103.47f),
                    PathNode.CurveTo(140.47498f, 98.919f, 147.89038f, 98.865944f, 152.6f, 103.35f),
                    PathNode.CurveTo(154.84665f, 105.54631f, 156.1091f, 108.55817f, 156.1f, 111.7f),
                    PathNode.CurveTo(156.13385f, 115.101395f, 154.81767f, 118.37745f, 152.44f, 120.81f),
                    PathNode.LineTo(90.19f, 181.0f),
                    PathNode.CurveTo(86.34501f, 184.73094f, 84.157684f, 189.84857f, 84.11821f, 195.20604f),
                    PathNode.CurveTo(84.078735f, 200.56349f, 86.19041f, 205.7128f, 89.98f, 209.5f),
                    PathNode.LineTo(118.64f, 238.16f),
                    PathNode.CurveTo(126.41435f, 245.8772f, 138.93927f, 245.9395f, 146.79f, 238.3f),
                    PathNode.LineTo(208.55f, 177.86f),
                    PathNode.LineTo(208.64f, 177.77f),
                    PathNode.CurveTo(244.65f, 141.78f, 245.18f, 83.31f, 209.84f, 47.44f),
                    PathNode.Close,
                    PathNode.MoveTo(60.62f, 146.21f),
                    PathNode.LineTo(37.62f, 123.21f),
                    PathNode.LineTo(55.81f, 104.8f),
                    PathNode.LineTo(78.69f, 127.68f),
                    PathNode.Close,
                    PathNode.MoveTo(132.82f, 218.39f),
                    PathNode.LineTo(109.82f, 195.39f),
                    PathNode.LineTo(128.43f, 177.39f),
                    PathNode.LineTo(151.31f, 200.26f),
                    PathNode.Close,
                    PathNode.MoveTo(191.71f, 160.77f),
                    PathNode.LineTo(168.48f, 183.5f),
                    PathNode.LineTo(145.7f, 160.73f),
                    PathNode.LineTo(169.21f, 138.0f),
                    PathNode.LineTo(169.36f, 137.86f),
                    PathNode.CurveTo(176.31424f, 130.85455f, 180.1809f, 121.360725f, 180.1f, 111.49f),
                    PathNode.CurveTo(180.0699f, 101.90093f, 176.15536f, 92.733345f, 169.25f, 86.08f),
                    PathNode.CurveTo(155.07411f, 72.57154f, 132.72624f, 72.78421f, 118.81f, 86.56f),
                    PathNode.LineTo(118.71f, 86.67f),
                    PathNode.LineTo(95.46f, 110.49f),
                    PathNode.LineTo(72.68f, 87.72f),
                    PathNode.LineTo(96.18f, 63.92f),
                    PathNode.CurveTo(108.905334f, 51.122456f, 126.2226f, 43.94924f, 144.27f, 44.0f),
                    PathNode.LineTo(144.53f, 44.0f),
                    PathNode.CurveTo(162.6711f, 44.022617f, 180.04231f, 51.333588f, 192.74f, 64.29f),
                    PathNode.CurveTo(218.85f, 90.78f, 218.38f, 134.05f, 191.71f, 160.77f),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
