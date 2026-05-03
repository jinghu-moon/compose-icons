package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorThinIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(185.85f, 35.7f),
                    PathNode.CurveTo(167.74f, 28.29f, 146.17f, 26.14f, 125.09f, 29.64f),
                    PathNode.CurveTo(102.5f, 33.4f, 83.0f, 43.1f, 68.62f, 57.7f),
                    PathNode.CurveTo(58.0f, 68.5f, 45.11f, 89.65f, 44.06f, 129.0f),
                    PathNode.CurveTo(43.37f, 154.95f, 48.35f, 183.29f, 57.36f, 204.79f),
                    PathNode.CurveTo(65.8f, 224.92f, 76.51f, 236.0f, 87.52f, 236.0f),
                    PathNode.CurveTo(108.02f, 236.0f, 117.3f, 217.87f, 127.13f, 198.68f),
                    PathNode.CurveTo(134.32f, 184.63f, 141.76f, 170.11f, 153.99f, 161.81f),
                    PathNode.CurveTo(160.24f, 157.58f, 168.38f, 154.44f, 176.99f, 151.11f),
                    PathNode.CurveTo(199.71f, 142.35f, 227.99f, 131.44f, 227.99f, 93.17f),
                    PathNode.CurveTo(228.0f, 67.6f, 212.64f, 46.66f, 185.85f, 35.7f),
                    PathNode.Close,
                    PathNode.MoveTo(174.13f, 143.64f),
                    PathNode.CurveTo(165.07f, 147.14f, 156.5f, 150.44f, 149.5f, 155.19f),
                    PathNode.CurveTo(135.57f, 164.64f, 127.3f, 180.79f, 120.01f, 195.03f),
                    PathNode.CurveTo(110.95f, 212.72f, 103.13f, 228.03f, 87.52f, 228.03f),
                    PathNode.CurveTo(80.16f, 228.03f, 71.64f, 218.2f, 64.74f, 201.73f),
                    PathNode.CurveTo(56.14f, 181.22f, 51.4f, 154.12f, 52.06f, 129.24f),
                    PathNode.CurveTo(53.06f, 92.49f, 64.7f, 73.12f, 74.32f, 63.34f),
                    PathNode.CurveTo(93.18f, 44.15f, 119.85f, 36.11f, 144.65f, 36.11f),
                    PathNode.CurveTo(158.53f, 36.11f, 171.83f, 38.63f, 182.82f, 43.11f),
                    PathNode.CurveTo(215.17f, 56.34f, 220.0f, 80.15f, 220.0f, 93.17f),
                    PathNode.CurveTo(220.0f, 126.0f, 196.68f, 135.0f, 174.13f, 143.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
